package learnAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAboutAnnotation {
	@Test
	public void callAllAnnotations() {
		System.out.println("Learning the hirerchy of Annotation");
	}

	@Test
	public void callAllAnnotations2() {
		System.out.println("Learning the hirerchy of Annotation2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Run before test methods->@BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Run after test methods->@AfterMethod");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Run before all test classes->@BeforeClass ");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("Run after all test classes->@AfterClass");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Run before all tests -> @BeforeTest");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("Run after all tests->@AfterTest ");

	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Run before suite->@BeforeSuite");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Run after suite->@AfterSuite");

	}

}
