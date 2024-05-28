package com.qa.demoblaze.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoblaze.base.BaseTest;

public class AccountPageTest extends BaseTest {

	@BeforeClass
	public void acccountPageSetup() {

		AccountPage = SignInPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void logoutLinkTest() throws InterruptedException {
		Assert.assertTrue(AccountPage.isLogoutLinkexist());

	}

	@Test(priority = 1)
	public void welcomeUserTest() {

		Assert.assertTrue(AccountPage.isWelcomeUSertextexist());
	}
	
	@Test(priority = 1)
	public void laptopLinkTest()
	{
		
		Assert.assertTrue(AccountPage.isLaptopProductLinkExist());
	}
	
	
	@Test(priority  = 1)
	public void monitorLinkTest()
	{
		Assert.assertTrue(AccountPage.isMonitorsLinkExist());
		
	}
	
	

}
