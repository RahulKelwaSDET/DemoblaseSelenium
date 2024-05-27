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
	protected WebDriver driver;

	protected SignInPage SignInPage ;
	protected AccountPage AccountPage;
	protected ProductLaptopPage ProductLaptopPage;
	protected DriverFactory df;
	protected Properties prop;


	@BeforeTest
	public void setup() throws IOException {
		df= new DriverFactory();
		prop = df.initProp();
		driver = df.initDriver(prop);
		
		System.out.println("=========================driver launched succcessfully===========================================================");
		
	
	
	
		 SignInPage = new SignInPage(driver);
System.out.println("============================= signinpage object created=============================");

	}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}
}
