package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {

	public static void main(String[] args) {
		Set<String> l = new TreeSet<>();
	
		l.add("naveen");
		l.add("ravi");
		l.add("kalyan");
		l.add("pardhu");
		l.add(null);
		l.add("venu");
		l.add("venu");
		
		
		Set<String> l1 = new LinkedHashSet<>();
		l1.add("naveen");
		l1.add("ravi");
		l1.add("kalyan");
		l1.add("pardhu");
		l1.add("venu");
		l1.add("ravi");
		l1.add(null);
		

		Set<String> s = new HashSet<>();
		s.add("naveen");
		s.add("ravi");
		s.add("kalyan");
		s.add("pardhu");
		s.add("venu");
		s.add(null);

		Iterator<String> i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
