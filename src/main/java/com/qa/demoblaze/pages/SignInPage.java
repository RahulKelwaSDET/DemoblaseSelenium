package com.qa.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	
	WebDriver driver;
	public  SignInPage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	By email = By.xpath("//input[@type='email']");
	By password = By.xpath("//input[@type='password']");

	
	public void enterusername(String username)
	{
		driver.findElement(email).sendKeys(username);
		
	}
	
	public void enterpassword(String username)
	{
		driver.findElement(password).sendKeys(username);
		
	}
}
