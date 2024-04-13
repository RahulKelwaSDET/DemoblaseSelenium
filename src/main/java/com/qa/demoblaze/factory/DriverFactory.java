package com.qa.demoblaze.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initDriver(Properties prop) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
		return driver;
	
	}
	
	public Properties initProp() throws IOException {
		
		FileInputStream ip = null;
		prop = new Properties();
		ip = new FileInputStream("./src/test/resources/config/configuration.property");
		prop.load(ip);
		return prop;
		
	}
	

}
