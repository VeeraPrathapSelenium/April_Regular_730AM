package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// parent p=new child();
		WebDriver driver=new ChromeDriver();
				
		
		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		
		WebElement iframe=driver.findElement(By.xpath("//iframe"));
		
		driver.switchTo().frame(iframe);
		
		//WebElement contribute=driver.findElement(By.xpath("//a[text()='Contribute']"));
		
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
			
		
		
		Actions acc=new Actions(driver);
		
		acc.dragAndDrop(src, dest).build().perform();
		
		

	}

}
