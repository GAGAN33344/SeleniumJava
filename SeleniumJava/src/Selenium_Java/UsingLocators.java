package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

/*
 1.Every Object(Element) have not ID,Name or ClassName, so we should use Xpath and Css locator
 should be prefer for finding the elements.
 2.Alpha Numeric ID may vary on every refresh, 
 3.Confirm the linkText element with anchor "a" tag. link means when we click on that, it will
 navigate to another page. link object always starts from anchor tag.
 4.In className locator, when we find any element through class name, then value of 
 class name should not have spaces like-- class- input r4 wide. we will get an error
 like compound class name not permitted.
 5.For Example we want to find two elements from the WebPage and Coincident both elements
 ID have same value like id-username, then Selenium will start scanning from the left
 side top of the page and go left to right, when it find first element value like
 id-username, then it will perform action against that element.
 
 
 */


public class UsingLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.yahoo.com/");
				
		System.out.println("Browser Successfully Launch");

		driver.findElement(By.id("mega-banner-close")).click();//By using id locator
		driver.findElement(By.id("header-signin-link")).click();//By using id locator
	    driver.findElement(By.className("phone-no")).sendKeys("1234567890");//By using  className locator
		driver.findElement(By.name("signin")).click();//By using name loactor
		driver.findElement(By.linkText("Forgot username?")).click();//By using linkText locator
		driver.navigate().back();
	    
		driver.close();
		System.out.println("Script Pass");

	}

}
