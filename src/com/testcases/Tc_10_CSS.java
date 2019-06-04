package com.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.readingexcel.ReadExcelFile;

public class Tc_10_CSS {

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
		
		
		
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("hello");;
		
		
		List<WebElement> alloption=driver.findElements(By.cssSelector("select[name='DateOfBirthDay']>option"));
		
		System.out.println(alloption.size());
		
		
		

	}

}
