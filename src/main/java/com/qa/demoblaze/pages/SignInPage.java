package com.qa.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class SignInPage {

	private WebDriver driver;

	private By email = By.xpath("//input[@id='loginusername']");
	private By passwordfield = By.xpath("//input[@id='loginpassword']");
	private By SignInLink = By.xpath("//a[text()='Log in']");
	private By login = By.xpath("//button[text()='Log in']");
	private By WelcomeUsertext = By.xpath("//a[@id='nameofuser']");

	public SignInPage(WebDriver driver) {

	this.driver=driver;
	}

	public boolean verifySignInLinkAvailable() {
		return driver.findElement(SignInLink).isDisplayed();

	}

	public AccountPage doLogin(String username, String password) {
		 driver.findElement(SignInLink).click();
		System.out.println("================================================came inside the do login========================================");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(email).sendKeys(username);

		driver.findElement(passwordfield).sendKeys(password);
		driver.findElement(login).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new AccountPage(driver);

	}
}
