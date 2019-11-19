package ashotapi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CaptureImages {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		BufferedImage expectedImage = ImageIO.read(new File("C://Temp/OrangeHRMLogo.png"));
		WebElement logoImageElement = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Screenshot logoScreenShot = new AShot().takeScreenshot(driver, logoImageElement);
		
		BufferedImage actualImage = logoScreenShot.getImage();
		
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);

		if (diff.hasDiff() == true) {
			System.out.println("Images are not the same");
		} else {
			System.out.println("Images are the same");
		}
	}

}
