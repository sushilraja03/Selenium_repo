package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitch01 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		switchToWindow1(driver,"amazon");
		Point amazonposition = driver.manage().window().getPosition();
		switchToWindow1(driver,"flipkart");
		Point flipkartposition = driver.manage().window().getPosition();
		driver.manage().window().setPosition(amazonposition);
		switchToWindow1(driver,"amazon");
		driver.manage().window().setPosition(flipkartposition);		
	}

	public static void switchToWindow1(WebDriver driver, String url) 
	{
		Set<String> allWindows = driver.getWindowHandles();
		for(String id:allWindows)
		{
			driver.switchTo().window(id);
			String actUrl=driver.getCurrentUrl();
			if(actUrl.contains(url))
			{
				break;
			}
		}
	}
}
