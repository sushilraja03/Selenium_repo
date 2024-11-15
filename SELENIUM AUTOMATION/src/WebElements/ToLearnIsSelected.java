package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement execellentRadioButton = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@type='radio']"));
		System.out.println("=====before clicking=====");
		System.out.println(execellentRadioButton.isSelected());
		execellentRadioButton.click();
		System.out.println("=====after selecting=======");
		System.out.println(execellentRadioButton.isSelected());
	}
}
