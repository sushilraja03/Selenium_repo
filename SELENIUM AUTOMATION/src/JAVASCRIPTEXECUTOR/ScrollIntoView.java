package JAVASCRIPTEXECUTOR;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement latestCourse = driver.findElement(By.xpath("//h3[text()='Latest Courses']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)",latestCourse);
	}

}
