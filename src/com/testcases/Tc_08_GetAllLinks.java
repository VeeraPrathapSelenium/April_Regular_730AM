package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_08_GetAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// for launching chrome browser
		
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				// parent p=new child();
				WebDriver driver=new ChromeDriver();
				
				driver.get("http://demo.nopcommerce.com/register");
				
				driver.manage().window().maximize();
				
				int counter=0;
				List<WebElement> alllinks=driver.findElements(By.tagName("a"));
				
				//get total links size
				System.out.println(alllinks.size());
				
				for(int i=0;i<=alllinks.size()-1;i++)
				{
					try
					{
					if(alllinks.get(i).isDisplayed())
					{
						System.out.println(alllinks.get(i).getText());
											
					}				
					
					
					}catch(Exception e)
					{
						
					}
					
				}
				
		
		
		
		
		

	}

}
