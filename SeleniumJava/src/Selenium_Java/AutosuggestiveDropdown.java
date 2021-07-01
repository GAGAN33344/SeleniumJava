package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/* Autosuggestive Dropdowns means-- for example when we go any site like Yatra
 when we start search from departure, we put only 2-3 words then we saw some information
 regarding that words. so website autosuggest some information basis of our putting 2-3
 words only.
 */

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		
		driver.findElement(By.className("btngdpr")).click();
		
		WebElement source = driver.findElement(By.id("BE_flight_origin_city"));
	    source.clear();
	    source.sendKeys("mum");
	    Thread.sleep(2000L);
        source.sendKeys(Keys.ENTER);
        
        WebElement destination = driver.findElement(By.id("BE_flight_arrival_city"));
        destination.clear();
        destination.sendKeys("del");
	    Thread.sleep(2000L);
	    destination.sendKeys(Keys.ARROW_DOWN);
        destination.sendKeys(Keys.ENTER);
        
		
		//driver.close();

	}

}
