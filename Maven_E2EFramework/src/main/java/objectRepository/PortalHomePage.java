package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {
	

	 WebDriver driver;
	public PortalHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By searchbox=By.cssSelector("input[id='search-courses']");
	
	
	public WebElement SearchBox()
	{
		return driver.findElement(searchbox);
	}
	
	

	
	

}
