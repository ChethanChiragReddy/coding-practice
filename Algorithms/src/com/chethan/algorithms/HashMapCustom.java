package com.chethan.algorithms;

public class HashMapCustom <K,V>{
	
	private Entry<K,V>[] table;
	private int capacity = 4;
	
	
	static class Entry<K,V>{
		K Key;
		V value;
		Entry<K,V> next;
		
		public Entry(K Key,V Value,Entry<K,V> next){
			this.Key = Key;
			this.value= Value;
			this.next = next;
		}
	}
	
	public HashMapCustom() {
		 table = new Entry[capacity];
	}
	
	public void put(K newKey,V Data){
		
	}

}
