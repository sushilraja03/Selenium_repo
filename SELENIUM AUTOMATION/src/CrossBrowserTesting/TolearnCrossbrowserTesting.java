package CrossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TolearnCrossbrowserTesting {
	
	public WebDriver driver;
	@Parameters("Browser")
	@Test
	public void launch(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browsername.equals("safari"))
		{
			driver=new SafariDriver();
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
	}
	
}
