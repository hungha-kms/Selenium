package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://demo.nopcommerce.com/");
		
		System.out.println("Title of tech page: " + driver.getTitle());
	}

}
