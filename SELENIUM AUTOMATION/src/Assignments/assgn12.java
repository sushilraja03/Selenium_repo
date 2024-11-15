package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assgn12 
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.facebook.com/reg/?next=%2FnopCommerce");
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropDown);
		List<WebElement> alloptions = yearSelect.getOptions();
		int size = alloptions.size();
		String lastValue = alloptions.get(size-1).getText();
		System.out.println(lastValue);
		
		
		
	}
}
