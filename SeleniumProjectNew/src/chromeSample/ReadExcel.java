package chromeSample;

import helper.ExcelDataConfig;

public class ReadExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\Administrator\\Documents\\Selenium Project\\ExcelData\\TestData.xls");
        String datareturn=excel.getData();
        System.out.println("The returned value is :"+datareturn);
	}

}
