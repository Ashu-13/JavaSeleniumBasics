package com.Adept.Java;

public class MehodOverLoad {

	public void add() {
	int a=10;
	int b =20;
	int c=a+b;
		System.out.println(c);
	}
	public void add(int a) {
		int b=10;
		int c=a+b;
		System.out.println(c);
		
	}
	public void add(float a) {
		System.out.println("floating arguments");
	}
	public void add(int a,int b) {
		
		int c= a+b;
		System.out.println(c);
	}
    public void add(float y, float z, int x) {
		
		System.out.println(">>>>>>");
	}
	
	public float add(float x, float y, float z) {
		System.out.println("add xyz");
		System.out.println("");
		return 0;
	}
	
	public void sub() {
		System.out.println("subtract");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MehodOverLoad obj = new MehodOverLoad();
		obj.add(1.2F, 8.9F, 8.8F);
		obj.add(9.4F, 3.3F, 1);
		
		
	}

}
