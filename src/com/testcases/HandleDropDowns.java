package com.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// parent p=new child();
		WebDriver driver=new ChromeDriver();
				
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select dropdown=new Select(day);
		
		dropdown.selectByIndex(2);
		
		Thread.sleep(1000);
		dropdown.selectByValue("25");
		Thread.sleep(1000);
		dropdown.selectByVisibleText("13");
		
		
		
		List<WebElement> alloptions=dropdown.getOptions();
		

for(int i=0;i<=alloptions.size()-1;i++)
{
	System.out.println(alloptions.get(i).getText());
}
		
	}

}
