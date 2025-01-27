package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.ButtonsPage;

public class ButtonsTest extends BaseLibrary {
	ButtonsPage ob;
	@BeforeTest
	public void launcher() throws InterruptedException
	{ Thread.sleep(3000);
		launchUrl();
		ob= new ButtonsPage();
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
	@Test(priority=3,enabled=true,groups={"smoke"})
	public void clickAtElement()
	{
		ob.clickOnElement();
	}
	@Test(priority=4,enabled=true,groups= {"smoke"})
	public void clickAtButtons()
	{
		ob.clickOnButtons();
	}
	@Test(priority=5,enabled = true,groups= {"smoke"})
	public void clickAtDoubleClick()
	{
		ob.clickOnDoubleclick();
	}
	@Test(priority=6,enabled=false,groups= {"smoke"})
	public void clickAtRightClick()
	{
		ob.clickOnRightClick();
	}
	@Test(priority=7,enabled=true,groups= {"smoke"})
	public void clickAtClick()
	{
		ob.clickOnButtons();
	}

}
