package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*  How we can select Static and Dynamic dropdowns ?
 *  Static dropdowns means when we go any dropdown and we see so many predefined options
  Example- when we go currency dropdown in spice-jet website, then we see so many prefined 
  options like INR,AED,USD.
  * Dynamic dropdown means, elements under the dropdown is display same on every time
  and tagName is not started with select tag.and select class will not work in this case.
 *  if we want so select dropdowns from webpage, then we have to use select class, under
  select class, there are lots of methods that helps to find the element under the 
  dropdown location.
 * one thing keep in mind, when we select any element under dropdown, 99% of elements 
  start from select tag in DOM and under select tag,child classes start from
  option tag, then we can use select class and get the elements location.
  
 */


public class Dropdown {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//now we have to use select class for access the dropdowns and the pass the
		//WebElement location value, under that element all dropdown comes.
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
	
		 s.selectByIndex(2);
		 Thread.sleep(3000L);
         s.selectByVisibleText("USD");
	     Thread.sleep(3000L);
		 s.selectByValue("INR");
         Thread.sleep(3000L);

         driver.close();
	}

}
