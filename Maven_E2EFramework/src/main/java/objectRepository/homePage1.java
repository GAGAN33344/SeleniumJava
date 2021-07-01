package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage1 {

	 WebDriver driver;
	public homePage1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By login1=By.cssSelector("a[href*='sign_in']");// i will click on sign in link
	//now i will validate the features courses text on home page.
	private By title=By.xpath("//div[@class='container'] //div[@class='text-center']");
	private By Interviewtitle= By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[@class='active']/following-sibling::li[3]");// i will find the 
	//location of element by using sibling xpath
	//li[@id=’tablelist1-tab2’]/following-sibling::li[2]
	private By Blogtitle= By.xpath("//ul[@class='nav navbar-nav navbar-right']//li[@class='active']/following-sibling::li[5]");
    private By popup= By.xpath("//button[text()='NO THANKS']");
	
	public WebElement getlogin1()
	{
		return driver.findElement(login1);
	}
	
	public String validateTitleText()
	{
		return driver.findElement(title).getText();// this will return the string type value.
	}
	
	public WebElement ValidateInterviewText()
	{
		 return driver.findElement(Interviewtitle);
	}
	
	public WebElement ValidateBlogText()
	{
		 return driver.findElement(Blogtitle);
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
