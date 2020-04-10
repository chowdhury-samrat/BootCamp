package DigitalPointTech.Validation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePageElements;
import pageObjects.logInfo;

import pageObjects.qaoutsourcingpage;
import resources.base;

public class HomePage extends base {

	@BeforeTest
	public void intialize() throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		logInfo.debug("Home Page Validation");
	}

	@Test
	public void basePageNavigation() throws IOException {

		HomePageElements hpe = new HomePageElements(driver);
		hpe.getHome().click();
		hpe.getQaserv().click();
		logInfo.info("\"QA Services Page clicked\"");

		hpe.getKnowledgecenter().click();
		logInfo.info("Knowledge Center Page");
		hpe.getContactus().click();
		logInfo.info("Contact us Page");

		qaoutsourcingpage qosp = new qaoutsourcingpage(driver);
		qosp.getFreequote().click();
		logInfo.debug("Get a Free Quote page landing");
		qosp.getFirstname().sendKeys("samrat");
		qosp.getLastname().sendKeys("chowdhury");
		qosp.getComemail().sendKeys("chysam099@gmail.com");
		qosp.getPhonenum().sendKeys("4036671666");
		WebElement element = driver.findElement(By.xpath("//select[@name='services']"));
		Select sel = new Select(element);
		sel.selectByValue("Automation Testing");
		qosp.getDescrip().sendKeys("bootcamp");
		logInfo.info("After finishing edit all button on the page,before submit");
		qosp.getSubmit().click();
		logInfo.info("Clicked on submit button");
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}

}
