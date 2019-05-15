package com.readpropetiesfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProprtiesfile {

	public static void main(String[] args) throws IOException {
		
		
		File f=new File("env.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		
		System.out.println(prop.getProperty("txt_username"));
		
		String username_selector=prop.getProperty("txt_username");
		
		
			
		
		

	}

}
