package learn;

public class PreIncrement {
	
	public static void main(String[] args) {
		int a = 6;
		int b = ++a;
		int c = b--;
		int d = a++ + --b - --c;
		
		System.out.println(a); // 8
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
	
		
	}

}
