package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	WebDriver driver;
	public  Loginpage(WebDriver driver)// constructor
	{
		this.driver=driver;
	}
	
	By username= By.xpath("//input[@id='login1']");
	By password= By.xpath("//input[@id='password']");
	By signin= By.xpath("//input[@name='proceed']");
	By rediffHomePage=By.linkText("rediff.com");
	//tagName[contains(@attribute,'value')]
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
		
	}
	
	public void Password()
	{
		driver.findElement(password).sendKeys("12345");	
	}
	
	public void SIGNIN()
	{
		driver.findElement(signin).click();
	}
	
	public WebElement Clickonrediff()
	{
		return driver.findElement(rediffHomePage);
	}
	

}
