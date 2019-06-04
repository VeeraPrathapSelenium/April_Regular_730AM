package com.testcases;

import java.io.IOException;

import com.readingexcel.ReadExcelFile;

public class Tc_01 {
	
	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\Hanshik\\Desktop\\Testadata.xlsx";
		
		ReadExcelFile exl=new ReadExcelFile(path);
		
		
		String data=ReadExcelFile.getData("Data", "Tc_04", "FirstName");
		
		System.out.println("The first name data is "+data);
		
		
		data=ReadExcelFile.getData("Data", "Tc_05", "Dateofbirth");
		
		String url=ReadExcelFile.getData("Data", "Tc_01", "url");
		
		System.out.println("Url of the application is "+url);
		
		
		
	}

}
