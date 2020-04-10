package utilities;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	public WebDriver driver;
	public Properties prop;
	

	public WebDriver intializeDriver() throws IOException
	

	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Automation\\Eclipse\\BootCamp\\FedexRegistrationPage\\src\\test\\java\\utilities\\data.properties");
	

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Eclipse\\BootCamp\\FedexRegistrationPage\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Eclipse\\BootCamp\\FedexRegistrationPage\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Automation\\Eclipse\\BootCamp\\FedexRegistrationPage\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

}
