package Selenium_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* In this class first i will go to table and find the runs of each player from 
   table Scoreboard also total and matches with total with batsman runs.
 */

public class tablesDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","//Users/GaGaNmAnn//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		int sum =0;
		driver.get("https://www.espncricinfo.com/series/19322/scorecard/1187686/new-zealand-vs-india-2nd-test-india-in-new-zealand-2019-20");

		//Now i will store the Table location in table WebElement
		WebElement table=driver.findElement(By.xpath("//div[@id='gp-inning-00']"));
		
		//Through table WebElement now i will check only element which are present in 
		//this Table.
		int rowcount=table.findElements(By.className("flex-row")).size();
		
		//Now i will reach the proper element whatever we need through below xpath.
	int count=table.findElements(By.xpath("//div[@id='gp-inning-00'] //div[@class='flex-row'] //div[@class='wrap batsmen']/div[3]")).size();
		
		for(int i=0; i<count;i++)
		{
			System.out.println("batsman run is " +table.findElements(By.xpath("//div[@id='gp-inning-00'] //div[@class='flex-row'] //div[@class='wrap batsmen']/div[3]")).get(i).getText());
			
			//Now I want to sum all the values
			String value=table.findElements(By.xpath("//div[@id='gp-inning-00'] //div[@class='flex-row'] //div[@class='wrap batsmen']/div[3]")).get(i).getText();
			//Now i will change the value string into int, because we store integer value.
			int valueinteger=Integer.parseInt(value);//this line of code will change string to int
			sum = sum + valueinteger;
		}
		System.out.println("Sum is " +sum);
		
		//Now i will print whatever written in Extra and Total after the batsman name.
		//and add the extra value into sum.
		//System.out.println("Extra value is " +driver.findElement(By.xpath("//div[@id='gp-inning-00'] //div[text()='Extras']/following-sibling::div")).getText());
		//String extra = driver.findElement(By.xpath("//div[@id='gp-inning-00'] //div[text()='Extras']/following-sibling::div")).getText();
		//int extrainteger = Integer.parseInt(extra);
		//int TotalSumValue =sum + extrainteger;
		System.out.println("Total value is " +driver.findElement(By.xpath("//div[@id='gp-inning-00'] //div[text()='TOTAL']/following-sibling::div")).getText());
		//System.out.println("Sum is " +TotalSumValue);
		System.out.println("Sum is " +sum);
			
		
		//driver.close();
		
		
		
	}

}
