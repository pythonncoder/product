package java8fetures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,5,6,7);
		
		
		Stream<Integer> st = list.stream();
		
	   //  Step :1  i want iterate the data 
		
		// st.forEach(n -> System.out.println(n));
		
		Stream<> i = st.map(n -> n*n).forEach(n->System.out.println(n));
		
	  
		
		
	}

}
