package com.automation.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.BaseClass.TestBase;

//We write common methods in this utility class

public class utiltest extends TestBase {
  


public utiltest() throws IOException {
		super();
		
	}


static	FileInputStream fis;
  static XSSFWorkbook workbook;
  static XSSFSheet sheet;
  static ArrayList<Object> al;
  public static String TEST_DATA_SHEETPATH=prop.getProperty("SheetPath");
  
  public static ArrayList<Object> getData(String sheetName) throws IOException
  {
	  al = new ArrayList<Object>();
	  
	  fis=new FileInputStream(new File(TEST_DATA_SHEETPATH));
	  workbook= new XSSFWorkbook(fis);
	   sheet=workbook.getSheet(sheetName);
        
 // Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
  for(int i=0;i<sheet.getLastRowNum();i++)//row
  {
	  for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) //column
	  {
		  
		 al.add( sheet.getRow(i+1).getCell(j).toString());
		  
	  }
  }
 return al;	
  }
}