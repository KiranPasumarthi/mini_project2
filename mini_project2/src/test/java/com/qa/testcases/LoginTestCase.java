package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.pages.LoginPage;

public class LoginTestCase extends BaseClass {	
	
	
	
	@Test
	public void loginapp() throws InterruptedException, IOException {

		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginPageOfFb(exceldata.getStringData("login", 0, 0),exceldata.getStringData("login", 0, 1));

		/*
		 * HomePage homepage = new HomePage(driver);
		 *  homepage.homepageofFb();
		 */
		
		
		
		
		
	}
	
	

}
