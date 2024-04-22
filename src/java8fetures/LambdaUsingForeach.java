package java8fetures;

import java.util.ArrayList;
import java.util.List;

public class LambdaUsingForeach {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();
		
		values.add(19);
		values.add(29);
		values.add(10);
		values.add(45);
		
		values.forEach((n)->{System.out.println(n);});

	}

}
