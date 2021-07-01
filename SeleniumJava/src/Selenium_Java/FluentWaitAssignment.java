package Selenium_Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

/* In this class we will use FluentWait class for impelement the wait interface.
  * Fluent wait--is not seperate type of wait, its comes under Explicit wait,it also
   same as WebDriverWait but only difference is that it finds the web element repeatedly
   at regular interval of time based on the given polling seconds until the timeout
    or till the object gets found.
 * Both WebDriverWait and FluentWait are classes which implement the wait interface.
 */
public class FluentWaitAssignment {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
				WebDriver driver = new ChromeDriver();
				
			driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");//Hit URL on browser
		
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		
		   Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				   .pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement ab = w.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
				{
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
				}
				else 
					return null;
			}
		});
		
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		
		driver.close();
		
	}

}
