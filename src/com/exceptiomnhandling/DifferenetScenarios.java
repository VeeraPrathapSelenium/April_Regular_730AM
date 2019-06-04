package com.exceptiomnhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DifferenetScenarios {

	public static void main(String[] args) {


		try
		{
			File f=new File("abc.txt");
			FileReader fr=new FileReader(f);
			
		}
		
		catch(ArithmeticException e1)
		{
			System.out.println(e1.getMessage());
		}
		catch(Exception g)
		{
			System.out.println("Generalized exception");
			System.out.println(g.getMessage());
		}
		
		
		
		
		

	}

}
