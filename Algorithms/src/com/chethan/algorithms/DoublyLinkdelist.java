package com.chethan.algorithms;

import java.util.NoSuchElementException;

public class DoublyLinkdelist {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	
	private class ListNode{
		
		private int data;
		private ListNode previous;
		private ListNode next;
		
		public ListNode(int data){
			this.data = data;
		}
		
	}
	
	public DoublyLinkdelist(){
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	
	public boolean isEmpty(){
		return length == 0; 
	}
	
	public int lenth(){
		return length;
	}
	
	
	public void displayForward(){
		if(head == null){
			return;
		}
		ListNode temp = head;
		while(temp!=null){
			System.out.println(temp.data +" -->  ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public void displayBackward(){
		if(tail == null){
			return;
		}
		ListNode temp = tail;
		while(temp!=null){
			System.out.println(temp.data +" -->  ");
			temp = temp.previous;
		}
		System.out.println("null");
	}
	
	// insert the node at the starting of the doublyLinkedList
	
	public void insertNode(int value){
		ListNode newNode = new ListNode(value);
		if(isEmpty()){
			tail = newNode;
		}else{
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	// Delete the first Node in DoublyLinkedList
	
	public ListNode deleteFirstNode(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		ListNode temp = head;
		if(head == tail){
			tail = null;
		}else{
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;
		
	}
	
	public static void main(String[] args) {
		DoublyLinkdelist dll = new DoublyLinkdelist();
		dll.insertNode(1);
		dll.insertNode(10);
		dll.insertNode(15);
		dll.displayForward();
		
		
		dll.deleteFirstNode();
		dll.deleteFirstNode();
		dll.deleteFirstNode();
		
	//	dll.deleteFirstNode();
		
		dll.displayForward();
	}

}
