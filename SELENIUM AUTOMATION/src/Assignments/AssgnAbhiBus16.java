package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssgnAbhiBus16 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("(//div[@class='input-prefix col auto'])[3]")).click();
		
		System.out.println("Enter month");
		Scanner sc = new Scanner(System.in);
		String month=sc.next();
		System.out.println("Enter year");
		int year = sc.nextInt();
		System.out.println("Enter date");
		int date = sc.nextInt();
		
		
		while(true)
		{
			try
			{
				driver.findElement(By.xpath("//span[text()='"+month+"']/../../..//span[text()='2']")).click();
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("(//div[@class=' col auto'])[3]")).click();
			}
		}
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Abhibus1.png");
		FileHandler.copy(temp, dest);
	}

}
