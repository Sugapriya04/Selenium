package chromeSample;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utility.CaptureScreenshot;


public class FailedTestScreenshot {
	
	WebDriver driver;

	@Test
	public void captureScreenshot() throws Exception
	{
			 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("text");
		 
		 
		} 
		 
		 
		 
		// It will execute after every test execution 
		@AfterMethod
		public void tearDown(ITestResult result)
		{
		 
			if(ITestResult.FAILURE==result.getStatus()) {
				
				 CaptureScreenshot.captureScreenshot(driver,result.getName());
		
		}
		// close application
		driver.quit();
		}
		 
		 
		 
		}


	
	

	




























