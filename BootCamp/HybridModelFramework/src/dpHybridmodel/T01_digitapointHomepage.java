package dpHybridmodel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import Utilities.browsers;
import resources.pageElements;

public class T01_digitapointHomepage extends browsers{
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver = intializeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		String title = driver.getTitle();
		System.out.println("The page title is: " + title);

	}
	
	
}
