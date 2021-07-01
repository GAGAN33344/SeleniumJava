package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Alerts- when we fill any information on webpage and hit enter,sometimes
   we got a pop-up and we can't click on it through driver methods because we can't
   inspect element on that pop-up, so we have to switch driver to that alert, after that we
   can accept it.
   * we got two types of alert, one is only we have one option like Ok and otherone
     have two options like Ok and cancel.
 */
public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
	  System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gagan");
		//fill the name on switchtoAlert location.
		
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		//click on alert button
		Thread.sleep(2000L);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gagan");
		//fill the name on switchtoAlert location.
		
		
		driver.findElement(By.cssSelector("input#confirmbtn")).click();
		//click on confirm button
	   Thread.sleep(2000L);
	   
	   System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	   
		driver.close();
	}

}
