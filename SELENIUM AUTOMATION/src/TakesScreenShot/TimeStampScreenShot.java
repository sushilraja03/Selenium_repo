package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeStampScreenShot 
{
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String time = LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File temp =ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+time+".png");
		org.openqa.selenium.io.FileHandler.copy(temp, dest);
	}
}
