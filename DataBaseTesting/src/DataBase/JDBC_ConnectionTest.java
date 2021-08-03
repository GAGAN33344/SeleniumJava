package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JDBC_ConnectionTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host= "localhost";
		String port="3306";
		 String Username=null;
		 String Password=null ;
		 
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port +"/Account?serverTimezone=UTC","root","Chahal@1988");//this
		//line of code connect java programming with MySql Database with the help of host
		//and port number with .getConnection method.
		
		Statement s=con.createStatement();//this line of code will help to make a road(path) to
		//go from here to database destination.
		//now i want to execute queries on that statement so that this queries travel to 
		//database and hit that database and get the values. i will do this with the
		//help of s object.
		
	   ResultSet rs=s.executeQuery("select * from Credentials where Scenario='Outstbalancecard'");//this
	    //line of code will get the values from Account database and store in resultset.
	    //now rs object store all the values from Account database where Scenario is Outstbalancecard. 
		//by default rs object will store the value in zeroth index.
	   
	   while(rs.next())//this line of code will help to go from base index to first index.
	   {
	   //now i will get the firstname value from rs object.
	   System.out.println(rs.getString("FirstName"));
	    Username = rs.getString("FirstName");
	 //now i will get the lastname value from rs object.
	   System.out.println(rs.getString("LastName"));
	    Password = rs.getString("LastName");
	 //now i will get the location value from rs object.
	   System.out.println(rs.getString("Location"));
		  
	   }
	   
	   
	   System.setProperty("webdriver.chrome.driver","D:\\Browser Drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://login.salesforce.com/");
	   
	   //now i will pass FirstName and LastName value from database to salesforce login
	   //in username and password boxes.
	   
	   driver.findElement(By.cssSelector("input[id='username']")).sendKeys(Username);
	   driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);
	   driver.findElement(By.cssSelector("input[id='Login']")).click();
	   
	   
		
	}

}
