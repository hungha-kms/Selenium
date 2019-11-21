package com.hth.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	WebDriver driver;
	
	@FindBy(name = "outFlight")
	List<WebElement> departFlight;
	
	@FindBy(name = "inFlight")
	List<WebElement> returnFlight;
	
	@FindBy(name = "reserveFlights")
	WebElement btnReserveFlights;
	
	public SelectFlight(WebDriver d){
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	public void chooseDepartFlight(int i) {
		WebElement type = (WebElement)departFlight.get(i);
		type.click();	
	}
	
	public void chooseReturnFlight(int i) {
		WebElement type = (WebElement)returnFlight.get(i);
		type.click();	
	}
	
	public void clickContinueBtn() {
		btnReserveFlights.click();
	}
}
