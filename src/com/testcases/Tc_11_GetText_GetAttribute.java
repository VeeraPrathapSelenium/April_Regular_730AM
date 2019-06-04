package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.readingexcel.ReadExcelFile;

public class Tc_11_GetText_GetAttribute {

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
		
		System.out.println(element.getText());
		
		//Enterr data into the text box FirstName
		
		WebElement firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
		
		firstname.sendKeys("hello");
		
		System.out.println(firstname.getAttribute("value"));

	}

}
