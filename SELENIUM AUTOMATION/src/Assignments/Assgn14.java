package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn14 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement frame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		
		driver.switchTo().frame(frame);
		driver.findElement(By.name("Montana")).click();
		
	}

}
