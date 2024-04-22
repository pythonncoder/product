package comparableandcomparetor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> stu = new ArrayList<>();
		stu.add(new Student(102, "bjsabd", 78));
		stu.add(new Student(104, "ralaji", 98));
		stu.add(new Student(106, "ramya", 81));
		stu.add(new Student(100, "lakshmi", 78));
		stu.add(new Student(107, "lucky", 90));
		stu.add(new Student(119, "jcci", 26));

		Collections.sort(stu, new AgeComparator());
		Collections.sort(null);
		for (Student s : stu) {
			System.out.println(s.id + " " + s.name + " " + s.age);
		}

	}

}
