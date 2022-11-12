package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static String[][] readData(String filename,int sheetindex) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheetAt = book.getSheetAt(sheetindex);
		XSSFRow row = sheetAt.getRow(0);
		int rowCount = sheetAt.getLastRowNum();
		int colCount = row.getLastCellNum();

		String[][] data = new String[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String allValues = sheetAt.getRow(i).getCell(j).getStringCellValue();
				// System.out.println(allValues);
				data[i - 1][j] = allValues;
				// data[1][0]=TL-->data[0][0];
			}
		}

		book.close();
		return data; // [][]

	}
	
	/*
	 * public static String[][] readData1() throws IOException { XSSFWorkbook book =
	 * new XSSFWorkbook("./data/DelLead.xlsx"); XSSFSheet sheetAt =
	 * book.getSheetAt(0); XSSFRow row = sheetAt.getRow(0); int rowCount =
	 * sheetAt.getLastRowNum(); int colCount = row.getLastCellNum(); String[][] data
	 * = new String[rowCount][colCount]; for (int i = 1; i <= rowCount; i++) { for
	 * (int j = 0; j < colCount; j++) { String allValues =
	 * sheetAt.getRow(i).getCell(j).getStringCellValue(); //
	 * System.out.println(allValues); data[i - 1][j] = allValues; //
	 * data[1][0]=TL-->data[0][0]; } }
	 * 
	 * book.close(); return data; // [][]
	 * 
	 * }
	 */
	
	
	
	
	
	

}
