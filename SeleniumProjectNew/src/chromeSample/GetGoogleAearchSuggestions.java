package chromeSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGoogleAearchSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.name("q")).sendKeys("game of thrones");
	List<WebElement> wb= driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
    for(WebElement webelement:wb) {
    	System.out.println(webelement.getText());
    }
		
	

	}

}
