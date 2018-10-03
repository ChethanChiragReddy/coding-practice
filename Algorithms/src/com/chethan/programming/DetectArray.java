package com.chethan.programming;

public class DetectArray {
	
	
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		boolean lCheck  = has_cycle_in_array(array, array.length);
		System.out.println("has_cycle_in_arrays "+lCheck);
	}

	public static boolean has_cycle_in_array(int a[] ,int n){
		 if(n == 1) return false;
		    int slow = 0, fast = 0;
		    while(slow < n && fast < n) {
		        if(a[slow] >= 0 && a[slow] < n)
		            slow = a[slow];
		        else {
		            slow++;
		            fast++;
		            continue;
		        }
		        
		        int step = 0;
		        while(step < 2 && a[fast] >= 0 && a[fast] < n) {
		            fast = a[fast];
		            step++;
		        }
		        if(step < 2) {
		            fast++;
		            slow = fast;
		        } else if(slow == fast) return true;
		    }
		    return false;
      }
}
