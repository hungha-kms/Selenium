package ashotapi;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoImage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement logoImageElement = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Screenshot logoScreenShot = new AShot().takeScreenshot(driver, logoImageElement);
		//System.out.println("Logo Screen Shot: " + logoScreenShot.getImage());
		ImageIO.write(logoScreenShot.getImage(), "png", new File("C://Temp/OrangeHRMLogo.png"));

		File f = new File("C://Temp/OrangeHRMLogo.png");
		if (f.exists()) {
			System.out.println("The Logo has been captured");
		} else {
			System.out.println("The Logo has not been captured");
		}
	}



}
