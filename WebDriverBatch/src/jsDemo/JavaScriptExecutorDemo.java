package jsDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.twoplugs.com/");
		/*WebElement joinFree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
		//JavaScriptUtil.flash(joinFree, driver);
		
		JavaScriptUtil.drawBorder(joinFree, driver);
		
		/*File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg = new File("C://temp/test.jpg");
		FileUtils.copyFile(scr, trg);
		*/
		
		//String title = JavaScriptUtil.getTitle(driver);
		//System.out.println("The title of the page: " + title);
		
		WebElement joinFree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
		JavaScriptUtil.clickElementByJS(joinFree, driver);
		
		//JavaScriptUtil.generateAlert(driver, "You clicked on login button...");
		JavaScriptUtil.refreshBrowserByJS(driver);
	}

}
