package com.fundy.codility.lessons;



public class BinaryGap {
	
	/*
	 * By given an positive integer N, find longest binary gap ("0" that occurs in between "1" is consider as a gap).
	 * 
	 * E.g.: 
	 * 	1. Given N = 1041, and its binary is 10000010001, hence its longest binary gap is of length 5.
	 * 	2. Given N = 32, and its binary is 100000, hence the function should return 0. 
	 */
	public int solution (int num) {
		int result = 0;
		int counter = 0;
		String binaryStr = Integer.toBinaryString(num);
		for(int i=0; i<binaryStr.length(); i++) {
			Character curr = binaryStr.charAt(i);
			if(curr.equals('1')) {
				if(counter > 0 && counter > result) {
					result = counter;
				}
				counter = 0;
			} else if(curr.equals('0')) {
				counter++;
			}
		}
		System.out.println("[" + this.getClass().getSimpleName() + "] Input=" + num + ", binary=" + binaryStr + ", result=" + result);
		return result;
	}
}
