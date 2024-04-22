package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "naveen");
		map.put(2, "ravi");
		map.put(3, "tajesh");
		map.put(4, "naveen");
		map.put(5, "venky");
		map.put(6, "teja");
		map.put(0, null);
		map.put(10, null);
		map.put(10, "hj");

		Iterator iter = map.values().iterator();
		while (iter.hasNext()) {
		   String value = (String) iter.next();
			// System.out.println(key + ":" + map.get(key));
			System.out.println(value);
		}
		System.out.println(map);
	}

}
