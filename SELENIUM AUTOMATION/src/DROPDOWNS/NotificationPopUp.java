package DROPDOWNS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NotificationPopUp {

	public static void main(String[] args) {
		
		ChromeOptions options= new ChromeOptions();
//		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.myntra.com/");
		WebElement menBtn = driver.findElement(By.partialLinkText("MEN"));
		Actions act = new Actions(driver);
		act.clickAndHold(menBtn).perform();
		
	}

}
