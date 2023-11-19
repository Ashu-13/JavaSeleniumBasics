package com.Adept.Java;

public class TypesOfVar {
	
	int x=3; // instance variable
	static int xyz=8; //static variable or class variable , We can call it directly via classname
	int m=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TypesOfVar obj = new TypesOfVar();
		obj.method1(4);
		System.out.println("the value of x is "+obj.x);
		
		System.out.println(xyz);
		System.out.println(TypesOfVar.xyz);
		System.out.println(obj.m);
	
		obj.method1(8);
		
	}
	public void method2() {
	int y=67;	
	System.out.println(m);
	System.out.println(y);
	}

	
	public void method1(int n) //here 'n' is local variable
	{
		System.out.println(m);
		int a =5; // 'a' local variable
		System.out.println(">>>>>>"+a+ " and other local var in params " +n);
	
	}
	

}
