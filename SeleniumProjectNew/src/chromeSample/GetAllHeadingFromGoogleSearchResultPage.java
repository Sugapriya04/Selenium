package chromeSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllHeadingFromGoogleSearchResultPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//click using Key.ENTER
		driver.findElement(By.name("q")).sendKeys("12 Angry Men"+Keys.ENTER);
		//click using submit method where the button type is submit
		WebElement wb=driver.findElement(By.name("q"));
		wb.sendKeys("12 Angry Men");
		wb.submit();
		//click using /n
		driver.findElement(By.name("q")).sendKeys("12 Angry Men \n");
		
		/*
		 * List<WebElement> totalLinks=driver.findElements(By.xpath("//a"));
		 * 
		 * for(WebElement links:totalLinks){
		 * sysout(links.getAttribute("href"))}
		 * 
		 */
		//to get all the heading links thats in green color, 1st check each links and get the parents nodes in common
		List<WebElement> totalLinks=driver.findElements(By.xpath("//div[@class='rc']//following::h3//following::cite"));
		for(WebElement links:totalLinks){
	    System.out.println(links.getText());
		
	}

	}}
