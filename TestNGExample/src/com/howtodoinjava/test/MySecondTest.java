package com.howtodoinjava.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MySecondTest {
  @Test
  public void f() {
	  System.out.println("In f method MySecondTest");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("In beforeTest method MySecondTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("In afterTest method MySecondTest");
  }

}
