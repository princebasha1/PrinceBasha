package SeleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("before Method");
	}
	@Test
	public void testMethod1() {
		System.out.println("Test method1");
	}
	@AfterMethod
	public void AfterMothed() {
		System.out.println("Afret method");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	@AfterSuite
	public void AfterSuitc() {
		
	}
	
	
}

