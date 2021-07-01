package ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/* In this class i will use @FindBy annotation for finding the elements from webpage.
  in this annotation we don't need to write driver.findelement(By.) this whole thing is 
  taken by @FindBy annotation and i need to write one step in constructor like
  PageFactory.initElements(driver,this);
 */

public class Afterhomepage_PF {

	WebDriver driver;
	public Afterhomepage_PF(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//now i will click on price tag lowprice and high price then go
	@FindBy(id="lowprice")//for low price searchbox
	WebElement lowprice;
	@FindBy(id="highprice")//for high price searchbox
	WebElement highprice;
	@FindBy(className="pr_rangebtn")//go button
	WebElement Gobutton;
	
	public WebElement lowprice()
	{
		return lowprice;
	}
	
	public WebElement highprice()
	{
		return highprice;
	}
	
	public WebElement Gobutton()
	{
		return Gobutton;
	}
	
	
	
	
}
