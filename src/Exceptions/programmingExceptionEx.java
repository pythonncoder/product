package Exceptions;

public class programmingExceptionEx {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		Exceptiontrace et = new Exceptiontrace();
		try {
			// c.add();
			et.indexout();
		} catch (NaveenException e) {
			System.out.println( "unable to process your index method");
		}
		
		
   }
}