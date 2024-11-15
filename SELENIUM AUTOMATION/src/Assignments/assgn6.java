package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assgn6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement sub = driver.findElement(By.xpath("//input[@class=\"form-control\"]"));
		System.out.println("subscribe : "+sub.isEnabled());
	}

}
