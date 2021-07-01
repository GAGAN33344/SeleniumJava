package Selenium_Java;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleGeckoDriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		 Thread.sleep(5000);// Wait for 5 sec.
		System.out.println("Successfully Launch the Webpage");
		System.out.println(driver.getTitle());// Validate the page title is correct or not
		System.out.println(driver.getCurrentUrl());//Validate the landed page is correct or not
		//System.out.println(driver.getPageSource());//print the page source code of landed page
		//we can use this method when right click is disable on Webpage,otherwise we can
		//check the page source code after right click on the page.
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().back();//going back from the current page.
		 Thread.sleep(3000);// Wait for 3 sec.
	 //  driver.navigate().forward();//Going forward from the current page.

       driver.close();// it closes the current browser.
       //driver.quit();// it closes all the browser opened by Selenium.
       
   
	}

}
