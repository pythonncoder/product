package multithreading;

class MyClass2 extends Thread {

	public synchronized void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("3*" + i + "=" + 3 * i);
		}
		// System.out.println(Thread.currentThread().getName());
	}
}

class Myclass1 extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("2*" + i + "=" + 2 * i);
		}
		// System.out.println(Thread.currentThread().getName());
	}

}

public class TwothreadsTask {
	public static void main(String[] args) {

		MyClass2 myclass2 = new MyClass2();
		Myclass1 myclass1 = new Myclass1();

		Thread t2 = new Thread(myclass2);
		Thread t1 = new Thread(myclass1);

		t2.start();
		t1.start();

	}

}
