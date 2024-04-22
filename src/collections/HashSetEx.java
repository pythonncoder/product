package collections;


import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> hset = new HashSet<>();
		hset.add( "Naveen");
		hset.add("venky");
		hset.add("praveen");
		hset.add("rajesh");
		hset.add("Naveen");
		System.out.println( hset.stream().findFirst()) ;  
		
//	     hset.toArray();                      // to Array it convers set to array 
   
		
		for (String h:hset) {
			System.out.println(h);
		}
		
		Iterator  s = hset.iterator();
		
		while(s.hasNext()) {
			System.out.print(s.next() + " ");
		}
		

	}

}
