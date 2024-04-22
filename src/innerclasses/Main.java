package innerclasses;

class Outer {
	int a = 10;

	class Inner {
		int b = 20;
	}
}

public class Main {
	public static void main(String[] args) {

		Outer outer = new Outer();
		Outer.Inner value = outer.new Inner();
	    int	add = outer.a + value.b ;
	    System.out.println(add);
	    
	}
}
