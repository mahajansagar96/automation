package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	public ConfigDataProvider() throws IOException {
	String file="C:\\Users\\SagarM\\eclipse-workspace\\Working_Framework\\Config\\Config.properties";
		FileInputStream fis=new FileInputStream(file);
		 pro=new Properties();
		pro.load(fis);
	}
	public String getQAENV_01() {
		return pro.getProperty("QAENV_01");
		
	}
	
}
