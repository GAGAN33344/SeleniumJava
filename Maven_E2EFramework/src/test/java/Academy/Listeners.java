package Academy;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resouces1.ExtentReporterNG;
import resouces1.baseClass;


/*ITestListener is an interface which implements the Testing Listeners.
 * with Listeners we can easily get the particular point where test is fail with
  the help of getName() method.
 * This below methods will execute after every test. when tests are passed, then
   success method block will execute, when got a failure, then failure listener method will
   execute.
 * when we run the testng.xml file, then we have to tell where these listener are located
   if we don't tell to testng.xml file then it will not go and redirect to listener class
   so for that, we have to mention in testng.xml file about listeners in between 
   suite and test folder.
   */

public class Listeners extends baseClass implements ITestListener {

	
	ExtentTest test;
	ExtentReports extent=ExtentReporterNG.getReportObject();//here i am calling this 
	//method in listeners class.
	//this extent report mechanism good works in sequential run test cases.
	ThreadLocal<ExtentTest> extentTest= new ThreadLocal<ExtentTest>();//ThreadLocal class will help us to run
	//our test cases in parallel mode and ExtentTest class object should be safe from 
	//overriding. so i will use ThreadLocal class for ExtentTest class.
	//now extentTest object will store all test objects.
	public void onTestStart(ITestResult result) {
		
		//now i will write here extent report first step code, this line of code will 
		//execute every time before starting each test case.
		 test= extent.createTest(result.getMethod().getMethodName());//this
		//line of code, with the help of extent object, we can simply creating the test, now every test case while 
		//starting, it will come in this method listener class, and create one entry in the
		//report and that way it will take care of reporting pass or fail.
		 extentTest.set(test);//now extentTest object have knowledge, whatever is present
		// in test object.
	
	}

	public void onTestSuccess(ITestResult result) {
		
		//test.log(Status.PASS, "Test Passed");//i will use this line of code, when i 
		//work only with ExtentReports , not a ThreadLocal class with run our test cases
		//sequential manner.
		
		extentTest.get().log(Status.PASS, "Test Passed");//this line of code will work,
		//when i work with ExtentReports and ThreadLocal class for parallel execution.
		//System.out.println("I Successfully executed Listeners pass code");
	}

	public void onTestFailure(ITestResult result) {
 
		//test.fail(result.getThrowable());//this line of code will show failure logs in
		//reports
		//i will use this line of code, when i work only with ExtentReports , not a 
		//ThreadLocal class with run our test cases sequential manner.
		
		extentTest.get().fail(result.getThrowable());//this line of code will work,
		//when i work with ExtentReports and ThreadLocal class for parallel execution.
		
		  //i want to capture the screenshot on failure
			WebDriver driver=null;
	String testMethodName= result.getMethod().getMethodName();//this line of code will 
	//capture failed test case name and pass that test case name as a argument in below method.
	//then this method we define in base class,then this base class method will execute and 
	//capture the screen shot.
	try {
		driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		//this
		//line of code will capture driver life and pass in getScreenShotPath method.
	} catch(Exception e)
	{
		
	}
	
	try {
		extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName, driver), result.getMethod().getMethodName());//this
		//line of code means add the test case failure screenshot with extent report.
		//getScreenShotPath(testMethodName, driver);//this line of code work only, when 
		//do not attach failure test case screenshot with extent report.
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		//System.out.println("I Got Failed Listeners pass code " +result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	public void onStart(ITestContext context) {
	
	}

	public void onFinish(ITestContext context)//this method will execute at the end
	{
		
		extent.flush();
		
		
	}

	

}
