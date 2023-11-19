package com.Adept.Java;

public class SakshiProjectBOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "Document{{_id=639784bb81a42b8e2784bOf3, rfrType=RP, attestor=NBK5G2Q, flu=TREASURY";
		String[] arr = s.split(",");
		for(String s1:arr) {
			System.out.println(s1);
			
		}
		System.out.println(">>>>>>"+arr[2]);
		
		String temp = arr[2];
		System.out.println("------->"+temp);
		
		String arr1[] = temp.split("=");
		for(String s2:arr1) {
			System.out.println(s2);	
		}
		
		

	}

}
