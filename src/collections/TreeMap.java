package collections;

import java.util.Hashtable;

public class TreeMap {

	public static void main(String[] args) {

		Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
		
		hash.put("Naveen", 6);
		hash.put("kalyan", 2);
		hash.put("praveen", 20);
		hash.put("venky", 24);
		hash.put("mahi", 24);
		hash.put("teja", 23);
		
		System.out.println(hash.keySet()+":"+hash.values() ); 
		
		hash.put("kalyan",13);

		System.out.println(hash);

	}

}
