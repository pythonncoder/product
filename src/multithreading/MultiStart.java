package multithreading;

public class MultiStart {

	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		
		t1.start();
		
		for (int row=1;row<=5;row++) {
			
			System.out.print(row +" ");
			
				
			for(int col=row+1;col <=5;col++) {
				System.out.print(col +" ");
			}for (int rowd=5;rowd>=1;rowd--) {
				
				System.out.print(row +" ");
			
		}
			
			System.out.println();
		}
	}

	}

