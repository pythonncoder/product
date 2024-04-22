package Exceptions;

public class UserdefinedException {

	public static void main(String[] args) {

		try {
			int i=0;
			while(i>0) {
				System.out.println(i);
			}
		i++;
		throw new myException("iterator out bound exception");
		}catch( myException e) {
			System.out.println(e);
			
	
		}
	}

}
class myException extends Exception{

	public myException(String string) {
		super( );
		System.out.println(string);
	}
	
	
	
}