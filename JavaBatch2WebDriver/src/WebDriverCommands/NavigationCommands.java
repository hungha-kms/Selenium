package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		System.out.println("Title of Newtours: " + driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("Title of Facebook: " + driver.getTitle());
		driver.navigate().back();
		System.out.println("Title of Back: " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("Title of Forward: " + driver.getTitle());
		
		driver.quit();
	}
	
}
