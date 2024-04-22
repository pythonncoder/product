package innerclasses;

class Test1{
	void print() {
		System.out.println("Test1 class");
	}
	
}
class Test2 extends Test1{
	void print() {
		System.out.println("Test2 class");
	}
}
public class Methodoverriding {
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.print();
		
	}
	
}
