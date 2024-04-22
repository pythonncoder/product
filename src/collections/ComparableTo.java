package collections;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class ComparableTo {
	

	public static void main(String[] args) {
		List<Student> l = new ArrayList<>();
	
		ComparableTo c = new ComparableTo();
		l.add( new Student( 104,"Venky",19));
		l.add( new Student( 102,"ramya",15));
		l.add( new Student( 101,"Naveen",23));
		l.add( new Student( 103,"Kalyan",12));
		
	Collections.sort(l);
	System.out.println( l.toString());	
	


	}

}
