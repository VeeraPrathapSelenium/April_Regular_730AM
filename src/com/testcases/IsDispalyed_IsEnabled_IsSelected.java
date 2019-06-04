package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.readingexcel.ReadExcelFile;

public class IsDispalyed_IsEnabled_IsSelected {

	public static void main(String[] args) throws IOException {
		
String path="C:\\Users\\Hanshik\\Desktop\\Testadata.xlsx";
		
		ReadExcelFile exl=new ReadExcelFile(path);
		// for launching chrome browser
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// parent p=new child();
		WebDriver driver=new ChromeDriver();
		
		
		String url=ReadExcelFile.getData("Data", "Tc_01", "url");
		
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		
		// identify the register link
		
		WebElement element=driver.findElement(By.xpath("//h1[text()='Register']"));
		
		try
		{
		if(element.isDisplayed())
		{
			System.out.println("Element is displayed");
		}
		}catch(Exception e)
		{
			System.out.println("Element is not displayed");
		}
		
		WebElement search=driver.findElement(By.xpath("//input[@value='Search']"));
		
		if(search.isEnabled())
		{
			System.out.println("Search Button is enabled");
		}
		else
		{
			System.out.println("Search Button is not enabled");
		}
		
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		if(male.isSelected())
		{
			System.out.println("Option male is selected");
		}else
		{
			System.out.println("Option male is not selected");
		}
	}

}
