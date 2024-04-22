package objectorientedprogramming;


class Vehicle{
	
	String name = "bike";
}
class Bikes extends Vehicle{
	String name = "Honda";
	
	void print() {
		System.out.println(name);
		System.out.println(super.name);	
	}
	
}

public class SuperUsing {

	public static void main(String[] args) {
		Bikes b = new Bikes();
		b.print();
	}
}
