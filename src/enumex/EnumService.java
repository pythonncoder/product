package enumex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumService {

	public static void main(String[] args) {
		
		EnumClass enumclass;

		List<EnumClass> l = new ArrayList<>();
		
		for (EnumClass e:EnumClass.values()) {
			l.add(e);
		}
		
		System.out.println(l.toString());
		
		for(EnumClass l1 : EnumClass.values()) {
			System.out.println(l1);
		}
//		
//		for ( EnumClass weekdays : )
			
		//	Arrays.stream( l.forEach(System.out::println));
			
//			l.stream().forEach(System.out::println);
//			
//			l.add("Rammi");
					
	}

	public EnumService() {
		super();
		// TODO Auto-generated constructor stub
	}
}
