package resouces1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

/*when we run our test cases sequential way rather than parallel, then extent reports 
 concept work perfectly, but if we want run our test cases in parallel mode, then we have 
 to use thread local class, so that class is responsible to make all our test cases 
 execution thread safe.
 * 
 */
public class ExtentReporterNG {
   
	       static ExtentReports extent;    
	
	public static ExtentReports getReportObject()//i want call this method in listeners 
	//class, that's why i use static keyword because now i don't need to create a object
	//for call this method.
	{
		
		String path=System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");	
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Gagan Mann");
		return extent;
			
	}
	
	
}
