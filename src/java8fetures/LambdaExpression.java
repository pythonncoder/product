package java8fetures;

public class LambdaExpression  implements FunctionInterEx{
	public static void main(String[] args) {
		
		// int a = ()->{System.out.println("Hello") };
	LambdaExpression le = new LambdaExpression();
	//le.print();
	
	

	FunctionInterEx fi = ( name)->{
		
		return "Hello"+ name;
		
	};
	}


	/*
	 * public String print() {
	 * 
	 * System.out.println("Functional Interface Implemented"); return null; }
	 */

	@Override
	public String print(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
