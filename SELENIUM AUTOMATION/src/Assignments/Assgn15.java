package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assgn15 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(image1, trash).perform();
		act.dragAndDrop(image2, trash).perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.partialLinkText("CHEATSHEETS")).click();
		WebElement ads = driver.findElement(By.xpath("//iframe[contains(@id, 'aswift_3')]"));
		driver.switchTo().frame(ads);
		driver.findElement(By.xpath("//div[@style='cursor: pointer;']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("SQL Cheat Sheet")).click();
			
		Set<String> windowIds = driver.getWindowHandles();
		for(String win:windowIds)
		{
			driver.switchTo().window(win);
			if(driver.getTitle().equals("sql-cheat-sheet"))
					{
						String url = driver.getTitle();
						System.out.println(url);
					}
		}
		
		WebElement sqlImage = driver.findElement(By.xpath("(//div[@class='wp-block-jetpack-slideshow aligncenter'])[2]"));
		act.scrollToElement(sqlImage).perform();

		TakesScreenshot ts =(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/sql1.png");
		FileHandler.copy(temp, dest);
	}

}
