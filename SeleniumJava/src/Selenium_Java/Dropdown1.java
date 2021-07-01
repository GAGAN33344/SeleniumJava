package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/* In this class i will handle adult dropdown in spicejet website
 
 */

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);

		Select a = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));//
		// this will select adults values
		a.selectByIndex(2);// this method select 3 adult.
		
		Select b = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));//
		// this will select child values
		b.selectByValue("4");// this method select 4 child.
		
		Select c = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));//
		// this will select infant values
		c.selectByVisibleText("2");// this method select 2 infant.
		
		driver.findElement(By.id("divpaxinfo")).click();
		//System.out.println("Total Passangers are " + driver.findElement(By.id("divpaxinfo")).getText());
		
		//driver.close();
		
		
	}

}
