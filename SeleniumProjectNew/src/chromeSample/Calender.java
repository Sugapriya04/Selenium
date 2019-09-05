package chromeSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
	    ChromeOptions options=new ChromeOptions();
	    options.addArguments("--disable-extions");
		WebDriver driver=new ChromeDriver(options);
	
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//get all the values and select a particular
		
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		
		/*List<WebElement> lis=driver.findElements(By.xpath("(//table[@class='rb-monthTable first last'])[2]//td"));
		
		for(int i=0;i<lis.size();i++) {
			
			String lisDate=lis.get(i).getText();
			System.out.println(lisDate);
			
			if(lisDate.equalsIgnoreCase("27")) {
				lis.get(i).click();
				break;
			}}
		
			System.out.println("clicked");*/
		
		//click on the particular element
		
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[4]")).click();        
		
			
			
			
			
		}
		
		
		
	}


