package ACTIONS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnCopy {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement firstName = driver.findElement(By.id("FirstName"));
		
		Actions act = new Actions(driver);
		act.sendKeys(firstName, "john").perform();
		
		act.keyDown(Keys.COMMAND).keyDown("a").perform();
		act.keyUp(Keys.COMMAND).keyUp("a").perform();
		
		act.keyDown(Keys.COMMAND).keyDown("c").perform();
		act.keyUp(Keys.COMMAND).keyUp("c").perform();
		
//		act.keyDown(Keys.TAB).perform();
//		act.keyUp(Keys.TAB).perform();
		
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		
		
		
		act.keyDown(Keys.COMMAND).keyDown("v").perform();
		act.keyUp(Keys.COMMAND).keyUp("v").perform();
		
		
		
	}

}
