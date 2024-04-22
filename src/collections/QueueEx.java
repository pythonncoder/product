package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(101);
		q.add(102);
		q.add(103);
		q.add(104);
		q.add(105);
		q.add(106);

		
		  System.out.println(q.element()); System.out.println(q.peek()); q.offer(102);
		  System.out.println(q.poll()); System.out.println("RetainsAll:" +
		  q.retainAll(q));
		  
//		  System.out.println("Stream:" + q.stream().sorted()); q.toArray();
		  
		  System.out.println(q.toString()); // Arrays.sort(q.toArray()
		  
		  Integer obj = 0; while (!q.isEmpty()) { obj = q.poll(); }
		  
		  System.out.println(obj.toString());
		 
		
		
		Iterator<Integer> il = q.iterator();
		while (il.hasNext()) {
			System.out.println(il.next());
		}

		
		  for (Integer first : q) { System.out.println(first); }
		 

	}

}
