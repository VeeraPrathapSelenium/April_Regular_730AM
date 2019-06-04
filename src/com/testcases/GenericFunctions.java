package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericFunctions {
	
	public static WebDriver driver;
	
	public static WebDriverWait wait ;
/*
 * Method Name:launchApplication()
 * 
 * @Input Parameter:Url
 * 
 * @Output Parameter:boolean
 * 
 * 
 */
	
	public boolean launchApplication(String url) {

boolean status=true;
		try
		{
			// for launching chrome browser
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			
			// parent p=new child();
		driver=new ChromeDriver();
			
			driver.get("http://www.google.com");
			
			driver.manage().window().maximize();
			
			// provide max time to identify element
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wait =new WebDriverWait(driver, 5);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			status=false;
			
		}
		return status;
		

	}
	
/**
 * Method Name:scrollDown
 * @input Parameter:NA
 */
public void scrollDown()
{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight);");
}



/**
 * Method Name:closeApp
 * @input Parameter:NA
 */
public void closeApp()
{
	driver.close();
	driver.quit();
}
}
