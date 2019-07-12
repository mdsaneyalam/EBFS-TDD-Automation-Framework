package com.ebfs.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ebfs.page_object_properties.AuthenticationPageProperties;

public class ExcelUtils {
	
	public static XSSFSheet excelSheet;
	public static XSSFWorkbook excelBook;
	public static XSSFRow	excelRow;
	public static XSSFCell excelCell;
	
	
	// 1. set the path for Excel file
	
	public static void setExcelFile(String path, String sheetName) throws Exception {
		
		try {
			//open the excel file
			FileInputStream excelFile = new FileInputStream(path);
			
			// access the file
			excelBook = new XSSFWorkbook(excelFile);
			
			excelSheet = excelBook.getSheet(sheetName);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//2. read the data from excel file
	public static String getCellData(int rowNum, int columnNum) {
		
		excelCell = excelSheet.getRow(rowNum).getCell(columnNum);
		
		String cellData = excelCell.getStringCellValue();
		
		return cellData;
		
				
	}
	
	
	//3. Write data to excel file
	
	public static void setCellData(String result, int rowNum, int colNum) throws Exception {
		
		excelRow = excelSheet.getRow(rowNum);
		
		excelCell = excelRow.getCell(colNum);
		
		if(excelCell == null) {
			excelCell = excelRow.createCell(colNum);
			excelCell.setCellValue(result);
		}else {
			excelCell.setCellValue(result);
		}
		
		
		FileOutputStream outputFile = new FileOutputStream(AuthenticationPageProperties.TEST_DATA_FILE);
		
		excelBook.write(outputFile);
		
		outputFile.flush();
		
		outputFile.close();
	}

}
