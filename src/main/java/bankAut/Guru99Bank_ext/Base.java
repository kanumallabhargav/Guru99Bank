package bankAut.Guru99Bank_ext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import resources.parameters;

public class Base 
{
	public static WebDriver driver;
	public static WebDriver driverInitialize()
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		driver = new FirefoxDriver();
		parameters pObject = new parameters();
		driver.get(pObject.url);
		return driver;
	}
}
