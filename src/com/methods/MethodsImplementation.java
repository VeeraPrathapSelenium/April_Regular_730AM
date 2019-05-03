package com.methods;

public class MethodsImplementation {

	public static void main(String[] args) {
		
		MethodsImplementation obj=new MethodsImplementation();
		int result=obj.add(78,20);
		
		System.out.println(result);
		
		
		result=obj.add(89,85);
		
		System.out.println(result);

	}
	
	public  int add(int a, int b)
	{
			
		return a+b;
		
		
	}
	
	
	

}
