package java8fetures;


interface hello{
	public String name( String name);
}

public class EX1 {
	public static void main(String[] args) {
		hello h1 = (name)->{
			return name;};
			
	System.out.println("Hello "+ h1.name("Naveen")); 
			
		hello h2 = (name)->{
				return name;};
			System.out.println("Hello "+ h2.name("Ravi"));	 
	}


	

}
