package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnQuit 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://shoppersstack.com/products_page/15");
		Thread.sleep(15000);
		driver.findElement(By.id("compare")).click();
		driver.quit();
	}
}
