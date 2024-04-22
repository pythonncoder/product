package compareandcomparabe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestEx1 {
	public static void main(String[] args) {

		List<Student> student = new ArrayList<>();

		student.add(new Student(101, "Naveen", 13)) ;
		student.add(new Student(115, "Praveen", 50)); 
		student.add(new Student(113, "Venky", 15)); 
		student.add(new Student(121, "Srinu", 11)); 
		student.add(new Student(111, "Suresh", 70)); 
		
		

		 Collections.sort(student);

		for( Student stu:student) {
			System.out.println(stu.getId() +":"+stu.getName() +":"+ stu.getAge() );
		}
	}

}
