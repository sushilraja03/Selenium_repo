package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitch 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		switchToWindow(driver,"flipkart");
		Point flipkartposition = driver.manage().window().getPosition();
		switchToWindow(driver,"ebay");
		Point ebayposition = driver.manage().window().getPosition();
		driver.manage().window().setPosition(flipkartposition);
		switchToWindow(driver,"flipkart");
		driver.manage().window().setPosition(ebayposition);
	}

	private static void switchToWindow(WebDriver driver, String url)
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