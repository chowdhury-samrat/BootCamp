import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePageElements;
import resources.base;

public class T01_HomePageValidation extends base {

	WebDriver driver;

	@BeforeTest
	public void homePage() throws IOException {
		driver = intializeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		String title = driver.getTitle();
		System.out.println("The page title is: " + title);
		
		
	}

	@Test(priority=1)
	public void PageValidation() throws InterruptedException {
		HomePageElements hpe = new HomePageElements(driver);
		hpe.getEmail().sendKeys("validation");
		hpe.getPassword().sendKeys("123456");
		System.out.println(hpe.getForgotaccount().getText());
		System.out.println(hpe.getLogin().getText());

	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
