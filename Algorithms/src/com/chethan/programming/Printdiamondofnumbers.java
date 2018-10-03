package com.chethan.programming;

import java.util.Scanner;

public class Printdiamondofnumbers {
	
	
	public static void main(String[] arg){
	//	Scanner lScanner = new Scanner(System.in);
		
	//	int noofrows = lScanner.nextInt();
		
		int midrow  = 7/2;
		
		int row = 1;
		 System.out.println("Here Is Your Diamond : ");
		for(int i=midrow;i>0;i--){
			
			for(int j =1;j<=i;j++){
				System.out.print(" ");
			}
			
			for(int j=1;j<=row;j++){
				System.out.print("*  ");
			}
			System.out.println();
			row++;
		}
		
		for (int i = 0; i <= midrow; i++) 
        {
			System.out.print(" "); 
        }
		
		for (int j = row; j > 0; j--) {
			System.out.print("*  ");
		}
		System.out.println();
		
		row--;
	}

}
