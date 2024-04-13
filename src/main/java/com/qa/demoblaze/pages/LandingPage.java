package com.qa.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	
	}

	private By home = By.xpath("//a[text()='Home ']");
	private By contact = By.xpath("//a[@data-target='#exampleModal']");
	private By aboutUs = By.xpath("//a[text()='About us']");
	private By cart = By.xpath("//a[@href='https://www.demoblaze.com/cart.html']");
	private By logIn = By.xpath("//a[text()='Log in']");
	private By phones = By.xpath("//a[text()='Phones']");
	private By laptops = By.xpath("//a[text()='Laptops']");
	private By monitors = By.xpath("//a[text()='Laptops']");

	public String gettitle() {
		String title = driver.getTitle();

		return title;

	}

	public boolean isHomeExist() {

		return driver.findElement(home).isDisplayed();
	}

	public boolean isContactExist() {

		return driver.findElement(contact).isDisplayed();
	}

	public boolean isAboutUsExist() {

		return driver.findElement(aboutUs).isDisplayed();
	}

	public boolean isCartExist() {

		return driver.findElement(cart).isDisplayed();
	}

	public boolean isLoginExist() {

		return driver.findElement(logIn).isDisplayed();
	}

	

}
