package com.howtodoinjava.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MyThirdTest {
  @Test
  public void f() {
	  System.out.println("In f method MyThirdTest");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("In beforeSuite method MyThirdTest");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("In afterSuite method MyThirdTest");
  }

}
