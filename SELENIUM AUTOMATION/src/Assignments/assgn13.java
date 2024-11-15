package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assgn13 {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.dream11.com/");
		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("send-sms-iframe");
		WebElement frameExample = driver.findElement(By.xpath("//iframe[@title=\"Iframe Example\"]"));
		driver.switchTo().frame(frameExample);
		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		driver.findElement(By.id("regUser")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("hamburger")).click();
	}

}
