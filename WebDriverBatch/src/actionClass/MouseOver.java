package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/menu/");

		Actions action = new Actions(driver);
		
		WebElement music = driver.findElement(By.xpath("//div[@id='ui-id-9']"));
		WebElement rock = driver.findElement(By.xpath("//div[@id='ui-id-10']"));
		WebElement classic = driver.findElement(By.xpath("//div[@id='ui-id-12']"));
		
		action.moveToElement(music).moveToElement(rock).moveToElement(classic).click().build().perform();
	}

}
