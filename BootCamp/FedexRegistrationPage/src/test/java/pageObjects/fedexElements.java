package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fedexElements {
	WebDriver driver;

	public fedexElements(WebDriver driver) {
		this.driver = driver;
	}

	By firstname = By.xpath("//input[@id='firstName']");
	By lastname = By.xpath("//input[@id='lastName']");
	By email = By.xpath("//input[@id='email']");
	By reemail = By.xpath("//input[@id='retypeEmail']");
	By address = By.xpath("//input[@id='address1']");
	By city = By.xpath("//input[@id='city']");
	By postal = By.xpath("//input[@id='zip']");
	By phone = By.xpath("//input[@id='phone']");
	By userid = By.xpath("//input[@id='uid']");
	By password = By.xpath("//input[@id='password']");
	By repassword = By.xpath("//input[@id='retypePassword']");
	By secanswer = By.xpath("//input[@id='reminderAnswer']");
	By termcon = By.name("acceptterms");
	By termcon2 = By.xpath("//input[@id='cboptin']");
	By createid = By.xpath("//input[@id='accountType3Radio']");

	public WebElement getFirstname() {
		return driver.findElement(firstname);
	}

	public WebElement getLastname() {
		return driver.findElement(lastname);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getReemail() {
		return driver.findElement(reemail);
	}

	public WebElement getAddress() {
		return driver.findElement(address);
	}

	public WebElement getCity() {
		return driver.findElement(city);
	}

	public WebElement getPostal() {
		return driver.findElement(postal);
	}

	public WebElement getUserid() {
		return driver.findElement(userid);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement getRepassword() {
		return driver.findElement(repassword);
	}

	public WebElement getSecanswer() {
		return driver.findElement(secanswer);
	}

	public WebElement getPhone() {
		return driver.findElement(phone);
	}

	public WebElement getTermcon() {
		return driver.findElement(termcon);
	}

	public WebElement getTermcon2() {
		return driver.findElement(termcon2);
	}

	public WebElement getCreateid() {
		return driver.findElement(createid);
	}

}