package HandlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(0,1000)", "");
		/*
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Best Sellers in Books')]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		*/
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
