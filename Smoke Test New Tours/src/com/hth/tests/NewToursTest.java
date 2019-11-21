package com.hth.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hth.pages.BookaFlight;
import com.hth.pages.FlightFinderPage;
import com.hth.pages.LoginPage;
import com.hth.pages.SelectFlight;

public class NewToursTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickSignon();
		
		loginPage.setUserName("hathanhhung@gmail.com");
		loginPage.setPassword("hthntnt");
		loginPage.clickSubmitBtn();
		
		FlightFinderPage flightFinderPage = new FlightFinderPage(driver);
		flightFinderPage.chooseTripTypeOneWay();
		flightFinderPage.setPassengers("2");
		flightFinderPage.setDepartFrom("Seattle");
		flightFinderPage.setFromMonth("December");
		flightFinderPage.setFromDay("25");
		flightFinderPage.setArrivingPort("New York");
		flightFinderPage.setReturnMonth("January");
		flightFinderPage.setReturnDay("30");
		flightFinderPage.chooseFirstServiceClass();
		flightFinderPage.setAirline("Unified Airlines");
		flightFinderPage.clickBtnFindFlights();
		
		SelectFlight selectFlight = new SelectFlight(driver);
		selectFlight.chooseDepartFlight(2);
		selectFlight.chooseReturnFlight(2);
		selectFlight.clickContinueBtn();
		
		BookaFlight bookaFlight = new BookaFlight(driver);
		bookaFlight.setPass1FirstName("abc");
		bookaFlight.setPass1LastName("abc");
		bookaFlight.setPass1Meal("Low Cholesterol");
		
		bookaFlight.setPass2FirstName("cde");
		bookaFlight.setPass2LastName("cde");
		bookaFlight.setPass2Meal("Low Calorie");
		
		bookaFlight.setCreditCardType("Visa");
		bookaFlight.setCreditNumber("1234567890");
		bookaFlight.setCreditCardExpMonth("10");
		bookaFlight.setCreditCardExpYear("2010");
		
		bookaFlight.setCCFirstName("aaa");
		bookaFlight.setCCMidleName("aaa");
		bookaFlight.setCCLastName("aaa");
		bookaFlight.clickBuyFlightsBtn();
	}
	
}
