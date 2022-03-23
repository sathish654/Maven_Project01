package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	

	public static void Particular_cell_data() throws IOException {

		File f = new File("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\DummyData.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheetAt(0);

		Row row = sheet.getRow(3);
		Cell cell = row.getCell(1);
		CellType Type = cell.getCellType();

		if (Type.equals(CellType.STRING)) {

			String stringCellValue = cell.getStringCellValue();
			System.out.println("PARTICULAR CELL DATA :");
			System.out.println(stringCellValue);

		} else if (Type.equals(CellType.NUMERIC)) {

			double numericCellValue = cell.getNumericCellValue();
			int number = (int) numericCellValue;
			System.out.println("PARTICULAR CELL DATA :");
			System.out.println(number);

		}
		wb.close();

	}

	public static void All_data() throws IOException {

		File f = new File("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\DummyData.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		System.out.println("ALL DATA:");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);

				CellType type = c.getCellType();

				if (type.equals(CellType.STRING)) {
					String stringCellValue = c.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (type.equals(CellType.NUMERIC)) {

					double numericCellValue = c.getNumericCellValue();
					int value = (int) numericCellValue;
					String value2 = Integer.toString(value);
					System.out.println(value2);

				}

			}

		}

		wb.close();

	}

	public static void Particular_Coloumn_Data() throws IOException {
		File f = new File("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\DummyData.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		System.out.println("PARTICULAR COLOUMN DATA :");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);

			Cell cell = r.getCell(0);

			CellType Type = cell.getCellType();
			if (Type.equals(CellType.STRING)) {

				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);

			} else if (Type.equals(CellType.NUMERIC)) {

				double numericCellValue = cell.getNumericCellValue();
				int number = (int) numericCellValue;
				System.out.println(number);

			}

		}

		wb.close();

	}

	public static void Particular_Row_Data() throws IOException {

		File f = new File("C:\\Users\\sathish kumar\\eclipse-workspace\\MyMaven_Projectt\\TestCases\\DummyData.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(4);
		

		System.out.println("PARTICULAR ROW DATA :");

	for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {

		Cell cell = r.getCell(i);

			CellType Type = cell.getCellType();
			
			if (Type.equals(CellType.STRING)) {

				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);

			}
			else if (Type.equals(CellType.NUMERIC)) {

				double numericCellValue = cell.getNumericCellValue();
				
				int number = (int) numericCellValue;
				System.out.println(number);

			}

		}

		wb.close();
		
	}
	
	
	public static void main(String[] args) throws IOException {
		Particular_cell_data();
		All_data();
		Particular_Coloumn_Data();
		Particular_Row_Data();

	}

}
