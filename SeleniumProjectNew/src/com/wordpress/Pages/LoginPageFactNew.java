package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFactNew {

	
	WebDriver driver;
	
	
	//one way
	@FindBy(xpath="//input[@type='email']")
	@CacheLookup
	WebElement username;
	
	//standard way
	@FindBy(how=How.NAME,using="pass")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@value='Log In']")
	@CacheLookup
	WebElement loginButton;
	
	
	public void PerformLogin(String uname,String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
		
		
	}
	
	//create constructor that accepts webdriver as argument and initialise the local driver
	
	public LoginPageFactNew(WebDriver driver1) {
		
		this.driver=driver1;
		
		
		
	}
	
	
	
	
}
