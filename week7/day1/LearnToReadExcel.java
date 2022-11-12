package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnToReadExcel {

	public static void  main(String[] args) throws IOException {

		// step:1 -->set the path for the excel book

		XSSFWorkbook book = new XSSFWorkbook("./data/CreateLeadxl.xlsx");

		// Step:2 --->Find the sheet using index/Sheet name
		XSSFSheet sheetAt = book.getSheetAt(0);

		// Step:3 ---->To access the row
		XSSFRow row = sheetAt.getRow(0);
		// =A1
		// Step:4 --->identify the column using the row
		XSSFCell cell = row.getCell(0);
		// Step:5-->to get the value from the cell
		String stringCellValue = cell.getStringCellValue();// 0,0
		//System.out.println(stringCellValue);

		// book-->sheet-->row-->col(cell)-->value
		// Step:6-->to get the row count
		int rowCount = sheetAt.getLastRowNum();
		System.out.println("row count : " + rowCount);

		// step:7-->to get the number of columns
		int colCount = row.getLastCellNum();
		System.out.println("Column Count : " + colCount);

		// to get available rows including header
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("rows including header: " + physicalNumberOfRows);

		System.out.println("Data from all rows and Columns");

		
		
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String allValues = sheetAt.getRow(i).getCell(j).getStringCellValue();
				System.out.println(allValues);
			}

		}
		
		

	}

}
