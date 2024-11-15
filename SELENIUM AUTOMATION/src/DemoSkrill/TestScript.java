package DemoSkrill;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends Baseclass {

	@Test
	
	public void clickSales()
	{
		driver.findElement(By.xpath("//span[text()='Sales']"));
		String actualTitle = driver.getTitle();
		String expectedTitle="SkillRary Ecommerce";
		if(actualTitle.equals(expectedTitle))
		{
			Reporter.log("Sales page is displayed",true);
		}
		else
		{
			Reporter.log("Sales page is not displayed",true);
		}
	}
	
}
