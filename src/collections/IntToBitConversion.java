package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class IntToBitConversion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number:");
		int value = sc.nextInt();

		int rem = 0;
		System.out.println( 2/1);

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();

		int count =0;
		int i = 0;
		while (value > 0) {
			
			rem = value / 2;
			if (rem == 1) {
				list1.add(1);
			} 
			else if(rem == 0) {
				list1.add(0);
			}
			count++;
			System.out.println(value = value / 2);
		}

		i++;
		if ( count == i) {
			list1.set(0,1);
		}
		
		
		System.out.println(list1.toString());

		
		
		/*
		 * System.out.println("First Stage:"+queue);
		 * 
		 * while(!queue.isEmpty()) { list.add(queue.poll()); }
		 * 
		 * System.out.println("Second stage:"+ list.toString());
		 * 
		 * System.out.println( list.size()); for (int j=list.size()-1;j>=0;j--) {
		 * queue.add(list.get(j)); System.out.println("i+"+j);
		 * 
		 * } System.out.println(" Third stage:"+queue.toString());
		 */
		  
		 

	}

}
