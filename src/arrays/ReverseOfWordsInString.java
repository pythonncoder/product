package arrays;

import java.lang.String;
import java.lang.StringBuffer;
import java.lang.System;
import java.util.StringTokenizer;

public class ReverseOfWordsInString {
	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
		String str = " My name is Naveen";
		
		for (String s:str.split(" ")) {
			for (int i=s.length();i>=0;i--) {
			    System.out.println(s.charAt(i));
			}
		}

		
		}

	}


