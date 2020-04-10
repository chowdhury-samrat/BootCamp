package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class qaoutsourcingpage {

	public WebDriver driver;
	
	
    
    
	By gafq = By.xpath("//div[@class='header-extra-buttons']//a[contains(text(),'Get a Free Quote')]");
	By firstname = By.name("fname");
	By lastname = By.xpath("//input[@name='lname']");
	By comemail = By.xpath("//input[@name='cemail']");
	By phonenum = By.name("pnumber");
	
	
	By descrip=By.xpath("//textarea[@name='description']");
	By submit=By.xpath("//input[@class='btn btn-primary btn-sm']");
	

	public qaoutsourcingpage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFreequote() {
		return driver.findElement(gafq);
	}

	public WebElement getFirstname() {
		return driver.findElement(firstname);
	}

	public WebElement getLastname() {
		return driver.findElement(lastname);
	}

	public WebElement getComemail() {
		return driver.findElement(comemail);
	}

	public WebElement getPhonenum() {
		return driver.findElement(phonenum);
	}

	public WebElement getDescrip()
	{
		return driver.findElement(descrip);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	
	
}
