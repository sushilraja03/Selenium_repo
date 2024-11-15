package DROPDOWNS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetAllSelected 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceDropDown = driver.findElement(By.id("cars"));
		Select priceSelect = new Select(priceDropDown);
		priceSelect.selectByIndex(0);
		priceSelect.selectByIndex(1);
		priceSelect.selectByIndex(2);
		 
		WebElement selectedPrice = priceSelect.getFirstSelectedOption();
		System.out.println(selectedPrice.getText());
		
		
		List<WebElement> selectedOption = priceSelect.getAllSelectedOptions();
		System.out.println(selectedOption.size());
		
		for(WebElement ele:selectedOption)
		{
			System.out.println(ele.getText());
		}
		
		driver.close();
		
		
	}
}
