package DROPDOWNS;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWIndowPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String ele:allWindows)
		{
			driver.switchTo().window(ele); //swicth to window
			String url = driver.getCurrentUrl(); // capture url
			if(url.contains("flipkart"))
			{
				break;
			}
		}
		driver.manage().window().maximize();
		
	}

}
