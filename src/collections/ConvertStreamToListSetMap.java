package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertStreamToListSetMap {
	
	public static void main(String[] args) {
		
	List<Integer>  input = Arrays.asList(1,2,3,76,90,87,67,56,64,36,27,27,678);
	
	System.out.println("Print Input:"+input);
	
	List<Integer> list = input.stream().collect(Collectors.toList());
    System.out.println("Array to List:"+list);
    
    Set<Integer> set = input.stream().collect(Collectors.toSet());
    
    System.out.println("Arrays to Set:"+set);
    
    HashSet<Integer> hashset = input.stream().sorted().collect(Collectors.toCollection( HashSet :: new));
    
    System.out.println("Arrays to Hashset:"+hashset);
    
		
	}

}
