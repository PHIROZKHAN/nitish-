package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.WebTablePage;

public class WebTableTest extends BaseLibrary{
	WebTablePage ob;
	@BeforeTest
	public void launcher() 
	{
		
		launchUrl();
		ob= new WebTablePage();
	}
	@Test(priority=1,enabled=true,groups= {"smoke"})
	public void clickAtclose()
	{try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		ob.clickOnClose();
	}
	@Test(priority=2,enabled=true,groups= {"smoke"})
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3,enabled=true,groups= {"smoke"})
	public void clickAtElements()
	{
		ob.clickOnElement();
	}
	@Test(priority=4,enabled=true,groups= {"smoke"})
	public void clickAtWebTables() throws InterruptedException
	{ Thread.sleep(3000);
		ob.clickOnWebTables();
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtNameEmail()
	{
		ob.clickOnNameEmail();
	}
	@Test(priority=6,enabled=true,groups= {"smoke"})
	public void clickAteditabl()
	{
		ob.editable();
	}
	@Test(priority=7,enabled=true,groups= {"smoke"})
	public void clickDelete()
	{
		ob.delete();
	}
	
	
	
	

}
