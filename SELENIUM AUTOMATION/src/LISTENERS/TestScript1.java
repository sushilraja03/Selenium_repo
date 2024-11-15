package LISTENERS;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation1.class)
public class TestScript1 extends BaseClass{
	
	@Test
	public void login()
	{	
		
		Reporter.log("Click on login link",true);
		driver.findElement(By.linkText("Log in")).click();
		
		Reporter.log("Enter valid Credentials",true);
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@12");
		
		Reporter.log("Click on login button",true);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "Home page is not diaplyed");
		Reporter.log("Home page is displayed",true);
	}
}
