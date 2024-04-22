package arrays;

//I want print duplicate values in an array

public class DuplicateNumbers {
	public static void main(String[] args) {
		int arr[] = { 18, 20, 3, 6, 8, 6 };
		printDuplicates(arr);
	}

	private static void printDuplicates(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
