package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(10000);
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		List<WebElement> img = driver.findElements(By.tagName("img"));
		System.out.println(img.size());
		for(WebElement image : img)
		
		{
			System.out.println("the images present are : " + image.getText());
		}
		for(WebElement allLinks:Links)
		{
			System.out.println(allLinks.getText());
		}
		driver.close();
	}
}
