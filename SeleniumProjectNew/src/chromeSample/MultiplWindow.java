package chromeSample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultiplWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
				
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com/");
		String parent=driver.getWindowHandle();
		System.out.println("The aprent window is:"+parent);
		
		
		//To close all the advertisement popups
		
		driver.findElement(By.xpath("//div[text()='Recruiters']")).click();
		//here we are using set because it ll return unique count (not list)
		Set<String> all=driver.getWindowHandles();
		
		//we cant use get(index) so we are using for each loop not for loop here for each will retrive all the values
		
		for(String child:all) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println(child);
				System.out.println(driver.getTitle());
				driver.close();//closes all the advertisement popups
							}
		}	
		
		
		
		
		
	
		
		
		
		
	}

}
