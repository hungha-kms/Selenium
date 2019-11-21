package com.hth.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookaFlight {
	WebDriver driver;
	
	@FindBy(name = "passFirst0")
	WebElement pass1FirstName;
	
	@FindBy(name = "passLast0")
	WebElement pass1LastName;
	
	@FindBy(name = "pass.0.meal")
	WebElement pass1Meal;
	
	@FindBy(name = "passFirst1")
	WebElement pass2FirstName;
	
	@FindBy(name = "passLast1")
	WebElement pass2LastName;
	
	@FindBy(name = "pass.1.meal")
	WebElement pass2Meal;
	
	@FindBy(name = "creditCard")
	WebElement creditCardType;
	
	@FindBy(name = "creditnumber")
	WebElement creditNumber;
	
	@FindBy(name = "cc_exp_dt_mn")
	WebElement creditCardExpMon;
	
	@FindBy(name = "cc_exp_dt_yr")
	WebElement creditCardExpYear;
	
	@FindBy(name = "cc_frst_name")
	WebElement ccFirstName;
	
	@FindBy(name = "cc_mid_name")
	WebElement ccMidName;
	
	@FindBy(name = "cc_last_name")
	WebElement ccLastName;
	
	@FindBy(name = "buyFlights")
	WebElement btnBuyFlights;
	
	public BookaFlight(WebDriver d){
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	public void setPass1FirstName(String firstName) {
		pass1FirstName.sendKeys(firstName);
	}
	
	public void setPass1LastName(String lastName) {
		pass1LastName.sendKeys(lastName);
	}
	
	public void setPass1Meal(String meal) {
		Select drop = new Select(pass1Meal);
		drop.selectByVisibleText(meal);
	}
	
	public void setPass2FirstName(String firstName) {
		pass2FirstName.sendKeys(firstName);
	}
	
	public void setPass2LastName(String lastName) {
		pass2LastName.sendKeys(lastName);
	}
	
	public void setPass2Meal(String meal) {
		Select drop = new Select(pass2Meal);
		drop.selectByVisibleText(meal);
	}
	
	public void setCreditCardType(String type) {
		Select drop = new Select(creditCardType);
		drop.selectByVisibleText(type);
	}
	
	public void setCreditNumber(String number) {
		creditNumber.sendKeys(number);
	}
	
	public void setCreditCardExpMonth(String month) {
		Select drop = new Select(creditCardExpMon);
		drop.selectByVisibleText(month);
	}
	
	public void setCreditCardExpYear(String year) {
		Select drop = new Select(creditCardExpYear);
		drop.selectByVisibleText(year);
	}
	
	public void setCCFirstName(String firstName) {
		ccFirstName.sendKeys(firstName);
	}
	
	public void setCCMidleName(String midName) {
		ccMidName.sendKeys(midName);
	}
	
	public void setCCLastName(String lastName) {
		ccLastName.sendKeys(lastName);
	}
	
	public void clickBuyFlightsBtn() {
		btnBuyFlights.click();
	}
}
