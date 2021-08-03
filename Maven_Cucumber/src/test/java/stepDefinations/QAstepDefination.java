package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class QAstepDefination{
	WebDriver driver;
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Browser Drivers\\chromedriver.exe");
   	 driver = new ChromeDriver();

	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@And("^Click on Login link in home page to land on secure sign in page$")
	public void click_on_Login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		driver.findElement(By.cssSelector("a[href*='sign_in']")).click();
    	

	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
        driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys(arg1);
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(arg2);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
		String output =driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
	       System.out.println(output);

	}


	
}