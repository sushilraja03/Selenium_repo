package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement errormsg = driver.findElement(By.xpath("//div[@class=\"validation-summary-errors\"]"));
		String color = errormsg.getCssValue("color");
		String fontsize = errormsg.getCssValue("font-size");
		String fontweight = errormsg.getCssValue("font-weight");
		System.out.println("color");
		System.out.println("fontsize");
		System.out.println("fontweight");
	}
}
