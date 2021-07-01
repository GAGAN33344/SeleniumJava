package Selenium_Java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/* 1.in this test case, i will count the how many links are present on webpage
 * Links always start from anchor tag a.
 * with the assistance of anchor tag we can count links using tagName Locator.
 * 2. how we can count total link which are present in footer section. 
 * For doing this, First i have to create subset driver of main driver for footer section, then the 
   scope of Subset driver will only on footer section, after that we can access links on
   footer section. Because global driver object scope is on whole webpage.
 * why we can say limiting WebDriver scope, because WebDriver can't directly access
   the footer section. 
   3. In 2nd case we count total links in footer section there are four columns,
    but now i want to count only on first column links in footer section. so we have to
    create one more subset driver. 
   4. Click on each Column link and check page is open or not.sometime links are dynamic
   --means today in first footer column links are 5, tomorrow it will be 6,10 or many more
   so in this condition, i will not find each link locator and click on it, in this
   scenario first i will count how any links are present under this first column and click 
   on it one by one.then my test will not fail.
   Now I want to navigate to open tabs and get the title.
 */

public class QAclickAcademy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
	   //1. i will count total links which are present in webpage.
		System.out.println("Total links in Webpage are " +driver.findElements(By.tagName("a")).size());
		
		//2.i will count total links which are present in footer section of this webpage.
		// first i will throw all main footer section link in SubsetDriver, then SubsetDriver
		//scope will be only on in footer section.
		WebElement SubsetDriver=driver.findElement(By.id("gf-BIG"));
	    System.out.println("Footer Section Links are " +SubsetDriver.findElements(By.tagName("a")).size());
		

		//3.i will count total links which are present in first column in footer section of this webpage.
		// first i will throw first main column footer section link in SubsetDriver, then SubsetDriver
		//scope will be only on in first column footer section.
	    WebElement ColumnDriver=SubsetDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
	    System.out.println("Total First Column Footer Links " +ColumnDriver.findElements(By.tagName("a")).size());
	    
	    //4.// Now first i will count how many links are present in first column footer
	    //link then click on it one by one by using for loop.
	    //but there is one problem, when we click on first link then it goes to next page,
	    //then we have to go back ans again click on another link, its not a good practice
	    //also it takes almost 30-20 seconds on each link, 
	    //So we will the one method in sendKeys, this will select the link and enter 
	    //on it and open the new Tab.
	     //Now I want to navigate to open tabs and get the title.
	    //So now we will use also while loop for iterating the every page and grab 
	    //the title of that page.
	    
	    
	    for(int i=1;i<ColumnDriver.findElements(By.tagName("a")).size();i++)
	    {
	    	
	    	String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);//This line of code
	    	//combination let we know to click on link and open the another Tab.
	    	ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
	       Thread.sleep(5000L);
	    }
	       // Now i will grab the title of open tabs with the help of WindowHandles concept
	       //and iterator
	       
	       Set<String> s =driver.getWindowHandles();
	       
	       Iterator<String> it =s.iterator();
	       
	       while(it.hasNext())//it tells whether the next index is present or not, if 
	    	   //present then move to it,Its starts from zero index.
	       {
	    	   driver.switchTo().window(it.next());
	    	   System.out.println(driver.getTitle());
	    	   
	    }
	    
		//driver.close();
	}

}
