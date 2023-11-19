package com.Adept.Java;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomArrayListStudent {

        // super keyword
		String name;
		int rollNo;
		int marks;
		CustomArrayListStudent(String name, int rollNo , int marks){
			this.name = name;
			this.rollNo= rollNo;
			this.marks= marks;
					
	}
		public static void main(String args[]) {

		CustomArrayListStudent student1 = new CustomArrayListStudent("Ashu", 10, 76);
		CustomArrayListStudent student2 = new CustomArrayListStudent("Ash", 11, 98);
		
		ArrayList<CustomArrayListStudent> a = new ArrayList<CustomArrayListStudent>();
		
		
		a.add(student1);
		a.add(student2);
	
		Iterator<CustomArrayListStudent> it = a.iterator();
		
		while(it.hasNext()) {
			
			CustomArrayListStudent stuDetails=it.next();
			
			System.out.println(stuDetails.marks);
		}
	}
		
}
