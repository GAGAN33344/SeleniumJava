package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","//Users//GaGaNmAnn//Desktop//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		//first I will check Checkbox is selected or not
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		
	 //Now I will click on Senior citizen checkbox
	 driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
		
		//After clicking i will check checkbox is selected successfully or not
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());

		
		//Now I will check how many checkboxes are present in this webpage,so i will use findelements
		 System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		driver.close();
		
	}

}
