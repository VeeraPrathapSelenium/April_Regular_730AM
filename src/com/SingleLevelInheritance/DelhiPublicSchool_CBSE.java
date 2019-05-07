package com.SingleLevelInheritance;

public class DelhiPublicSchool_CBSE extends DelhiPublicSchool{

	public DelhiPublicSchool_CBSE(String std_name, String classname) {
		super(std_name, classname);
		
	}

	public static void main(String[] args) {

		DelhiPublicSchool_CBSE dpse=new DelhiPublicSchool_CBSE("Hari","XII");
		
		dpse.addStudent();
		dpse.addDrawingClass();
		dpse.addVedicMaths();
		
		

	}
	
	
	public void addVedicMaths()
	{
		System.out.println("Adding vedic mathamatic to the student");
	}
	
	
	
	

}
