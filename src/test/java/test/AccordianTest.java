package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.AccordianPage;

public class AccordianTest extends BaseLibrary
 {
	AccordianPage ob;
	
	@BeforeTest
	public void launcher()
	{
		launchUrl();
		
		ob=new AccordianPage();
	}
	
	@Test(priority=1,enabled=true,groups= {"smoke"})
	public void clickAtClose()
	{
		ob.clickOnClose();
	}
	@Test(priority=2,enabled=true,groups= {"smoke"})
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3,enabled=true,groups= {"smoke"})
	public void clickAtWigets() {
		
		ob.clickOnWigets();
	}
	@Test(priority=4,enabled=true,groups= {"smoke"})
	public void clickAtAccordian()
	{
		ob.clickOnAccordian();
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtAccordianpara1()
	{
		ob.clickOnAcordianPara1();
	}
	@Test(priority=6,enabled=true,groups= {"smoke"})
	public void clickAtAccordiantext()
	{
	
		ob.validation();
	}
	

 }
