package multithreading;

import java.io.File;

public class MultiThreadedFileMovingExample {

		public static void main(String[] args) {

			boolean isInputToOutput = false;

			String inputFolderPath = null;
			String outputFolderPath = null;

			if (isInputToOutput) {
				inputFolderPath = "E:\\folders\\multithreadsFilesInput";
				outputFolderPath = "E:\\folders\\multithreadsFilesOutput";
			} else {
				inputFolderPath = "E:\\folders\\multithreadsFilesOutput";
				outputFolderPath = "E:\\folders\\multithreadsFilesInput";
			}

			// Number of user defined threads to use
			int numOfThreads = 5;

			File inputFolder = new File(inputFolderPath);
			File[] listOfFiles = inputFolder.listFiles();

			if (listOfFiles != null) {
				// Create an array of thread objects based on user defined numOfThreads
				Thread[] threads = new Thread[numOfThreads];

				// Submit tasks to move each file using separate threads
				for (int i = 0; i < numOfThreads; i++) {
					threads[i] = new Thread(new FileMover(listOfFiles, i, numOfThreads, outputFolderPath));
					threads[i].start();
				}

				// Wait for all threads to complete
				try {
					for (Thread thread : threads) {
						thread.join();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("File move completed.");
			}

		}

		static class FileMover implements Runnable {
			private final File[] listOfFiles;
			private final int threadNumber;
			private final int numOfThreads;
			private final String outputFolderPath;

			public FileMover(File[] listOfFiles, int threadNumber, int numOfThreads, String outputFolderPath) {
				this.listOfFiles = listOfFiles;
				this.threadNumber = threadNumber;
				this.numOfThreads = numOfThreads;
				this.outputFolderPath = outputFolderPath;
			}

			@Override
			public void run() {
				for (int i = threadNumber; i < listOfFiles.length; i += numOfThreads) {
					File file = listOfFiles[i];
					if (file.isFile()) {
						moveFile(file, outputFolderPath);
					}
				}
			}

			private void moveFile(File file, String outputFolder) {
				File outputFolderFile = new File(outputFolder);
				File outputFile = new File(outputFolderFile, file.getName());

				if (file.renameTo(outputFile)) {
					System.out.println("Moved: " + file.getAbsolutePath() + " to " + outputFile.getAbsolutePath());
				} else {
					System.err.println("Error moving file: " + file.getAbsolutePath());
				}
			}
		}

	}


