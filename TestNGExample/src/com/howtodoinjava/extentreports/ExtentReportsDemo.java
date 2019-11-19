package com.howtodoinjava.extentreports;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsDemo {
	static ExtentTest test;
	static ExtentReports report;

	@BeforeClass
	public static void startTest()	{
	
		report = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReportResults.html", true);
		report.addSystemInfo("Host Name", "LocalHost");
		report.addSystemInfo("Environment", "QA");
		report.addSystemInfo("User Name", "HungHa");
		report.loadConfig(new File(System.getProperty("user.dir") + "extent-config.xml"));
		test = report.startTest("ExtentReportsDemo");
	}

	
	@Test
	public void extReportsDemo()	{
		System.setProperty("webdriver.chrome.driver", "C://Users//hatha//eclipse//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");

		/*if(driver.getTitle().equals("Google")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
			test.log(LogStatus.PASS, "Assert pass as condition is true");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}*/
	}
	
	@Test
	public void testDemoFail() {
		test = report.startTest("testDemoFail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "Assert pass as condition is false");
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
		}else {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
			test.log(LogStatus.PASS, "Assert pass as condition is true");
		}
	}
	
	@AfterClass
	public static void endTest() {
	
		report.endTest(test);
		report.flush();
	}
}
