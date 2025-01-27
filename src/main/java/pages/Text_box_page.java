package pages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseutility.BaseLibrary;


public class Text_box_page  extends BaseLibrary{
	
	public Text_box_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//a[text()='text box']")
	private WebElement textbox;
	@FindBy(xpath = "//input[@id='fullname1']")
	private WebElement name;
	@FindBy(xpath = "//input[@id='fullemail1']")
	private WebElement emailbox;
	@FindBy (xpath="//textarea[@id='fulladdresh1']")
	private WebElement c_addres;
	@FindBy(xpath = "//textarea[@id='paddresh1']")
	private WebElement p_address;
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submit;
	@FindBy(xpath = "//div[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement>  list;

	public void clickOnPractice()
	{
		// this java script are used for scroll up page
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", practice);
		practice.click();
	}
	public void clickOnClose()
	{
		close.click();
	}
	public void clickOnElement()
	{
		element.click();
	}
	public void clickOnTextBox()
	{
		textbox.click();
	}
    public void clickOnFillDetails()
	{
    	//getReadData(int sheetno,int row,int col)
    	
    	name.sendKeys(getReadData(0, 1, 0));	
    	
    	emailbox.sendKeys(getReadData(0, 1, 1));
    
    	c_addres.sendKeys(getReadData(0, 1, 2));
    	
    	p_address.sendKeys(getReadData(0, 1, 3));
    	
    	submit.click();
    	
    	}
	
   public void validation()
   {
	   
	   SoftAssert softassert = new SoftAssert();
	   List<String> expected = new ArrayList<String>();
	   List<String> actual = new ArrayList<String>();
	 //getReadData(int sheetno,int row,int col)
	// Collect expected data
	   
	  for(int i=0;i<4;i++)
	  {
		  expected.add(getReadData(0, 1, i));
	  }
	  // Collect actual data from web elements
	  for(int i =1; i<list.size();i=i+2) 
	  {
		  actual.add(list.get(i).getText());
	  }
	  // Compare expected and actual data
	   for(int i=0;i<4;i++)
	   {
		   softassert.assertEquals(expected.get(i), actual.get(i));  
	   }
	  softassert.assertAll(); 
	  
   }	   
}   
	   
	   
   

