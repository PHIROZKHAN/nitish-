package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Baseutility.BaseLibrary;

public class ChekboxPage extends BaseLibrary
    {
	
	public ChekboxPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='×']")
	private WebElement close;
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//a[text()='check box']")
	private WebElement checkbox;
	@FindBy(xpath = "//input[@id='myCheck']")
	private WebElement mobile;
	@FindBy(xpath = "//input[@id='mylaptop']")
	private WebElement laptop;
	@FindBy(xpath="//input[@id='mydesktop']")
	private WebElement desktop;
	@FindBy(xpath = "(//iframe[@class='embed-responsive-item'])[1]")
	private WebElement iframe;
	
	@FindBy(xpath = "//*[text()='You are selected Mobile']")
	private WebElement mobiletext;
	@FindBy(xpath="//*[text()='You are Selected Laptop']")
	private WebElement laptoptext;
	@FindBy(xpath="//*[text()='You are Selected Desktop']")
	private WebElement desktoptext;
	public void clickOnClose()
	{
		close.click();
	}
	public void clickOnPractice()
	{
		practice.click();
	}
	public void clickOnElement()
	{
		element.click();
	}
	public void clickOnCheckbox()
	{
		checkbox.click();
	}
	
	public void clickOnMobile()
	{
		driver.switchTo().frame(iframe);
		mobile.click();
		String actual=mobiletext.getText();
		String expected=getPropertiesData("Mobile");
		Assert.assertEquals(actual, expected);
	}
	public void clickOnLaptop()
	{
		laptop.click();
		String actual=laptoptext.getText();
		String expected=getPropertiesData("Laptop");
		Assert.assertEquals(actual, expected);
	}
	public void clickOnDesktop()
	{
		desktop.click();
		
		String expected=desktoptext.getText();
		String actual=getPropertiesData("Desktop");
	Assert.assertEquals(actual, expected);
	driver.switchTo().defaultContent();
	}
	
}
