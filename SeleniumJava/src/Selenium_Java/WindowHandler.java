package Selenium_Java;


import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

/* WindowHandler-- when we click on link on one webpage, after clicking, new window is open,
  the new window is known as child window.
 * In this class we will handle parent-child window relationship. how we can switch the
   window and come back on parent window.
 * if we have 3 windows, then we will use windowhandles method, this method will return 
  a each window id, this id will be in form of string and store in set data structure.
 * With the help of iterator we can traverse from parent window to child windows. 
 */
public class WindowHandler {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signup");
		
		driver.findElement(By.linkText("Help")).click();//the line of code will open the other window
		System.out.println("This Title belongs to Parent Window " +driver.getTitle());//this will print the title of parent window
		//not a child window while click on help we go to child window.
		
		//If we want to print the title of child window or perform some actions on 
		//child window, then we have to switch on child window.
		//Through iterator we can traverse from parent window to child window.
		
		Set<String>ids=driver.getWindowHandles();// this line of code grab the id of all
		//the window and store in set.
		//now i will traverse on set through iterator and grab the each window id
		//and store in string.
		            Iterator<String> it= ids.iterator();
		            System.out.println("ID's are " + it);
		            String parentid = it.next();
		            String childid = it.next();
		            
		        //    driver.switchTo().window(childid);//Switch to child window		            
		      //System.out.println("This Title belongs to Child Window " +  driver.getTitle());
		      
		     // driver.switchTo().window(parentid);
		     // System.out.println("This Title belongs to Again Parent Window " + driver.getTitle()); 
	
		
	}

}
