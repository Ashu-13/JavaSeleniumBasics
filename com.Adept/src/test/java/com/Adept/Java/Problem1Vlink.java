package com.Adept.Java;

import java.util.*;

public class Problem1Vlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "nagaram";
		
		boolean result = isAnagram(s, t);
		if(result) {
			System.out.println(t + "is an anagram of"+s);
		}
		else {
			System.out.println(t + "is not an anagram of"+s);
		}

	}
	public static boolean isAnagram(String s,String t) {
		
		if(s.length()!=t.length()) {
			return false;
		}
		Map<Character, Integer> charFrequency =new HashMap<>();
		
		for( char c: s.toCharArray()) {
			charFrequency.put(c, charFrequency.getOrDefault(c, 0)+1);
		}
		
		for( char c: t.toCharArray()) {
			int frequency = charFrequency.getOrDefault(c, 0);
			if(frequency == 0) {
				return false;
			}
			
			charFrequency.put(c, frequency-1);
		}
		return charFrequency.values().stream().allMatch(frequency->frequency==0);
		
		
	}
	
	

}
