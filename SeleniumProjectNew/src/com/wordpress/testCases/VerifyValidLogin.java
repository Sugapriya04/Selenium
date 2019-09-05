package com.wordpress.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPageFactNew;

import helper.Browserfactory;

public class VerifyValidLogin {
	
	@Test
	public void checkValidUser() {
		
		//start browser and specific url
		WebDriver driver=Browserfactory.StartBrowser("chrome","http://www.facebook.com");
		
		//create page obj using page factory
		LoginPageFactNew login1=PageFactory.initElements(driver, LoginPageFactNew.class);
		
		//call method
		login1.PerformLogin("sugapriyadev@gmail.com","Spriya$27");
		
		
		
	}
	
	

}
