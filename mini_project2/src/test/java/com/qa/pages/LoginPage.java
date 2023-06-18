package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver ldriver) {
		
		PageFactory.initElements(ldriver,this);
		
	}
	
	@FindBy(xpath = "//*[@id=\"email\"]")  WebElement email;
	
	@FindBy(xpath = "//*[@id=\"pa\"]") WebElement passwd;
	
	@FindBy(name = "login")	 WebElement loginbutton;
	
	public void loginPageOfFb(String username,String password) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		email.sendKeys(username);
		passwd.sendKeys(password);
		loginbutton.click();
		
		
		
	}
}
