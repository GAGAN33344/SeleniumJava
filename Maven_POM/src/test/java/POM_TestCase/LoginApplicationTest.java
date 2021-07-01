package POM_TestCase;


import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ObjectRepository.Afterhomepage_PF;
import ObjectRepository.Homepage;
import ObjectRepository.Loginpage1;

public class LoginApplicationTest {

	@Test
	public void rediff()
	{
		
		System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Now i will create the object of homepage class from object repository package,
		//because i want to call the objects that are present in homepage class.
		Homepage hp = new Homepage(driver);
		hp.signin();
		
		//Now i will create the object of Loginpage class from object repository package,
	    //because i want to call the methods (objects) that are present in Loginpage class.
		Loginpage1 lp =new Loginpage1(driver);
		lp.EmailId().sendKeys("Gagan.mann@ymail.com");// this EmailId method will return WebElement value
		lp.Password();//this Password method will return whatever we write in block of code.
		lp.SIGNIN();//this SIGNIN method will return whatever we write in block of code.
		lp.Clickonrediff().click();
		
		//now again i will navigate to home page.
		hp.searchbox();
		hp.ClickonSearchbox().click();
		
		//Now i will create the object of AfterHomePage class from object repository package,
	    //because i want to call the methods (objects) that are present in AfterHomePage class.
		//now i will navigate to other page after click on search box.
		Afterhomepage_PF ahp = new Afterhomepage_PF(driver);
		ahp.lowprice().sendKeys("800");
		ahp.highprice().sendKeys("1500");
		ahp.Gobutton().click();
		
		driver.close();
	
	}
	
	
	
	
}