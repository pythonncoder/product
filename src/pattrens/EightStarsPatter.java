package pattrens;

public class EightStarsPatter {
	public static void main(String[] args) {
		int rows = 9;
		int cols = 8;
		for(int row=1;row<rows;row++) {
			for(int col= 1;col<cols;col++ ) {
				if ( col == 1 || col == 8) {
					System.out.print("*");
				}else if( row == 1 || row == 5 || row == 9) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}

}
