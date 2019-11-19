package pageObjectModel;

import org.openqa.selenium.*;

public class RegistrationPage {
	WebDriver driver;
	
	By regLink = By.linkText("REGISTER");
	By firstName = By.name("firstName");
	By lastName = By.name("lastName");
	By phone = By.name("phone");
	By email = By.name("userName");
	By address1 = By.name("address1");
	By address2 = By.name("address2");
	By city = By.name("city");
	By state = By.name("state");
	By postalCode = By.name("postalCode");
	By country = By.name("country");
	By userName = By.name("email");
	By password = By.name("password");
	By confirmPassword = By.name("confirmPassword");
	By registerBtn = By.name("register");
	
	RegistrationPage(WebDriver d){
		driver = d;
	}
	
	public void clickRegLink() {
		driver.findElement(regLink).click();
	}
	
	public void setFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	}
	
	public void setPhone(String ph) {
		driver.findElement(phone).sendKeys(ph);
	}
	
	public void setEmail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
	
	public void setAddress1(String add1) {
		driver.findElement(address1).sendKeys(add1);
	}
	
	public void setAddress2(String add2) {
		driver.findElement(address2).sendKeys(add2);
	}
	
	public void setCity(String ci) {
		driver.findElement(city).sendKeys(ci);
	}
	
	public void setState(String st) {
		driver.findElement(state).sendKeys(st);
	}
	
	public void setPostalCode(String postal) {
		driver.findElement(postalCode).sendKeys(postal);
	}
	
	public void setCountry(String co) {
		driver.findElement(country).sendKeys(co);
	}
	
	public void setUserName(String uName) {
		driver.findElement(userName).sendKeys(uName);
	}
	
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void setConfirmPassword(String conPass) {
		driver.findElement(confirmPassword).sendKeys(conPass);
	}
	
	public void clickRegisterBtn() {
		driver.findElement(registerBtn).click();
	}
}
