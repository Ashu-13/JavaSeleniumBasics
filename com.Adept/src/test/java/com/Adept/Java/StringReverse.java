package com.Adept.Java;

 public class StringReverse {

	 private int num=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //String[] name1 ={"Bhuvan","Rajeev","Ashu","Nitin","Mayank","A"};
	   String name = "Bhuvan";
	   String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			System.out.print(name.charAt(i));
		
		}
		System.out.println(name);
		if(name.equals(rev)) {
			System.out.println("Palindrom");
		}
		else
			System.out.println("Not Palindrome");
		
	}
	
	//Anagram = when string1,string2 have letters
	//example= andiii,idiain == ascending order- sort
	//ajbe==abej
	
	
	public  void sentenceReverse() {
		
		String sentence= "This is a java class";
		String[] s1= sentence.split(" ");
		
	}

}
