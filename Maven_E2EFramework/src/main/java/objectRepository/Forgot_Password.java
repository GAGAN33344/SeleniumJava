package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgot_Password {

	 WebDriver driver;
	public Forgot_Password(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By forgotUserName=By.xpath("//input[@id='user_email']");
	private By sendMeInstructions=By.xpath("//input[@type='submit']");
	
	
	public WebElement ForgotUserName()
	{
		return driver.findElement(forgotUserName);
	}
	
	public void SendMeInstructions()
	{
		 driver.findElement(sendMeInstructions).click();
	}
	
}
