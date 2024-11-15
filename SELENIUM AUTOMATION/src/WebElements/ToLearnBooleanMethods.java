package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(15000);
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		Thread.sleep(3000);
		System.out.println("dislayed : "+loginbutton.isDisplayed());
		System.out.println("enabled : "+loginbutton.isEnabled());
	}
}
