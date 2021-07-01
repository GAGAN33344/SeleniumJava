package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/* In this class we will validate the return date column is enable or disable after 
  click on Round trip button.
 * Also we will check how we can click on current calander date.
 */

public class CalanderSelection {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		//First check the return date is enable or disable with the help of style attribute
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//now I will click on Round Trip Radio Button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//After clicking on Round trip button i will check the return date is enable 
		//or disable with the help of style attribute
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Return date column is Enable");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Return date column is Disable");
			Assert.assertTrue(false);
		}
		
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//
		//click on from box
		
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='BHO']")).click();//
		//click the departure city
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='ATQ']")).click();//
		//click the arrival city 
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();//
		//click on current Calander date
	
		
		//driver.close();
		
		
		
	}

}
