package com.Adept.Java;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		//String s = "Ashu"
		sc.close();
		String reversed = reverseString(input);
		System.out.println(reversed);
	

	}
	
	public static String reverseString(String input) {
		char[] charArray = input.toCharArray();
		int left = 0;
		int right = charArray.length-1;
		while(left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		return new String(charArray);
	
	}

}
