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

	@Test
	public void logoutLink() throws InterruptedException {
		Assert.assertTrue(AccountPage.isLogoutLinkexist());

	}

	@Test
	public void welcomeUser() {

		Assert.assertTrue(AccountPage.isWelcomeUSertextexist());
	}

}
