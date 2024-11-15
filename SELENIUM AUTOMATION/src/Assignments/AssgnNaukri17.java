package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssgnNaukri17 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		WebElement experienced = driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(experienced).perform();
		experienced.click();
		driver.findElement(By.id("resumeUpload")).sendKeys("/Users/sushilraja/Downloads");
	}

}
