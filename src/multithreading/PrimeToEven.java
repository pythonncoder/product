package multithreading;

public class PrimeToEven {

	public static void main(String[] args) {

		EvenNumber  e = new EvenNumber();
		PrimeNumber p = new PrimeNumber();
		
		Thread t1 = new Thread(e);
		Thread t2 = new Thread( p);
		t1.start();
		t2.start();
		
		try {
			t1.wait();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
	}

}
