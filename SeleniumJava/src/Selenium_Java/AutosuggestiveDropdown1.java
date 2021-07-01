package Selenium_Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/* in this class i will validate that when i put only 3 words like DEL or whatever in 
   search box,then related option would appear or not or validate.
 * One selenium disadvantage is that it don't extract the print the hidden values through
   getText(); method or any one methods.
 * so if we want to print the hidden value then we have to use javaScript executer.it can
   extract the hidden elements as well.the name of this concept is javaScript HTML DOM.    
   with this assistance we can extract hidden elements from webPage.
 */

public class AutosuggestiveDropdown1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		      driver.findElement(By.cssSelector("input[id='gosuggest_inputSrc']")).click();
                    driver.findElement(By.cssSelector("input[id='gosuggest_inputSrc']")).sendKeys("DEL");
                   Thread.sleep(2000L);
                   driver.findElement(By.cssSelector("input[id='gosuggest_inputSrc']")).sendKeys(Keys.ARROW_DOWN);
                  
        //Now i want print the name of city which one is showing in from box.
        //so i will put the command, but after doing that no one output will show on console
        // because its a hidden text, getText() method will not extract the keywords.           
              System.out.println(driver.findElement(By.cssSelector("input[id='gosuggest_inputSrc']")).getText());
              
        //so we want to print that, then  we have to use javaScript DOM executer, because
        //selenium is not capable for extracting the hidden elements from DOM.
        // Hidden elements on DOM and we can't extract through selenium also know as
              // (aJax implementation)
         //How we can find out the hidden elements, we can investigate the properties of
         //finding element on DOM, and we can see overthere like hidden-accessible.
                   
         // Through javascriptExecutor we can achieve this problem   
              JavascriptExecutor js = (JavascriptExecutor)driver;
               String script = "return document.getElementById(\"gosuggest_inputSrc\").value";//
               //This line of code will ready my script
            //in javaScript, we use document instead of driver and return means it 
             //  will return the value like System.out.println() and .value is method
               //like getText().
              String TEXT =(String) js.executeScript(script);//this line of code will execute my script and 
                // get the text after that i will store that text in one string TEXT.
                System.out.println(TEXT) ;  
                
                while(!TEXT.contains("Escanaba (ESC)"))
                {
                	driver.findElement(By.cssSelector("input[id='gosuggest_inputSrc']")).sendKeys(Keys.ARROW_DOWN);
                	TEXT =(String) js.executeScript(script);
                	System.out.println(TEXT) ;
                	
                }      
	}

}
