package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* one more concept is regular expression, sometime when we inspect element and we find
 only one attribute value that value subtext sometimes keep on changing, its not a 
 exact value on everytime like--first time is username123--secondtime username345--
 third time-- username678, in this case we can use xPath and cssSelector regular expression syntex,
 * For xPpath-- //tagName[contains(@attribute,'value')]
 * For cssSelector-- tagName[attribute*='value']
 
 */
public class UsingLoactors2 {	

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		
		//driver.findElement(By.className("signin")).click();// using className Locator
		      //or
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();// By
		//Using CssSelector regular expression.
		
		driver.findElement(By.cssSelector("input#login1")).sendKeys("hello");//By
		//using Custom cssSelector Syntex-- tagName#idvalue
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");//By
		//using custom xPath--Syntex--//tagName[@attribute='value'].
		
		driver.findElement(By.cssSelector("input.signinbtn")).click();//By
		//Using Custom cssSelector--Syntex--tagNam.ClassValue.
		
		System.out.println(driver.findElement(By.cssSelector("div#div_login_error.div_login_error")).getText());//By
		//Using Custom cssSelector//print the error code.
		
		driver.findElement(By.linkText("Forgot Password?")).click();//By
		//using linkText.//click on forgot password.
		
		driver.findElement(By.id("txtlogin")).sendKeys("Hey");//By
		//Using id//fill the emailid.
		
		driver.findElement(By.className("rTextfield")).clear();//By
		//Using className.//clear the emailid.
		
		//driver.navigate().back();
		
		//System.out.println("Script Successfully Compiled");
		
		//driver.close();
		
		

	}

}
