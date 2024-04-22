package Exceptions;

import java.util.Scanner;

public class AtmException {
	
	
	public static int atmException( int a) throws MyExceptionex{
		try {
			if ( a == 500) {
				System.out.println("Your money was Debited ");
			}else {
				throw new MyExceptionex("200 and 100 not available ");
			}
		}catch( Exception e) {
			System.out.println("200 and 100 Rupees are not their so plz min 500Rs");
		}
		finally {
			System.out.println("Thank you for using our service");	
		}
		
		return 0;
		
	}
	public static void main(String[] args) throws MyExceptionex {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter An Amount");
		int amount = sc.nextInt();
		atmException( amount);
		
	}

}

 class MyExceptionex extends Exception{

	public MyExceptionex(String string) {
		super();
		System.out.println("tacket raised"+string);
	}
	 
}