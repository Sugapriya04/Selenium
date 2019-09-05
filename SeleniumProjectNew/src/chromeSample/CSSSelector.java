package chromeSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		//using id
	
		driver.findElement(By.cssSelector("input#u_0_l")).sendKeys("test");
		//using classname
		
		driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']#u_0_n")).sendKeys("testsec");
		
		//using contains
		driver.findElement(By.cssSelector("input[class*='58mg']#u_0_q")).sendKeys("priya");
	
		//using starts with 
		driver.findElement(By.cssSelector("input[autocomplete^='new']#u_0_x")).sendKeys("humble");
		
		//using ends with 
		driver.findElement(By.cssSelector("button[name$='submit']")).click();
		
	}

}
