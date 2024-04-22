package java8fetures;

import java.util.ArrayList;
import java.util.List;

class pojo {
	public int id;
	public String name;
	public int age;

	public pojo(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}

class CompareTo{
	public List compare(List person){
		return (List) person.iterator().next();
		
	    
		
	}
}

public class CompareToUsingLabda {
	public static void main(String[] args) {
		
		CompareToUsingLabda ct = new CompareToUsingLabda();
		List<pojo> obj = new ArrayList<pojo>();
		obj.add(new pojo(1,"Naveen",22));
		obj.add(new pojo(2,"Venu1",29));
		obj.add(new pojo(3,"Venu2",238));
		obj.add(new pojo(4,"Venu3",28));
		obj.add(new pojo(5,"Venu4",45));
		obj.add(new pojo(6,"Venu5",60));
		
		 System.out.println( ct.compare(obj)); 
     
	     System.out.println( obj.stream( ).count());	
	
         System.out.println( obj.iterator().equals(obj.toArray()));  
         
         
	}

	private void compare(List<pojo> obj) {
		// TODO Auto-generated method stub
		
	}


}