package com.chethan.algorithms;

public class CircularSinglyList {
	
	private ListNode last;
	private int length;
	
	
	private class ListNode{
		private ListNode next;
		private int data;
		
		public ListNode(int data){
			this.data = data;
		}
	}
	
	public CircularSinglyList(){
		last = null;
		length = 0;
	}
	
	public int length(){
		return length;
	}
	
	public boolean isEmpty(){
		return length ==0;
	}
	
	public void createCircularSinglyList(){
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(10);
		ListNode fourth = new ListNode(15);
		
		first.next = second;
		second.next  = third;
		third.next = fourth;
		fourth.next  = first;
		
		last = fourth;
	}
	
	public static void main(String[] args){
		CircularSinglyList circularSinglyList  = new CircularSinglyList();
		circularSinglyList.createCircularSinglyList();
	}

}
