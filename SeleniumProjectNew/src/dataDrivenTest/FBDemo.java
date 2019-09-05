package dataDrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FBDemo {

	static WebDriver driver;
	
@Test(dataProvider="testDataArray")
public void loginToFB(String uname,String pwd)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.facebook.com");
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(uname);
	driver.findElement(By.name("pass")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	Assert.assertTrue(driver.getTitle().contains("Facebook"),"User is not able to login");
	
	
}

@AfterMethod
//it ll execute aft every test irrespective of the test result status 
public static void tearDown()

{
	driver.quit();
}

@DataProvider(name="testDataArray")
public Object[][] testData(){
	
	Object[][] data=new Object[3][2];
	data[0][0]="uname1";
	data[0][1]="pwd1";
	
	data[1][0]="uname2";
	data[1][1]="pwd2";
	
	data[2][0]="sugapriyadev@gmail.com";
	data[2][1]="Spriya$27";
	return data;
	
	
	
	
	
	
}
	
	
}
