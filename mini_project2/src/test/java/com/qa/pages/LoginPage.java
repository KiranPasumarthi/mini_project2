package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	public LoginPage(WebDriver ldriver) {
		
		
		PageFactory.initElements(ldriver,this);
		
	}
	
	@FindBy(id = "email")  WebElement email;
	
	@FindBy(xpath = "//*[@id=\"pass\"]") WebElement passwd;
	
	@FindBy(name = "login")	 WebElement loginbutton;
	
	public void loginPageOfFb(String username,String password) {
		
		email.sendKeys(username);
		passwd.sendKeys(password);
		loginbutton.click();
		
		
		
	}
}
