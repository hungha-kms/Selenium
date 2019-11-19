package HandlingWebElements;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		System.out.println("*** Before adding **** Size of the Cookies: " + cookies.size());

		for(Cookie c:cookies){
			String str = c.getName() + "; " + c.getValue();
			System.out.println(str);
		}
		
		Cookie cookieObj = new Cookie("Hung Ha cookie", "Thuy, Hung, YenDan, Emma, Lucas");
		driver.manage().addCookie(cookieObj);
		
		cookies = driver.manage().getCookies();
		
		System.out.println("*** After adding **** Size of the Cookies: " + cookies.size());
		
		for(Cookie c:cookies){
			String str = c.getName() + "; " + c.getValue();
			System.out.println(str);
		}
		
		driver.manage().deleteAllCookies();

		cookies = driver.manage().getCookies();
		System.out.println("*** After deleting **** Size of the Cookies: " + cookies.size());
	}

}
