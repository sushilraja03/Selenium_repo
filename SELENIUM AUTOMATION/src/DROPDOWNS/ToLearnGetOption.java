package DROPDOWNS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceDropDown = driver.findElement(By.id("cars"));
		Select priceSelect = new Select(priceDropDown);
		
		
		List<WebElement> allOptions = priceSelect.getOptions();
		for(WebElement ele:allOptions)
		{
			System.out.println(ele.getText());
			
		}
		
	}

}
