package bankAut.Guru99Bank_ext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testClass 
{
		@Test
		public void test2()
		{
		System.setProperty("webdriver.gecko.driver", "/Users/bhargavkanmalla/Documents/selenium-java-3.141.59/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr263563");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("azAmAEha");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		}
}
