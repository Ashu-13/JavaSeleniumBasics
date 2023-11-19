package com.Adept.Java;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodDemo obj = new MethodDemo();
		obj.func1();
		obj.func2(20, 19);
		
	}
	
	public void func1() {
		
		int a=4;
		int b = 5;
		int c = a+b;
		System.out.println(c);
	}

	public void func2(int a , int b) {
		int c = a+b;
		System.out.println(c);
		
	}
}
