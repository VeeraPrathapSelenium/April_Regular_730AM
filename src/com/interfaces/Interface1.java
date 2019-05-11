package com.interfaces;

public interface Interface1 {
	
	// public and final
	int a=20;
	
	int b=30;
	
	// abstarct methods, which are not having any implementation of the body
	
	int add();
	
	int sub();
	
	int multiplication();
	
	static int doBoth_Add_Mul()
	{
		return 0;
		
	}
	
	static int doBoth_Add_Sub()
	{
		return 0;
		
	}
	

}
