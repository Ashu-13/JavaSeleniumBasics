package com.Adept.Java;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =0; i<5; i++) {
			
			System.out.println("Dheeme Dheeme");
			
		}
		System.out.println("             By Tony Kakkar");
		
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");		
		
		String I_say= "tumsa haseen";
		System.out.println(I_say);
		if(I_say.equals("tumsa haseen")){
			System.out.println("Kaayanat me nahi hai koi");
		}

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");		

		String s2="tum mil jao";
		if(s2.equals("tum")) {
			System.out.println("Zamana chohdd denge hum");
		}else
			System.out.println("Jeena shuru kr denge hum");
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");		
		
		
       String s="jab tak rahega samose me aaloo ";
       int flag=0;
       while(!s.isEmpty()) {
    	   
    	   System.out.println(">>>>>>"+s);
    	   flag++;
    	   if(flag==2) {
    	   break;
    	   }
       }
       System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");		

       do{
   		
   		System.out.println("Tab tak rahegi ye teri shaalu");
   	}while(s.isBlank());
   	
	}
	
	

}
