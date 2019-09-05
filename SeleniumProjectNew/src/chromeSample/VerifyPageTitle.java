package chromeSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class VerifyPageTitle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		String title=driver.getTitle();
		String exptitle="Facebook - log in or singup";
		if(title.contains("Facebook")){
			System.out.println("matches");
			
		}
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
