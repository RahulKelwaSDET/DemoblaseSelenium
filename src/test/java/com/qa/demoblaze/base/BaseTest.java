package com.qa.demoblaze.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.demoblaze.factory.DriverFactory;
import com.qa.demoblaze.pages.*;

public class BaseTest {
	WebDriver driver;
	protected LandingPage LandingPage;
	protected SignInPage SignInPage;
	protected DriverFactory df;
	protected Properties prop;


	@BeforeTest
	public void setup() throws IOException {
		df= new DriverFactory();
		prop = df.initProp();
		driver = df.initDriver(prop);
		
	
	
	
		LandingPage = new LandingPage(driver);

	}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}
}
