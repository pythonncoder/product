package compareandcomparabe;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int age;

	public Student(int id, String string, int age) {
		this.id = id;
		this.name = string;
		this.age = age;
	}

	public Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student student) {
		if (this.id < student.id) {
			return -1;
		}else if(this.id > student.id) {
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
