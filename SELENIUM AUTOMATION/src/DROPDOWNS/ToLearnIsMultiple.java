package DROPDOWNS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnIsMultiple
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceDropDown = driver.findElement(By.id("cars"));
		Select priceSelect = new Select(priceDropDown);
		priceSelect.selectByIndex(0);
		priceSelect.selectByValue("99");
		priceSelect.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		
		priceSelect.deselectAll();
		
		Thread.sleep(2000);
		System.out.println(priceSelect.isMultiple());
	}
}
