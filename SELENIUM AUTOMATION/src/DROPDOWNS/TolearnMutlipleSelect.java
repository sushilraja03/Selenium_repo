package DROPDOWNS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TolearnMutlipleSelect 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceDropDown = driver.findElement(By.id("cars"));
		Select priceSelect = new Select(priceDropDown);
		priceSelect.selectByIndex(0);
		priceSelect.selectByValue("299");
		priceSelect.selectByVisibleText("More Than INR 500 ( 55 )");
		Thread.sleep(6000);
		driver.close();
	}
}
