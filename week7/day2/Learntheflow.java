package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class Learntheflow {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
	  System.out.println(n+" --> "+ s);
  }
  

  @DataProvider
  public Object[][] dp() {
	  System.out.println("From DataProvider");
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("BeforeMethod");
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Beforeclass");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");

  }
  
  
  public void method() {
	  System.out.println("SetFilename");
  }
  

}
