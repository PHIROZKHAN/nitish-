package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseutility.BaseLibrary;

public class ButtonsPage extends BaseLibrary {
	
	public ButtonsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='×']")
	private WebElement close;
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//a[text()='buttons']")
	private WebElement buttons;
	@FindBy(xpath="//button[@ondblclick='doubletext()']")
	private WebElement doubleclick;
	@FindBy(xpath = "//button[@id='noContextMenu']")
	private WebElement rightclick;
	@FindBy(xpath="//button[@onclick='clicktext()']")
	private WebElement click;
	
	
	public void clickOnClose()
	{
		click(close);
	}
	public void clickOnPractice()
	{
		click(practice);
	}
	public void clickOnElement()
	{
		click(element);
	}
	public void clickOnButtons()
	{
	   click(buttons);	
	}
	public void clickOnDoubleclick()
	{
		doubleclick(doubleclick);
	}
	public void clickOnRightClick()
	{
		rightClick(rightclick);
	}
	public void clickOnSingleClick()
	{
		click(click);
	}

}
