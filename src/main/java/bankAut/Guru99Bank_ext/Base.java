package bankAut.Guru99Bank_ext;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	public static WebDriver driver;
	public static WebDriver driverInitialize()
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//parameters pObject = new parameters();
		//driver.get(pObject.url);
		return driver;
	}
	public String timeDate()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    return formatter.format(date);  
	}
	File sourceFile;
	public void getScreenshot(String methodName, WebDriver driver) throws IOException
	{
		sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String DestinationFile = System.getProperty("user.dir")+"/Screenshots/"+methodName+timeDate()+".png";
		FileUtils.copyFile(sourceFile, new File(DestinationFile));
	}
}
