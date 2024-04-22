package Exceptions;

public class NaveenException  extends Exception{

	public NaveenException() {
		super();
	}
	
	public NaveenException( String message) {
		System.out.println( " create a ticket"+message);
	}

}
