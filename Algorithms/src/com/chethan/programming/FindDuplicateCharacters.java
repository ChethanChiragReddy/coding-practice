package com.chethan.programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
	
	public static void main(String ag[]){
		printDuplicateCharacter("Programming");
		printDuplicateCharacter("Combination");
		printDuplicateCharacter("Java");
	}
	
	
	public static void printDuplicateCharacter(String word){
		char[] characters  = word.toCharArray();
		
		Map<Character,Integer> charMap  = new HashMap<Character, Integer>();
		
		for(Character ch : characters){
			 if(charMap.containsKey(ch)){
				 charMap.put(ch, charMap.get(ch)+1);
			 }else{
				 charMap.put(ch, 1);
			 }
		}
		// Iterate the dupicate Character in the word
		Set<Map.Entry<Character,Integer>> entryset  = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", word);
		
		for(Map.Entry<Character, Integer> enrtry :entryset){
			if(enrtry.getValue() >1){
				 System.out.printf("%s : %d %n", enrtry.getKey(), enrtry.getValue());
			}
		}
	}

}
