package multithreading;

public class MultithreadUsingRannbleClass extends Thread {
	public static void main(String[] args) {
		MultithreadUsingRannbleClass mt1 = new MultithreadUsingRannbleClass();
		MultithreadUsingRannbleClass mt2 = new MultithreadUsingRannbleClass();
		MultithreadUsingRannbleClass mt3 = new MultithreadUsingRannbleClass();
		
		mt1.start();
		mt2.start();
		mt3.start();	
	}
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i=0;i<10;i++) {
			System.out.print(i);
		}
    }


}
