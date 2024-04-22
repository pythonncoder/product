package Exceptions;

public class UncheckedExceptions {
	
	public static int stackoverflow( int i) {
		
	System.out.println( i);
	return stackoverflow(i);	
		
	}

	public static void main(String[] args) {

		// unchecked exception means program is compiled but in run time problem
	    // for example Zero Division , StackOverflow ,Indexoutbound 
		int i = 1;
		stackoverflow(i);
	}



}
