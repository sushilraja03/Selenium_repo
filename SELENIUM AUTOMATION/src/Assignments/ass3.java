package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass3 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernametf = driver.findElement(By.id("username"));
		usernametf.clear();
		usernametf.sendKeys("TESTING");
		WebElement passwordft = driver.findElement(By.id("password"));
		passwordft.clear();
		passwordft.sendKeys("abc@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		WebElement errormsg = driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
		errormsg.getText();
		System.out.println(errormsg);
		String color = errormsg.getCssValue("color");
		String fontsize = errormsg.getCssValue("font-size");
		System.out.println(color);
		System.out.println(fontsize);
	}
}
