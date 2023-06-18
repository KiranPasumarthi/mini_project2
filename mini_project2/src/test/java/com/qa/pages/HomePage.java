package com.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver ldriver) {

		PageFactory.initElements(ldriver, this);

	}

	@FindBy(xpath = "//*[@type=\"search\"]")
	WebElement searchboxOnHome;

	@FindBy(xpath = "//*[@href=\"https://www.facebook.com/bhavani.pentakota\"]")
	WebElement searchname;

	public void homepageofFb() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		searchboxOnHome.click();
		searchboxOnHome.sendKeys("Bhavani Dinesh");
		searchboxOnHome.sendKeys(Keys.ENTER);
		searchname.click();

	}

}
