/**
 * 
 */
package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Administrator
 * accept the browser name in the parameter and initialize the browser
 */
public class Browserfactory {
	
	static WebDriver driver;

	public static WebDriver StartBrowser(String browserName,String URL) {
		
		if(browserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}

		if(browserName.equalsIgnoreCase("IE")) {
			driver=new InternetExplorerDriver();
		}
		
		
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
	}
	
	
}
	
	
	
	

