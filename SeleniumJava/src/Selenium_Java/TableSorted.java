package Selenium_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


/* In this Class-- How to check the column values in the table are sorted or not. 
 * Verify the column which should be one time ascending order and one time descending order
 * I will make a plan
 * 1. I will retrieve all values of Veg/fruit name Column
 * 2.Push the values into arraylist as same manner which i show on table, it will be like
   12345.
 *3. I will create new Arraylist2 and same values putt into this arraylist2 like as
    ealier arraylist and sort, after that we get new Arraylist2 with sorted.then comapre
    Both arraylist will not be same, because sorted arraylist2 will be in alphabetic
    wise, and by default list in not alphabetic wise.
 *
 */
public class TableSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","//Users//GaGaNmAnn//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Now i will click on two times on Veg/fruit name column,after that column
		//would be in sorted manner, now if we compare the two list our test is pass.
		//without click on this column two times,by default this column is not in
		//sorted manner,definitely test will fail.so try to test without clicking on
		//this column.
		 driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		 driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		
		 List<WebElement> firstcollist = driver.findElements(By.xpath("//tbody //tr //td[2]"));//This
		 //line of code give me a list of elements that one we store in firstcollist.
		
		 ArrayList<String> originallist = new ArrayList<String>();
		for(int i=0; i<firstcollist.size();i++)
		{
			System.out.println("FirstColumList values are " +firstcollist.get(i).getText());
			originallist.add(firstcollist.get(i).getText());//this line of code will
			//add same elements in originallist which one is present in firstcollist
		}
		System.out.println("OriginaList values are " +originallist);
		
		ArrayList<String> copiedlist = new ArrayList<String>();

		for(int i=0;i<originallist.size();i++)
		{
			copiedlist.add(originallist.get(i));
			
		}
		System.out.println("Copiedlist values are " +originallist);
		
		Collections.sort(copiedlist);//this is the sorted method for list like in ascending order.
		//Collections.reverse(copiedlist);//this is the sorted method for list like in descending order.
		System.out.println("CopiedList after sorted values are " +copiedlist);//this will print the whole thing which is present
		//in copiedlist
		//Now i want to check print each value which is present in copies list
		//so i will iterate by using Enhanced advanced loop
		
		for(String s: copiedlist)
		{
			System.out.println("CopiedList after sorted value is through iterating " +s);
		}
		
		//Now i will compare two arraylists
		if(originallist.equals(copiedlist))
				{
			System.out.println("Script is Pass");
				}
		else
		{
			System.out.println("Script is Fail");
				}
		
		//one more method for comparing the two list
		Assert.assertTrue(originallist.equals(copiedlist));//this line of code fail
		//the test because assertion is true but condition is false,because both lists 
		//are not in same manner.
		
		System.out.println("By this way we can validate the default list in sorted or not");

	}
	
}
