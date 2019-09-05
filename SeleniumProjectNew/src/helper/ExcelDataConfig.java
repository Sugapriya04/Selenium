package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataConfig {
	
	private static final String data1 = null;
	HSSFWorkbook wb;
	HSSFSheet sheet1;
	
	public ExcelDataConfig(String excelpath) {
		
		
		
		try {
			File src=new File(excelpath);
			
			//java.io is the package and file is the class
			
			FileInputStream fis=new FileInputStream(src);
			
			//loaded src as bites
			
			wb=new HSSFWorkbook(fis);
			//this is for .xls file else we should use XSSFWorkbook
			
			 sheet1=wb.getSheetAt(0);
				} catch (Exception e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
		
		
	}
	
	public String getData() {
		
		int countRow=sheet1.getLastRowNum();
		System.out.println(countRow);
		String data1 = null;
		
			data1=sheet1.getRow(0).getCell(0).getStringCellValue();
			
		
	
		return data1;   
		
		
		
		
	}

}
