package Object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Wall_Mirror_Page extends baseConstructor {
	
	Actions a = new Actions(driver);
	private By shape_icon=By.xpath("//span[text()='Shape']");
	private By rectangle_selection=By.xpath("//span[text()='Rectangle']");
	
	private By frame_finish_icon=By.xpath("//span[text()='Frame Finish']");
	private By white_color__selection=By.xpath("//span[text()='White']");
	
	private By dimensions_icon=By.xpath("//span[text()='Dimensions']");
	private By large_size_selection=By.xpath("//span[text()='Large & Oversized (Over 32\" High)']");
	
	private By price_per_item_icon=By.xpath("//span[text()='Price Per Item']");
	private By price_range_selection=By.xpath("//span[text()='$250 to $500']");
	
	private By features_icon=By.xpath("//span[text()='Features']");
	private By tilt_shape_selection=By.xpath("//span[text()='Tilt']");
	
	private By door_selection=By.xpath("//h2[text()='Rima Modern & Contemporary Full Length Mirror']");
	
	
	public WebElement clickonShape() throws InterruptedException
	{
		a.moveToElement(driver.findElement(shape_icon)).build().perform();
		//Thread.sleep(1000);
		return driver.findElement(rectangle_selection);
	}
	
	public WebElement clickonframe_finish() throws InterruptedException
	{
		a.moveToElement(driver.findElement(frame_finish_icon)).build().perform();
		//Thread.sleep(1000);
		return driver.findElement(white_color__selection);
	}
	
	public WebElement clickonDimensions() throws InterruptedException
	{
		a.moveToElement(driver.findElement(dimensions_icon)).build().perform();
		//Thread.sleep(1000);
		return driver.findElement(large_size_selection);
	}
	
	public WebElement clickonprice_per_item() throws InterruptedException
	{
		a.moveToElement(driver.findElement(price_per_item_icon)).build().perform();
		//Thread.sleep(1000);
		return driver.findElement(price_range_selection);
	}
	
	public WebElement clickonfeatures() throws InterruptedException
	{
		a.moveToElement(driver.findElement(features_icon)).build().perform();
		//Thread.sleep(1000);
		return driver.findElement(tilt_shape_selection);
	}
	
	public WebElement clickondoor()
	{
	   return driver.findElement(door_selection);
	}
	
	public void get_title()
	{
		System.out.println("Title of current window is = "  + driver.getTitle());
	}
	
	public void switch_window()
	{
	
	}
	/*public WebElement click_on_mirror()
	{
		return driver.findElement(mirror_selection);
	}*/
	

}
