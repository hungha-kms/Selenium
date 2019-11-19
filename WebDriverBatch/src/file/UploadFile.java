package file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");

		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		System.out.println(element);
		element.submit();
		
		/*String imagesFilepath = "C:\\Temp\\";
		String inputFilepath = "C:\\Temp\\";
		
		Screen screen = new Screen();
		
		Pattern fileInputTextbox = new Pattern(imagesFilepath+"HTH_9162.jpg");
		Pattern openButton = new Pattern(imagesFilepath+"HTH_9163.jpg");
		
		Thread.sleep(5000);
		screen.wait(fileInputTextbox, 20);
		screen.type(fileInputTextbox, inputFilepath + "HTH_9163.jpg");
		screen.click(openButton);
		*/
	}

}
