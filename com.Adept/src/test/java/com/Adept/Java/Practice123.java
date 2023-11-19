package com.Adept.Java;

import java.util.Scanner;

abstract public class Practice123 {
	
	 public void method1() {
		System.out.println("123");
	}
	
	abstract public void method2();
	int x;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Age");
		int age = sc.nextInt();
		if(age>=16 && age<=85) {
			
			System.out.println(age);
		}
		else {
			System.out.println("ERROR ! Please Enter The Correct Age");
		}
		
		
		

	}

}
