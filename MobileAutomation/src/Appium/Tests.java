package Appium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/* First i will call the base class in this class with the help of extends keyword
 * 
 */
public class Tests extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		 AndroidDriver<AndroidElement> driver=Capabilities();// I call this method from base class.
		// in capabilities method, we are returning driver object, because this is
		 //responsible for automation.so have to send driver object from base class to test
		 //class also and this will continue the further steps, we have to mention this driver is what data type, we mention
		 //in base class, it is AndroidDriver<AndroidElement>.
	
	//driver.findElement(By.xpath("//*[@text='Media']")).click();// we can 
		 //find out elemnts with the help of uiautomatorviewer tool.
		
		
		
		

	}

}
