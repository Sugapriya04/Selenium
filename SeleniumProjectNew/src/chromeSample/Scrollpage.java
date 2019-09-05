package chromeSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.livechatinc.com/typing-speed-test/#/");
		driver.manage().window().maximize();
		
		
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
		
	js.executeScript("scroll(0,400)");
	
	
		
		
		
		
		
		
		
		
	}

}
