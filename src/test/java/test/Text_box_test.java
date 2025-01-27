package test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Baseutility.BaseLibrary;
import pages.Text_box_page;

public class Text_box_test extends BaseLibrary {
	
	Text_box_page ob;
	@BeforeTest
	public void launcher( )
	{
		launchUrl();
	ob=new Text_box_page();
	
	}
//	@AfterTest
//	public void flush()
//	{
//		driver.close();
//	}
	@Test(priority=2 , enabled=true)
	public void clickAtPractice() 
	{
	
		ob.clickOnPractice();
	}
    @Test(priority=1 , enabled=true)
    public void clickAtClose()
    {
    	ob.clickOnClose();
    }
	@Test(priority=3 ,enabled=true)
	public void clickAtElement()
	{
		ob.clickOnElement();
	}
	@Test(priority=4, enabled=true)
	public void clickAtBox()
	{
		ob.clickOnTextBox();
	}
	@Test(priority=5 ,enabled=true)
	public void clickAtFillDetails()
	{
		ob.clickOnFillDetails();
	}
    @Test(priority=6, enabled = true)
	public void validate() {
		ob.validation();
	}
	
	
}
