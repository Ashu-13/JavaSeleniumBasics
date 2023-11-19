package com.Adept.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) throws Exception, IOException, NullPointerException {
		// TODO Auto-generated method stub
		ScannerInput();
		
	}
	
	
	// BufferedReader class
	// br is an object of BufferedReader class
	// readLine()-- read string
	public static void bufferedReaderInputbyAshu() throws NumberFormatException, IOException {
		System.out.println("Enter your number ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name =br.readLine();
		int t = Integer.parseInt(name);
		
		System.out.println("Number you entered is: " + t);
		System.out.println("Enter your string");
		String s  = br.readLine();
		System.out.println("String you entered is: " + s);
		
	}
	
	
	
	
	
	public static void ScannerInput() {
		System.out.println("Enter your number");
		Scanner Objsc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int i= Objsc.nextInt();
		System.out.println("The number you entered is "+i);
				     
	}

	
	
	
	
	public static void consoleInput() throws Exception{
		
		System.out.println("Enter your data");
		
		String name = System.console().readLine();
		System.out.println(name);
		
	}
}
