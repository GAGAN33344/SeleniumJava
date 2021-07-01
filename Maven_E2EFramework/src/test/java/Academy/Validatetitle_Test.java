package Academy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import objectRepository.homePage1;
import resouces1.baseClass;



// in this class i will validate the text with the help of assertions

public class Validatetitle_Test extends baseClass{ 

    public  WebDriver driver;	
	//Now i will use the logs in my script
	public static Logger log = LogManager.getLogger(Validatetitle_Test.class.getName());
	
	@BeforeTest
	public void StartTest()
	{
		log.info("I am going to start the Validatetitle_Test & ValidatetitleTest class");
	}
	
	
	@BeforeClass
	public void initialize() throws IOException
	{
		driver=initializeDriver();//this method is present in baseClass and call it in this test case.
		log.info("Driver is Initialized");
		//	driver.get("http://www.qaclickacademy.com");// I set this url value in properties file.
		
	}

	@Test 
	public void BasePageNavigation2() throws IOException
	{
		driver.get(prop.getProperty("url"));
		homePage1 p =new homePage1(driver);
		//NOW I  will check Blog text is present or not in homepage.
		AssertJUnit.assertTrue(p.ValidateBlogText().isDisplayed());
		log.info("Successfully Displayed the Validated Text Message");
	//	System.out.println("Successfully print the " +p.ValidateBlogText().getText()+ " Text");
		
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
	
		driver.close();
		log.info("Successfully close the browser");
	}

	
	@AfterTest
	public void EndTest()
	{
		log.info("I am going to wrap-up the Validatetitle_Test & ValidatetitleTest class");
	}

	

	
}
