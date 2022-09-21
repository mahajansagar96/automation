package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportGenerator {
	public static ExtentReports extent;
	public static ExtentReports geReports() {
		String reportpath="C:\\Users\\SagarM\\eclipse-workspace\\Working_Framework\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportpath); 
		reporter.config().setDocumentTitle("working_Framework_Reports");
		reporter.config().setReportName("Automation_Test_Reports");
				
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "OCS");
		extent.setSystemInfo("QA", "Sagar Mahajan");
		return extent;
		
	}
	
}
