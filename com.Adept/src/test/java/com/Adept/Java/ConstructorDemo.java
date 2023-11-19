package com.Adept.Java;

public class ConstructorDemo {
	
	
	
	float a = 6.7F;
	int b;
	int c;
	char ch;
	
	// Method == Function
	// Syntax= accessModifier returnType methodName(Parameter1, Parameter 2){}
		public int add(int x , int y) { 
			
			int z=x+y;
			return z;
		}
		
	
	public static void main(String args[]) {
		
		// Has some information and some functionality
		//new is a Keyword.
		ConstructorDemo obj = new ConstructorDemo();
		int a =5;
		
		//Syntax for object
		// className objvariable = new className();
		
		System.out.println(obj.a); //6.7
		System.out.println(obj.b);
		System.out.println(obj.ch);
		System.out.println(">>>>>>>>>>>>>>>>>>");
		System.out.println(obj.add(64,98)); //
		System.out.println(obj.add(10,15));
		System.out.println(obj.add(79,834));
		System.out.println(obj.add(824,2897));
	}

}
