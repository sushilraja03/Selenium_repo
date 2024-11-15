package DemoSkrill;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Baseclass {
	
	public WebDriver driver;
	public Properties prop;
	
	@BeforeTest
	public void fetch() throws IOException
	{
	
	FileInputStream fis = new FileInputStream("./TESTDATA/commandata.properties");
	prop = new Properties();
	prop.load(fis);
	
	}
	@Parameters("Broswer")
	@BeforeClass
	public void launchBrowser(@Optional("chrome") String browsername)
	{
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String url = prop.getProperty("url");
		driver.get(url);
	}
	@BeforeMethod
	public void login()
	{
		
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("last")).click();
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
		driver.findElement(By.linkText("Sign out")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
