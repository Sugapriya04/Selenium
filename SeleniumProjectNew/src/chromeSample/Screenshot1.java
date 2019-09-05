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

import Utility.CaptureScreenshot;

public class Screenshot1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("text");
        CaptureScreenshot.captureScreenshot(driver,"FirstSnap");
        CaptureScreenshot.captureScreenshot(driver,"SecondSnap");
		
		//   ./->it ll focus on the current directory
		
		
		
		

	}

}
