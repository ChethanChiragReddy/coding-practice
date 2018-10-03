package com.chethan.linkedlist.generic;

import java.util.EmptyStackException;

/**
 * @author Chethan Chirag Reddy
 * 
 * @param <E>
 */
public class LinkedListStack<E> implements GenericStack<E>{
	private Element<E> top;
	
	public LinkedListStack(){
		top = null;
	}
	
	private static class Element<E>{
		private E data;
		private Element<E> next;
		
		Element(E data,Element<E> next){
			this.data = data;
			this.next = next;
		}
	}

	public void push(E v) {
		if(v == null){
			throw  new NullPointerException();
		}
		top  = new Element<E>(v, top);
	}

	public E pop() {
		if(isEmpty()){
			throw new EmptyStackException();
		}
		E data  = top.data;
		top = top.next;
		return data;
	}

	public E peek() {
		if(isEmpty()){
			throw new EmptyStackException();
		}
		E data  = top.data;
		return data;
	}

	public boolean isEmpty() {
		return (top == null);
	}

}
