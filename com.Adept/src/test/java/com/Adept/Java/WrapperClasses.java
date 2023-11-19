package com.Adept.Java;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// OOPs based-- objects (classes)
		// Primitve and Non-Primitive -- 
		// int , char , float , double -- Primitive Datatype
		// Wrapper Classes -- conversion of primitive datatypes into classes
		
		
		int a =10;
		Integer i = Integer.valueOf(a); //Wrapper class - Integer
		System.out.println("Primitive type "+a); //Primitive
		System.out.println("Wrapper class " +i); // Wrapper class
		char ch = 'A';
		Character ObjC = Character.valueOf(ch);
		System.out.println(ObjC);
		
	}

}
