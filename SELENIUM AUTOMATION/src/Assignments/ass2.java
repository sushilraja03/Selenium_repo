package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass2
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement usernameft = driver.findElement(By.id("username"));
		usernameft.clear();
		usernameft.sendKeys("TESTING");
		WebElement passwordft = driver.findElement(By.id("password"));
		passwordft.clear();
		passwordft.sendKeys("Test123");
		
	}
}
