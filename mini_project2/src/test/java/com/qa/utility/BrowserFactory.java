package com.qa.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	public static WebDriver browserStart(WebDriver driver, String browserName, String appUrl)
			throws InterruptedException {

		if (browserName.equalsIgnoreCase("chrome")) {

			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");

			System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver(opt);

		} else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("WebDriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Internet explorer")) {

			System.setProperty("WebDriver.ie.driver", "./drivers/IEDriverserver.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(appUrl);
		return driver;

	}

}
