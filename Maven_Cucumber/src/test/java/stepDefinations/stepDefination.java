package stepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/* i generated all below methods with the help of Tidy Gherkin chrome app.
 * 
 */

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    //code to navigate netbanking landing page
    	System.out.println("I successfully landed on Netbanking login page");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
       //code to write username and password and submit
    	System.out.println("I successfully fill the credentials and click on submit button");
    }
    
    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
       System.out.println("Username is " + strArg1);
       System.out.println("Password is " +strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
      //home page validation
    	System.out.println("Successfully opened the home page");
    }

    @And("^cards Displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
       System.out.println("Cards are Dispalyed = " + strArg1);
    }


   
}