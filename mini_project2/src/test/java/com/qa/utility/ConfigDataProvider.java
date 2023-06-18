package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties proconfig;

	public ConfigDataProvider() {
		File configFile = new File("./config/config.properties");

		try {
			FileInputStream fisconfig = new FileInputStream(configFile);
			proconfig = new Properties();
			proconfig.load(fisconfig);
		} catch (IOException e) {
			System.out.println("configFile is unable to load" + e.getMessage());
		}

	}
	
	public String getWebFromConfig() {
		return proconfig.getProperty("web");
	}
	
	public String getaQaUrlFromConfig() {
		return proconfig.getProperty("qaUrl");
	}
	
	public String getaDataFromConfig(String keytosearch) {
		return proconfig.getProperty(keytosearch);
	}

}
