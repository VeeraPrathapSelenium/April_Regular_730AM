package com.ScannerClass;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a value in between 1-7");
		
		int usergiven_value=sc.nextInt();
		
		
		//System.out.println(usergiven_value);
		
		
		if((usergiven_value==0) || (usergiven_value>7))
		{
			System.out.println("User value can not be 0 , it must be in between 1-7 only");
			
		}
		else if(usergiven_value==1)
		{
			System.out.println("Monday");
		}
		else if(usergiven_value==2)
		{
			System.out.println("Tue");
		}
		

	}

}
