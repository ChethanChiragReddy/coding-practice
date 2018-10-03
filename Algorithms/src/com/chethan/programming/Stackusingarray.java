package com.chethan.programming;

public class Stackusingarray {
	
	// LIFO Last in first out stack (LIFO)
	
	int mSize;
	int mArr[];
	int mTop;
	
	
	public Stackusingarray(int pSize){
		this.mSize  = pSize;
		this.mArr = new int[pSize];
		this.mTop = -1;
	}
	
	
	public void push(int pushElement){
		if(!isFull()){
			mTop++;
			mArr[mTop] = pushElement;
			System.out.println("Pushed element:" + pushElement);
		}else{
			System.out.println("Stack is full !");
		}
	}
	
	
	public int pop(){
		if(!isEmpty()){
			int returnedTop  = mTop;
			mTop--;
			System.out.println("Popped element :" + mArr[returnedTop]);
			return mArr[returnedTop];
		}else{
			System.out.println("Stack is empty !");
			return -1;
		}
	}
	
	public int peek(){
		return mArr[mTop];
	}
	
	public boolean isEmpty(){
		return (mTop == -1);
	}
	
	public boolean isFull() {
		return (mSize - 1 == mTop);
	}


	
	/**
	 * @param Testing Stack implemented using array
	 */
	public static void main(String[] args) {
		Stackusingarray StackCustom = new Stackusingarray(10);
		StackCustom.pop();
		System.out.println("=================");
		StackCustom.push(10);
		StackCustom.push(30);
		StackCustom.push(50);
		StackCustom.push(40);
		System.out.println("=================");
		StackCustom.pop();
		StackCustom.pop();
		StackCustom.pop();
		System.out.println("=================");
	}

}
