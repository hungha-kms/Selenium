package webElementsControl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ControlForm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select select = new Select(element);
		
		select.selectByVisibleText("Tuesday");
		
		List<WebElement> options = select.getOptions();
		
		System.out.println("Size of the compobox: " + options.size());
		
		for(WebElement w:options) {
			System.out.println(w.getText());
		}
		
		element = driver.findElement(By.xpath("//select[@id='multi-select']"));
		select = new Select(element);
		
		select.selectByVisibleText("Texas");
		select.selectByVisibleText("Florida");
		select.selectByVisibleText("Washington");
		select.getAllSelectedOptions();
		
		options = select.getOptions();
		
		System.out.println("Size of the multi select: " + options.size());
		System.out.println("List out all options:");
		for(WebElement w:options) {
			System.out.println(w.getText());
		}
		
		options = select.getAllSelectedOptions();
		
		System.out.println("Size of the multi selected options: " + options.size());
		System.out.println("List out all options:");
		for(WebElement w:options) {
			System.out.println(w.getText());
		}
	}

}
