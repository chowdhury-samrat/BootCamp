package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements {
	
	public WebDriver driver;
	
	By home=By.xpath("//a[contains(text(),'Home')]");
	By qaserv=By.xpath("//*[@id=\'nav-services\']");
	By knowc=By.xpath("//a[contains(text(),'Knowledge Center')]");
	By cu=By.xpath("//a[contains(text(),'Conatct Us')]");
	
	
	public HomePageElements(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getHome()
	{
		return driver.findElement(home);
	}
    
	public WebElement getQaserv()
	{
		return driver.findElement(qaserv);
	}
	
	public WebElement getKnowledgecenter()
	{
		return driver.findElement(knowc);
	}
	
	public WebElement getContactus()
	{
	return driver.findElement(cu);
	}
}
