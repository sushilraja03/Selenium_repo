package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("@before suite executed",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("@BeforeTest is executed",true);
	}
	public void demo()
	{
		Reporter.log("@Test demo is executed",true);
	}
	@AfterTest
	public void afterTest()
	{
		Reporter.log("@AfterTest is executed",true);
	}
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("@afterSuite is executed",true);
	}
}
