package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assgn7 
{
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("(//a[text()='Hyderabad to Bangalore Bus'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		driver.findElement(By.xpath("//label[text()='BSR TOURS & TRAVELS']/..//input[@class=\"primary  \"]")).click();
		List<WebElement> prices = driver.findElements(By.xpath("//strong[@class=\"h5 fare\"]"));
		System.out.println(prices.size());
		TreeSet priceSet=new TreeSet();
		
		for(WebElement ele:prices)
		{
			String actPrice = ele.getText().replace(",", "");
			//System.out.println(actPrice);
			int intPrice = Integer.parseInt(actPrice);
			priceSet.add(intPrice);
		}
		System.out.println(priceSet);
		System.out.println(priceSet.first());
		
	}
}
