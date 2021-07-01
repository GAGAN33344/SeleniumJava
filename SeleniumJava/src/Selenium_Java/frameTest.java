package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/* we can switch the frame by three methods
  driver.switchTo().frame(By index);
  driver.switchTo().frame(By string);
  driver.switchTo().frame(By WebElement);
  HTML code of iFrame always start from iFrame tag.
 */


public class frameTest {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//for frames, first we have to switch to frame, then we can do something.
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//now i want to click on frame
		driver.findElement(By.xpath("//div[@id='draggable']")).click();
		//Now i will drag this element to drop somewhere with the help of action class
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(source, target).build().perform();
		
		//Now if we want to work from out of frame, then we have to follow below command.
		driver.switchTo().defaultContent();//after this step we can find element on webpage.
		driver.findElement(By.cssSelector("a[href*='download']")).click();
		
		
		

	}

}
