package stringPrograms;

import java.util.Arrays;

public class StringToChar {
	public static void main(String[] args) {
	   String s = "SriHari"; // s r i h a r i
	   char[] c	 = s.toCharArray();
	   System.out.println(c);
	    
	   Arrays.sort(c); 
	   
	   String sorted = new String(c);
	   System.out.println(sorted);
	}

}
