package chromeSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.findElement(By.id("firstName")).sendKeys("Priya");
        driver.findElement(By.id("lastName")).sendKeys("Selvaraj");
        driver.findElement(By.id("username")).sendKeys("Priya");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("text");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("text");
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        
        //mouse hower on the tooltip message
        
        Actions act=new Actions(driver);
        
        WebElement point=driver.findElement(By.xpath("//div[text()='Use 8 characters or more for your password']"));
        act.moveToElement(point).perform();
        String text=point.getText();
        System.out.println("The tooltip message is :"+text);
	}

}
