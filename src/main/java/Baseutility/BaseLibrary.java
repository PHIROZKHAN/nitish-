package Baseutility ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import applicationutility.ActionUtility;
import applicationutility.Applicationutility;
import applicationutility.Properties_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLibrary implements Applicationutility ,Properties_Utility,ActionUtility

   {
	
	public static WebDriver driver;
	
	public void launchUrl()
	{ 
		// Initialize WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); // Create a new ChromeDriver instance

        // Launch URL
        driver.get("https://testingbaba.com/old/");

        // Optional: Maximize the window
        driver.manage().window().maximize();
	//	WebDriverManager.chromedriver().setup();
		//driver.get("https://testingbaba.com/old/");
		//ChromeOptions option = new ChromeOptions();
		//option.setAcceptInsecureCerts(true);
		//option.addArguments("--incognito");
		
		//option.addArguments("--maximize");
	    //driver.manage().window().maximize();
		
	}
//<<<<---------------------Data Reading From Excel------------------------------>>>>
	@Override
	public String getReadData(int sheetno,int row,int col) {
		
		String path="C:\\Users\\PHIROZ KHAN\\Practice_Automation_Maven_project_Jan-2025\\testdata\\Textbox fill.xlsx";
		
		String value="";
		
	   try{
		FileInputStream fis= new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sht = wb.getSheetAt(sheetno);
		   value=sht.getRow(row).getCell(col).getStringCellValue();
	   }
	   catch(Exception e)
		 {
		 	System.out.println("issue getread data"+e); 
		 }
		return value;
	}
//<<<---------------------Data Reading Propertiese File-------------------->>>>
	@Override
	public String getPropertiesData(String key) {
		String value="";
		String path="C:\\Users\\PHIROZ KHAN\\Practice_Automation_Maven_project_Jan-2025\\testdata\\config.properties";
		try {
			FileInputStream fis= new FileInputStream(path);
			Properties prop= new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
		    } 
		catch (Exception e) {
			System.out.println("issue get read data from propertiese file");
		    }
		return value;
	}
	
//	<<<-------------------Action class------------------------>>>


	@Override
	public void doubleclick(WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		
	}
	@Override
	public void singleClick(WebElement ele) {
		Actions act= new Actions(driver);
		act.click(ele).perform();
		
	}
	@Override
	public void rightClick(WebElement ele) {
	Actions act= new Actions(driver);
	act.contextClick(ele).perform();
	}
	@Override
	public void dragAndDrop(WebElement ele) {
		Actions act =new Actions(driver);
		act.dragAndDrop(ele, ele);
	}
	@Override
	public void mouseOver(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele);
		
	}
	@Override
	public void click(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	
	 
	 

}
