package com.Adept.Java;

public class GarbageCollectionDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectionDemo obj = new GarbageCollectionDemo();
		GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
		
		obj = null; // unreferenced object
		obj1= null;
		
		System.gc();

	}
	
	public void finalize() {
		System.out.println("GC calls");
		
	}

}
