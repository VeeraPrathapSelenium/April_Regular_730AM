package com.arrays;

public class ObjectArray {

	public static void main(String[] args) {

		
	// in java for every class the parent class is called "Object" class
		
	// this object class have some predefined methods available
		
	// based on the situation and purpose those methods are overridden
		
		Object[] myarr=new Object[5];
		
		myarr[0]="india";
		myarr[1]=123;
		
	// from this i can declare that Object array is called as hetrogenius array
		
		for (Object item : myarr) {
			
			System.out.println(item);
			
		}
		
		
		

	}

}
