package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IphoneX_SearchPrice extends GenericFunctions{
	
	/**
	 * Method Name:searchPhone()
	 * 
	 * @InputParameter:NA
	 * 
	 * @OutputParameter:boolean
	 */
	public boolean searchPhone(String searchtext)
	{boolean status=true;
		try
		{
			driver.findElement(By.name("q")).sendKeys(searchtext);
			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			status=false;
		}
		return status;
	}
	
	
	/**
	 * MethodName:getSearch_Links
	 */
	
	public boolean getSearchResults(String searchdata)
	{
		boolean status=false;
		
		try
		{
			List<WebElement> alllinks=driver.findElements(By.xpath("//h3/following-sibling::div/cite"));
			
			for (WebElement webElement : alllinks) {
				
				
				//System.out.println(webElement.getText().trim());
				
				
				if(! webElement.getText().trim().isEmpty() &&webElement.getText().trim().contains(searchdata))
				{
					status=true;
					webElement.click();
					break;
				}
				
			}
			
			
		}catch(Exception e)
		{
			status=false;
			System.out.println(e.getMessage());
		}
		return status;
	}
	
	/**
	 * MethodName:click_Next
	 */
	
	public boolean click_Next()
	{boolean status=true;
		try
	{
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Next']")));
		WebElement element=driver.findElement(By.xpath("//span[text()='Next']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(element).click(element).build().perform();
		
		
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
		status=false;
	}
		return status;
		
	}
	
	
	public boolean verifyCountry()
	{
		boolean status=true;
		
		try
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//h4[text()='United States'])[1]")));
			WebElement element=driver.findElement(By.xpath("(//h4[text()='United States'])[1]"));
			Actions acc=new Actions(driver);
			acc.moveToElement(element).click(element).build().perform();
			
		}catch(Exception e)
		{
			
		}
		return status;
	}
	
	
	
	
	public boolean printPrice()
	{
		boolean status=true;
		
		try
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[starts-with(@id,'pricing-price')])[1]//div/span[@aria-hidden=\"true\"]")));
			WebElement element=driver.findElement(By.xpath("(//*[starts-with(@id,'pricing-price')])[1]//div/span[@aria-hidden=\"true\"]"));

System.out.println("The Cost of the Phone is :"+element.getText());
			
		}catch(Exception e)
		{
			
		}
		return status;
	}

}
