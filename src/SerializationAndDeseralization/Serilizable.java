package SerializationAndDeseralization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serilizable {

	public static void main(String[] args) {

	
		Student s1 = new Student(101,"ramesh");
		
		try {
			File f = new File("E:\\WorkSpace3\\learn\\src\\SerializationAndDeseralization\\f.txt");
			FileOutputStream  fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject( s1);
			oos.flush();
			oos.close();
			System.out.println("Serilization is Completed");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
