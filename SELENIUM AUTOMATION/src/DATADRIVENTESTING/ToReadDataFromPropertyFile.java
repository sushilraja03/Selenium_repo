package DATADRIVENTESTING;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//step 1 : Create object for file type object
		
		FileInputStream fis= new FileInputStream("./TESTDATA/commandata.properties");
		
		//Step 2 : create respective file type object
		
		Properties prop = new Properties();
		
		//Step 3 : call the methods
		
		prop.load(fis);
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String username = prop.getProperty("username");
		System.out.println(username);
		
		String password = prop.getProperty("password");
		System.out.println(password);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("last")).click();
	}

}
