package com.SingleLevelInheritance;

public class DelhiPublicSchool extends School{

	public DelhiPublicSchool(String std_name, String classname) {
			
		super(std_name, classname);
		
		this.classname="FGH";
		
	}	
	
	public void addDrawingClass()
	{
		System.out.println("Adding drawing class to the student");
	}
	
	
	public void addKarateClass()
	{
		System.out.println("Adding karate class to the student");
	}
	
	

}
