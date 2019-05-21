package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_06_AbsXpath {

	public static void main(String[] args) {


		// for launching chrome browser
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// parent p=new child();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
		// identify using abs xpath
		
		driver.findElement(By.xpath("html/body/div[6]/div/div[2]/div[2]/form/input[1]")).sendKeys("Hello");
		
		
		

	}

}
