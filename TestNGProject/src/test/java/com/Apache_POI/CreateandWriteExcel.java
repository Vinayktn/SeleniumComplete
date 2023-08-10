package com.Apache_POI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFAnchor;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CreateandWriteExcel 
{	

	//WORKBOOK --> SHEET --> ROW --> CELL
	//	public static void main(String[] args) throws Exception 
	//	{
	//		HSSFWorkbook workbook = new HSSFWorkbook();
	//		HSSFSheet sheet = workbook.createSheet("TestSheet");
	//
	//		//in apache poi indexs starts from 0 for rows and sheets
	//		sheet.createRow(0);
	//		sheet.getRow(0).createCell(0).setCellValue("Hello");
	//		sheet.getRow(0).createCell(1).setCellValue("World");
	//
	//		sheet.createRow(1);
	//		sheet.getRow(1).createCell(0).setCellValue("HYR");
	//		sheet.getRow(1).createCell(1).setCellValue("Tutorials");
	//
	//		File file = new File("C:\\Users\\VK075855\\eclipse-workspace\\TestNGProject\\ExcelFiles\\Test2.xls");
	//		FileOutputStream fos = new FileOutputStream(file);
	//		workbook.write(fos);
	//		workbook.close();
	//	}


	public static void main(String[] args) throws Exception 
	{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("TestSheet");

		//in apache poi indexs starts from 0 for rows and sheets
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("World");

		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("HYR");
		sheet.getRow(1).createCell(1).setCellValue("Tutorials");

		//		File file = new File("C:\\Users\\VK075855\\eclipse-workspace\\TestNGProject\\ExcelFiles\\Test4.xls");
		//		FileOutputStream fos = new FileOutputStream(file);
		int rowcount = sheet.getPhysicalNumberOfRows();
		for(int i=0; i<rowcount; i++)
		{
			XSSFRow row = sheet.getRow(i);

			int cellcount = row.getPhysicalNumberOfCells();
			for(int j=0; j<cellcount; j++)
			{
				XSSFCell cell = row.getCell(j);
				String cellvalue = getcellvalue(cell);
				System.out.println("||"+cellvalue);
			}
			System.out.println();
			workbook.close();
		}
	}

	public static String getcellvalue(XSSFCell cell)
	{
		switch(cell.getCellType())
		{
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());

		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());

		case STRING:
			return cell.getStringCellValue();

		default:
			return cell.getStringCellValue();
		}
	}
}