package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement source = driver.findElement(By.id("box1"));
		WebElement target = driver.findElement(By.id("box103"));
		
		Actions action = new Actions(driver);
		
		//action.clickAndHold(source).moveToElement(target).release().build().perform();
		action.dragAndDrop(source, target).build().perform();
	}

}
