package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateLeadIntegration {

	//Step 1 For Integration: Convert the main method to Static String[][] 
	public static String[][] fetchData(String fileName) throws IOException {

		// Step1 : Set up the excel file path/ workbook
		XSSFWorkbook wb = new XSSFWorkbook("./ReadExcel/"+fileName+".xlsx");

		// Step2 : to get the sheet from the book.
		XSSFSheet sheet = wb.getSheetAt(0);

		XSSFRow row = sheet.getRow(0);

		// getLsatRowNum(); - excludes header.
		int rowCount = sheet.getLastRowNum();
		// System.out.println("getLastRowNum " + rowCount);

		// getPhysicalNumberOfRows(); - Includes header.
		// count all the row including header.
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		// System.out.println("physicalNumberOfRows " + physicalNumberOfRows);

		// count the cell/column value
		short lastCellNum = sheet.getRow(1).getLastCellNum();
		// System.out.println("lastCellNum " + lastCellNum);

		// count all the cell including header.
		String stringCellValue = sheet.getRow(1).getCell(1).getStringCellValue();
		// System.out.println("stringCellValue " + stringCellValue);

		// Step4: to get the column/cell value. - index starts from 1.
		XSSFCell cell = row.getCell(1);

		//Step 2: For Integration.
		String[][] data = new String[rowCount][lastCellNum];
		
		
		// Step5: to read the Entier cell value.
		String stringCellValue2 = cell.getStringCellValue();

		// System.out.println(stringCellValue2);

		// Step6: Print all the values from the sheet.
		// row value index starts from
		for (int i = 1; i <= rowCount; i++) {

			// cell values starts from 0.
			for (int j = 0; j < lastCellNum; j++) {

				String stringCellValues = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValues);

				//Step 3: 
				data[i-1][j]=stringCellValues;
				
				
				// nullPointerException.
			}

		}
		wb.close();
		return data;
		
	}

}
