package chromeSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EelemntNotClickable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("persistent")).click();
		
		//element is not interactable exception
		
		driver.findElement(By.xpath("//label[text()='Stay signed in']")).click();
		
		
		
		

	}

}
