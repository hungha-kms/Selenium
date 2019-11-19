package HandlingWebElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://goo.gl/kNZ6Sr");
		driver.findElement(By.xpath("//input[@id='RESULT_FileUpload-10']")).click();
		Runtime.getRuntime().exec("C://Temp/FileUpload.exe");

	}

}
