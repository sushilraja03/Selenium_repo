package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ToLearnGet 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com");//used to navigate to an application
	}
}
