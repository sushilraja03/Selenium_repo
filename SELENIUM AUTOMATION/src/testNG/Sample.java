package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample { // TestNG class
	
	@Test
	public void sample()
	{
		Reporter.log("Sample Testcase Executed",true);
	}
	
	@Test
	public void add()
	{
		Reporter.log("Add Testcase Executed",true);
	}
	
	@Test
	public void demo()//Test case
	{
		//test steps
		Reporter.log("Demo TestCase Executed",true);
	}
	
	
}
