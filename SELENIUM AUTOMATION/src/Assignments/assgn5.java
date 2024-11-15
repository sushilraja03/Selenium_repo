package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assgn5 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement sub = driver.findElement(By.xpath("//input[@value=\"Subscribe\"]"));
		System.out.println("subsribe status : "+sub.isDisplayed());
		Rectangle rect = driver.findElement(By.xpath("//input[@value=\"Subscribe\"]")).getRect();
		System.out.println("height : "+rect.getHeight());
		System.out.println("width : "+rect.getWidth());
		System.out.println("X : "+rect.getX());
		System.out.println("Y : "+rect.getY());
		
		
	}
}
