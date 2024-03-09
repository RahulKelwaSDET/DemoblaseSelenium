package com.qa.demoblaze.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.demoblaze.pages.*;

public class BaseTest {
	WebDriver driver;
	protected LandingPage LandingPage;
	protected SignInPage SignInPage;

	@BeforeTest
	public void initdriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.demoblaze.com/");
		LandingPage = new LandingPage(driver);

	}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}
}
