package qaclickacademy;

/* Jenkins-- This is the most important tool in software industry for development and
   testing.This is Continuous Integration/Continuous Delivery tool. this tool is developed
   for automation, with the help of this tool we can schedule a time for triggering 
   the test cases. here is zero percentage manual interversion.
   
   Example-- we have 500 test case, we know that we can execute all the test by single 
   shot by using Maven commands or by using testng.xml file.but we have to do some work
   manually like write the maven commands and hit enter. but we have a scenario, where
   test should be trigger automatically only without any manual intervension,
   I want to schedule a time for my test cases like my test case should be trigger
   at 2AM morning. for example my whole test script takes 5-6 hours to execute, it have
   thousands of test cases, i need when i reach office my script should be executed
   successfully and i just saw a results, in this type of scenario i have to schedule 
   a timing for my script.
   
   so now i will schedule this maven commands to jenkins and say run in the 2AM in the 
   morning, jenkin will simply trigger that command and automatically all the test cases
   will start executing on jenkins. 
   
   Jenkin run on its own server and we need to set java and maven version to it, so based
   upon the versions which will we set jenkin run all our test cases on that version.
   jenkin gives the stability if we have some version problem in our local system.
   
*  Download the Generic java package(.war) file, now i will open the terminal and give
   the command to start the jenkin server, just pass the path where .war is placed on
   terminal.command is--java -jar jenkins.war(file name) -httpPort=8080 or 9090
   tell the port number where we want start the jenkin server.
   after creating the username and password on jenkins, i will reach UI page of jenkins.
   IN manage jenkins on left side icon, we will click on it, after that we will land on 
   another page and will click on Global tool configuration, where we will give the 
   JDK JAVA_HOME path and MAVEN_HOME path
   
   Jenkins Workspace-- if we want create a new job,I have a Mavenjava project and i want
   to push that project into jenkins job and we want to trigger it from there, if we want
   jenkins to pick that either we can do from source code like GitHub,SVN  or if we want 
   to pick from local machine then first we have to place that project into jenkins home
   directory, then only jenkin will recognize that project. 
   
   Pick from local machine, first i will click on new item on left top side,Enter name,
   	and when we come down, there are some options like how we need project like from
   	GitHub, local folder and many more options. i will click on FreeStyle project, its common
   	thing, under that option i will provide all the information related my local maven
   	project, which is placed in eclipse.
   	
   	under this Freestyle project option, there are some options about how we need the 
   	project code like from GitHub, SVN or none.
   	if we want project test case code from local machine, then we click on advance, then
   	click on use Custome workspace. 
   	first i will copy whole project name folder from maven local system and paste 
   	this whole project on .jenkins home directory folder. if we place in .jenkins
   	folder, then automatically when we run our job jenkins comes in home directory folder
   	and checks the project.under use custome workspace options we will pass the path
   	where we place Mavenjava project in .jenkins folder.
   	
   	In Build Trigger option-- click on build periodically,we can schedule our test case
    execution like when we want to run the test case like 7AM or anytime.
    In Build Environment--lots of options are available for different purpose.
    In Build option-- we will pass the maven version which one we already add in 
    global configuration tool, also we will pass the command to start the test case
    execution under Involve top-level Maven targets.
    In Post Build Actions-- there are lots of options, like we can generate the testng 
    reports and many more.
    after that we can save it.
    our Maven_job is created after that i will execute it after click on build now.
    after building the build, we can see the reports to click on console output.
    
    we will see one file in maven project target folder, file name is testing-results.xml
    all our results basically in generated in xml file format, now testing have provided one 
    feature that if we pass this xml to testng, it will create a report for us in jenkins
    so testng came up with one plugin which can be integrated with jenkins to generate
    reports. with the help of this plug-in testng will expect this testng-results.xml
    report in jenkin.
    
    for this, first we will install that plug-in in jenkin, so i will go in manage jenkin
    in jenkin, then go to manage plug-in and search testng result plug-in and install it.
    After successfully installed the TestNG Results Plugin, we will go back to our job,
    click on configuration and going down to post bulid action, in that option, i will 
    click on Publish TestNG Results.
    
    after click on it, Maven project target folder testng-results.xml file will 
    automatically pop-up here.
    after that we will click on build now and we will see TestNG Results also TestNG Results
    Trend.	
    
    */

    
  

public class Jenkins_Theory {

}
