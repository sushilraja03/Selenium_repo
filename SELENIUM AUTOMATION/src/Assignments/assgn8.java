package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class assgn8
{
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("mobile",Keys.ENTER);
		String time = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dist = new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, dist);
		
		
	}
}
