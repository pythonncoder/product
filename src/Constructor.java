
public class Constructor {
	int sum =0;
	Constructor() {

		this(10,20);
	}
	Constructor(int i,int j) {
		this.sum = i+j;
	}
	void print() {
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
		c.print();
	}
}
