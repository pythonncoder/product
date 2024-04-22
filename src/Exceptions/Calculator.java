package Exceptions;

public class Calculator {

		public int add() throws NaveenException{
			
			try {
				System.out.println(50/0);
			}catch( Exception e) {
				throw new NaveenException(" Dividing by zero sholod be provided");
			}finally {
				System.out.println(" Tnank you for your service");
			}
			return 0;
			
			
	}

}
