package com.testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {

		// parent p=new child();
				WebDriver driver=new ChromeDriver();
						
				
				driver.get("https://www.facebook.com/");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				WebElement forgetpassword=driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
		
		String url=forgetpassword.getAttribute("href");
		
		System.out.println("The url is :"+url);
		
		URL ourl=new URL(url);
				
		HttpURLConnection con=(HttpURLConnection) ourl.openConnection();
		
		con.connect();
		
		int responsecode=con.getResponseCode();
		
		if(responsecode==200)
		{
			System.out.println("Link is active");
		}else
		{
			System.out.println("Link is not active");
		}
		
		
			
		
		
		
		

	}

}
