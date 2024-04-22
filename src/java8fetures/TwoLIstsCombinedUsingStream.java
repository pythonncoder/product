package java8fetures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Stream;

public class TwoLIstsCombinedUsingStream {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,28,37,45,67);
		List<Integer> list2 = Arrays.asList(254,67,89);
		
	Set<Integer> set = new TreeSet<>();
	set.add(10);
	set.add(20);
	set.add(13);
	set.add(14);
	set.add(15);
	set.add(16);
	set.add(17);
	set.add(18);
	set.add(19);
	
	for (Integer s:set) {
		System.out.println(s);
	}
	}
}
