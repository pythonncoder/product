package arrays;

// A number multiples that number 
// in that last number will same multiple
// 

public class AutoMorpic {

	public static void main(String[] args) {
		
		int num = 7;
		int mul = num * num;
		String str =  Integer.toString(mul);
		if (str.endsWith( Integer.toString(num))) {
			System.out.println("Automorphic");
		}else {
			System.out.println("NOn-Automorphic");
		}
	}
}
