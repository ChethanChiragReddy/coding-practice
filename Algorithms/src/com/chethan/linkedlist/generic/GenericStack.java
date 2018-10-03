package com.chethan.linkedlist.generic;

public interface GenericStack<E> {
   void push(E v);
   E pop();
   E peek();
   boolean isEmpty();
}
