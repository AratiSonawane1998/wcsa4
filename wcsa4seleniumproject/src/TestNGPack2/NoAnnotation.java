package TestNGPack2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NoAnnotation {
	@Test
	public void test() {
		Reporter.log("@test Annotation", true);
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("@beforeSuite Annotation", true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("@beforeAnnotation", true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("@beforeAnnotation", true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("@beforeAnnotation", true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("@beforeAnnotation", true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("@beforeAnnotation", true);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("@beforeAnnotation", true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("@beforeAnnotation", true);
	}
	
	
}
