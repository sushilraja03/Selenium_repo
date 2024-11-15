package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public Properties prop;
//	public Workbook workBook;
	public WebDriver driver;
	
	@BeforeTest
	public void fetchData() throws IOException
	{
		//propertyFile
		FileInputStream fis = new FileInputStream("./TESTDATA/commandata.properties");
		prop = new Properties();
		prop.load(fis);
		
		//Excel file
//		FileInputStream eFis=new FileInputStream("file path");
//		Workbook workBook = WorkbookFactory.create(eFis);
	}
	@BeforeClass
	public void launchBrowser()
	{
		driver=new ChromeDriver();
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
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
