package com.interfaces;

public class SecondImple extends Implementation{

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiplication() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calPercent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void dosunm() {
		// TODO Auto-generated method stub
		
	}
	
	
	// parent p =new child();
	
	// WebDriver driver=new FireFoxDriver();
	
	/*
	 * here we create object for child class , but we reffer to the parent class only
	 * 
	 */
	
	public static void main(String[] args) {
		Interface1 inter=new SecondImple();
		
		//inter.a=45;
		
		
		inter.add();
	}
	
	
	
	
	
	
	

}
