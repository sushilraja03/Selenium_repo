package LISTENERS;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation1 extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		String methodName = result.getName();
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dist = new File("./Screenshots/"+methodName+timeStamp+".png");
		try {
			FileHandler.copy(temp, dist);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
}
