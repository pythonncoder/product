package programs;

public class REverseString {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String str = " My name is Naveen";

		for (String s : str.split(" ")) {
			for (int i = s.length()-1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
