package com.Adept.Java;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> animal = new HashSet<>(); 
		
		animal.add("dog"); // dog, PRESENT
		animal.add("cat");
		animal.add("lion");
		animal.add("tiger");
		animal.add("dog");
		animal.add("lion");
		
		System.out.println(animal); // {dog, cat, tiger, lion}
		
		for(String s1:animal) {
			System.out.println(s1); 
		}
	}

}
