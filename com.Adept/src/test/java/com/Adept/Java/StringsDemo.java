package com.Adept.Java;

public class StringsDemo {

	public static void main(String[] args) {
		
		// String is consider as Non-Primitive Datatype
		// String is Final class and immutable
		//Wrapper Classes-Integer, Character - final+immutable
		// Final variable== can't be changed throughout the program
		// Final method== can't be overridden
		// Final class = can't be inherited
		
		String s5= "This is java";
		String s1 = "ASHU"; 
		String s2 = "Ashu";
	//	String s3 = "Ashu";	
		
		String s4 = new String("Ashu");
		String s6 = new String("Ashu");
		
		
		
		
		if(s4.equals(s6)) {
			System.out.println("The values are Same");
		}
		
		
		System.out.println(s5.length());
		System.out.println(s1.toLowerCase());
		
		System.out.println("The value at 3rd index "+s1.charAt(3));
		
		
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));   //iteration 1= A
												// iteration2 = S		
		}
		
		String name1="Rohit ";
		String name2="Sharma";
		System.out.println(name1+name2);
		System.out.println(name1.concat(name2));
		System.out.println("The value of name1 is still the same "+name1);
		
		System.out.println(s5.substring(4));
		System.out.println(s1.contains("Z"));
		
		//Imumutable== can't change
		
		//Can be Mutable with the help of String Builder and String Buffer
		

	}

}
