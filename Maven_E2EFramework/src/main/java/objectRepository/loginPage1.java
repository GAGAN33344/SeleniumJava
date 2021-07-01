package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage1 {

	 WebDriver driver;
	public loginPage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//input[@id='user_email']")
	WebElement username;
	
	 @FindBy(id="user_password")
	WebElement password;
	
	 @FindBy(name="commit")
	WebElement submitbtn;
	
	 private By forgotPassword=By.cssSelector("a[href*='password/new']");
	
	public WebElement userName()
	{
		return username;
	}
	
	public WebElement passWord()
	{
		return password;
	}
	
	public WebElement submitBtn()
	{
		return submitbtn;
	}
	
	public Forgot_Password ForgotPassword()
	{
		driver.findElement(forgotPassword).click();
		Forgot_Password fp = new Forgot_Password(driver);
		return fp;
	}	
	
	
	
	
	
	
}
