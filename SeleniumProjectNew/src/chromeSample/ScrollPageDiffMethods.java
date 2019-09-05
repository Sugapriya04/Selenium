package chromeSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageDiffMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement wb=driver.findElement(By.name("q"));
		wb.sendKeys("game of thrones");
		wb.submit();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//scroll down
		/*js.executeScript("window.scroll(0,50)");
		Thread.sleep(4000);
		//scroll up
		js.executeScript("window.scroll(0,-20)");*/
		
		/*js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(4000);
		//to come up
		js.executeScript("window.scroll(0,0)");*/
		
		WebElement wb1=driver.findElement(By.linkText("Game of Thrones: Jon Snow is Azor Ahai NOT Arya or Daenerys ..."));
		js.executeScript("arguments[0].scrollIntoView(true)",wb1);
		

	}

}
