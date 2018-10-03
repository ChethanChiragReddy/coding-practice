package com.chethan.stack.generic;

public class Stack<T>  {
  int size;
   StackElement<T> top;
   
   
   public Stack(){
	   size = 0;
	   top  = null;
   }
   
   public void push(T newValue){
	   StackElement<T> newElement = new StackElement<T>(newValue, top);
	   top  = newElement;
	   size++;
   }
   
   public T pop(){
	   StackElement<T>  oldtop = top;
	   if(size ==0){
		   return null;
	   }
	   top = top.getNext();
	   size--;
	    return  oldtop.getValue();
   }
   
   public T peek(){
	   if(size ==0){
		   return null;
	   }
	   return top.getValue();
   }
   
   
   public void empty(){
	   size =0;
	   top = null;
   }
   
    
   public static void main(String[] args) {
	 Stack<String> mstring = new Stack<String>();
	 mstring.push("Chethan");
	 mstring.push("fiyaz");
	 System.out.println(mstring.peek());
	 System.out.println(mstring.pop());
	 System.out.println(mstring.pop());
	 System.out.println(mstring.pop());
   }
}
