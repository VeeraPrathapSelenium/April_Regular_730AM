package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		// parent p=new child();
		WebDriver driver=new ChromeDriver();
				
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		driver.manage().window().maximize();
		
		
		// get table
		
		WebElement table=driver.findElement(By.xpath("//th[text()='Company']/ancestor::table"));
		
		//get the row count from the table
		
		List row=table.findElements(By.tagName("tr"));
		
		for(int i=1;i<=row.size()-1;i++)
		{
			
			List colcount=driver.findElements(By.xpath("//th[text()='Company']/ancestor::table/tbody/tr["+i+"]/td"));
			
			for(int c=1;c<=colcount.size()-1;c++)
			{
				System.out.println(driver.findElement(By.xpath("//th[text()='Company']/ancestor::table/tbody/tr["+i+"]/td["+c+"]")).getText());
				
			}
			
		}
		

	}

}
