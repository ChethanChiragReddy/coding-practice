package com.chethan.algorithms;

public class SinglyLinkedListGeneric<T> {
	
	private Node<T> head;
	private Node<T> tail;
	
		
	
	
	public class  Node<T> implements Comparable<T>{
		
		private T value;
		private Node<T> nextref;
		
	
		public T getValue() {
			return value;
		}
		public void setValue(T value) {
			this.value = value;
		}
		public Node<T> getNextref() {
			return nextref;
		}
		public void setNextref(Node<T> nextref) {
			this.nextref = nextref;
		}
		public int compareTo(T arg0) {
			if(arg0 ==this.value){
				return 0;
			}else{
				return 1;
			}		
		}
		
	}
	
	public void add(T element){
		Node<T> nd = new Node<T>();
		nd.setValue(element);
		System.out.println("adding: " +element);
		// to check the linkedlist is empty or not
		if(head == null){
			// since 	there only one element,both head and tail points is same object
			head = nd;
			tail = nd;
		}else{
			// set current tail next link to new node 
			tail.setNextref(nd);
			// set tail as newly created node
			tail =nd;
		}
	}
	
	
	public void addAfter(T element, T After){
		
	}

}
