package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook workbook;

	public ExcelDataProvider() throws IOException {
		
		File Data = new File("./Excel/Data.xlsx");
		
		FileInputStream dataInput = new FileInputStream(Data);
		
		
		workbook = new XSSFWorkbook(dataInput);	
		
	}
	
	
	public String getStringData(String sheetname,int rownum,int cellnum) {
		return workbook.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	
	public String getStringData(int sheetnum,int rownum,int cellnum) {
		return workbook.getSheetAt(sheetnum).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
	
	public double getNumericData(String sheetname, int rownum,int cellnum) {
		return workbook.getSheet(sheetname).getRow(rownum).getCell(cellnum).getNumericCellValue();
	}
	
}
