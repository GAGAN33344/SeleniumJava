package Academy;

/*Optimizing Framework--
 * How to parameterized Jenkins build with different browser execution ?
 --now my framework test cases is running on chrome and i want to run on firefox,then 
 i will go to properties file and change chrome to firefox then trigger the test cases,
 if we don't want to make any changes in framework, like we don't want to change browser
 type in my framework, then there is one more option where we can change browsertype
 without touching any framework file, we can do this with the help of jenkins, in jenkin
 there is one option build with parameter, overthere we can create a browsertype option,
 and change the browser type, where we can trigger our test cases. 
for doing this there are some steps:
step-1. first we should be able to send browser type parameters from maven commands instead
of writing in properties file.then i will give command like 
mvn test -Dbrowser=chrome, if i give this command, it means i want to run our all test cases,
but whereever we see browser parameter, then set that browser name=chrome. 
how we can extract the browser value, in that case maven basically treats all these properties
as a system properties , we can write like this--
String browserName=System.getProperty("browser");

if we give mvn test -Dbrowser=chrome, then all the test cases will trigger on chrome browser.
if we give mvn test -Dbrowser=firefox, then all the test cases will trigger on firefox browser.
 Now i will create browsertype option in jenkins.
 first go to jenkins, inside it, go to project where we want to set browser type option,
 after click on jenkins project, click on project configuration.
 here top left side there is one general tab, under this tab, one option is present
 like THIS PROJECT IS PARAMETERIZED, click the checkbox of this option,then add parameters,
 then click on choice parameter,in this choice paramter, under name box ,fill parameter
 type, under choices box, fill parameter values like chrome,firefox and what we need. 
 after that we can see build option change build now to build with parameters.click on
 that and we can use any type of browser, which one we set.
 for example i want to run our test cases on firefox, first i will click on firefox in
 browsertype option and change the maven command in jenkin project configuration from
 test to test -Dbrowser="$browser".
 
 *Coding Standards--Private Locators-Public methods-Achieving Encapsulation OOps principle
 in Framework.
 we can achieve Encapsulation in page object class in our selenium framework, for achieving 
 this,we have to kept data and variables are private and make their accessible methods 
 are public to hide the data implementation.

*Remove Hard coded paths from everywhere in the project.
from get rid this problem, we will use command like
System.out.println("user.dir")-- this will print the current project path

*Achieve chrome headless Execution Mechanism.
Headless execution mechanism means-- when we run our test cases, browser will not get 
open, we will not see the browser open but still all the test will run with the chrome
binary without opening the browser.
how we can do that ?
firstly create a ChromeOptions class object, this class will help us to give many options,
which we can inject in this chrome driver and tell the behavior of headless.
Syntex is-- ChromeOptions options = new ChromeOptions();
options.addArguments("headless");
so options object i will pass in ChromeDriver argument.
WebDriver driver = new ChromeDriver(options);
now driver have a knowledge of options object and that object pass the argument of headless
browser.
one thing should keep in mind, when running headless, make sure we have latest selenium 
version.
also we can add this chromeheadless browser parameters in browser type option in in jenkins.

*How inheritance is achieved in Framework and How we can implement interfaces in framework also
how can driver be static without initializing it for every test?
Static driver--- when we declare any variable as static, for example in our baseClass, if 
we declare WebDriver driver as static, so that means if multiple test cases are accessing
this driver variable, then it will not create  new object, it will share the existing 
driver variable copy only, if we marked the variable as static, so that object will be
shared across all the test cases, so no new copy is created, one common driver variable 
only will be shared, so if second test case want to use that, that test case will override
existing driver object.but it will not create new one, if we go with static keyword.if
we are running our test case in sequential mode, then its fine, because at one time, only
one test case will use that driver object.but in ovverridden time, test will fail.

But there is one beauty in our framework, no matter we use static or not,our test will
not fail in parallel mode.
normal when we run our test case in parallel mode, then baseclass static  driver is override
in each test case classes and our script will fail, for get rid from this problem, 
 we will create one local variable driver in each test case class and that local driver 
 will assigning the driver which we got from baseClass to our local driver.then this
 local declare driver is taking care of execution because we given the knowledge of real
 driver which we got from baseClass to local driver.

Conclusion is --- if we want to run our test cases in sequential mode, then static 
keyword is advantages to have less memory on heap space, however if we are running our 
test cases in parallel mode, then we can cannot use static keyword because we might run 
into nullpointerexception, so we have to use without static, but if we have static in 
parallel mode execution, then we have to declare same variable in each test case class 
as local.

*Best Approach to how to consolidate the test cases into different classes.
when we work on framework, then we should keep some point in mind.
1. all the object that belongs to one page, should be write in one class like follow
the page object modal, and placed in object repository package.
2.write all the tests that belongs to same page,for that we should have create one class
for all the test cases.by this way browser will open and close only one time.
3.in testng.xml file, all the test cases that belongs to same module, we have to place
under test tag. 
 













*/


public class Theory {

}
