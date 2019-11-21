package com.hth.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(how = How.LINK_TEXT, using = "SIGN-ON")
	WebElement sigOnLink;
	
	@FindBy(name = "userName")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "login")
	WebElement btnLogin;
	
	public LoginPage(WebDriver d){
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	public void clickSignon() {
		sigOnLink.click();
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
}
