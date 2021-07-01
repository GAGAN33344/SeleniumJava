package Selenium_Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/* Actions-- This class is specifically designed to handle mouse over or keyboard interaction
  with the users.This class have some methods which help us to co-ordinate the application
  with the help of mouse and keyboard.
 * How we can do context click on element--means right click.
 * How we can do double click on element.
 * Drag and drop the element.
 * How we can entering the Capital latter.
 * This all functions we can do with the help of Action Class methods.
 */

public class ActionsClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Now i have to create a object of action class, then with the assistance of that
		//object we can access methods of action class and perform action on Webpage.
		Actions a = new Actions(driver);// In action class argument we have to pass the driver object
		//then driver will get capabilities of action class methods.
		//now i am passing driver capabilities into actions and now object a have 
		//poweful capabilities of handing the webpages.
		
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		//I just move to mouse to account & List.
		//build()--this method will build the line of code
		//perform()--this method will execute the line of code
		//without build() and Perform()--we can't complete the action.
		
			
		//Now i want to go search box then click it then hold shift button for capital
		//latter then fill the information.
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")))
		.click().keyDown(Keys.SHIFT).sendKeys("iphone x").build().perform();
		
		//i will use explicit wait here
		WebDriverWait wa = new WebDriverWait(driver, 5);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='twotabsearchtextbox']")));
	
		//Now i want to clear the written text from search box
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).clear();
		
		//Now i want to double click on text after inserting in search box
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")))
		.click().keyDown(Keys.SHIFT).sendKeys("bmw").doubleClick().build().perform();
		
		//Now i want to right click on search box.
		a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")))
		.click().contextClick().build().perform();
		
		//driver.close();
		

	}

}
