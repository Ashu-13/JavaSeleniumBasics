package com.Adept.Java;
import java.util.HashMap;

public class FindOccurenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString= "Ashutosh Kumar";
		
		HashMap<Character, Integer> charOccurence = findCharacterOccurence(inputString);
		for(char c: charOccurence.keySet()) {
			System.out.println("Character '"+c+"' occurs "+charOccurence.get(c)+" times");
		}

	}
	public static HashMap<Character, Integer> findCharacterOccurence(String input){
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		input = input.toLowerCase();
		char[] charArray = input.toCharArray();
		
		for(char c: charArray) {
			if(c!=' ') {
				if(charCountMap.containsKey(c)) {
					charCountMap.put(c, charCountMap.get(c)+1);
				}
				else {
					charCountMap.put(c,1);
				}
			}
		}
		return charCountMap;
		
	}
	
	

}
