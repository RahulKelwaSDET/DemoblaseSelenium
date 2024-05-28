package com.qa.demoblaze.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.demoblaze.base.BaseTest;

public class SignPageTest extends BaseTest {

	@Test(priority = 1)
	public void signinLinkTest() {
		Boolean SignIn = SignInPage.verifySignInLinkAvailable();
		Assert.assertTrue(SignIn);

	}

	@Test(priority = 1)
	public void contactLinkTest() {
		Assert.assertTrue(SignInPage.verifyContactLinkExist());

	}

	@Test(priority = 1)
	public void signUpLinkTest() {

		Assert.assertTrue(SignInPage.verifySignUpLinkExist());
	}

	@Test(priority = 2)
	public void LoginTest() throws InterruptedException {

		AccountPage = SignInPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Logged Successfully");
		Assert.assertEquals(AccountPage.isLogoutLinkexist(), true);

	}

}
