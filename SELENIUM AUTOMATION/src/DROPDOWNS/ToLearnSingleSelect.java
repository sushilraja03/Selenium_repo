package DROPDOWNS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnSingleSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		
		
		driver.get("https://www.facebook.com/reg/?next=%2FnopCommerce");
		
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select daySelect=new Select(dayDropDown);
		daySelect.selectByVisibleText("3");
		
	WebElement mothDropDown = driver.findElement(By.id("month"));
	Select monthSelect = new Select(mothDropDown);
//		monthSelect.selectByIndex(11);
//		monthSelect.selectByValue("12");
		monthSelect.selectByVisibleText("Sep");
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect=new Select(yearDropDown);
//		yearSelect.selectByIndex(12);
//		yearSelect.selectByValue("2012");
		yearSelect.selectByVisibleText("1997");
		
		
	}

}
