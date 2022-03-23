package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\sathish kumar\\Documents\\Write_Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		 wb.createSheet("Data").createRow(0).createCell(0).setCellValue("Email");
		 wb.getSheet("Data").getRow(0).createCell(1).setCellValue("Password");
		 wb.getSheet("Data").createRow(1).createCell(0).setCellValue("sathish");
		 wb.getSheet("Data").getRow(1).createCell(1).setCellValue("strac123");
		 
		 FileOutputStream fisout = new FileOutputStream(f);
		 wb.write(fisout);
		 wb.close();
		 System.out.println("success");
	
		
		
		
	}

}
