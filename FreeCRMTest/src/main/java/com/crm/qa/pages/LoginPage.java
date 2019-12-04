package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name = "userName")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "login")
	WebElement btnLogin;
	
	@FindBy(xpath = "//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/p[1]/img[1]")
	WebElement logo;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String uName) {
		userName.sendKeys(uName);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickSubmitBtn() {
		btnLogin.click();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return logo.isDisplayed();
	}
	
	public FlightFinderPage login(String un, String pass) {
		setUserName(un);
		setPassword(pass);
		clickSubmitBtn();
		
		return new FlightFinderPage();
	}
}