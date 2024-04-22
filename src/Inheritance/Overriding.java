package Inheritance;


class A{
	
	  public void print( int i ,String name) { 
		  System.out.println("A Class:"+i + " "+name); 
		  }
	 
	 public void print(int i) {
		 System.out.println("A Class:"+i  );
	 }
}
class B extends A{
	public void print( int i ,String name,String j) {
		 System.out.println("B Class:"+i);
	 }
}

public class Overriding {
	public static void main(String[] args) {
		
		B b = new B();
		b.print(10);
		
		B b1 = (B) new A();
		// b1.print(199);
		
		A a = new A();
		a.print(100);
		// a.print(199,"Naveen");
		
	}

}
