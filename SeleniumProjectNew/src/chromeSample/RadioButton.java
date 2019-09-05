package chromeSample;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/howto/howto_css_custom_checkbox.asp");
		driver.manage().window().maximize();
		
		
		
		List<WebElement> tm=driver.findElements(By.xpath("//input[@type='checkbox']//div[@class='w3-col s4']"));
		System.out.println("identified the element");
		for(int i=0;i<tm.size();i++){
			System.out.println("entered into for");
			WebElement l1=tm.get(i);
			boolean flag=l1.isDisplayed();
			System.out.println(flag);			
			String textval=l1.getAttribute("innerHTML");	
			System.out.println(textval);}
			

	}}
		
	


