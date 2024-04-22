package arrays;

import java.util.Arrays;

public class RemoveElemnts {
	public static void main(String[] args) {
		int[] originalarray = { 1, 2, 3, 4, 5 };
		int[] newarray = new int[originalarray.length - 1];
		int remove = 5;
		int[] arr = removeelement(originalarray,remove,newarray);
		System.out.println("Original array"+Arrays.toString(originalarray));
		System.out.println();
		System.out.println("new array"+Arrays.toString(arr));
	}

	public static int[] removeelement(int[] array, int remove, int[] newarray) {

		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != remove) {
				newarray[index] = array[i];
				index++;
			}
			
		}

		return newarray;

	}

}
