package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assgn11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.id("reg_new_btn")).click();
		if(driver.getCurrentUrl().equals("https://www.freshersworld.com/user/register?src=homeheader"))
		{
			System.out.println("REGISTER PAGE IS DISPLAYED");
		}
		WebElement currentCityDropDown = driver.findElement(By.id("currentCity"));
		Select currentCitySelect=new Select(currentCityDropDown);
		currentCitySelect.selectByVisibleText("Bangalore");
		
		WebElement courseDropDown = driver.findElement(By.id("course"));
		Select courseSelect = new Select(courseDropDown);
		courseSelect.selectByVisibleText("BE/B.Tech");
	}

}
