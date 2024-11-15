package POPUPS;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopUp1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		System.out.println("Enter month");
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		System.out.println("Enter year");
		int year = sc.nextInt();
		System.out.println("Enter date");
		int date = sc.nextInt();
		
		
		
		while(true)
		{
			try
			{
				driver.findElement(By.xpath("(//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"'])")).click();
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}

}
