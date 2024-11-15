package LISTENERS;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listenerimplementation implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test script is failed");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Test script is passed",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("Test  script is Skipped",true);
	}
	
	
}
