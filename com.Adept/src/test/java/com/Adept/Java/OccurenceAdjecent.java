package com.Adept.Java;

public class OccurenceAdjecent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aaaaaabbc";
		String output = generateCharacterCount(input);
		System.out.println(output);

	}

	
	public static String generateCharacterCount(String input) {
		if(input == null || input.isEmpty()) {
			return "";
		}
		StringBuilder result = new StringBuilder();
		char currentChar = input.charAt(0);
		int count = 1;
		
		for(int i=1; i<input.length();i++) {
			char current = input.charAt(i);
			if(current == currentChar) {
				count++;
				
			}
			else {
				result.append(currentChar).append(count);
				currentChar = current;
				count = 1;
			}
		}
		result.append(currentChar).append(count);
		return result.toString();
		
	}
	
}
