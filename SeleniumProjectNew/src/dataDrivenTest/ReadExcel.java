package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File src=new File("C:\\Users\\Administrator\\Documents\\Selenium Project\\ExcelData\\TestData.xls");
		
		//java.io is the package and file is the class
		
		FileInputStream fis=new FileInputStream(src);
		
		//loaded src as bites
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		//this is for .xls file else we should use XSSFWorkbook
		
		HSSFSheet sheet1=wb.getSheetAt(0);
		
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from excel is:"+data0);
		
		
		wb.close();
			
	}

}
