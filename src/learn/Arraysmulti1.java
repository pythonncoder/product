package learn;

public class Arraysmulti1 {
	private static int[][] d;

	public static void main(String[] args) {

		int c[][] = new int[3][3];

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9 }};
		int[][] b = { { 7, 8, 9 }, { 1, 2, 3 },{4,5,6 }};

		// 1 2 3 7 8 9 (0,0)*(0,0)+01*10+02*20
		// 4 5 6 1 2 3

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c[i][j] = 0;
				for (int m = 0; m < a.length; m++) {

					c[i][j] += a[i][m] * b[m][j];
				}

			}
		}

		for (int[] values : c) {
			for (int elements : values) {
				System.out.print(elements + " ");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		// for each loop using iteration
		for (int[] values : a) {
			for (int elements : values) {
				System.out.print(elements + " ");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println();

		for (int[] values : b) {
			for (int elements : values) {
				System.out.print(elements + " ");
			}
			System.out.println();

		}
	}

}
