package com.staticandinstance;

public class StaticAndInstance {
	
	
	int a=10;
	
	int b=20;
	
	boolean status=false;
	
	static int c=30;
	
	static int d=40;	
	
	

	public static void main(String[] args) {
		
		System.out.println(c);
		System.out.println(d);
		
		// how to create an object
		// syntax: Classname somename=new Classname();
		
		StaticAndInstance obj=new StaticAndInstance();//--->object creation
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		System.out.println(obj.status);
		
	}
	
	
	public void testblock()
	{
		System.out.println(a);
		System.out.println(b);	
		System.out.println(c);
		System.out.println(d);
	}

}
