package pattrens;

public class Pattren2 extends Thread{
	
	private static Pattren2 obj;

	public static void main(String[] args) {
		
		Pattren2 t1 = new Pattren2();
		obj = new Pattren2();
		System.out.println("thread t1 is not started first intial" + t1.getClass());
		t1.start();
		System.out.println("Thread t1 is Started"+ t1.getState());
	    System.out.println("Get the threadID "+ t1.getId());	
	 	
		// t1.notify();
		System.out.println( "notify method in thread current state"+ t1.getState());
	System.out.println( "GetName of the current thread: "+t1.getName());	
	
		
	}

	@Override
	public void run() {
		for (int i = 0; i <= 9; i++) {
		    for (int j = i; j <= i + 8; j++) {
		    	try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        System.out.print(j % 9 + 1 + " ");
		    }
		    System.out.println();
		}
		System.out.println("State of thread t1 in final run method" + Thread.currentThread());
	
		System.out.println( "ThradName:" + Thread.currentThread().getName());
	System.out.println("Thread Active Count"+ Thread.activeCount());	
	}

}

//1 2 3 4 5 6 7 8 9
//2 3 4 5 6 7 8 9 1
//3 4 5 6 7 8 9 1 2
//4 5 6 7 8 9 1 2 3
//5 6 7 8 9 1 2 3 4
//6 7 8 9 1 2 3 4 5
//7 8 9 1 2 3 4 5 6
//8 9 1 2 3 4 5 6 7
//9 1 2 3 4 5 6 7 8