package Extent_Reports;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ApplicationTest {

	
	ExtentReports extent;

	@BeforeTest
	public void Configuration()
	{
		//String path =System.getProperty("user.dir")+"//reports//index.html";//this line
		//of code means, under the project one reports folder will be created and we will
		//see index.html file.
		//ExtentSparkReporter reporter = new ExtentSparkReporter(path);//reporter is the object
		//of ExtentSparkReporter class, this class expect a path, where report will be
		//created.
		//reporter.config().setReportName("Web Automation Results");
		//reporter.config().setDocumentTitle("Test Results");
		//ExtentSparkReporter class is the helper class, which helps to create a configuration
		//that will finally report to ExtentReports class.
		
		 extent = new ExtentReports();
		//extent.attachReporter(reporter);//now object of ExtentReports have know of reporter
		//object, which have all settled configuration.
		extent.setSystemInfo("Tester", "Gagan Mann");
		
		
	}
	
	
	@Test
	public void ApplicatonTest()
	{
		ExtentTest test=extent.createTest("ApplicatonTest");/*this line of code means it will create test in
		the reporting file,which one we will see at after the test execution.once we 
		create test, after that extent keyword variable automatically will keep on monitoring
		the result status of this test case, if it reports pass, then it will go back 
		and update this test result as pass and if it fail, then extent will go back 
		and mark it fail.*/
		/*when we create a test, then one object is created automatically for this whole
		test method, so we will catch that object, so that object(test) is responsible to listen
		and report about all the happenings back to the extent report.
		with the help of that object, we can perform lots of functions	 */
		System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		//test.fail("Results do not match");//this line of code forcefully generate the 
		//fail test report in index.html reporting. 
		//after completed the test, we will mention extent.flush, means test is completed,
	    //don't need to monitoring further more.
		extent.flush();
		
	}
	
	
	
}
