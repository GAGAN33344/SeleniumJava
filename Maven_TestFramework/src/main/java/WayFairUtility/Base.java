package WayFairUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

            static WebDriver driver;	
	public static void launch(String browsertype, String url)
	{
		if(browsertype.contains("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
			 driver = new FirefoxDriver();
		}
	   else if(browsertype.contains("IE"))
				{
		   System.setProperty("webdriver.IE.driver", "IEdriver");
			 driver = new InternetExplorerDriver();
				}
	   else 
		{
			   System.setProperty("webdriver.chrome.driver", "//Users//GaGaNmAnn//Desktop//chromedriver");
				 driver = new ChromeDriver();
					}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static void close()
	{
		driver.close();
	}
	
}
