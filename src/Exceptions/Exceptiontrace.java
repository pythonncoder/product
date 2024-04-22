package Exceptions;

public class Exceptiontrace {
	
	public int indexout() throws NaveenException  {
		
		try {
			int i=0;
			while(i>0) {
				
			}
		i++;
		}catch( Exception e) {
			throw new NaveenException( "Stack oVreflow error ");
		}finally {
			System.out.println("Thank you");
		}
		return 0;
	}

}
