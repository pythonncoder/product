package PojoClass;

import java.util.ArrayList;
import java.util.List;

public class StudentImpl {
	
	
	
	public static void main(String[] args) {
		
		List<StudentEx1>  l = new ArrayList<>();
		l.add( new StudentEx1(1,"Naveen"));
		l.add( new StudentEx1(2,"Kiran"));
		l.add( new StudentEx1(3,"Venu"));
		l.add( new StudentEx1(4,"Kalyan"));
		
		System.out.println(l.toString());
		
		for (StudentEx1 l1:l) {
			System.out.println(l1.getId() +" "+ l1.getName());
		}
		
	}

}
