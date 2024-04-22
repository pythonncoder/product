package multithreading;

public class ThreadSleepEx extends Thread {
	
	public static void main(String[] args) {
		
		ThreadSleepEx t1 = new ThreadSleepEx();
		ThreadSleepEx t2 = new ThreadSleepEx();
		// t1.start();
		// t2.start();
	t1.setPriority(MAX_PRIORITY);
	System.out.println( "State of t1 thread"+ t1.getState());
	t1.start();
	System.out.println( "State of t1 thread"+ t1.getState());
	System.out.println();
	}
	
	public void run() {
		
		for (int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			

			
		}
				
	}

}
