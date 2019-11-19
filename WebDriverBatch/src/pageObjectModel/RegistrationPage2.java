package pageObjectModel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage2 {
	
	WebDriver driver;
	
	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	WebElement RegLink;
	
	@FindBy(how = How.NAME, using = "firstName")
	WebElement FirstName;
	
	@FindBy(name = "lastName")
	WebElement LastName;
	
	@FindBy(name = "phone")
	WebElement phone;
	
	@FindBy(name = "userName")
	WebElement email;
	
	@FindBy(name = "address1")
	WebElement address1;
	
	@FindBy(name = "address2")
	WebElement address2;
	
	@FindBy(name = "city")
	WebElement city;
	
	@FindBy(name = "state")
	WebElement state;
	
	@FindBy(name = "postalCode")
	WebElement postalCode;
	
	@FindBy(name = "country")
	WebElement country;
	
	@FindBy(name = "email")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name = "register")
	WebElement registerBtn;
	
	RegistrationPage2(WebDriver d){
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	public void clickRegLink() {
		RegLink.click();
	}
	
	public void setFirstName(String fname) {
		FirstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		LastName.sendKeys(lname);
	}
	
	public void setPhone(String ph) {
		phone.sendKeys(ph);
	}
	
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void setAddress1(String add1) {
		address1.sendKeys(add1);
	}
	
	public void setAddress2(String add2) {
		address2.sendKeys(add2);
	}
	
	public void setCity(String ci) {
		city.sendKeys(ci);
	}
	
	public void setState(String st) {
		state.sendKeys(st);
	}
	
	public void setPostalCode(String postal) {
		postalCode.sendKeys(postal);
	}
	
	public void setCountry(String co) {
		Select drop = new Select(country);
		drop.selectByVisibleText(co);
	}
	
	public void setUserName(String uName) {
		userName.sendKeys(uName);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void setConfirmPassword(String conPass) {
		confirmPassword.sendKeys(conPass);
	}
	
	public void clickRegisterBtn() {
		registerBtn.click();
	}
}
