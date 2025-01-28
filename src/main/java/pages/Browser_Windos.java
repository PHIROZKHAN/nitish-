package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseutility.BaseLibrary;

public class Browser_Windos extends BaseLibrary {
	
	Browser_Windos()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath=" //a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\"#widget\"]")
	private WebElement wigets;

}
