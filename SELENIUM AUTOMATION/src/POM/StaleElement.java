package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaleElement {
	
	//Declaration
	
	@FindBy(id="navbar-search-input")
	private WebElement searchTextField;
	
	//Initialization
	
	public StaleElement(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
}
