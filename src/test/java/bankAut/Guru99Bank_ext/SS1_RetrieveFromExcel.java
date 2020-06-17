package bankAut.Guru99Bank_ext;

import java.io.IOException;
import java.util.ArrayList;

public class SS1_RetrieveFromExcel {

	public static void main(String[] args) throws IOException 
	{
		Experimental_SS1_Login_ExcelDDT obj = new Experimental_SS1_Login_ExcelDDT();
		ArrayList lst = obj.getData();
		String uName = (String) lst.get(1);
		String pswrd = (String) lst.get(2);
		String UrL = (String) lst.get(3);
	}

}
