package chromeSample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;


public class SelectDrodown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement wb=driver.findElement(By.xpath("//select[@aria-label='Day'][@name='birthday_day']"));
		Select sel=new Select(wb);
		
		List<WebElement> alloptions=sel.getAllSelectedOptions();
		for(int i=0;i<alloptions.size();i++){
			WebElement ao=alloptions.get(i);
			System.out.println("The selected options are :"+ao.getText());
		}
		
		
	    WebElement firstselval=sel.getFirstSelectedOption();
	    System.out.println("The first selected value is: "+firstselval.getText());
	    
	    
	    List<WebElement> options=sel.getOptions();
	    for(int i=0;i<options.size();i++){
	    	WebElement op=options.get(i);
	    	System.out.println("The vailable options are :"+op.getText());
	    }
	    
	    
	    
	    sel.selectByIndex(2);
	    System.out.println("Selected 2");
	    
	    sel.selectByValue("12");
	    System.out.println("Selected 12");
	    
	    sel.selectByVisibleText("18");
	    System.out.println("Selected 18");
	    
	   
		
	}

}
