package java8fetures;

import java.util.ArrayList;
import java.util.List;

interface Sayable{  
    void say();  
}  

public class MethodReference {
	 public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	       List<Integer> li = new ArrayList<>();
	       li.stream()
	    }  
	    public static void main(String[] args) {  
	        // Referring static method  
	        Sayable sayable = MethodReference::saySomething;  
	        // Calling interface method  
	        // sayable.say();  
	    }  


}
