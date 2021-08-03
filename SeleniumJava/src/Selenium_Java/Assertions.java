package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

/* About assertions-- it help us to validate the expected results, example if we are 
  looking our expected result would be 6 based on our coding but it comes 4, in assertions,
  we will put like result should be 6,it will match the result with expected result,if
  its not match with 6 then it gives failure report otherwise gives success.
  * when we put the assertions,we expect the result according to assertion,if condition is 
   not successful, then test will fail on that point and will not execute further.
  * we use the assertions in testNG framework, because this feature is given by testNG,
   so first i have to install the testNG.
 */
public class Assertions {


	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		/*first I will put the assertion according to my expectation, i expect in below 
		 line of code checkbox will not select, so my condition is false.if condition
		 will false according to my expectation,then code will further execute otherwise
		 further codes will not execute and got a failure test*/
		Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
				
	 	 //Now I will click on Senior citizen checkbox
			 driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
				
				//After clicking i would expect checkbox would be selected.
		 Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());

		//Now I will check how many checkboxes are present in this webpage,so i will use findelements
		 //and i will use assertion , here i expect, answer should be 8 also actal condition
		 //will also give 6 output,so test will fail.
		// Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(),"8");
		 
		 
		driver.close();
		
		
	}

}
