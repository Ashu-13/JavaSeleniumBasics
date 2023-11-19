package com.Adept.Java;

import java.util.ArrayList;
import java.util.List;

public class SubStringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainString = "testabctest";
		String substring = "test";
		
		List<Integer> occurances = findSubstringOccurences(mainString, substring);
		
		if(occurances.isEmpty()) {
			System.out.println("No Occurances Found.");
			
		}
		else {
			System.out.println("Occurances found at indices: "+occurances);
		}
	
	}
	 // testabctest, test
	public static  List<Integer> findSubstringOccurences(String minString, String subString){
        List<Integer> indices = new ArrayList<>();
  int lastIndex = 0;

while(lastIndex!=-1){
    lastIndex = minString.indexOf(subString, lastIndex);
    if(lastIndex!=-1){
        indices.add(lastIndex);
        lastIndex += subString.length();
    }
}
return indices;
}
    }






