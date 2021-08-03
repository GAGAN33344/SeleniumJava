package Cucumber;

/* Part-1. Understand the importance of Behavior Driven Development.
 cucumber is commonly used tool for all behavior driven development approaches.
 
 Behavior Driven Development is one of the approach which popularly used in agile projects.
 The aim of Behavior Driven Development approach is to provide a common standard template
 behavior among across the client, Business Analyst, Developers and testers, provide a 
 template in common language among all the peoples so all of them can understood the methods and 
 terminologies which would be used in the project, by this way all the peoples get rid
 from misconceptions. so that's why this approach is used by most of the companies for
 clarifications. after that every guy have own responsibilities to describe our project
 according to that template.
 --TestCases Specifications in Behavior Driven Development
 Step-1. TestCases should be defined in a Business level by following ubiquitous language.
 Ubiquitous language is a semi-formal language that is shared by all members of a software
 development team-both software developers and non-technical personal.
 Syntex: 
 In order to(Achieve Something)-> Business outcome
  As a (Role)
  I want to do this
  
 Achieve something means-- add one functionality in our project--Example-- I want to add
 one friend in my facebook list.
 Business Outcome means-- output-- like i successfully added one friend in my facebook list.
 Role means-- if we treat facebook, as a owner of the account, in order to add	a friend 
 to my friend list
 do this means--this is the one which developers wants to focus.
 after that as a tester we have to make sure that developers are do this, check do this
 is done properly so that are we able to achieve by do this. that we need to test.
 so everything is comes under single template.
 
 Example with syntex:
 In order to Pay credit card payment
 As a NetBanking sole owner who have credit card section acess
 I want to Navigate to credit card section, Enter amount and process my payment
 Using this scenario template, product owner writes this and developers use this scenario
 to develop and tester use this scenario to write test cases.
  
 Step-2. It's time to decide what test cases are sufficient to certify Business Scenario 
 working.
 Syntex for Writing TestCases:
 Given(What you need to have to perform action),--Prerequisites
 When(Perform action)- Action
 Then(The desired outcome for the user)--Validation
 
 also we can derive different test case from one given scenario.
 one negative test case with Example:
 Given: An Account with zero balance
 When: I navigate to credit card payment section, enter amount and click on submit.
 Then: It should throw an error- insufficient funds.
 
 one more test case
 Given: An Account with sufficient balance but who does have credit card
 When: I navigate to credit card payment section, enter amount and click on submit.
 Then: It should throw an error- you don't have to access.
 
 one more test case
 Given: An Account with sufficient balance and also access the credit card.
 When: I navigate to credit card payment section, amount box is empty and click on submit.
 Then: It should throw an error- please fill the amount.
 
 by this way we can derive lots of test cases from one scenario.
 
 Advantages:
 This can be used as standard template where all QA can stick to one common standard of
 defining TestCases.
 Each Scenario reflect a Business Value.
 We can estimate the test coverage happened for each business outcome by going through
 Test cases.
 We can tag these annotations to Selenium annotations and execute the Business
 TestCases.
 Common Standardized TestCase template for both manual and automation testing.
 
 * Part-2. Cucumber Framework Architecture and its core functionalities.
 
 
 What we need for cucumber installation and further steps.
 * Java Download
 * Set System Variables path
 * download Eclipse with java development
 * download Natural plug-in
 * cucumber project skeleton can be obtained by Maven.
 * cucumber supports maven-archetype-quickstart template.
 * POM.xml document needs all the jars information which is required to our project.
 * need two jars for cucumber project -- cucumber-java and cucumber-junit.
 * Three key and core parts in cucumber framework are--
   Feature file
   StepDefination file
   junit Test Runner
 *StepDefination file matched with TagName and description 
 *There should be one mapping implementation for each gherkin line
 *Regular expression for different data but same implementation.
 *
 *  
 
 Before we start a project, we need to install one plug-in to eclipse to support the
 Gherkin language, so when we write test cases in Gherkin language, so there is plug-in
 with eclipse, where it will highlight the syntex of gherkin what we write and it basically
 like that particular plug-in will support all gherkin test cases.
 the plug-in name is natural plug-in. we can download this plu-in from eclipse market palce.
  i search it and download Natural 0.7.6
  
  For creating the cucumber project, we don't create  a simple java project, because
  cucumber expects the standardized skeleton to write cucumber test cases. it has to be
  written in one format where exactly cucumber can understand and process it accordingly.
  one good thing is there is maven, build management tool which gives skeleton of cucumber.
  so we need maven for creating a skeleton for cucumber project. 
  Cucumber skeleton gives a structure.	
  now i will create a project with maven with cucumber skeleton.
  then maven gives us lots of templates, so we will select 
  maven-archetype-quickstart template because cucumber supports this template.
  
  now i configure the cucumber jars in pom.xml file. For cucumber we need two jars,one 
  is cucumber-java and other one is cucumber-junit.
  
  Three important terminologies we need to know when we want start working on cucumber
  automation, 
  1. Feature file-- all the features which needed to test the application will go inside
  in this feature file. so same file which we were discussed will be used to automate as 
  well, so basically automate that file only. all the scenario's we write in feature file
  in simple language--in feature file we define all the test cases what need to be 
  automated.
  example--
  In order to Pay credit card payment
 As a NetBanking sole owner who have credit card section acess
 I want to Navigate to credit card section, Enter amount and process my payment
 Using this scenario template, product owner writes this and developers use this scenario
 to develop and tester use this scenario to write test cases.
 
 by using syntex for writing TestCases--
 Given(What you need to have to perform action),--Prerequisites
 When(Perform action)- Action
 Then(The desired outcome for the user)--Validation
 
 2. StepDefination file-- so for every step we define in scenario should be mapped with
 related automation code,all the codes related to scenario like which are mention in
 When and then will be implemented in StepDefination file.
 example--
 when i click on sign in button-- this i will mention in feature file, but automation
 code of this line will be implemented in StepDefination file and we provide mapping with
 click on sign in button scenario as a plane english language to the code to automate 
 that plane english language functionality. so all the automate thing will be part of
 StepDefination file.
 in simple language--how we can automate our test cases, we can see in StepDefination.
 
 3.Test Runner-- this basically trigger all the test cases, so each feature file is nothing
 but a test case, feature file have multiple scenarios, if we want to run feature file,
 so we have to automate everything whatever we provide in that feature file.
 so basically in the Test Runner, we can say that we provide information of our feature file 
 and also we will tell where exactly that code is located for this feature file. To run
 our test cases first Test Runner need the location where feature file is located, so
 we have to pass the path of feature file in test runner also Test runner needs the
 location of implementation code,which is related scenario. Based on the provided 
 information Test runner will find the related documents and it will help to execute to
 all them together.so all the jobs will be done by junit test runner.
 junit is the testing framework which helps us to connect the dotes and run feature file
 for that we will write a separate junit test runner class and their we will provide the 
 information ask to run test cases.
 
 so these three things provide a vital role in cucumber framework.
 
 now i will create feature file in eclipse
 i will create feature package under src/test/java folder.
 under the package i will create simple file.one thing keep in mind, when we create a
 file, the extention of that file should be .feature beacuse if we do that then eclipse
 will recognize that is feature file.
 In the feature file i will write different scenarios of application.
 
 i will create StepDefination package under src/test/java folder.
 Now i will create a package with StepDefination name also create one class under that
 package.
 now i will map stepDefination class code with feature file scenarios.
 below codes i will write in StepDefination class
 @Given("^write here feature file Given text$")
 public void same text name()
 {
 implemented code according to feature file Given text
 }
 
 @When("^write here feature file When text$")
 public void same text name()
 {
 implemented code according to feature file When text
 }
 
 @Then("^write here feature file Then text$")
 public void same text name()
 {
 implemented code according to feature file Then text
 }
 
 By this way we will map StepDefination class code with feature file TagName and
 description.
 
 There is one plug-in with chrome-- name Tidy Gherkin plug-in, we can add this
 plug-in chrome.
 Tidy Gherkin is an app which comes as chrome extension.
 now i will open Tidy Gherkin app and copy the feature file scenario from eclipse which one 
 we earlier write in eclipse and paste in Tidy Gherkin, and this will create automatically all 
 the methods related to feature file TagName and description and can copy all the automatically
 created methods from Tidy Gherkin and paste in Stepdefination class, by this way we
 don't need to write the methods manually according to feature file TagName and 
 description.
 
 
 now i create new package for test runner and class for test ruuner,
 first i will pass the parameters of feature file and StepDefination file where these
 are located, both files information i have to give in test runner class.
 CucumberOption annotation i will use for doing this.
 
 @RunWith(Cucumber.class)
 @CucumberOptions(
             features = "src/test/java/feature";
             glue="stepDefination")
 CucumberOptions is an annotation which actually takes two inputs, one is where's the 
  feature file is located and other one is glue--that is nothing but a parameter to define
  stepDefination file.
  
  if we will not write any code in StepDefination file according to gherkin plane text
  which is present in feature file and run the testrunner file, then we what will we see
  in console window, we will see like you can implement missing steps with the snippets below:
  down here we will see the coding with methods name according to gherkin plane text,
  which is present in feature file. so according to console output we can implement
  the codes in our StepDefination class.
  also if we miss any code in StepDefination class, then that missing step we will see
  in console window when we run our testrunner.
  by this way we can say we can achieve 100 percent test coverage in cucumber framework.
  
  * Importance of Regular Expression in features file
  if we have two test case scenario, in which,under the same tag with same functionality 
  but different parameters for example
  1st test case
  Scenario: Home Page default Login
  Given User is on Netbanking landing page
  When User login into application with username "Gagan" and password "1234"
  Then Home page is populated
  And cards are Displayed
  
  2nd test case
  Scenario: Home Page default Login
  Given User is on Netbanking landing page
  When User login into application with username "Mann" and password "3456"
  Then Home page is populated
  And cards are  not Displayed

 in this case we will pass the regular expression of same tag in method.
    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strAgr1, String strArg2)
    {
       System.out.println(strArg1);
       System.out.println(strArg2);
    }
    when we will run the test runner and when control comes in upper method, this 
    will pick the regular expression values(arguments) from feature file and paste it automatically.
    we don't need to fill the values of username and password manually.
    by this way we can use different parameters. regular expression accept any string.
    Regular expression for different data but same implementation.
    Arguments should match with regular expression caught values.
    
    *Part-3. Selenium integration with cucumber.
  
  Parameterization--
  if we are using multiple parameters in Gherkin feature file, there is one standard to
  write all the parameters in feature file.if we are using regular expression in our test 
  case scenario, then Scenario keyword should be change from Scenario to Scenario Outline.
  
  Feature: QAClickAcademy Application Login

Scenario Outline: Positive Test Validation Login
Given Initialize the browser with chromee
And Navigate to "http://www.qaclickacademy.com" sitee
And Click on Login link in home page to land on secure sign in pagee
When User enters <username> and <password> and logs inn
Then Verify that user is successfully logged inn

Examples:
|username				|password		|          for making spaces press tab
|gagan.mann@ymail.com	|Chahal@1988	| 
|gaganmann3334@gmail.com|123456 		|

now test will run two times with different set of data.

now i will integrate cucumber with TestNG and run through maven command or run throw jenkins
command.
TestRunner class always run through Junit library.
first i will create a new Testng xml file, and convert the testrunner classes into testng
runner and pass the TestRunner classes in that testng xml file and run it.
for converting this we need one integration dependency-- name is cucumber-testng,

cucumber-java, cucumber-junit and cucumber-testng version should be same.
and highlight the @RunWith(Cucumber.class) in testrunner class
and extends one file in testrunner class, file name AbstractTestNGCucumberTests.
now testrunner file convert into testng and we can run testrunner class from testng xml file.

  	
  
  
  
  
  
  
  
  
 */




public class Theory {

}
