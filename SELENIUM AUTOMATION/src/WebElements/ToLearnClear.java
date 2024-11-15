package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameFT = driver.findElement(By.id("username"));
		usernameFT.clear();
		usernameFT.sendKeys("TESTING");
		WebElement passwordFT = driver.findElement(By.id("password"));
		passwordFT.clear();
		passwordFT.sendKeys("abcd@12345");
	}
}
