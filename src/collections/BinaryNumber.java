package collections;

public class BinaryNumber {

	public void toBinary(int decimal, StringBuffer sb) {
		while (decimal > 0) {
			sb.append(decimal % 2);
			// sb = decimal%2; // 10%2 16 8 4 2 1 -> 10100
			decimal = decimal / 2;
		}
		for (int i = sb.length() - 1; i >= 0; i--) {
			System.out.print(sb.charAt(i));
		}
	}

	public static void main(String[] args) {

		BinaryNumber b = new BinaryNumber();
		StringBuffer sb = new StringBuffer();
		b.toBinary(18, sb); // 10100 168421

	}

}
