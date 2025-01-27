package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Baseutility.BaseLibrary;
public class RadioButtonsPage extends BaseLibrary {
	
	public  RadioButtonsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='×']")
	private WebElement close;
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//a[text()='radio buttons']")
	private WebElement radiobuttons;
	@FindBy(xpath = "//input[@id='yes']")
	private WebElement yesbutton;
	@FindBy(xpath = "//input[@id='impressive']")
	private WebElement impressive;
	@FindBy(xpath="//input[@id='no']")
	private WebElement nobutton;
	@FindBy(xpath="//p[text()='You have selected yes']")
	private WebElement yestext;
	@FindBy(xpath = "//p[text()='You have selected impressive']")
	private WebElement impressivetext;
	@FindBy(xpath = "//p[text()='You have selected no']")
	private WebElement notext;
	
	
	
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
	public void clickOnRadioButton()
	{
		radiobuttons.click();
	}
	public void clickOnYesButton()
	{
		yesbutton.click();
		String expected=getPropertiesData("yes");
		String actual=yestext.getText();
		Assert.assertEquals(actual, expected);
	}
	public void clickOnImpressive()
	{
		impressive.click();
		String expected=getPropertiesData("impressive");
		String actual=impressivetext.getText();
		Assert.assertEquals(actual, expected);
		
	}
	public void clickOnNoButton()
	{
		nobutton.click();
		String expected=getPropertiesData("no");
		String actual=notext.getText();
		Assert.assertEquals(actual, expected);
	}

}
