package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LogOnPageElements {

	WebDriver driver;
	
By logout=By.id("userNavigationLabel");
By logout1=By.xpath("//span[@class='_54nh'][text()='Log Out']");


	
	
public LogOnPageElements(WebDriver driver) {

	this.driver=driver;

}
public WebElement getLogout()
{
	return driver.findElement(logout);
}

public WebElement getLogout1()
{
	return driver.findElement(logout1);
}
	


}
