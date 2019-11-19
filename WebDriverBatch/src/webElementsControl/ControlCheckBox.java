package webElementsControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ControlCheckBox {

	public static void main(String[] args) {
		//label[text()='Click on this check box']
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[text()='Click on this check box']")).click();
		driver.findElement(By.xpath("//label[text()='Option 2']")).click();
		driver.findElement(By.xpath("//label[text()='Option 4']")).click();
	}

}
