package webElementsControl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://www.yahoo.com");
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		//driver.get("admin:admin@http://the-internet.herokuapp.com/basic_auth");
		
	}

}
