package com.Adept.Java;

public class StringbufferDemo {

	public static void main(String[] args) {
	
		//Strings can be made mutable with the help of String Builder and String Buffer
		String s1= new String("Ashu");
		s1.concat("name");
		System.out.println(s1);
		
		
		StringBuffer obj = new StringBuffer("Ashu");
		obj.append("name"); 
		System.out.println(obj); //Ashuname
		obj.reverse();
		System.out.println(obj); //emanuhsA
		
		
		//String Buffer= ThreadSafe, Synchronized
		//String Builder= is not ThreadSafe, Synchronized
		
		
		
		
	}

}
