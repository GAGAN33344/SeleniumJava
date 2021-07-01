package stepDefinations;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectRepository.PortalHomePage;
import objectRepository.homePage1;
import objectRepository.loginPage1;
import resouces1.baseClass;

public class stepDefination extends baseClass {

	@Given("^Initialize the browser with chromee$")
	public void initialize_the_browser_with_chromee() throws Throwable {
		driver=initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" sitee$")
	public void navigate_to_sitee(String arg1) throws Throwable {
		driver.get(arg1);// I set this url value in properties file.
		
	}

	@Given("^Click on Login link in home page to land on secure sign in pagee$")
	public void click_on_Login_link_in_home_page_to_land_on_secure_sign_in_pagee() throws Throwable {
		homePage1 hp =new homePage1(driver);
		if(hp.PopUpSize()>0)
		{
			hp.getPopUp().click();
		}//this step will help to click on pop-up before clicking on login button,if we
		//will not use this step and pop-up comes before click on login button, then we will
		//get error like not clickable on element.	
		hp.getlogin1().click();
	   
	}

	 @When("^User enters (.+) and (.+) and logs inn$")
	    public void user_enters_and_and_logs_inn(String username, String password) throws Throwable  {
		loginPage1 lp = new loginPage1(driver);
		lp.userName().sendKeys(username);
		lp.passWord().sendKeys(password);
		lp.submitBtn().click();
		
	}

	@Then("^Verify that user is successfully logged inn$")
	public void verify_that_user_is_successfully_logged_inn() throws Throwable {
		//in this block of code i will validate search box is displayed or not
	     PortalHomePage php = new PortalHomePage(driver);
	     Assert.assertTrue(php.SearchBox().isDisplayed());
	 	
	}

    @And("^Close the browserr$")
    public void close_the_browserr() throws Throwable {
       driver.quit();
    }

	
	
}
