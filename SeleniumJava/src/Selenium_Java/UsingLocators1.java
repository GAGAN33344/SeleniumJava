package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*6.We can generate own xPath and CssSelector. Browser tools also provide us some xPath and
   cssSelector but that are not 100% reliable.
 * How the browser tool give us xPath and cssSelector-- when we inspect the elements, then
  blue highlighted html code generate, then right click on that and the copy xPath and cssSlector.
 * one thing keep in mind, which we right click on blue highlighted html code and we
  want to copy cssSelector in chrome browser, we don't find any cssSelector overthere
  in chrome browser but in firefox we can find it.IN Chrome, we can find it in right 
  bottom side in toolbar.
 * xPath/cssSelector can be defined in N number of ways.
 * Double quotes inside double quotes are not accepted.
 * when we find a blue highlighted html code, which starts from anchor tag "a" and we right
 click on that for copy the xPath,then we find a very big xPath which starts from html,
 thats not reliable. so don't copy that xPath. this problem we got on firfox browser
 when we inspect that element, then we have to use Chrome browser.
 * we can direct find xPath and cssSelector in toolbar within help of firepath in firefox
 browser, but this is possible only, if we have firefox browser version less than 55.
 but we don't do because it's not a professional way.
 * if we want to validate the xPath and csslocator, then we can just copy the xPath or csslocator
 from highlighted html code and paste on bottom side of console window in toolbar.
 * for validating xPath--use $X("xPath") command and move your mouse on output of this code, this
 will reflect element which you earlier copy the xPath.
 * for validating cssLocator--use $("csslocator") command and move your mouse on output of this code, this
 will reflect element which you earlier copy the cssSelector.
 * Both $x("") or $("") commands work on chrome or firefox browser.
 * Custom xPath Syntex is //tagname[@attribute='value'], we can write custom xPath
 based on html, if we are not sure about tagname or keep on changing everytime, then
 we can use * instead of tagname--like //*[@attribute='value'].
 * Custom cssSelector Syntex is tagname[attribute='value'], we can write custom cssSelector
 based on html, if we are not sure about tagname or keep on changing everytime, then
 we can leave it empty instead of tagname--like [attribute='value'].
 There are two more Syntex for cssSelector
 tagname#idvalue-- this can be used if we have id attribute and we can use value of id attribute.
 tagname.classvalue--this can be used if we have class attribute and we can use value of class attribute.
 also we can skip tagname-- we can write #idvalue and .classvalue for upper syntexes.
 * Difference between absolute and relative xPath--
  Absolute xPath means--it contains the complete path from the root element to the desire element or 
  we can say each element traverse from parent to child(desire) element through nodes.
  Relative xPath means- This is not depend on parent, this is more like starting simply by 
  referencing the element you want and go from the particular location.
  we should have always use relative xPath beacuase if we get any architectural change in
  the website that change don't effect the testing or selecting the element.
  Relative xPath is known as Custome xPath.
  * cssSelector locator is 10 times faster than xPath and its Syntex is so simple.
 */


public class UsingLocators1 {	

	public static void main(String[] args) {
		
		
       System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("gagamann@ymail.com");//By
		//using xpath, which is given by browser tool
		driver.findElement(By.cssSelector("input#pass.inputtext.login_form_input_box")).sendKeys("1234");// By
		//using cssSelector, which is shown on bottom right side in toolbar.
		driver.findElement(By.cssSelector("#loginbutton")).click();// we can find this
		//#loginbutton text bottom right side in toolbar, when we inspect particular element
		//for cssSelector in chrome browser.
		
		System.out.println(driver.findElement(By.cssSelector("div._4rbf._53ij")).getText());//print
		//the error message which i got when we entered wrong id or password.
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@name='email']")).clear();//Custom
		//Xpath-- //tagname[@attribute='value']//clear the email text.
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Gaganpreet");//Custom
		//Xpath-- //tagname[@attribute='value']// first name value.
		
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Mann");//Custom
		//cssSelector-- tagname[attribute='value']// last name value.
		
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("987654321");//Custom
		//Xpath-- //tagname[@attribute='value']// mobile number
		
	   driver.findElement(By.cssSelector("input#u_0_w")).sendKeys("Mann");//Custom
		//cssSelector-- Tagname#idvalue Syntex// password
		
		System.out.println("Script Successfully Pass");
		
		//driver.close();
			
		
	}

}
