package com.shopify.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static FileInputStream fin;
	public static FileOutputStream fout;
	public static XSSFWorkbook wBook;
	public static XSSFSheet wSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int getRowCount(String xFile, String xSheet) throws Exception
	{
		fin = new FileInputStream(xFile);
		wBook = new XSSFWorkbook(fin);
		wSheet = wBook.getSheet(xSheet);
		
		int rowCount = wSheet.getLastRowNum();
		wBook.close();
		fin.close();
		
		return rowCount;
		
	}
	
	public static int getCellCount(String xFile, String xSheet, int rowNum) throws Exception
	{
		fin = new FileInputStream(xFile);
		wBook = new XSSFWorkbook(fin);
		wSheet = wBook.getSheet(xSheet);
		row = wSheet.getRow(rowNum);
		
		int cellCount = row.getLastCellNum();

		wBook.close();
		fin.close();

		return cellCount;

	}

	public static String getCellData(String xFile, String xSheet, int rowNum, int colnum) throws IOException {
		fin = new FileInputStream(xFile);
		wBook = new XSSFWorkbook(fin);
		wSheet = wBook.getSheet(xSheet);

		row = wSheet.getRow(rowNum);
		cell = row.getCell(colnum);

		DataFormatter dataFormatter = new DataFormatter();
		String cellDate = dataFormatter.formatCellValue(cell);

		wBook.close();
		fin.close();

		return cellDate;

	}
	public static void setCellData(String xFile, String xSheet, int rowNum, int colnum) throws FileNotFoundException {
		fout = new FileOutputStream(xFile);
		wSheet = wBook.createSheet("student data");
		wSheet.createRow(rowNum++);
	}
}