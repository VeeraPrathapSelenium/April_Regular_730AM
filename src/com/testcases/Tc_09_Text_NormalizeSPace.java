package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.readingexcel.ReadExcelFile;

public class Tc_09_Text_NormalizeSPace {

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
		
		// identify using abs xpath
		

		
		
		String firstname=ReadExcelFile.getData("Data", "Tc_01", "FirstName");
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstname);
		
		
		

	}

}
