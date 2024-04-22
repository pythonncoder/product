package multithreading;

class Multithread implements Runnable{

	String name;
	Multithread(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("Run"+i);
		}
	}
	
}
public class MultithreadDemo {

	public static void main(String[] args) {

		Multithread mt1 = new Multithread("Thread1");
		Multithread mt2 = new Multithread("Thread2");
		Thread t1 = new Thread( mt1);
		Thread t2 = new Thread( mt2);
		t1.start();
		t2.start();
		for (int i=0;i<10;i++) {
			System.out.println("Main"+i);
		}
		
	}

}
