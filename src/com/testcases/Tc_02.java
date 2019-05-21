package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_02 {
	
	public static void main(String[] args) {
		
		
		// for launching chrome browser
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// parent p=new child();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
		// enter data into firstname
		
		driver.findElement(By.id("FirstName")).sendKeys("FirstName");
		
		
	}

}
