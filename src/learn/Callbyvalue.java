package learn;

public class Callbyvalue {

	int a = 10;

	public int value(int a) {
		return a = a + 10;
	}

	public static void main(String[] args) {

		Callbyvalue CV = new Callbyvalue();

		System.out.println("before value:" + CV.a);

		 int c = CV.value(100);

		System.out.println("After value:" + c);

	}

}
