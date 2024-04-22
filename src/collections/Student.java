package collections;

public class Student implements Comparable<Student>{
	int rollNo;
	String name;
	int age;
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student s1) {
		
		if (rollNo > s1.rollNo) {
			return 1;
		}
		else {
			return -1;
		}
	}
	

}
