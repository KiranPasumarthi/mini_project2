package com.qa.utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreports {
	
	public ExtentReports Reports;
	public Extentreports(String filename) {
		ExtentHtmlReporter extentpath = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/REports/"+filename+ ".png"));
		 Reports= new ExtentReports();
		Reports.attachReporter(extentpath);
	}
	
	public void extentReport() {
		
		
		
	}
	
	
	
}
