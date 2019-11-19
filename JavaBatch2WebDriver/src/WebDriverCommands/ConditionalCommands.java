package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath(".//*[@id='email']"));
		//System.out.println("Title of Forward: " + driver.getTitle());
		WebElement pass = driver.findElement(By.xpath(".//*[@id='pass']"));
		
		if (email.isDisplayed() && email.isEnabled()) {
			email.sendKeys("hungha@gmail.com");
		}
		
		if (pass.isDisplayed() && pass.isEnabled()) {
			pass.sendKeys("abc123");
		}
		
		//driver.quit();
	}
}
