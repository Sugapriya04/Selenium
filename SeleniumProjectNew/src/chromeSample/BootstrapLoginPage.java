package chromeSample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BootstrapLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
				
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
			
		driver.findElement(By.id("i-icon-profile")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("signInLink"));
		
        Actions act=new Actions(driver);
        act.moveToElement(ele).click().perform();
        Thread.sleep(4000);
        
        //the bootstrap is coming inside a frame
       List<WebElement> c= driver.findElements(By.tagName("iframe"));
       int count=c.size();
       System.out.println(count);
        WebElement wb=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
        
        
        driver.switchTo().frame(wb);
        
        driver.findElement(By.id("mobileNoInp")).sendKeys("7865436890");
        
        
	}

}
