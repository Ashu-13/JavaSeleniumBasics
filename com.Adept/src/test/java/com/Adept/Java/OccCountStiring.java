package com.Adept.Java;

import java.util.*;

public class OccCountStiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "";
		occurenceCount(input);
				

	}
	
	public static void occurenceCount(String input) {
		if(input == null || input.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
		Map<Character, Integer> charCountMap = new HashMap<>();
		for(char e : input.toCharArray()) {
			charCountMap.put(e,  charCountMap.getOrDefault(e, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
	}

}
