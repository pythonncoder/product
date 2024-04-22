package learn;

public class ArrayExamples {

	public static void test() {

		int[] value = new int[5];
		value[0] = 10;
		value[1] = 20;
//		value[2] = 30;
		value[3] = 40;
		value[4] = 50;

		for (int v : value) {
			System.out.print(v);
		}

	}

	public void multi() {
		int[][] t = new int[2][2];
		t[0][0] = 10;
		t[0][1] = 20;
//		t[0][2] = 30;
		t[1][0] = 10;
		t[1][1] = 20;
//		t[1][2] = 30;

		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j <= t[i].length; j++) {
				System.out.println(t[i][j]);
			}
			System.out.print("");
		}
	}

	public static void main(String[] args) {

		ArrayExamples arr = new ArrayExamples();
		ArrayExamples.test();
		arr.multi();

	}

}
