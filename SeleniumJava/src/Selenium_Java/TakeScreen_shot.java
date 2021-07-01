package Selenium_Java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* In this class we will see how we can take screenshot.
 * First we have to change driver object into screenshot object.
 * i have to import some jars for screenshot from Apache common IO.
 */
public class TakeScreen_shot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		//First we cast driver object to TakesScreenshot, So its ready to take screenshot
		//with the help of getScreenshotAs method,this method shows only when we cast
		//driver object to TakesScreenshot object.
		//At the end we write (OutputType.FILE)-- means we need a output as a file format.
		//and storing in source object.
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Below line of code will copy and paste the file from source folder to location
	    //which one we provide.
		FileUtils.copyFile(source,new File("//Users//GaGaNmAnn//Desktop//screenshot.png"));
		
		
	}

}
