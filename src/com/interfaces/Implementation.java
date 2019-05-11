package com.interfaces;

public abstract class Implementation implements Interface1,Interface2{

	@Override
	public int modDiv() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public int add() {
		System.out.println("i am doing addition");
		return 0;
	}
	
	
	public static void doTesting()
	{
		System.out.println("Own method");
	}
	
	abstract void dosunm();

	
// when we do partial implementation of an interface then we need to use a keyword called abstract before the class name
	
// for abstarct classes we can not create an object
	
// when any other class that extends abstarct class. it will force the newly extended class to implement unimplemented methods
	
// a abstarct class can have both astarct methods and aswell as normal methods
	
// it is not mandatory for a abstarct class to have abstarct methods
// we can not create any object to interface and abstarct class
	
	
	
	

	
}
