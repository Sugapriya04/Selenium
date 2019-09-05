package chromeSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("document.getElementById('pass').value='priya';");
	
	js.executeScript("document.getElementById('u_0_a').click();");
	
	
		
		
		
		
		
		
		
		
	}

}
