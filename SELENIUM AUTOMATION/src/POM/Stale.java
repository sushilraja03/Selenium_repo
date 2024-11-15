package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
	//	StaleElement at=new StaleElement(driver);
	//	at.getSearchTextField().sendKeys("selenium",Keys.ENTER);
		
		StaleElement st = new StaleElement(driver);
		st.getSearchTextField().sendKeys("Selenium",Keys.ENTER);
		Thread.sleep(3000);
		st.getSearchTextField().sendKeys("Test");
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement searchTf = driver.findElement(By.id("navbar-search-input"));
//		searchTf.sendKeys("selenium",Keys.ENTER);
//		searchTf.sendKeys("Testing");
	}

}
