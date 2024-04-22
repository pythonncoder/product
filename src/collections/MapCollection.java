package collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
	
	public static void main(String[] args) {
		Map<Integer,String>  map = new HashMap<>();
		map.put(1,"Naveen");
		map.put(1,"hari");
		map.put(1,"praveen");
		map.put(4,"Pardhu");
		map.put(5,"Harika");
		map.put(6,"Venky");
		System.out.println(map.entrySet()); 
		map.forEach((t1,t2)->System.out.println(t1+" "+t2));
		
	
	}

}
