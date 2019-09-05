package chromeSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> checklist= driver.findElements(By.xpath("//div[@id='post-body-4966932485064487229']//input[@type='radio']"));
		
		for(int i=0;i<checklist.size();i++) {
			WebElement singlelis=checklist.get(i);
			String name=singlelis.getAttribute("name");
			System.out.println(name);
			if(name.equalsIgnoreCase("female")) {
				singlelis.click(); 
				
			}
			
		}
	
		
		

	}

}
