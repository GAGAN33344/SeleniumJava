package Academy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import objectRepository.Forgot_Password;
import objectRepository.homePage1;
import objectRepository.loginPage1;
import resouces1.baseClass;


public class ApplicationTest extends baseClass{ 

     public WebDriver driver;
	
	//Now i will use the logs in my script
		public static Logger log = LogManager.getLogger(ApplicationTest.class.getName());
	
	@BeforeTest
	public void StartingPoint()
	{
		log.info("I am going to start the ApplicationTest class");
	}
	
	@BeforeClass
	public void initialize() throws IOException
	{
		driver=initializeDriver();//this method is present in baseClass and call it in this test case.
		log.info("Driver is Initialized");
		
	}
	
	@Test// in this test case i will access all the homePage1 method(objects).
	public void HomePage()
	{
		driver.get("http://www.qaclickacademy.com");// I set this url value in properties file.
		homePage1 hp =new homePage1(driver);
		hp.getlogin1().click();
		log.info("Successfully click on login");
	}
	
/*	@Test// in this test case i will access all the loginPage1 method(objects).
	public void LoginPage()
	{
		loginPage1 lp = new loginPage1(driver);
		lp.userName().sendKeys("gagan.mann@ymail.com");
		lp.passWord().sendKeys("Chahal@1988");
		lp.submitBtn().click();
	}  */
	 
	//or we can pass the values by using dataprovider annotation.
	
	@Test(dataProvider="getData1")// in this test case i will access all the loginPage1 method(objects).
	public void LoginPage(String username, String password) throws InterruptedException
	{
		loginPage1 lp = new loginPage1(driver);
		lp.userName().sendKeys(username);
		lp.passWord().sendKeys(password);
		lp.submitBtn().click();
		//after putting the first username and password, then we have to clear the username
		//and password box for putting the second username and password value.
		lp.userName().clear();
		lp.passWord().clear();
		log.info("Successfully pass the parameters");
		
	}
	
	@Test
	public void clickonForgotPassword()
	{
		//now i will click on forget password
		loginPage1 lp = new loginPage1(driver);
		Forgot_Password fp=lp.ForgotPassword();
		//Forgot_Password fp = new Forgot_Password(driver);//this step i will mention in
		//loginPage1 in ForgotPassword method.
		
		fp.ForgotUserName().sendKeys("gaganmann3334@ymail.com");
		fp.SendMeInstructions();
		
		
	}
	
	//now i will pass the data through @DataProvider annotation
	@DataProvider
	public Object[][] getData1()
	{
	//Row stands for how many different data types test should run.
	//Column stands for how many values we want to send per each test case.	
    // now i will store the data in an array
		Object[][] data1 = new Object[2][2];//2,2 means i want to pass two test case and 
		//two values per each test case.
		
		data1[0][0]="gaganmann3334@ymail.com";
		data1[0][1]="chahal1988";
		
		data1[1][0]="gaganmann333444@ymail.com";
		data1[1][1]="Chahal@1988"; 
		//now i will return this data and assign to particular test case.
		return data1;
	}

	@AfterClass
	public void closeBrowser()
	{
		//driver.navigate().back();
		driver.close();
		log.info("Successfully close the browser");
	}
	

	@AfterTest
	public void EndingPoint()
	{
		log.info("I am going to wrapup the ApplicationTest class");
	}
	
}
