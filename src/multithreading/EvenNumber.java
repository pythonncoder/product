package multithreading;

public class EvenNumber extends Thread {
	
	String even = null;
	
	public void run() {
		int i=0;
		while(i<100) {
			if ( i%2 == 0) {
			    even += i + " ";
			}
			i++;
		}
		System.out.println("Even:"+even);
	}
	
	
	

}
