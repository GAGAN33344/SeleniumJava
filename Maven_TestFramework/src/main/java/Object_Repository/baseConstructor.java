package Object_Repository;

import org.openqa.selenium.WebDriver;

import WayFairUtility.Base;

public class baseConstructor {

	
	WebDriver driver;
	public baseConstructor()
	{
		this.driver= Base.getDriver();
	}
	
	
	
	
}
