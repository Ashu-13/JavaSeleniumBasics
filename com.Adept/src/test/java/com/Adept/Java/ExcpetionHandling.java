package com.Adept.Java;

import java.io.File;

public class ExcpetionHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		exceptionHandleThrow();
		
	}

	public static void exceptionOccur() {

		int a =10;
		int b = 0;
		int c=a/b;
		System.out.println(c); // Arthemetic Exception Divide(/) by 0
	}
	
	
	
	public static void exceptionHandleTryCatchbyAshu() {
		
		int a =10;
		int b = 0;
		try 
		{
		int c=a/b; // 10/2==5
		System.out.println(c); //5
		
		
		}
		
		catch(ArithmeticException ashu) {
			System.out.println(ashu.getMessage());
			System.out.println("Exception Due to Mathematical logical error");
		}
		
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Exception in 2nd block");
						
		}
		
	
		
		finally {
			System.out.println("Division Done Successfully");
			
		}
		
	}
	
	public static void exceptionHandleThrows() throws Exception {
		int a =10;
		int b = 0;
		int c=a/b;
		System.out.println(c);
	}
	
	public static void exceptionHandleThrow() {
		
		int a =10;
		int b = 5;
		int c=a/b;
		if(c<10) {
		throw new ArithmeticException("exception occured in this method [anything you can write ]");
		}
		
		}
}
