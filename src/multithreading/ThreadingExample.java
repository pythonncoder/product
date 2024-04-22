package multithreading;

public class ThreadingExample  implements Runnable{
	
	public static Thread t1;
	public static ThreadingExample obj;
	
	
	public static void main(String[] args) {
		obj = new ThreadingExample();
		t1 = new Thread(obj);
		
		System.out.println("The state of thread t1 after spawning it - " + t1.getState());
		t1.start();
		System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());
		
	}

	@Override
	public void run() {
		ABCExample myObj = new ABCExample();
		Thread t2 = new Thread(myObj);
		
		t2.getState();
		t2.start();
		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The state of thread t1 when it has completed it's execution - " + t2.getState());


		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The state of thread t2 when it has completed it's execution - " + t2.getState());


		
	}

}
