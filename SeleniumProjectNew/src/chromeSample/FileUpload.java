package chromeSample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Administrator/Documents/Selenium%20Project//fileupload.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/input")).click();
		
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\Administrator\\Documents\\Selenium Project\\AutoIT\\UploadTest.exe");
		
	
		
		
		     
		
		
		
	}

}
