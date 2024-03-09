package com.qa.demoblaze.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.demoblaze.base.BaseTest;
import com.qa.demoblaze.pages.*;

public class LandingPageTest extends BaseTest {

	@Test
	public void landingPagetitleTest() {
		String actitle = LandingPage.gettitle();
		Assert.assertEquals("STORE", actitle);

	}

	@Test
	public void getHomeTest() {
		Boolean flag = LandingPage.isHomeExist();

		Assert.assertTrue(flag);
	}

	@Test
	public void getContactExist() {

		Boolean flag = LandingPage.isContactExist();
		Assert.assertTrue(flag);

	}

	@Test
	public void getAboutUsExist() {
		Boolean flag = LandingPage.isAboutUsExist();
		Assert.assertTrue(flag);

	}

}
