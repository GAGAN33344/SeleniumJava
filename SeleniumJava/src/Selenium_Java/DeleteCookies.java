package Selenium_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* In this class we will see how we can maximize the browser and delete the cookies 
   before to start testing.
 */

public class DeleteCookies {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("asfdddd");

		driver.get("https://www.google.com/");
	
	}

}
