package com.qa.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

	private WebDriver driver;

	private By LogOutLink = By.xpath("//a[@onclick='logOut()']");
	private By WelcomeUsertext = By.xpath("//a[@id='nameofuser']");
	private By LaptopProductLink = By.xpath("//a[text()='Laptops']");

	public AccountPage(WebDriver driver) {
		this.driver = driver;

	}

	public boolean isLogoutLinkexist() throws InterruptedException {
		Thread.sleep(4000);

		return driver.findElement(LogOutLink).isDisplayed();

	}

	public boolean isWelcomeUSertextexist() {
		return driver.findElement(WelcomeUsertext).isDisplayed();

	}

	public ProductLaptopPage doClickProdct(String ProductName) {
		driver.findElement(LaptopProductLink).click();

		return new ProductLaptopPage(driver);
	}

}
