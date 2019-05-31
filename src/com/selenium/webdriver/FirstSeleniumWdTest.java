package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumWdTest {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.uplift.com");
		String pageTitle = driver.getTitle();
		
		System.out.println("Application title" +pageTitle);
		//driver.findElement(By.name("userName")).sendKeys("EarnQA");

	}

}
