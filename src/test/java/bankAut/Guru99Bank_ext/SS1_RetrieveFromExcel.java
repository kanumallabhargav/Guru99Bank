package bankAut.Guru99Bank_ext;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class SS1_RetrieveFromExcel extends Base
{
	@Test
	public void SS1_TC() throws IOException
	{
		Experimental_SS1_Login_ExcelDDT obj = new Experimental_SS1_Login_ExcelDDT();
		ArrayList<String> lst = obj.getData();
		String uName = (String) lst.get(1);
		String pswrd = (String) lst.get(2);
		String UrL = (String) lst.get(3);
		driverInitialize();
		driver.get(UrL);
		loginPageObjects lpo = new loginPageObjects(driver);
		lpo.locateUsrName().sendKeys(uName);
		lpo.locatePassword().sendKeys(pswrd);
		lpo.locateLoginButton().click();
		if(driver.getTitle().equalsIgnoreCase("----"))
		{
			System.out.println("Test case Passed");
		}
}
}