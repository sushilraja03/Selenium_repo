package DATADRIVENTESTING;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./TESTDATA/commandata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url1 = prop.getProperty("url1");
		System.out.println(url1);
		
		String email = prop.getProperty("email");
		System.out.println(email);
		
		String password1 = prop.getProperty("password1");
		System.out.println(password1);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(url1);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password1);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		
	}

}
