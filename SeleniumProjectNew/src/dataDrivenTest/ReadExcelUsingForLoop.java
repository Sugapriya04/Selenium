package dataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelUsingForLoop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
File src=new File("C:\\Users\\Administrator\\Documents\\Selenium Project\\ExcelData\\TestData.xls");
		
		//java.io is the package and file is the class
		
		FileInputStream fis=new FileInputStream(src);
		
		//loaded src as bites
		
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		//this is for .xls file else we should use XSSFWorkbook
		
		HSSFSheet sheet1=wb.getSheetAt(0);
		
		int countRow=sheet1.getLastRowNum();
		
		System.out.println("Total number of rows are :"+(countRow+1));
		
		for(int i=0;i<countRow;i++) {
			
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("test data for excel is :"+data0);
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
