package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Test {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.linkText("Vtiger")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dist = new File("./Screenshots/image01.png");
		FileHandler.copy(temp, dist);
		
		
		Set<String> allwindows = driver.getWindowHandles();
		for(String ele : allwindows)
		{
			driver.switchTo().window(ele);
			if(driver.getTitle().equals("CRM"))
			{
				break;
			}
		}
		
		WebElement element = driver.findElement(By.partialLinkText("Company"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		
		

		
		
		
  }

}
