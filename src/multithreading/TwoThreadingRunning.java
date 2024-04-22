package multithreading;

class MyClass2 extends Thread {

	public synchronized void run() {
		for (int i = 100; i > 0; i--) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		// System.out.println(Thread.currentThread().getName());
	}
}

class Myclass1 extends Thread {

	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(i);
		}
		// System.out.println(Thread.currentThread().getName());
	}

}

public class TwoThreadingRunning {
	public static void main(String[] args) {

		Myclass1 myclass1 = new Myclass1();
		MyClass2 myclass2 = new MyClass2();

		Thread t1 = new Thread(myclass1);
		Thread t2 = new Thread(myclass2);

		t2.start();
		t1.start();

	}

}
