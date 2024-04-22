package pattrens;

public class FabonacciEx {
	
	  double n1=0,n2=1,n3; 
	  public  void fabonnaci(int count) { 
		  if ( count > 0) { 
			
	 
		  System.out.print(n1 +" ");
		  n3 = n1 +n2; 
		  n1 = n2; 
		  n2 = n3; 
		  fabonnaci(count-1);
	  
	  } 
	}
	 
	
	public static void main(String[] args) {
		FabonacciEx fe = new FabonacciEx();
	   fe.fabonnaci(100);
		
	}

}
