package com.maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExel {

	public static void allData() throws IOException {
		FileInputStream excelFile = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\maven\\exel.xlsx");

		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		for (int r = 0; r < rowCount; r++) {
			Row row = sheet.getRow(r);

			for (int c = 0; c < cellCount; c++) {

				String string = row.getCell(c).toString();
				System.out.print( "   "   + string);

			}
			System.out.println();

		}

	}

	// Workbook sheet = new XSSFWorkbook(fis);
//		Sheet sheetAt = sheet.getSheetAt(0);
//		//int rowCount = sheetAt.getLastRowNum();
//		int rowCount = sheetAt.getPhysicalNumberOfRows();
//		System.out.println(rowCount);
//		int noOfcells = sheetAt.getRow(0).getPhysicalNumberOfCells();
//		System.out.println(noOfcells);
//		
//		for (int i = 0; i < rowCount; i++) {
//			Row row = sheetAt.getRow(i);
//			
//		
//		
//		for (int j = 0; j <noOfcells; j++) {
//		String value = row.getCell(j).toString();
//		System.out.print("   "                 +          value);
//			
//		}
//		
//		System.out.println();
//		}
//
//	}
	public static void main(String[] args) throws IOException {
		allData();

	}

}
