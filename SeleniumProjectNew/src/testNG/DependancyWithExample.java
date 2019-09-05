package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependancyWithExample {

	static WebDriver driver;
	
	@BeforeClass
	public void Open() {
		System.out.println("started");
	}
	
	@Test	
	public static void startURL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, "https://opensource-demo.orangehrmlive.com/");
		

	}
	
	@Test(dependsOnMethods="startURL")
		public static void Login() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//verify a label in the next page
	    boolean admin=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).isDisplayed();
		Assert.assertTrue(admin);
		
		
		}
	
	@Test(dependsOnMethods="Login")
	    public static void logoutApp() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	    driver.findElement(By.id("welcome")).click();
	    driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    driver.quit();
		}
	@AfterClass
	public void close() {
		System.out.println("closed");
	}

}
