package com.fundy.codility.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OddOccurrencesInArray {

	/*
	 * By given an positive integer array. Each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
	 * 
	 * E.g.: 
	 * 	A[0] = 9  A[1] = 3  A[2] = 9
	 * 	A[3] = 3  A[4] = 9  A[5] = 7
	 * 	A[6] = 9
	 * 
	 * 	- the elements at indexes 0 and 2 have value 9,
	 * 	- the elements at indexes 1 and 3 have value 3,
	 *  - the elements at indexes 4 and 6 have value 9,
	 *  - the element at index 5 has value 7 and is unpaired.
	 *  
	 *  the function should return 7
	 */
	
	public int solution (int[] ary) {
		int result = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<ary.length; i++) {
			if(list.contains(ary[i])) {
				list.remove(list.indexOf(ary[i]));
			} else {
				list.add(ary[i]);
			}
		}
		if(list.size() == 1) {
			result =  list.get(0);
		} else {
			result = -1;
		}
		System.out.println("[" + this.getClass().getSimpleName() + "] Input=" + Arrays.toString(ary) + ", result=" + result);
		return result;
	}
}
