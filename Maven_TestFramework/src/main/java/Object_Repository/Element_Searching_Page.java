package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Element_Searching_Page extends baseConstructor {

	
	private By mirror=By.xpath("//p[text()='Wall Mirrors']");
	
	
	public WebElement Mirror()
	{
		return driver.findElement(mirror);
		
	}
}
