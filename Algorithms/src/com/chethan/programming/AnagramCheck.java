package com.chethan.programming;

public class AnagramCheck {
	
	
	
	public static void main(String arg[]){
		boolean isAnagram = AnagramCheck.isAnagram("word", "wrdo");
		System.out.println("isAnagram  " +isAnagram);
	}
	
	
	public static boolean isAnagram(String word,String anagram){
		if(word.length()!= anagram.length()){
		    return false;
		}
		
		char[] chars = word.toCharArray();
		
		for(char c: chars){
			int index = anagram.indexOf(c);
			
		    
			if(index!= -1){
				anagram = anagram.substring(0, index) + anagram.substring(index+1,anagram.length()); 
				
				
			}else{
				return false;
			}
		}
		
		return anagram.isEmpty();
		
	}

}
