package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class Landing_Page extends baseConstructor{
	
	  
	private By Pillow=By.xpath("//ul[@class='DepartmentDropdown-sections DepartmentDropdown-sections--3']//h3[text()='Decorative Pillows &']");
	private By popup= By.xpath("//button[@aria-label='Close Modal']");
	
	
	
	public WebElement pillowValidation() throws InterruptedException
	{
		Actions actions = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//a[text()='Décor & Pillows']"));
		actions.moveToElement(menu).build().perform();
		Thread.sleep(5000);
	     return  driver.findElement(Pillow);
	}

	public int PopUpSize()
	{
		 return driver.findElements(popup).size();
	}
	public WebElement getPopUp()
	{
		return driver.findElement(popup);
	}
	
	
	
}
