package webElementsControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableControl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:\\Working\\Eclipse-workspace\\WebDriverMorningBatch\\sample.html");
		
		int rowsCount = driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
		System.out.println("Number of rows of the table: " + rowsCount);
		int colsCount = driver.findElements(By.xpath("html/body/table/tbody/tr/th")).size();
		System.out.println("Number of cols of the table: " + colsCount);
		
		for(int i = 2; i <= rowsCount; i++) {
			for(int j = 1; j <= colsCount; j++) {
				String value = driver.findElement(
						By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(value + "  ");
			}
			System.out.println();
		}
		
		driver.close();
	}

}
