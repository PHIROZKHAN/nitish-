package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.RadioButtonsPage;

public class RadioButtonsTest extends BaseLibrary {
	
	RadioButtonsPage ob;
	@BeforeTest
	public void launcher()
	{
		launchUrl();
		ob= new RadioButtonsPage();
	}
	@Test(priority=1 , enabled=true,groups= {"smoke"})
	public void  clickAtclose()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ob.clickOnClose();
	}
	@Test(priority=2,enabled=true,groups= {"smoke"})
	public void clickAtpractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3,enabled=true,groups= {"smoke"})
	public void clickAtElement()
	{
		ob.clickOnElement();
	}
    @Test(priority=4,enabled=true,groups= {"smoke"})
    public void clickAtRadioButton()
    {
    	ob.clickOnRadioButton();
    }
    @Test(priority=5,enabled= true,groups= {"smoke"})
    public void clickAtyes()
    {
    	ob.clickOnYesButton();
    }
    @Test(priority=6,enabled = true,groups= {"smoke"})
    public void clickAtImpressive()
    {
    	ob.clickOnImpressive();
    }
    @Test(priority=7,enabled=true,groups= {"smoke"})
    public void clickAtNOButton()
    {
    	ob.clickOnNoButton();
    }
    
	
	
	
	
	
	
	
}
