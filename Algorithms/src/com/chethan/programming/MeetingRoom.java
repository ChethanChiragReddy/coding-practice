package com.chethan.programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * Given an array of meeting time intervals consisting of 
 * start and end times [[s1,e1],[s2,e2],...] find the minimum number of 
 *  conference rooms required.
 * 
 */

public class MeetingRoom {
	
	public static class Interval{
		int start ;
		int end ;
		public Interval() {
			start =0;
			end = 0;
		}
		public Interval(int s,int e){
			start = s;
			end = e;
		}
	}
	
	public static void main(String[] args) {
		Interval i1 = new Interval(0, 30);
        Interval i2 = new Interval(5, 10);
        Interval i3 = new Interval(15, 10);

        Interval[] interval = {i1,i2,i3};
        System.out.println(minmeetingrooms(interval));
	}
	
	
	public static int minmeetingrooms(Interval[] interval){
		 if(interval == null|| interval.length ==0){
			 return 0;
		 }
		 Arrays.sort(interval, new Comparator<Interval>() {
			public int compare(Interval i1, Interval i2) {
				return i1.start-i2.start;
			}
		});
		 PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		 int count = 1;
		 queue.offer(interval[0].end);
		 for(int i=1; i<interval.length; i++){
			 if(interval[i].start < queue.peek()){
				 count++;
			 }else{
				 queue.poll();
			 }
			 queue.offer(interval[i].end);
		 }
		 return count;
		 
	}  

}
