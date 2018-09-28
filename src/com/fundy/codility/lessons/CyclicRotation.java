package com.fundy.codility.lessons;

import java.util.Arrays;

public class CyclicRotation {

	/*
	 * By given an integer array N and positive integer K, rotate the element on the array by K times.
	 * Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place.
	 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7].
	 * 
	 * E.g. 1: 
	 * 	Given
	 * 		A = [3, 8, 9, 7, 6]
	 * 		K = 3
	 * 	the function should return [9, 7, 6, 3, 8]. Three rotations were made:
	 * 		[3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
	 * 		[6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
	 * 		[7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
	 * 
	 * E.g. 2: 
	 * 	Given
	 * 		A = [0,0,0]
	 * 		K = 1
	 * 	the function should return [0, 0, 0]
	 * 
	 * E.g. 3: 
	 * 	Given
	 * 		A = [1, 2, 3, 4]
	 * 		K = 4
	 * 	the function should return [1, 2, 3, 4]
	 * 		
	 */
	
	public int[] solution (int[] ary, int k) {
		int[] result = new int[ary.length];
		int y = k - ary.length;
		if(y>0)
			k = y;
		int x = Math.abs(ary.length - k);
		if(x>0) {
			for(int i=0; i<ary.length; i++) {
				if(i<k)
					result[i] = ary[x+i];
				else
					result[i] = ary[i-k];
			}
		} else {
			result = ary;
		}
		System.out.println("[" + this.getClass().getSimpleName() + "] Input=" + Arrays.toString(ary) + ", k=" + k + ", result=" + Arrays.toString(result));
		return result;
	}
}
