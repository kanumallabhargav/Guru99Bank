package bankAut.Guru99Bank_ext;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.parameters;

public class SS1_Login extends Base
{
	private static Logger log = LogManager.getLogger(Base.class.getName());
		@Test(dataProvider="DataProviderMethod")
		public void test1(String usrNameFromDataProvider, String passWordFromDataProvider)
		{
			driver = driverInitialize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			parameters parametersClassObject =new parameters(driver);
			driver.get(parametersClassObject.url);
			parametersClassObject.findUserNameBox().sendKeys(usrNameFromDataProvider);
			parametersClassObject.findPasswordBox().sendKeys(passWordFromDataProvider);
			parametersClassObject.findLoginButton().click();
			if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage"))
			{
				log.info("Title verified.");
				log.info("Test Case Passed");
			}
			if(driver.findElement(By.linkText("Manager")).isDisplayed())
			{
				log.info("Login Success");
			}
			else
			{
				log.error("login Failed");
			}
		}
		@DataProvider
		public Object[][] DataProviderMethod() throws IOException
		{
			FileInputStream fis = new FileInputStream("/Users/bhargavkanmalla/Documents/workspace/Guru99Bank_ext/src/main/java/resources/Data.properties");
			Properties prop = new Properties();
			prop.load(fis);
			String validUID = prop.getProperty("validUserId");
			String validPWD = prop.getProperty("validPassword");
			String invalidData = prop.getProperty("invalidData");
			Object[][] dataProviderObject = new Object[4][2];
			dataProviderObject[0][0] = validUID;
			dataProviderObject[0][1] = validPWD;
			dataProviderObject[1][0] = invalidData;
			dataProviderObject[1][1] = validPWD;
			dataProviderObject[2][0] = validUID;
			dataProviderObject[2][1] = invalidData;
			dataProviderObject[3][0] = invalidData;
			dataProviderObject[3][1] = invalidData;
			return dataProviderObject;
		}
		@AfterTest
		public void closeDriverAndClearCookies()
		{
			driver.manage().deleteAllCookies();
			driver.close();
		}
}
