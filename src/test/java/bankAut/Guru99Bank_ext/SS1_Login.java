package bankAut.Guru99Bank_ext;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.parameters;

public class SS1_Login extends Base
{
		@Test
		public void test1() throws InterruptedException
		{
		driver = driverInitialize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		parameters pObject =new parameters();
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(pObject.uName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pObject.pwd);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(1000);
		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage"))
		{
			System.out.println("Title verified.");
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Title doesn't match.");
			System.out.println("Test Case Failed");
		}
		}
		@AfterTest
		public void at()
		{
			driver.quit();
		}
}
