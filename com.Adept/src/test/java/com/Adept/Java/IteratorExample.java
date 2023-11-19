package com.Adept.Java;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		forEachExample();
		
		ArrayList arr = new ArrayList();
		arr.add(3);
		arr.add(5);
		arr.add(6);
		arr.add(87);
		arr.add(78);
		
		Iterator it = arr.iterator();
	
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
	
	
	
	public static void forEachExample() {
		System.out.println("Execution through for loop");
		
		int a[] = {1,3,4,67,8,9};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]); // a[0],a[1],a[2], a[3]...
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>");
		System.out.println("Execution through For each loop");
		for(int i:a) {
			System.out.println(i);
		}
		
	}

}
