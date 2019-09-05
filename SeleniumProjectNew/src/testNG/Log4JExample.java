package testNG;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4JExample {
	
	 public static void main(String[] args) {
	
		  //this returns logger
	Logger logger=Logger.getLogger("Log4JExample");
  
	 
    // configure log4j properties file
    PropertyConfigurator.configure("Log4j.properties");
    

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	logger.info("open browser");
	
	List<WebElement> radio=driver.findElements(By.id("male"));
	
	for(int i=0;i<radio.size();i++) {
	int x=radio.get(i).getLocation().getX();
	if(x!=0) {
		radio.get(i).click();
		System.out.println("done");
		break;
	}
	}
	

}}
