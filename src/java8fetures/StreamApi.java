package java8fetures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamApi {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
	    list.addAll(Arrays.asList(10,20,30,40,20,70,80,90));
		Set<Integer> set = new HashSet<>();
		list.stream().filter(x->set.add(x)).collect()
		
	}

}
