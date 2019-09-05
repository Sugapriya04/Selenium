package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot{
	
	
public static void captureScreenshot(WebDriver driver,String snapshot) {
	
	

	TakesScreenshot ts=(TakesScreenshot)driver;
	File fs=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(fs, new File("C:\\Users\\Administrator\\Documents\\Selenium Project\\"+snapshot+".png"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		
		
		System.out.println("Exception arrived:"+e.getLocalizedMessage());}
	
	System.out.println("Screenshot captured");

	
}
}
