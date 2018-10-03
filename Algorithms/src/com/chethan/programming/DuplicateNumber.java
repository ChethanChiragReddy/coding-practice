package com.chethan.programming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CAE5KOR
 * 
 * You have got a range of numbers between 1 to N, where one of the number is
   repeated. You need to write a program to find out the duplicate number.
 *
 */
public class DuplicateNumber {

	
	public int findDuplicateNumber(List<Integer> numbers){
		int higestnumber   = numbers.size() -1;
		int total  = getSum(numbers);
		int dupliacte  = total -(higestnumber *(higestnumber+1)/2);
		return dupliacte;
	}
	
	public int getSum(List<Integer> numbers){
		int sum  = 0;
		for(int num:numbers){
			sum += num;
		}
		return sum;
	}
	
	public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(22);
        DuplicateNumber dn = new DuplicateNumber();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }
}
