package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		// hashMap is Key_value pair
		// hashmap doesn't allow the duplicate keys

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "naveen");
		map.put(2, "ravi");
		map.put(2, "ravi");
		map.put(3, "tajesh");
		map.put(4, "naveen");
		map.put(5, "venky");
		map.put(6, "teja");
		map.put(2, "r");
		map.put(0, null);
		map.put(10, null);
		map.put(10, "hj");

		Iterator iter = map.keySet().iterator();
		while (iter.hasNext()) {
			int key = (int) iter.next();
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println(map);

	}

}
