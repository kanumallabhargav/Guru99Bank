package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class parameters 
{	
	public WebDriver driver;
	
	public String url = "http://www.demo.guru99.com/V4/";
	/*public String uName = "mngr263563";
	public String pwd = "azAmEha";*/
	
	private By userNameLocator = By.xpath("//input[@name='uid']");
	private By passwordLocator = By.xpath("//input[@name='password']");
	private By loginButtonLocator = By.xpath("//input[@name='btnLogin']");
	
	public parameters(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public WebElement findUserNameBox()
	{
		return driver.findElement(userNameLocator);
	}
	public WebElement findPasswordBox()
	{
		return driver.findElement(passwordLocator);
	}
	public WebElement findLoginButton()
	{
		return driver.findElement(loginButtonLocator);
	}
}
