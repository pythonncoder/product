package multithreading;

import java.io.File;

public class FileMovingWithoutMultiThreadingExample {

	public static void main(String[] args) {

		boolean isInputToOutput = false;
		
		String inputFolderPath = null;
		String outputFolderPath = null;
		
		if (isInputToOutput) {
			inputFolderPath = "E:\\folders\\multithreadsFilesInput";
			outputFolderPath = "E:\\folders\\multithreadsFilesOutput";
		}else {
			inputFolderPath = "E:\\folders\\multithreadsFilesOutput";
			outputFolderPath= "E:\\folders\\multithreadsFilesInput";
		}
		
		File inputFolder = new File(inputFolderPath);
		File[] listOfFiles = inputFolder.listFiles();
		
		for ( File f:listOfFiles) {
	    if(f.isFile()) {
	    	moveFile(f,outputFolderPath);
	    }
		}
		System.out.println("Files moved successfully");
	}

	private static void moveFile(File file, String outputFolderPath) {

		File outputFolderFile = new File(outputFolderPath);
		File outputFile = new File(outputFolderFile,file.getName());
		
		if (file.renameTo(outputFile)) {
			System.out.println("Moved: " + file.getAbsolutePath() + " to " + outputFile.getAbsolutePath());
		}else {
			System.err.println("Error moving file: " + file.getAbsolutePath());
		}
		
	}

}
