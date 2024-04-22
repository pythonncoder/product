package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {
		
		// checked exception means compile timr error 
	   // if i am giveing one file that file is not their on that time it is compiler throw the error
		File file = new File("text.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("FileNotFoundException throw error");
		}finally {
			System.out.println("Thanks for you takes my services ");
		}

	}

}
