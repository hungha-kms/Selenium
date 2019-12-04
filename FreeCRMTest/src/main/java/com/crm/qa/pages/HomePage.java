package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(how = How.LINK_TEXT, using = "SIGN-ON")
	WebElement sigOnLink;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignon() {
		sigOnLink.click();
	}
}
