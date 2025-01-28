package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.ChekboxPage;

public class CheckboxTest extends BaseLibrary {
	
	ChekboxPage ob;
	@BeforeTest(groups= {"smoke","sanity","regression"})
	public void launcher()
	{
		launchUrl();
		ob= new ChekboxPage();
	}

	@Test(priority=1,enabled=true,groups= {"smoke"})
	public void clickAtClose()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ob.clickOnClose();
	}
	@Test(priority=2,enabled=true,groups= {"smoke","regression"})
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3,enabled=true,groups= {"smoke","sanity"})
	public void clickAtElements()
	{
		ob.clickOnElement();
	}
	@Test(priority=4,enabled=true,groups= {"smoke","regression","sanity"})
	public void clickAtCheckbox()
	{
		ob.clickOnCheckbox();
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtMobile()
	{
		ob.clickOnMobile();
	}
	@Test(priority=6,enabled= true,groups= {"smoke","snity"})
	public void clickAtLaptop()
	{
		ob.clickOnLaptop();
	}
	@Test(priority=7,enabled=true,groups= {"smoke","sanity"})
	public void clickAtDesktop()
	{
		ob.clickOnDesktop();
	}

}


