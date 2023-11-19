package com.Adept.Java;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Map<key, value> 
		Map<String, Integer> m = new HashMap<>();
		m.put("Ashu", 48);
		m.put("Rohan", 98);
		m.put("Harry", 74);
		m.put("Ashu", 38);
		m.put("Mayank",67);
		m.put("Bhuvan", 87);
		m.put("Harry", 50);
		m.put("Shubham", 12);
	System.out.println(	m.get("Ashu"));
		
		System.out.println(m);
		
		
		
	}

}
