package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Baseutility.BaseLibrary;

public class WebTablePage extends BaseLibrary {
	
	public WebTablePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath="//a[@href=\'#tab_4\']")
	private WebElement webtable;
	
	@FindBy(xpath="//iframe[@src='Webtable.html']")
	private WebElement iframe;
	@FindBy(xpath="//input[@pattern='^[a-zA-Z][\\sa-zA-Z]{2,32}']")
	private WebElement name;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath = "//*[@class=\"btn btn-info btn-xs btn-edit\"]")
	private List<WebElement> editlist;
	
	@FindBy(xpath = "//input[@name='edit_name']")
	private WebElement editname;
	
	@FindBy(xpath = "//input[@name='edit_email']")
	private WebElement editemail;
	
	@FindBy(xpath = "//button[@class='btn btn-info btn-xs btn-update']")
	private WebElement update;
	
	@FindBy(xpath = "//button[@class='btn btn-danger btn-xs btn-delete']")
	private List<WebElement> delete;
	
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
	public void clickOnWebTables()
	{
		webtable.click();
	}
	public void clickOnNameEmail()
	{ 
		driver.switchTo().frame(iframe);
		for (int i = 1; i <=6; i++) {
			name.sendKeys(getReadData(0, i, 0));
			email.sendKeys(getReadData(0, i, 1));
			save.click();
		}	
	}
	public void editable()
	{
		int j=2;
       for(int i =0; i<editlist.size(); i++)
       {
    	   editlist.get(i).click();
    	   editname.clear();
    	    editname.sendKeys(getReadData(0, j, 0));
    	    editemail.clear();
			editemail.sendKeys(getReadData(0,j, 1));
			update.click();
    	   j++;
       }
		
	}
	public void delete()
	{
		for(int i=0;i<delete.size()-1;i++)
		{
			WebElement ele = delete.get(1);
			ele.click();
		}
		driver.switchTo().defaultContent();
	}
	
}
