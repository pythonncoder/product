package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetEx {

	public static void main(String[] args) {
		TreeSet<String> hset = new TreeSet<>();
		hset.add( "Naveen");
		hset.add("venky");
		hset.add("praveen");
		hset.add("rajesh");
		hset.add("Naveen");
//		System.out.println( hset. last());  
//	  System.out.println( hset.ceiling("rajesh1")); 
//	   System.out.println(hset.isEmpty());	
		
                  
//       System.out.println("pollFirst"+ hset.pollFirst());  
          System.out.println("First Element"+ hset.first());  
       
//       System.out.println("pollLast"+ hset.pollLast());
        System.out.println( "Floor:"+hset.floor("Kalayan")); 
       
       Iterator  s = hset.iterator();
		while(s.hasNext()) {
			System.out.print(s.next() + " ");
		}

	}

}
