package bankAut.Guru99Bank_ext;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Experimental_SS1_Login_ExcelDDT 
{
	public ArrayList<String> getData() throws IOException
	{
		ArrayList<String> valuesFromExcelSheet = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("---filePathHere---");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int numberOfSheets = workbook.getNumberOfSheets();
		for (int i=0;i<numberOfSheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("--yourSheetNameHere--"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> cellIterator= firstRow.cellIterator();
				int count=0;
				int coloumn=0;
				while(cellIterator.hasNext())
				{
					Cell value = cellIterator.next();
					String cellContent = value.getStringCellValue();
					if(cellContent.equalsIgnoreCase("--yourColumnNameHere--"))
					{
						coloumn = count;
					}
					count++;
				}
				while(rows.hasNext())
				{
					Row moveThroughColumn = rows.next();
					String valueIntheCell = moveThroughColumn.getCell(coloumn).getStringCellValue();
					if(valueIntheCell.equalsIgnoreCase("--yourDesiredValueToBeRetrievedHere--"));
					{
						Iterator<Cell> getTheValue = moveThroughColumn.cellIterator();
						while(getTheValue.hasNext())
						{
							valuesFromExcelSheet.add(getTheValue.next().getStringCellValue());
						}
					}
				}
			}
		}
		return valuesFromExcelSheet;
	}
}
