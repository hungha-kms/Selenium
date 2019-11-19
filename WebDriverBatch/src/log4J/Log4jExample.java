package log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Log4jExample {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("Log4jExample");
		DOMConfigurator.configure("log4j1.xml");
		
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		logger.info("Browser opened");
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		logger.info("Click on Register");
		driver.findElement(By.linkText("REGISTER")).click();
		
		logger.info("Entering contact information");
		
		driver.findElement(By.name("firstName")).sendKeys("Hung");
		driver.findElement(By.name("lastName")).sendKeys("Ha");
		driver.findElement(By.name("phone")).sendKeys("678-542-9680");
		driver.findElement(By.name("userName")).sendKeys("abc@yahoo.com");
		
		logger.info("Entering mailing information");
		
		driver.findElement(By.name("address1")).sendKeys("thekkhohoa");
		driver.findElement(By.name("address2")).sendKeys("khkhhaoh");
		driver.findElement(By.name("city")).sendKeys("Alpharetta");
		driver.findElement(By.name("state")).sendKeys("GA");
		driver.findElement(By.name("postalCode")).sendKeys("30004");
		
		logger.info("Selecting country");
		
		Select dropCountry = new Select(driver.findElement(By.name("country")));
		dropCountry.selectByVisibleText("VIETNAM");
		
		logger.info("Entering user information");
		
		driver.findElement(By.name("email")).sendKeys("HUNG");
		driver.findElement(By.name("password")).sendKeys("hung");
		driver.findElement(By.name("confirmPassword")).sendKeys("hung");
		
		logger.info("Clicking on register link");
		
		driver.findElement(By.name("register")).click();
		
		logger.info("Validation started");
		
		if (driver.getPageSource().contains("Thank you for registering")) {
			System.out.println("Your registered successfully - Test Pass");
			logger.info("Validation Done - Test Passed");
		} else {
			System.out.println("Your registered failed - Test Failed");
			logger.info("Validation Done - Test failed");
		}
		
		driver.close();
	}
}
