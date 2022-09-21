package com.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	/*public static ConfigDataProvider config;
	@BeforeSuite
	public void Initiolizationsetup() throws Exception {
		 config=new ConfigDataProvider();
		
	}*/
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	
	public void setup(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if (BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();	
		}
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
        
	}
	
	@AfterMethod
	
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
