package resouces1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass 
{
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{

   //First and foremost I will initialize the browser driver, which one we need for run our script
	//and placed in properties file.
	
	           prop = new Properties();//this class will help to interpret the properties file
	
		FileInputStream f =new FileInputStream(System.getProperty("user.dir")+"//src//main//java//resouces1//data.properties");
	       //this line of code store the location of property file in f object.
	
		
		prop.load(f);//now Properties class object prop have a knowledge of property file location.
		
		//if we want to set browsertype from maven, then we have to give command like
		//mvn test -Dbrowser=chrome
		//String browserName=System.getProperty("browser");//this line of code means it will extract
		//the maven browsertype value, which one we give in mvn command.
		
		String browserName=prop.getProperty("browser");// now i pass the browser value,
		//which is mention in properties file.
		
		if(browserName.contains("chrome"))
		{
			//Execute the chrome driver
			System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
			ChromeOptions options = new ChromeOptions();//I use this line of code for run
			//our test cases in headless chrome browser.
			if(browserName.contains("headless"))
			{
			options.addArguments("headless");//pass the argument 
			}
			//driver = new ChromeDriver();
              driver = new ChromeDriver(options);//now driver have a knowledge of
               //options object and that object pass the argument of headless browser.
		}
		else if(browserName.equals("firefox"))
		{
			//Execute the FireFox driver
			System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
			 driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{ 
			//Execute IE code
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("url"));
		return driver;
	}
	
	//here i will declare one method for screenshot on failure any test case.

	/*First we cast driver object to TakesScreenshot, So its ready to take screenshot
     with the help of getScreenshotAs method,this method shows only when we cast
     driver object to TakesScreenshot object.
	 At the end we write (OutputType.FILE)-- means we need a output as a file format.
	 and storing in source object.
	 we get a jar file for FileUtils from Apache common IO */
	//Below line of code will copy and paste the file from source folder to location
    //which one we provide.
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException//here i will pass the 
	//test case name from listeners 
	{
		     TakesScreenshot ts =(TakesScreenshot)driver;
		    		  File source=ts.getScreenshotAs(OutputType.FILE);//in this line
		      //driver have no life,but when we pass the driver as an argument in getScreenShotPath
		     // method ,then driver have a life.
				String destinationFile = System.getProperty("user.dir")+"//reports//"+ testCaseName+".png";
			   FileUtils.copyFile(source,new File(destinationFile));
			   return destinationFile;//we use this line of code when we want to attach
			   //the failure test case screenshot with extent report with parallel run
			   //or sequential run test cases.
	}
	

}
