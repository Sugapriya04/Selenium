/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Administrator
 *this class ll store all the locator and methods of login page
 *
 *
 */
public class LoginPage {

	WebDriver driver;
	By username=By.xpath("//input[@type='email']");
	By password=By.name("pass");
	By loginButton= By.xpath("//input[@value='Log In']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;		
	}
	
	public void username(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void password(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void loginButton() {
		driver.findElement(loginButton).click();
	}
	
	
	
}

