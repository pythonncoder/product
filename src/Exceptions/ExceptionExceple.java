package Exceptions;

public class ExceptionExceple {

	public static void main(String[] args) {
		
		try {
			String name = null;
			try {
				name.length();
				
			}catch( NullPointerException e) {
				
				System.out.println("Neisted Try block Exception trows");
				System.out.println( "String null values Exceptions throws" +e);
			}finally {
				System.out.println("neisted finally block");
			}
			System.out.println( 50/0);
			
		}catch(NullPointerException e) {
			System.out.println("NullPointerException throws");
			System.out.println(e.getStackTrace());
		}catch(ArithmeticException  e) {
			System.out.println("ArithmeticException throws");
			System.out.println("Arthimatic:"+e.getStackTrace());
			System.out.println(e);
		}catch(Exception  e) {
			System.out.println(" Exception throws");
			System.out.println(e.getStackTrace());
		}
		finally {
			System.out.println("Finally block throws ");
		}
		
		
	}

}
