package chromeSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		//click on dropdown
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle'][@data-toggle='dropdown'][@id='menu1']"));
		//click on the outlayer of the box 
		System.out.println("done");
		
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='dropdown-menu test']//li/a"));
		for(int i=0;i<list1.size();i++){
	
			String text=list1.get(i).getAttribute("innerHTML");
			if(text.equalsIgnoreCase("CSS")){
				((WebElement) list1).click();
				
			}
			System.out.println("The values are : "+text);
			
		}
		
		
		
		
		
	}

}
