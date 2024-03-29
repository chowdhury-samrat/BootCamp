package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import cucumber.api.junit.Cucumber;
import pageObjects.fedexElements;
import utilities.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

@RunWith(Cucumber.class)
public class stepDefination extends base {
	@Given("^User Launch Chrome Browser$")
	public void user_launch_chrome_browser() throws Throwable {
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@When("^User opens Fedex Registration page URL \"([^\"]*)\"$")
	public void user_opens_fedex_registration_page_url_something(String strArg1) throws Throwable {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	@When("^User enters following required information for registration$")
	public void user_enters_following_required_information_for_registration(DataTable data) throws Throwable {
		List<List<String>> obj = data.raw();
		fedexElements fde = new fedexElements(driver);
		fde.getFirstname().sendKeys(obj.get(0).get(0));
		fde.getLastname().sendKeys(obj.get(0).get(1));
		fde.getEmail().sendKeys(obj.get(0).get(2));
		fde.getReemail().sendKeys(obj.get(0).get(3));
		fde.getAddress().sendKeys(obj.get(0).get(4));
		fde.getCity().sendKeys(obj.get(0).get(5));
		fde.getPostal().sendKeys(obj.get(0).get(6));
		fde.getPhone().sendKeys(obj.get(0).get(7));
		fde.getUserid().sendKeys(obj.get(0).get(8));
		fde.getPassword().sendKeys(obj.get(0).get(9));
		fde.getRepassword().sendKeys(obj.get(0).get(10));
		fde.getSecanswer().sendKeys(obj.get(0).get(11));

	}

	@When("^User add remaining information for State, Country, Secret question$")
	public void user_add_remaining_information_for_state_country_secret_question() throws Throwable {

		Select selProvince = new Select(driver.findElement(By.xpath("//select[@id='state']")));
		selProvince.selectByValue("AB");
		Select selCountry = new Select(driver.findElement(By.xpath("//select[@id='country1']")));
		selCountry.selectByValue("ca_english");
		Select selSecquestion = new Select(driver.findElement(By.xpath("//select[@id='reminderQuestion']")));
		selSecquestion.selectByValue("SP2Q2");

	}

	@When("^User acknowledge Terms and Conditions and click on Create a user ID tab button$")
	public void User_acknowledge_Terms_and_Conditions_and_click_on_Create_a_user_ID_tab_button() throws Throwable {
		fedexElements fde2 = new fedexElements(driver);
		fde2.getTermcon().click();
		fde2.getTermcon2().click();
		fde2.getCreateid().click();

	}

	@Then("^Complete registration on fedex portal$")
	public void complete_registration_on_fedex_portal() throws Throwable {
		System.out.println("Successfully Completed Fedex Registration Process");
	}

}