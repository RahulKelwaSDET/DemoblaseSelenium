package com.qa.demoblaze.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoblaze.base.BaseTest;

public class SignPageTest extends BaseTest {

	@Test(priority = 2)
	public void verifysigninLinkAvailableTest() {
		Boolean SignIn = SignInPage.verifySignInLinkAvailable();
		Assert.assertTrue(SignIn);

	}

	@Test(priority = 1)
	public void LoginTest() throws InterruptedException {

		AccountPage = SignInPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Logged Successfully");
		Assert.assertEquals(AccountPage.isLogoutLinkexist(), true);

	}

}
