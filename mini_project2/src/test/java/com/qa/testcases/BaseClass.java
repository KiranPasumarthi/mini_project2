package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.utility.BrowserFactory;
import com.qa.utility.ConfigDataProvider;
import com.qa.utility.ExcelDataProvider;
import com.qa.utility.Helper;

public class BaseClass {

	public WebDriver driver;
	ExcelDataProvider exceldata;
	ConfigDataProvider configdata;
	public ExtentReports extent;
	ExtentHtmlReporter ReportPath;
	ExtentTest logger;

	@BeforeSuite
	public void setUpSuite() throws IOException {

		exceldata = new ExcelDataProvider();
		configdata = new ConfigDataProvider();
		
		 ReportPath = new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/Facebook_"+Helper.getcurrenttime()+".html");
		extent = new ExtentReports();
		 extent.attachReporter(ReportPath);
		
		
	}

	@BeforeTest
	public void setup() throws InterruptedException {

		driver = BrowserFactory.browserStart(driver, configdata.getWebFromConfig(), configdata.getaQaUrlFromConfig());
		Thread.sleep(3000);

	}

	
	
	//@AfterMethod
	public void takescreenshot(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			
			//Helper.getscreenshot(driver, result.getName());
			logger = extent.createTest("Login to Facebook");
			logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(Helper.getscreenshot(driver,result.getName() )).build());
		}
		extent.flush();
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
