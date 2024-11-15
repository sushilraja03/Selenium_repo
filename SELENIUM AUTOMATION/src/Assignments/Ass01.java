package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass01 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(10000);
		driver.findElement(By.linkText("Facebook")).click();
		String facebookurl = driver.getCurrentUrl();
		System.out.println(facebookurl);
		Thread.sleep(30000);
		switchToWindow(driver,"facebook");
		Point facebookposition = driver.manage().window().getPosition();
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		String signupurl = driver.getCurrentUrl();
		System.out.println(signupurl);
		
		switchToWindow(driver,"reg/?next" );
		Point signupposition = driver.manage().window().getPosition();
		String cna = driver.getCurrentUrl();
		System.out.println(cna);

		
	}

	private static void switchToWindow(WebDriver driver, String url) {
		
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
