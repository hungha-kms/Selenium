package webElementsControl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		//String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert text: " + alertText);
		//String alertText1 = driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		alert.accept();
		alertText = alert.toString();
		System.out.println("Alert text: " + alertText);
	}

}
