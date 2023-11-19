package com.Adept.Java;

public class EvenOddd {
	
	int xyz=90;
	
	
	public int findEvenOdd(int n) {
		if(n%2==0) {
			
			System.out.println("Even Number");
		}
		else
		System.out.println("Odd number");
		
	  return 0;
	}

	
	public void tableOfFive(int num) {
	
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddd obj = new EvenOddd();
		obj.findEvenOdd(4);
		obj.tableOfFive(9);
		System.out.println(obj.xyz);

	}

}
