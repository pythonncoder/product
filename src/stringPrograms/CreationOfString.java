package stringPrograms;

import java.util.Arrays;
import java.util.List;

public class CreationOfString {

	public static void main(String[] args) {
		String s = "Naveen";
		String s1 = "is good";

		String s2 = "Naveen";
		String s3 = "Hello Naveen,Hello Swetha";
		String s4 = new String("Naveen");

		// s = s + " " +s1; //Adding two string in same reference
		System.out.println(s4);
		System.out.println(s);

		System.out.println(s.compareTo(s2));

		System.out.println("ContentEqualsTo:" + s.contentEquals(s2));

		System.out.println("charAt:" + s.charAt(0)); // char in specific position

		System.out.println(s.chars().min());

		System.out.println("length of the String:" + s.length());

		System.out.println(s1.replace(" ", "f"));
		System.out.println("s1 after replacement :" + s1);

		System.out.println(s3 = s3.replaceAll("Hello", "hi"));

		System.out.println(s.format("This is %s", s));

		System.out.println("concat Operation:" + s.concat(" " + s1));

		List<String> words = Arrays.asList(new String[] { "Hello", "World", "2019" });
		System.out.println(words);

		String msg = String.join(" ", words);
		System.out.println(msg);

		String[] s5 = new String[] {
				"Hello","Naveen","Rules"
		};
		
		List<String> s6 = Arrays.asList(s5);
		System.out.println();
		System.out.println(s5);
	}
}
