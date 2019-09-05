package chromeSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//type on google without using findElement
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().activeElement().sendKeys("test");
		//activeelement method takes us to where the cursor is
		
		
		
		
		
		
		
		
		
		
	}

}
