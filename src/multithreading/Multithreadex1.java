package multithreading;

class MyThread implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getId() + " Value " + i);
			System.out.println(i);
		}
	}
}

public class Multithreadex1 {

	public static void main(String[] args) {

		Thread t1 = new Thread();
		Thread t2 = new Thread();

		t1.start();
		t2.start();

		t1.run();
		t2.run();

	}

}
