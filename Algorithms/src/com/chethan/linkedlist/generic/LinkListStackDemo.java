package com.chethan.linkedlist.generic;

public class LinkListStackDemo {
	
   public static void main(String[] args) {
	   
	   LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
	   stack.push(4);
	   stack.push(45);
	   stack.push(34);
	   stack.push(134);
	   
	   while(!stack.isEmpty()){
		   System.out.println(stack.pop());   
	   }
  }

}
