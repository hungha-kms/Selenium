package com.howtodoinjava.listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

public class Listeners extends TestListenerAdapter{
  
	public void onTestStart(ITestResult tr) {
		System.out.println("Test started");
	}
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test passed");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test failed");
	}
	
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test skipped");
	}
	
	@Test
  public void f() {
  }
}
