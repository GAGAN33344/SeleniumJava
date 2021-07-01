package Selenium_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*In this class i want to find day and month.
 * In month, we will use while loop and execute it
 * Grab the common attribute, put into list then iterate it and compare your requirement
   date.
 */


public class calanderDemo {

	public static void main(String[] args){
	
		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://path2usa.com/travel-companions");
		
       driver.findElement(By.xpath("//input[@id='travel_date']")).click();
       
       //First i will find August month
      while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch'] ")).getText().contains("August"))
      {
    	  driver.findElement(By.xpath("//*[@class='datepicker-days'] //th[@class='next']")).click();
      } 
       
       //Now i will select 15 day
       List<WebElement> dates = driver.findElements(By.className("day"));
		
      int count = driver.findElements(By.className("day")).size();
      
      for(int i=0; i<count;i++)
      {
    	 String text = driver.findElements(By.className("day")).get(i).getText();
    	  if(text.equalsIgnoreCase("15"))
    	  {
    		  driver.findElements(By.className("day")).get(i).click();
    		  
    		  break;
    	  }
      }

      //driver.close();
	}

}
