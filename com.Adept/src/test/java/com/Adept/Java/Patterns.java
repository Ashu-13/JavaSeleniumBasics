package com.Adept.Java;

public class Patterns {

	
	public void pattern1() {
	
		for(int row=1;row<=4;row++) {
			
			for(int col=1;col<=row;col++) {
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
	
	public void pattern2() {
		
		
		for(int row=1;row<=4;row++) {
			
			for(int col=1;col<=row;col++) {
				
				System.out.print(col+ " ");
			}
			System.out.println();
			
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patterns obj = new Patterns();
		//obj.pattern1();
		obj.pattern2();

	}

}
