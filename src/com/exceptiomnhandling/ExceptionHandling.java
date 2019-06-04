package com.exceptiomnhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandling {

	public static void main(String[] args)  {

try
{
	System.out.println(10/0);	
	
}catch(Exception e)
{
	System.out.println(e.getMessage());
	
	// here we wantt o write our controling code
	
	// logging event 
	
	// disconnect the DB
	// close excel
	// alternative recovery action
}finally
{
	System.out.println("My execution is completed");
}
		
		
		
		

	}

}
