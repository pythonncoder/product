package stringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseWord {
	public static void main(String[] args) {
		String str = "Heelo";
		char[] ch = str.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}

		System.out.println(set.toString());
	}

}
