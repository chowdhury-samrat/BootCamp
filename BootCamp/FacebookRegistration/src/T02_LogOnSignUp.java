import java.io.IOException;
import java.util.List;

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

public class T02_LogOnSignUp extends base {

	WebDriver driver;

	@BeforeTest
	public void homePage() throws IOException {
		driver = intializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

	}

	@Test(priority=2)
	public void signUp() throws InterruptedException {

		HomePageElements hpe = new HomePageElements(driver);
		hpe.getFirstname().sendKeys("Samrat");
		hpe.getLastname().sendKeys("Chowdhury");
		hpe.getMobileEmail().sendKeys("test@gmail.com");
		hpe.getRemobileemail().sendKeys("test@gmail.com");
		hpe.getPassword1().sendKeys("sam1234");
		
		Thread.sleep(4000L);

		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));

		Select sel1 = new Select(month);
		sel1.selectByIndex(7);
		List<WebElement> listmonths = sel1.getOptions();
		System.out.println(listmonths.size());
		int Totalmonths = listmonths.size() - 1;
		System.out.println("Total months are: " + Totalmonths);

		for (int i = 0; i < listmonths.size(); i++) {
			String monthValue = listmonths.get(i).getText();
			System.out.println(monthValue);
		}

		Select sel2 = new Select(day);
        sel2.selectByIndex(23);
		List<WebElement> listdays = sel2.getOptions();
		System.out.println(listdays.size());
		int Totaldays = listdays.size() - 1;
		System.out.println("Total days are: " + Totaldays);

		for (int i = 0; i < listdays.size(); i++) {
			String dayValue = listdays.get(i).getText();
			System.out.println(dayValue);
		}

		Select sel3 = new Select(year);
		sel3.selectByValue("1987");
        List<WebElement> listyear = sel3.getOptions();
		System.out.println(listyear.size());
		int Totalyear = listyear.size();
		System.out.println("Year are option available are: " + Totalyear);

		for (int i = 0; i < listyear.size(); i++) {
			String yearValue = listyear.get(i).getText();
			System.out.println(yearValue);
		}

		WebElement genderFemale = driver.findElement(By.xpath("//input[@id='u_0_6']"));
		genderFemale.click();

		WebElement genderMale = driver.findElement(By.xpath("//input[@id='u_0_7']"));
		genderMale.click();

		System.out.println(hpe.getSignup().getText());
		System.out.println(hpe.getCreate().getText());

	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}