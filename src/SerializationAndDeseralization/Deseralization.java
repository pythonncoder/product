package SerializationAndDeseralization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Deseralization {
	public static void main(String[] args) {
		
		try {
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream ("f.txt"));
			Student s = (Student) ois.readObject();
			System.out.println(s.getId() +" "+s.getName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} . catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
