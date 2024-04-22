package learn;

public class DonotUseThirdReferenceConcateOfTwoStrings {
	public static void main(String[] args) {
		String s = "naveen";
		String s1 = "Is Good";
		
		s = s +" "+ s1;
		System.out.println(s);
		
		s = s.concat( " "+s1);
		System.out.println(s);
		
	}

}
