package com.Adept.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//classname objname = new classname()
		
		// here Integer == generics == wrapper class == 
		ArrayList<Integer> ar = new ArrayList<>();
		//ar.add("Ashu"); //String
		ar.add(12); //Integer
		ar.add(14); // Float
		//ar.add('A'); // Character
		//ar.add("Yes");
		System.out.println(ar.size());
		ar.add(9);
		ar.add(89);
		System.out.println(ar.size());
		System.out.println(ar);
					

	}
	
	

}
