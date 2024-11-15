package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes 
{
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement discount = driver.findElement(By.xpath("//th[text()='SAMSUNG Galaxy']/following-sibling::td[3]"));
		System.out.println(discount);
		
		for (String string : args) {
			System.out.println(string);
		}
		
	}
}
