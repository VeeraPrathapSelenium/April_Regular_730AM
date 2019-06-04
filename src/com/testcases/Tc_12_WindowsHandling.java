package com.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.readingexcel.ReadExcelFile;

public class Tc_12_WindowsHandling {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// parent p=new child();
		WebDriver driver=new ChromeDriver();
				
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		// for every browser we have a window
		//every window will have an unique id
		
		String parentid=driver.getWindowHandle();//get parent window id
		
		System.out.println(parentid);
		
		
		//get the windows id
		
		Set<String> allwindows=driver.getWindowHandles();
		
		Iterator itr=allwindows.iterator();
		
		
		while(itr.hasNext())
		{
			
			String childwindow=itr.next().toString();
			
			if(!parentid.equals(childwindow))
			{
				driver.switchTo().window(childwindow);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentid);
		

	}

}
