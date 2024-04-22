package multithreading;

public class PrimeNumber extends Thread {

	String prime ;
	public void run() {
		int i =1;
		int count = 0;
		while(i<100) {
			int j = 1;
			while( j <= i) {
				if ( i%j == 0) {
					count++;
				}
				j++;
			}
			if (count == 2) {
				prime += i + " ";
			}
			i++;
			count = 0;
		}
		
		
		System.out.println("primenumber:"+prime);
	}
	

}
