package com.arrays;

public class StringArray {

	public static void main(String[] args) {


		String[] arr=new String[4];
		
		
		
		arr[0]="hello";
		arr[1]="india";
		
		
		
		// print all the values one at a time
		
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
		
	}
	System.out.println("**************************************");
	for (String prathap : arr) {
		
		System.out.println(prathap);
		
	}
	
	

	}

}
