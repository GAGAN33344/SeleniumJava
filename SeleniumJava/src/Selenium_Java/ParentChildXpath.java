package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* for example when we inspect the element from webpage and we don't find any unique
   or static attribute and we find only one attribute with value and that value always
   keep on changing and we don't know which attribute should we use,then parent-child
    xPath comes in picture--means define xPath for parent and traverse to child with 
    the help of tagName. In this way we can write the xPath.
 */

public class ParentChildXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Softwaretestingmaterial");//By
		//using Custom cssSelector Syntex-- tagName.classValue
		      //   or we can use parentchild relationship xPath
		
		//driver.findElement(By.xpath("//div[@class=‘gb_h gb_i’]/a")).click();;
		// first we will reach at parent class unique attribute then traverse towards
		//child class.
		
		driver.close();
		
		
		
		
		
		
		

	}

}
