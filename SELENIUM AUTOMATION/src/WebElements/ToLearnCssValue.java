package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCssValue 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//input[@class=\"button-1 register-next-step-button\"]")).click();
		WebElement errormsg = driver.findElement(By.xpath("//span[text()='First name is required.']"));
		String color = errormsg.getCssValue("color");
		String fontweight = errormsg.getCssValue("font-weight");
		System.out.println(color);
		System.out.println(fontweight);
	}
}
