package Selenium_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/* SSL Certifications--means sometimes when we try to open the webSite, we get an error
   like THIS IS PROBABLY NOT THE SITE YOU ARE LOOKING FOR!, under this message they suggest
   the webSite which one we tried to open and bottom of this message box written 
   PROCEED ANYWAY, when we click on it then we navigate to that webSite.so how we can 
   tell the Selenium when it faces that type of problem, then it have to click on 
   PROCEED ANYWAY.so that we have to put 4-5 lines of code in our test case so that selenium
   can easily get rid from this problem.
   INSECURE Certifications--got a error same as SSL but diffrence is that, in this error
   we get a message like YOUR CONNECTION IS NOT PRIVATE.
 * DesiredCapabilities--it is a class which helps to customize the Chrome browser, we have 
   to customize the chrome browser for using DesiredCapabilities by providing the proper
   knowledge of browser and then pass the object of DesiredCapabilities to ChromeOption,
   with the help of DesiredCapabilities object we can accept the certifications.
   *There is class in selenium WebDriver ChromeOptions and create a object of that class
  so with the help of ChromeOption object, we can merge ChromrOption object with 
  DesiredCapabilities object, By this way ChromeOption object have of knowledge of 
  certifications which is accept by DesiredCapabilities Object.
   
 */
public class HandingHTTPS_certifications {

	public static void main(String[] args) {
		//This is general chrome profile
		DesiredCapabilities dc =DesiredCapabilities.chrome();//This line of code 
		//will handle the customize thing in chrome browser.
		//dc.acceptInsecureCerts();
		//or
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);//This line of code
		//accept the certifications.
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);//This line of code
		//accept the certifications.
		//Now in dc object have chrome profile which accept the certifications.
		//Now i will pass this profile in ChromeOption object.
		
		//This ChromrOption belongs from local browser
		ChromeOptions c = new ChromeOptions();
		c.merge(dc);//Now Object c have knowledge of certifications with the help of object dc.
	
		System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver(c);//in this line of code we have to pass
		//ChromeOption Object, so driver have knowledge about certifications and selenium
		//will automatically handle these type of certifications.
		

	}

}
