package com.SingleLevelInheritance;

public class School {
	
	String std_name;
	
	static int roll_number;
	
	String classname;
	
	public School(String std_name,String classname)
	{
		this.std_name=std_name;
		
		this.classname=classname;
		
		this.roll_number++;		
		
	}
	
	
	
	
	
	public  void addStudent()
	{
		System.out.println("Adding the student "+this.std_name+" to the database and the rool number is :"+this.roll_number);
		
	}
	
	
	public  void deleteStudent()
	{
		System.out.println("deleting the student "+this.std_name+" from the database");
		
	}
	
	
	public void modifyStudent()
	{
		System.out.println("modifying the student "+this.std_name+"data in the database");
		
	}
	
	public static void addStaff()
	{
		System.out.println("adding  the staff to the database");
		
	}
	
	
	public static void addSubject()
	{
		System.out.println("adding  the subject to the database");
		
	}
	
	public static void deleteSubject()
	{
		System.out.println("deleting   the subject from the database");
		
	}

}
