package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class assgn9
{
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/table"))
		{
			System.out.println("web table page is displayed");
		}
		driver.findElement(By.linkText("Dynamic Web Table")).click();
		if(driver.getCurrentUrl().equals("https://demoapps.qspiders.com/ui/table/dynamicTable"))
		{
			System.out.println("dynamic web table is displayed");
		}
		
		WebElement appleIphone = driver.findElement(By.xpath("//th[text()='Apple iPhone']/..//td[4]"));
		System.out.println(appleIphone.getText());
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/demo1.png");
		FileHandler.copy(temp, dest);
	}
}
