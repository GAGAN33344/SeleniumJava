package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	
	WebDriver driver;// this is local driver
	public HomePage(WebDriver driver)// this is constructor and pass the driver argument
	{
		this.driver=driver;
	}
	
	
	By signin=By.xpath("//a[@class='signin']");
	By searchbox=By.cssSelector("input[id='srchword']");
	By ClickonSearchbox=By.className("newsrchbtn");
	
	
	public void signin()
	{
		driver.findElement(signin).click();
	}
	
	public void searchbox()
	{
		driver.findElement(searchbox).sendKeys("iphone 11 pro max");
	}
	
	public WebElement ClickonSearchbox()
	{
		return driver.findElement(ClickonSearchbox);
	}
	
}
