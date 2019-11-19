package Selenium.webdriver.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
	
		String exptitle = "Find a Flight: Mercury Tours:";
		String acttitle = driver.getTitle();
		
		//Validation
		if (exptitle.equals(acttitle)) {
			System.out.println("Test is passed; title: " + acttitle);
		}else {
			System.out.println("Test is failed; title: " + acttitle);
		}
		driver.close();
	}

}
