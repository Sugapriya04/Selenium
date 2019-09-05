package chromeSample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAuthentication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	
		
		Runtime.getRuntime().exec("C:\\Users\\Administrator\\Documents\\Selenium Project\\AutoIT\\Authentication.exe");
		driver.get("https://www.engprod-charter.net/");
		
		
		
		
		
	}

}
