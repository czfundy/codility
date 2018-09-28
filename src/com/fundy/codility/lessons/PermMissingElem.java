package com.fundy.codility.lessons;

import java.util.Arrays;

public class PermMissingElem {

	/*
	 * By given an positive integer array. The value of the array should be in sequence with missing 1 element in between. 
	 * Find the exactly one element is missing.
	 * 
	 * E.g.: 
	 * 	A[0] = 2  A[1] = 3  A[2] = 1
	 * 	A[3] = 6  A[4] = 5  A[5] = 7
	 * 
	 * 	the function should return 4, as it is the missing element.
	 */
	
	public int solution (int[] ary) {
		int result = 0;
		Arrays.sort(ary);
		for(int i=0; i<ary.length; i++) {
			if(ary[i] + 1 != ary[i+1]) {
				result = ary[i] + 1;
				break;
			}
		}
		System.out.println("[" + this.getClass().getSimpleName() + "] Input=" + Arrays.toString(ary) + ", result=" + result);
		return result;
	}
}
