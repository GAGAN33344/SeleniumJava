package Selenium_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookChromedriver {

	public static void main(String[] args) {
	

		 System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");//Hit URL on browser
			System.out.println("Successfully Launch the Webpage");
			System.out.println(driver.getTitle());// Validate the page title is correct or not
			System.out.println(driver.getCurrentUrl());//Validate the landed page is correct or not
			//System.out.println(driver.getPageSource());//print the page source code of landed page
			//we can use this method when right click is disable on Webpage,otherwise we can
			//check the page source code after right click on the page.
			driver.close();

	}

}
