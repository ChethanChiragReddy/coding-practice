package com.chethan.algorithms;

import java.util.Arrays;

public class MissingNumberInArray {
	
	
	public static void main(String arg[]){
		int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(iArray), missing);
	}
	
	
	private static int getMissingNumber(int[] number, int totalCount){
		int expectedSum  = totalCount * ((totalCount+1)/2);
		int actualSum = 0;
		
		for(int i:number){
			 actualSum += i;
		}
		return expectedSum - actualSum;
	 }


}
