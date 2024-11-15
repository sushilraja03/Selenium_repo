package POPUPS;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		
		Alert confirmationPopUp = driver.switchTo().alert();
		String text = confirmationPopUp.getText();
		System.out.println(text);
		Thread.sleep(2000);
		confirmationPopUp.accept();
		
		System.out.println(confirmationPopUp.getText());
		Thread.sleep(2000);
		confirmationPopUp.accept();
	}

}
