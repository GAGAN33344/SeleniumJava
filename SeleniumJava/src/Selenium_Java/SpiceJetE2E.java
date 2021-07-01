package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJetE2E {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		//First check the return date is enable or disable with the help of style attribute
		//before click on round trip button and we know it looks disable.
     	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
     	
		//now I will click on Round Trip Radio Button
        //driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//or
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();//
			
		//After clicking on Round trip button i will check the return date is enable 
		//or disable with the help of style attribute and we know it looks Enable.
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
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();//
		//search on from Departure city box and click
		
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='BLR']")).click();//
		//search and click the Bengaluru departure city
		driver.findElement(By.xpath("//td[@class='mapbg'] //a[@value='ATQ']")).click();//
		//search and click the Amritsar arrival city 
		
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();//
		//search and click on current Calander date on Departure date column
		
		//driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent')]")).click();
		//Click on return date column
		
		driver.findElement(By.xpath("//span[contains(@id,'spclear')]")).click();
		//now i click on close point on return date column 
		
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		//search and click on passengers tab.
		
		Select a1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));//
		// Now i have to create a select class for access the elements which are 
		//present under this Adult dropdown,this will select adults values
		a1.selectByIndex(2);// this method select 3 adult.
		
		Select b1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));//
		// Now i have to create a select class for access the elements which are 
	   //present under this Child dropdown,this will select child values
		b1.selectByValue("4");// this method select 4 child.
		
		Select c1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));//
		// Now i have to create a select class for access the elements which are 
	    //present under this infant dropdown,this will select infant values
		c1.selectByVisibleText("2");// this method select 2 infant.
		
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		//Again click on passengers tab.
		
		Select s4 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		//this will select currency tab
		 
        s4.selectByVisibleText("USD");
	     //now i will selct USD currency
		
		driver.findElement(By.xpath("//input[contains(@id,'FindFlights')]")).click();
		//click on Search button
		
		System.out.println("SpiceJet End to End Testing Complete");
		
		
		driver.close();
		
	}

}
