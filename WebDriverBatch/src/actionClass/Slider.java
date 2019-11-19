package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		
		/*WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();*/
		
		WebElement resizable = driver.findElement(By.xpath("//div[@id='resizable']"));
		Actions action = new Actions(driver);
		
		action.moveToElement(resizable).dragAndDropBy(resizable, 100, 100).build().perform();
	}

}
