package java8fetures;

@FunctionalInterface
public interface Hello {

	public void run();
	 default void name() {
		 System.out.println("Heelo Naveen");
	 }
}
