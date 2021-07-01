package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

/*How to handle Dynamic dropdowns ?
 Dynamic dropdowns- in spicejet website, for example we take one xPath from Departure
 city tab and refresh the browser and try to validate in console window, when we put and 
 enter, we don't find any node, but after clicking the departure tab and loading the all
 city, then check Xpath validation, it shows 1 matching node, after clicking on arrival tab
 and check xpath, it shows 2 matching nodes-----means it changes the values after doing
 some actions.
 
 */
public class Dropdown2 {

	public static void main(String[] args)  {
	
		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// search the element From Departure tab and click on it.
		
		//driver.findElement(By.xpath("//a[@value='ATQ']")).click();//from
		//Departure Tab Amritsar
		//Thread.sleep(3000L);
		
	//	driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();//to
		//Arrival Tab Goa.// i put[2] because when we search this element its 
		//comes second time.
		
		/*sometimes people don't like search element location by using indexes,
		/ what should we do ?
		/so we will use parent-child relationship.for example we need a xPath of one 
		/element and don't want to use index like [2] or whatever. then we will find
		/ xpath of this element parent, then it directly goes towards parent then child.
		*/
		
		//now we write a code with parent-child relationship of line no 28 and 32.
		
		
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='ATQ']")).click();
		// first I will use parent element xPath then space then child element xPath.
		
		
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='MAA']")).click();
		// first I will use parent element xPath then space then child element xPath.
		
		
		
		driver.close();


	}

}
