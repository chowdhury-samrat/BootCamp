package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageElements {
WebDriver driver;

public pageElements(WebDriver driver)
{
	this.driver=driver;
}

By userlogin= By.xpath("//div[@class='owl-item active']//a[@class='button defaulthole scrollings bottom30'][contains(text(),'User Login')]");
By email=By.xpath("//input[@placeholder='Email']");
By password=By.xpath("//input[@placeholder='Password']");
By checkbox=By.xpath("//input[@class='styled']");
By signin=By.xpath("//button[@class='btn btn-primary pull-right']");
By logoff1=By.xpath("//a[@class='dropdown-toggle']");
By logoff2=By.xpath("//a[contains(text(),'Logout')]");

public WebElement getUserlogin()
{
	return driver.findElement(userlogin);
}
public WebElement getEmail()
{
	return driver.findElement(email);
}

public WebElement getPassword()
{
	return driver.findElement(password);
}

public WebElement getCheckbox()
{
	return driver.findElement(checkbox);
}
public WebElement getSiginin()
{
	return driver.findElement(signin);
}

public WebElement getLogoff1()
{
	return driver.findElement(logoff1);
}

public WebElement getLogoff2()
{
	return driver.findElement(logoff2);
}






}
