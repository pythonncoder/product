package Inheritance;

class Animal {
	String name;
	public void makeNoise() {
		System.out.println("I'm just a animal");
	}
}

class Dog extends Animal {
	public void makeNoise() {
		System.out.println("woof woof");
	}
	public void growl() {
		System.out.println("grr");
	}
}

public class Casting {
	public static void main(String[] args) {
	 Dog myAnimal = new Dog();
		myAnimal.makeNoise();
	 myAnimal.growl();
	}
	

}
