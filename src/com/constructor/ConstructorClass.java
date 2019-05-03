package com.constructor;

public class ConstructorClass {

	ConstructorClass()
	{
		System.out.println("i am a constructor");
	}
	
	ConstructorClass(int a)
	{
		System.out.println("i am a one arg constructor"+ a);
	}
	
	ConstructorClass(int a,int b)
	{
		System.out.println("i am a two arg constructor"+ (a+b));
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorClass con=new ConstructorClass();
		
		ConstructorClass con1=new ConstructorClass(10);
		
		ConstructorClass con2=new ConstructorClass(10,58);

	}

}
