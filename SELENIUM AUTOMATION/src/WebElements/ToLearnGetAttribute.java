package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement searchft = driver.findElement(By.name("q"));
		String title = searchft.getAttribute("title");
		System.out.println(title);
	}
}
