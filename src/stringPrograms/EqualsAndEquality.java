package stringPrograms;

public class EqualsAndEquality {
	public static void main(String[] args) {
		String str1 = "Naveen";
		String str2 = "Naveen";
		String str3 = new String("Naveen");
		System.out.println(str1 == str2); // true
		System.out.println( str1.equals(str3));  // true
		System.out.println(str1 == str3); // 
	          System.out.println( str1.hashCode());	
	          System.out.println( str2.hashCode());	
	          System.out.println( str3.hashCode());	
	          
	}

}
