package com.filesystem;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFolder {

	public static void main(String[] args) {


SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		Date date=new Date();
		
		
		System.out.println(sdf.format(date));
		
		String path="C:\\Users\\Hanshik\\Desktop\\Strings Examples\\Results\\"+sdf.format(date);
		
		
		
		
		File f=new File(path);
		// create a folder
		//f.mkdir();
		
		//check for folder existance
		
		if(!f.exists())
		{
			System.out.println("No directory exist");
			f.mkdirs();
		}
		else
		{
			System.out.println("Directory Exist");
			
			
		}
		
		

	}

}
