package bankAut.Guru99Bank_ext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects extends Base
{
	public WebDriver driver;
	private By usrName= By.xpath("//input[@name='uid']");
	private By passWorD = By.xpath("//input[@name='password']");
	private By clickLoginButton = By.xpath("//input[@name='btnLogin']");
	public loginPageObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	public WebElement locateUsrName()
	{
		return driver.findElement(usrName);
	}
	public WebElement locatePassword()
	{
		return driver.findElement(passWorD);
	}
	public WebElement locateLoginButton()
	{
		return driver.findElement(clickLoginButton);
	}
}
