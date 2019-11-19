package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {
	
	public static void main(String[] args) {
		new RegistrationTest().verifyFlightReg();
	}
	
	public void verifyFlightReg() {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		RegistrationPage2 RGPage = new RegistrationPage2(driver);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		RGPage.clickRegLink();
		RGPage.setFirstName("Hung");
		RGPage.setLastName("Ha");
		RGPage.setPhone("678-542-9680");
		RGPage.setEmail("abc@yahoo.com");
		RGPage.setAddress1("thekkhohoa");
		RGPage.setAddress2("khkhhaoh");
		RGPage.setCity("Alpharetta");
		RGPage.setState("GA");
		RGPage.setPostalCode("30004");
		RGPage.setCountry("VIETNAM");
		
		RGPage.setUserName("HUNG");
		RGPage.setPassword("hung");
		RGPage.setConfirmPassword("hung");
		
		RGPage.clickRegisterBtn();
		
		//Validation
		
		if (driver.getPageSource().contains("Thank you for registering")) {
			System.out.println("Your registered successfully - Test Pass");
		} else {
			System.out.println("Your registered failed - Test Failed");
		}
		
		driver.close();
	}
}
