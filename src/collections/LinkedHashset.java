package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		
		Set<String> lset = new LinkedHashSet<>();
		lset.add("Naveen");
		lset.add("venky");
		lset.add("praveen");
		lset.add("rajesh");
		lset.add("Naveen");
		
		
		
		
		
		Iterator  s = lset.iterator();
		
		while(s.hasNext()) {
			System.out.print(s.next() + " ");
		}
		
	}

}
