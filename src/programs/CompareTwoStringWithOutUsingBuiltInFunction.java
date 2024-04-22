package programs;

public class CompareTwoStringWithOutUsingBuiltInFunction {
	public static void main(String[] args) {
		
		String s1 = "Naveen";
		String s2 = "Helllo";
		
		for (int i=0;i<s1.length();i++) {
		  char c1 = s1.charAt(i);
		  char c2 = s2.charAt(i);
		  if (c1 != c2) {
			  System.out.println("Two Strings Not equal");
		  }else {
			  System.out.println("Two string equal");
		  }
		}
	}

}
