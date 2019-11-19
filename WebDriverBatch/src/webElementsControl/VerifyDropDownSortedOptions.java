package webElementsControl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOptions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("animals"));
		Select se = new Select(element);
		
		List<String> originalList = new ArrayList<>();
		
		List <WebElement> options = se.getOptions();
		
		for (WebElement e:options) {
			originalList.add(e.getText());
		}
		System.out.println("Original List: " + originalList);
		
		List<String> tempList = new ArrayList<>();
		
		tempList = originalList;
		
		System.out.println("before sorting temp list: " + tempList);
		Collections.sort(tempList);
		System.out.println("before sorting temp list: " + tempList);
		driver.close();
	}
}
