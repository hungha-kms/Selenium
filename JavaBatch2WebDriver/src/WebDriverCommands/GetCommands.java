package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		System.out.println("Title of the page: " + driver.getTitle());
		System.out.println("Current URL: " + driver.getCurrentUrl());
		
		String strDate = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText();
		System.out.println("Current Date: " + strDate);
		
		driver.close();
	}
}
