package compareandcomparabe;

import java.util.Arrays;

class ComparableEx{
	public static void main(String[] args) {
		int[] intarr = {1,9,0,8,67,3,35,2};
		Arrays.sort(intarr);
		System.out.println(Arrays.toString(intarr));
		
		String[] strarr = {"Nave","venk","ravi","jsaj","cg","sjh","hbw"};
		Arrays.sort(strarr);
		System.out.println(Arrays.toString(strarr));
	}
}