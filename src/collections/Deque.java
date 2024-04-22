package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Deque {

	public static void main(String[] args) {
	
	List<Integer> l = new ArrayList<>();
	Queue<Integer> q = new ArrayDeque<>();
	
	q.add(0);
	q.add(0);
	q.add(0);
	q.add(1);
	
	System.out.println(q.toString());
	
	while(!q.isEmpty()) {
		l.add(q.poll());
	}
	
	System.out.println(l.toString());
	
	
	
	
	for (int i=l.size()-1;i>=0;i--) {
		q.add(l.get(i));
		System.out.println("i+"+i);
		
	}
	System.out.println("Q:"+q.toString());
	
	
		

	}

}
