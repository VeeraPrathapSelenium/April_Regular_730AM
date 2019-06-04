package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_02 extends GenericFunctions{
	
	public static void main(String[] args) {
		
		String url="http://www.google.com";
		
		GenericFunctions generic=new GenericFunctions();
		boolean status=generic.launchApplication(url);
		
		// check browser status
		if(status)
		{
			IphoneX_SearchPrice iphone=new IphoneX_SearchPrice();
			status=iphone.searchPhone("i phone x");
			
			if(status)
			{
				status=iphone.getSearchResults("bestbuy");
				
				while(! status)
				{
					generic.scrollDown();
					
					iphone.click_Next();
					
					status=iphone.getSearchResults("best");
					
					
				}
			
				status=iphone.verifyCountry();
				
				if(status) {
					status=iphone.printPrice();
					
					generic.closeApp();
				}
				
				
				
			}
			
		}
		
				
		
	}

}
