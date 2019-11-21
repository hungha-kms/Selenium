package com.hth.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage {
	WebDriver driver;
	
	@FindBy(name = "tripType")
	List<WebElement> tripType;
	
	@FindBy(name = "passCount")
	WebElement passengers;
	
	@FindBy(name = "fromPort")
	WebElement departingPort;
	
	@FindBy(name = "fromMonth")
	WebElement fromMonth;
	
	@FindBy(name = "fromDay")
	WebElement fromDay;
	
	@FindBy(name = "toPort")
	WebElement arrivingPort;
	
	@FindBy(name = "toMonth")
	WebElement returnMonth;
	
	@FindBy(name = "toDay")
	WebElement returnDay;
	
	@FindBy(name = "servClass")
	List<WebElement> serviceClass;
	
	@FindBy(name = "airline")
	WebElement airline;
	
	@FindBy(name = "findFlights")
	WebElement btnFindFlights;
	
	public FlightFinderPage(WebDriver d){
		driver = d;
		PageFactory.initElements(d, this);
	}
		
	public void chooseTripTypeRoundTrip() {
		WebElement type = (WebElement)tripType.get(0);
		type.click();	
	}
	
	public void chooseTripTypeOneWay() {
		WebElement type = (WebElement)tripType.get(1);
		type.click();
	}
	
	public void setPassengers(String passCount) {
		Select drop = new Select(passengers);
		drop.selectByVisibleText(passCount);
	}
	
	public void setDepartFrom(String departFrom) {
		Select drop = new Select(departingPort);
		drop.selectByVisibleText(departFrom);
	}
	
	public void setFromMonth(String fMonth) {
		Select drop = new Select(fromMonth);
		drop.selectByVisibleText(fMonth);
	}
	
	public void setFromDay(String fDay) {
		Select drop = new Select(fromDay);
		drop.selectByVisibleText(fDay);
	}
	
	public void setArrivingPort(String toPort) {
		Select drop = new Select(arrivingPort);
		drop.selectByVisibleText(toPort);
	}
	
	public void setReturnMonth(String toMonth) {
		Select drop = new Select(returnMonth);
		drop.selectByVisibleText(toMonth);
	}
	
	public void setReturnDay(String toDay) {
		Select drop = new Select(returnDay);
		drop.selectByVisibleText(toDay);
	}
	

	public void chooseBusinessServiceClass() {
		WebElement type = (WebElement)serviceClass.get(1);
		type.click();	
	}
	
	public void chooseEconomyServiceClass() {
		WebElement type = (WebElement)serviceClass.get(0);
		type.click();	
	}
	
	public void chooseFirstServiceClass() {
		WebElement type = (WebElement)serviceClass.get(2);
		type.click();	
	}
	
	public void setAirline(String fAirline) {
		Select drop = new Select(airline);
		drop.selectByVisibleText(fAirline);
	}
	
	public void clickBtnFindFlights() {
		btnFindFlights.click();
	}
}
