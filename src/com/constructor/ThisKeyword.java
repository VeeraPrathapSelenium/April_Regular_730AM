package com.constructor;

public class ThisKeyword {
	
	int a=0;
	
	int b=0;
	
	ThisKeyword() {

this(20,58);


System.out.println("Two argument based constructor is called");
	}
	
	
	ThisKeyword(int a,int b)
	{
this(12,20,30);

this.a=a;

this.b=b;

this.add();

	}
	
	ThisKeyword(int a,int b,int c)
	{

this.a=a;

this.b=b;

this.add();

	}
	
	
	public  void add()
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {

		ThisKeyword obj=new ThisKeyword();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
