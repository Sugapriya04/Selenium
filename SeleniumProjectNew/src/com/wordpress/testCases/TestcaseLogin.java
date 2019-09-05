/**
 * 
 */
package com.wordpress.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

/**
 * @author Administrator
 *
 */


public class TestcaseLogin {


@Test

public void VerifyLoginPage() {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("http://www.facebook.com");
	 
	 LoginPage obj1=new LoginPage(driver);
     obj1.username("sugapriyadev@gmail.com");
     obj1.password("hhhh");
     obj1.loginButton();
     driver.quit();

	
	
	
	
}
	
	
	
	
	
	
}
