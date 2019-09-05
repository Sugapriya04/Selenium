package chromeSample;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowContd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//To move to different windows and perform actions
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.naukri.com/");
	    //To get non duplicate count
		Set<String> all=driver.getWindowHandles();
		
		//To use Get(index) and move to windows, we sue list
		
		ArrayList<String> li=new ArrayList(all);
		driver.switchTo().window(li.get(1));
		driver.close();
		
		driver.switchTo().window(li.get(2));
		driver.close();
		
		driver.switchTo().window(li.get(3));
		driver.close();
		
		driver.switchTo().window(li.get(0));
		System.out.println("Moved to parent");
	}

}
