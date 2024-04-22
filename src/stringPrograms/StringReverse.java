package stringPrograms;

import java.util.StringTokenizer;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String[] Input =" geeks quiz practice code".split(" ");
	    /// Output: s = “code practice quiz geeks”

		
		String ans = " ";
		for( int i = Input.length-1;i >=0;i--) {
			ans += Input[i] + " " ;
		}
               ans.trim();
            System.out.println(ans.toString());  
	}

}
