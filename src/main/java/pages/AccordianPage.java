package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Baseutility.BaseLibrary;
//import dev.failsafe.internal.util.Assert;

public class AccordianPage extends BaseLibrary {
	
	public AccordianPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath=" //a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target=\"#widget\"]")
	private WebElement wigets;
	@FindBy (xpath=" //a[text()='accordion']")
	private WebElement accordian;
	
	@FindBy (xpath = "//*[@data-target=\"#collapse1\"]")
	private WebElement acordianpara1;
	@FindBy (xpath = "//div[@id='collapse1']/div")
	private WebElement accordiantext1;
	          
   
	public void clickOnClose()
	{
		close.click();
	}
	public void clickOnPractice()
	{
		practice.click();
	}
	public void clickOnWigets()
	{
		wigets.click();
	}
	public void clickOnAccordian()
	{
		accordian.click();
	}
	public void clickOnAcordianPara1()
	{
	  doubleclick(acordianpara1);
	} 
	
	public void validation()
	
	{
	
		boolean flag=accordiantext1.getText().contains("Accordions are useful when you want");
		Assert.assertEquals(flag, true);
	}
	
	
	
	
}
