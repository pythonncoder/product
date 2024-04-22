package arrays;

import java.lang.String;
import java.lang.System;

public class Arrayscreatedupliacte {
	
	public static void main(String[] args) {
		int[] arr1 = { 1,3,2};
		int[] arr2 = new int[arr1.length*2];
		int count = arr1.length;
		int count1 =0;
		for (int i=0;i<arr1.length;i++) {
			arr2[count1++] += arr1[i]; 
			arr2[count++] += arr1[i];
		}
		for(int a:arr2)
		System.out.print(a);
	}

	
}
