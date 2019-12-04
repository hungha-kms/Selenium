package com.crm;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FlightFinderPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	FlightFinderPage flightFinderPage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		HomePage homePage = new HomePage();
		homePage.clickSignon();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.getTitle();
		Assert.assertEquals(title, "Sign-on: Mercury Tours");
	}
	
	@Test(priority = 2)
	public void logoImageTest() {
		Assert.assertTrue(loginPage.validateLogo());
	}
	
	@Test(priority = 3)
	public void loginTest() {
		flightFinderPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
