package java8fetures;

public interface First {
	public void run();
	 default void name() {
		 System.out.println("Heelo Naveen");
	 }

}
