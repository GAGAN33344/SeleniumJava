package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitAssignment {

	  /*In this class we will use WebDriverWait class for implement the wait interface.
	  * Explicit Wait-- we can target a specific scenario or specific element to wait 
	   required seconds.if we put 10 seconds,then it continuously listening the web element
	   from DOM for 10 seconds until it found the element,it comes with two types, 
	   one is with WebDriverwait class and other one is with FluentWait class.
	   */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		
		WebDriverWait wdw = new WebDriverWait(driver, 5);
		wdw.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='results']")));
		
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
		
		driver.close();
	}

}
