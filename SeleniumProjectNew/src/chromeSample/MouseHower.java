package chromeSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement dd=driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(dd).perform();
		
		//the focus ll be on the place where mouse hower performed until next activity
		
		//To know how many links are there in the dropdown
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		
		for(int i=0;i<list.size();i++) {
			WebElement element=list.get(i);
			String text=element.getText();
			System.out.println(text);
		
		//click on selenium
		
		if(text.equalsIgnoreCase("TestNG")) {
			element.click();
			break;
		}
		}}}
	
		
		
		
		
		
		
		
		
