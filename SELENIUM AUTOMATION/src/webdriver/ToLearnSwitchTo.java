package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		Set<String> allwindows = driver.getWindowHandles();
		for(String id:allwindows)
		{
			driver.switchTo().window(id);
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			if(url.contains("flipkart"))
			{
			driver.manage().window().maximize();
			break;
			}
			Dimension size =driver.manage().window().getSize();
			int height = size.getHeight();
			int width = size.getWidth();
			
			System.out.println("height : "+height + "width = "+ width);
			System.out.println(url);
			
		}
	}
}
