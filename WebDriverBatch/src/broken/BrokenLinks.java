package broken;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		
		//Wait 5000 milli-seconds
		Thread.sleep(5000);
		
		//Capture links from the webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//number of links
		System.out.println("Links size: " + links.size());
		
		for(int i = 0; i < links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link = new URL(url);
			
			HttpURLConnection httpConn = (HttpURLConnection)link.openConnection();
			Thread.sleep(2000);
			
			httpConn.connect();
			
			int resCode = httpConn.getResponseCode();
			
			if (resCode >= 400) {
				System.out.println(url + " - is broken link");
			}else {
				System.out.println(url + " - is valid link");
			}
		}
	}

}
