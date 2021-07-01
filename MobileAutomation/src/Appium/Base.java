package Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

/* First of all when we want to write the Appium code, we have to configure the Appium
   Client jars and selenium WebDriver jars also, by this way eclipse have knowledge
   about this appium code.
 * first we have to talk(start)to appium server on terminal,just type appium,
   then appium server invokes the virtual devices
   or real devices. 
 * Appium server is started and listening on port 4723.
 * Information which one we want to pass form client code to server code,we well give,
   then appium server interpret and execute and run the test cases on virtual device or
   real device.
 * we have to create a object of DesiredCapabilities class, which actually takes the 
   information in Jason structure and gives the information to the server.
 * I download the demo appliaction file, ApiDemos-debug.apk from appium Github for test
   it, after that i place it inside the computer, after that copy the file and paste 
   under src package folder under MobileAutomation Project. 
 */
public class Base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException
	{
		
		File f = new File("src");//This line of code will store whatever placed in src
		//folder into f object.
		File fk = new File(f,"ApiDemos-debug.apk");//This line of code will go to f object
		//and find ApiDemos-debud.apk file location which we mention in upper line after find it 
		//fk object store the loction of particular file.
		
       DesiredCapabilities apm = new DesiredCapabilities();
       apm.setCapability(MobileCapabilityType.DEVICE_NAME, "GaganEmulator");
       apm.setCapability(MobileCapabilityType.APP, fk.getAbsolutePath());//here i will
       //pass the path of file which is stored in fk object.
       
       //Now i will make a connection with server.first of all to send the connection to 
       //the server, we need to create and invoke android driver class
       //If we work on android devices, then create AndroidDriver Class
       //If we work on iOS devices, then create IOSDriver Class
       
       AndroidDriver<AndroidElement> driver =new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),apm);
       //I have to pass two arguments here, one for
       //connection to server by using(server IP address)and other one is object of DesiredCapabilities
       //which have knowledge of all information whatever we pass through setCapability methods.
       //"http://127.0.0.1:4723/wd/hub"--means 127.0.0.1 is local host ip address and
       //4723 is the port where appium is listening, wd/hub is WebDriver hub, that is 
       //where we are actually invoking and setting up are connection to our appium server
       
      // System.out.println("Connection Successful and launch app properly");
    //   System.out.println("Got the code 200--means success");
       return driver;
       
       /*above steps are almost common for all the mobile test cases like, open the 
       emulator, pass the path of file(ApiDemos-debug.apk), make a connection with
       appium server.so i will put these steps in base class and i will call this class
       to other class instead of writing these steps again and again.
       */
       /* after completed the test,session will takes 60 seconds to shut down, we
        can see written this on command prompt and if we run the other test before
        shutting down the session, test will fail definitely.
        we should wait 60 seconds, after that we can run the test.*/
       /*if we don't want to wait 60 seconds and i want to run other test quickly
       then what should we do, after completing the test, the session takes 60 seconds 
       to close, but connection is open, if we want to run the test quickly, then we can 
       close the appium connection forcefully and then started again.we can shut the 
       connection forcefully by using Control+C command, and started again by using appium
       command.
       */
       
       /*Now I reach on virtual device/Emulator and i want to click on one object, how we
        can do that, in selenium, we can find objects by using locators in webPages, but
        in mobile automation, if we want to get some objects and click on it, By uiautomatorviewer tool,
        we can identifies the object in mobile application.
        first open the emulator page where we want to get the elements, after that open
        uiautomatorviewer tool, with the help of this tool, we can capture the mobile
        page where we want to get the elements and paste it in uiautomatorviewer tool.
        after that click on that element which we need and we can get all attribute of that 
        particular element like index, id, text, class. package and many more.
        If we want to click on any element, then we need all the information about that
        element, so i can pass that information in my script and click on it, to get the
        information of elements in mobile automation, we use uiautomatorviewer.
            */
		
		
		
	}

}
