package learn;

public class MatrixMulti {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 7, 8, 9 }, { 1, 2, 3 } };
		
		//for each loop
		
		

		
		System.out.println();
		System.out.println();
		// a array values
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// b array values
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// Addition of two values
		int c[][] = new int[3][3];

		// 1 2 3
		// 4 5 6

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[j][j];
			}
			System.out.println();
		}

		// c array values
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {

				System.out.print("cvalues:" + c[i][j]);

			}
			System.out.println();

		}

	}

}
