package listenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenersDemo.TestNGListenerEg.class)
public class TestcaseOne {

	
	@Test
	
	
	public void GoogleTitleVerify() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	
	public void TitleMatch() {
		System.out.println("Dummy");
		Assert.assertTrue(false);
	}
}
