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

public class ValidatetitleTest extends baseClass{ 

	public WebDriver driver;
	
	//Now i will use the logs in my script
	public static Logger log = LogManager.getLogger(ValidatetitleTest.class.getName());
	
	

	@BeforeTest
	public void StartingTest()
	{
		log.info("I am going to start the ApplicationTest class");
	}
	@BeforeClass
	public void initialize() throws IOException
	{
		driver=initializeDriver();//this method is present in baseClass and call it in this test case.
		log.info("Driver is Initialized");
		//	driver.get("http://www.qaclickacademy.com");// I set this url value in properties file.
		
	}
	
	
	@Test(dependsOnMethods= {"ValidateText"}) 
	public void BasePageNavigation1() throws IOException
	{
		//initializeDriver();//this method is present in baseClass and call it in this test case.
		homePage1 hp =new homePage1(driver);
		// i will validate featured courses text is available or not on homepage
		// i want to compare the text from the browser with actual text --if it's not
		//present, then script should fail.
		AssertJUnit.assertEquals(hp.validateTitleText(), "FEATURED COURSES123");
		log.info("Successfully Validated Text Message");
		//System.out.println("Successfully print the " + hp.validateTitleText() + " Text");
	}
	
	@Test
	public void ValidateText()
	{
		driver.get(prop.getProperty("url"));
		homePage1 p =new homePage1(driver);
		//NOW I  will check interview guide text is present or not in homepage.
		AssertJUnit.assertTrue(p.ValidateInterviewText().isDisplayed());
		log.info("Successfully Displayed the Validated Text Message");
		//System.out.println("Successfully print the " +p.ValidateInterviewText().getText()+ " Text");
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		log.info("Successfully close the browser");
	}

	@AfterTest
	public void EndingTest()
	{
		log.info("I am going to wrap-up the Validatetitle_Test & ValidatetitleTest class");
	}

	
}
