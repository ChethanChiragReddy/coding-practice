package com.chethan.programming;

/**
 * @author Chethan 
 * 
 * Binary Gap in the given integer number 
 *
 */
public class BinaryGap {
	
	public static void main(String[] args) {
		System.out.println("Binary Gap " + BinaryGap.sloution(1041));
	}
	
	public static int sloution(int n){
		// Look for the first 1
		int first1index = 0;
		for(int i=0;i<32;i++){
				if(getNthBit(n,i) ==1){
					first1index =1;
					break;
				}
		}
		int currentgap = 0;
	    int biggestgap = 0;			
		for(int i = first1index;i<32;i++){
			 System.out.println("getNthBit" +getNthBit(n, i));
			 if(getNthBit(n, i)==0){
				 currentgap ++;
			 }else{
				 if(currentgap >biggestgap){
					 biggestgap = currentgap;
				 }
				 currentgap =0;
			 }
		}
		return biggestgap;
	}

	public static int getNthBit(int thenumber, int bitpostion) {
		int mask =1;
		final int thenumberShifted  = thenumber >> bitpostion;
		return thenumberShifted & mask;
	}

}
