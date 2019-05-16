package com.readingexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	
	
	String path;
	
	public static XSSFWorkbook wrkbk;
	
	public static XSSFSheet sheet;
	
	public ReadExcelFile(String path) throws IOException
	{
		this.path=path;
		
		File f=new File(path);
		
		FileInputStream fis=new FileInputStream(f);
		
		wrkbk=new XSSFWorkbook(fis);
	}
	
	public static int getRowCount(String sheetname)
	{
		sheet=wrkbk.getSheet(sheetname);
		return sheet.getPhysicalNumberOfRows()-1;
	}
	
	public static int getColCount(String sheetname)
	{
		XSSFSheet sheet=wrkbk.getSheet(sheetname);
		int rowcount=getRowCount(sheetname);
		
		return sheet.getRow(rowcount).getPhysicalNumberOfCells();
	}
	
	public static int searchTestCase(String sheetname,String classname)
	{
		int rowcount=getRowCount(sheetname);
		
		int row=0;
		for(int r=1;r<=rowcount-1;r++)
		{
							
			
		String testcase=sheet.getRow(r).getCell(0).getStringCellValue();
		
		if(classname.equals(testcase.trim()))
		{
			row= r;
			break;
		}
			
			
			
		}
		return row;
		
		
	}
	
	
	public static int searchColumn(String sheetname,String columnnames)
	{
		int colcount=getColCount(sheetname);
		
		int col=0;
		for(int c=1;c<=colcount-1;c++)
		{
							
			
		String colname=sheet.getRow(0).getCell(c).getStringCellValue();
		
		if(colname.equals(columnnames.trim()))
		{
			col= c;
			break;
		}
			
			
			
		}
		return col;
		
		
	}
		
		
	public static String getData(String sheetname,String testcasename,String columnnames)
	{
		
		
		int row=searchTestCase(sheetname, testcasename);
		
		int col=searchColumn(sheetname, columnnames);
		
		String data="";
		
		switch(sheet.getRow(row).getCell(col).getCellTypeEnum())
		
		{
		case STRING:
			data=sheet.getRow(row).getCell(col).getStringCellValue();
			break;
		case NUMERIC:
			data=String.valueOf(sheet.getRow(row).getCell(col).getNumericCellValue());
			break;
			
		}
		return data;
			
			
			
		}
		
		
	}
	
	
	
	
	


