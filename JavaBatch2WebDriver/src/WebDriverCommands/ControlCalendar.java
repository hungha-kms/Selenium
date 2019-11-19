package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ControlCalendar {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://metroui.org.ua/calendarpicker.html");
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/main[1]/div[2]/div[1]/div[1]/button[1]/span[1]")).click();
		
		String yearStr = "";
		for(int i = 0; i < 10; i++) {
			yearStr = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/main[1]/div[2]/div[1]/div[2]/div[2]/div[1]/span[5]")).getText();
			if (yearStr.equals("2022")) {
				break;
			}
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/main[1]/div[2]/div[1]/div[2]/div[2]/div[1]/span[6]/span[1]")).click();
		}
		System.out.println("Selected year: " + yearStr);
		driver.close();
	}
}