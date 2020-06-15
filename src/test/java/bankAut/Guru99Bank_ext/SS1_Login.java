package bankAut.Guru99Bank_ext;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.parameters;

public class SS1_Login extends Base
{
		@Parameters({"URL"})
		@Test(dataProvider="DataProviderMethod")
		public void test1(String usrNameFromDataProvider, String passWordFromDataProvider)
		{
			driver = driverInitialize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			parameters parametersClassObject =new parameters(driver);
			driver.get(parametersClassObject.url);
			System.out.println(usrNameFromDataProvider);
			System.out.println(passWordFromDataProvider);
			parametersClassObject.findUserNameBox().sendKeys(usrNameFromDataProvider);
			parametersClassObject.findPasswordBox().sendKeys(passWordFromDataProvider);
			parametersClassObject.findLoginButton().click();
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
			System.out.println("down the line check");
			driver.manage().deleteAllCookies();
			driver.close();
		}
		@DataProvider
		public Object[][] DataProviderMethod()
		{
			Object[][] dataProviderObject = new Object[4][2];
			dataProviderObject[0][0] = "mngr263563";
			dataProviderObject[0][1] = "azAmEha";
			dataProviderObject[1][0] = "INVALID";
			dataProviderObject[1][1] = "azAmEha";
			dataProviderObject[2][0] = "mngr263563";
			dataProviderObject[2][1] = "INVALID";
			dataProviderObject[3][0] = "INVALID";
			dataProviderObject[3][1] = "INVALID";
			return dataProviderObject;
		}
}
