package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	
	
	public static String getscreenshot(WebDriver driver,String filename) throws IOException {
		
		
		File SSfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationPath =  "./Screenshots/"+ filename + "_"+ getcurrenttime()+ ".png";
		FileHandler.copy(SSfile,new File( destinationPath));
		
		return destinationPath;
		
		
		
	}
	public static String getcurrenttime() {
		Date currentdate = new Date();
		DateFormat ourcustomformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		String finaldate = ourcustomformat.format(currentdate);
		return finaldate;
	}
}
