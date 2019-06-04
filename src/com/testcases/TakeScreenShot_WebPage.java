package com.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot_WebPage {

	public static void main(String[] args) throws IOException {


System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// parent p=new child();
		WebDriver driver=new ChromeDriver();
				
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		TakesScreenshot sht=(TakesScreenshot)driver;
		
		File src=sht.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Hanshik\\Desktop\\UiPath-Task1\\screen1.png");
		
		
		FileUtils.copyFile(src, dest);
		
		

	}

}
