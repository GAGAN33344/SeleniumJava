package qaclickacademy;


/* Maven-- Apache Maven is software project management and build management tool for
   java frameworks.
   it provides the central repository to get dependencies. 
   it maintain common structure across the organization.
   it provides flexibility in integration with CI tools.
   Easy plug-in for test framework execution.
   
   All jars are available in maven repository
   when we build our project with maven configuration,then we don't need to provide any
   jars for our project,so automatically maven project which we build will connect to maven
   website and look for the jars which we need for our project and download them and place
   it in project build path.all this process is done by maven itself,
   
   how maven knows which version jars are need to project-- for this problem, all types
   of jars are available on maven repository, we will just get every jar version xml dependencies
   from maven repository and place in POM.xml in maven, then maven will read this dependency
   and find the jar version,then go to maven repository and download that particular jar version
    based on dependency information.
   if we want to update our jars, just update the version, that mention in every 
   jar dependency xml tag. 
   
   It maintain common structure across the organization.
   means--In a company, have multiple teams work on multiple frameworks, each team define
   their framework in different folders, different structures, some maintains folder and
   packages for test data, some don't maintain the folder for test data and some teams break
   the the test case into multiple packages, by this way there is no consistency.
   
   To bring the consistency across all the organization, maven help us to give the common
   structure, it suggest some templates to us, like for Test Project it suggest one template
   for java development project, it suggest one more template. so simply we can convert our
   project using maven and get the template and introduce all our test cases according to 
   that template and inject our code on those template. 
   
   In Maven structure, there are two folders, main and test
   In main folder-- we can define test data which we need to run in test also define
   some utilities like reusable methods which we want into the test and some page object.
   In test folder--we write the test and execute it.
   
   Maven Terminologies-- 
   GroupID, ArtifactID, archetype:generate
   
   GroupID-- this will identify the project uniquely across all the projects, Maven will
   uniquely identify selenium project with the help of GroupID, which is given in
   dependencies, because there are lots of projects that are related to selenium are available
   in maven repository.with GroupID, because its unique, maven can easily get selenium jars with
   related this GroupID.	
   
   ArtifactID-- An artifact is a file, usually a jar that gets deployed to a maven repository.
   also known as sub-project of the GroupID.
   
   xml tag like
   <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>
    
   archetype:generate-- Generates a new project from an archetype, this is the command
   that helps to create a new project.	  
   first when we create  maven project, it gives dummy skeleton-- means structure
   also its up to us, which template we want to use, because maven give multiple template
   out of that template it have. first we have to download that template which is recommended by
   our company for project.
   
   we usually use below command for create a new maven project through command prompt.
   first we have to go the loaction where maven is installed. then give command.
   
   mvn archetype:generate -DgroupId=qaclickacademy -DartifactId=Maven_Java 
   -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
   
   mvn archetype:generate-- is the command that helps to create a new project.	  
   -D-- means type of parameter
   -DgroupId-- know that
   -DartifactId--know that
   -DarchetypeArtifactId=maven-archetype-quickstart-- this command is used for common template,
   which one is used by most of the companies for testing, below one is the common template.
       my-app
    |-- pom.xml
    `-- src
        |-- main
        |   `-- java
        |       `-- com
        |           `-- mycompany
        |               `-- app
        |                   `-- App.java
        `-- test
            `-- java
                `-- com
                    `-- mycompany
                        `-- app
                            `-- AppTest.java
   now i will put this command in terminal on mac after successfully install the maven.
   when press enter after putting this command on terminal, then project will create and
   automatically place /Users/GaGaNmAnn/ and project name Maven_java. 
   
   when we create a project, then POM.xml file will create automatically,
   pom.xml play a dominant role in maven project. all dependencies, whatever we need 
   for our project,we have to pass this xml file, because maven reads this xml document 
   and run the test cases.
   after creating the project through command prompt, we need to integrate with eclipse
   for write and run the project, for this we have to create one .class file, because 
   eclipse expect one .class path file in maven project to integrate with this project
   by default this .class path file is not present in maven project, so we have to create 
   this file, after that we can import our project into eclipse.  
   
   for creating this file, we will go to command prompt and go to Mavenjava project
   like cd Maven_java/ then enter and we will reach in Mavenjava folder, after that
   i will give one more command for creating the file, After inside the Mavenjava folder
   i will use mvn eclipse:eclipse and hit enter, after that it will create a .class path 
   file.
   After creating the file now i will import the project into eclipse.Then i will go to
   eclipse,file and import then maven folder and click on existing maven project and put the same 
   path in root directory, where your already created maven project is placed.   
                     
   ArtifactID is the project name and GroupID is the package name. 
   Now i will add dependencies in pom.xml according to my project from maven repository.
   I have to add maven Surefire plug-in in POM.xml because without it we can't
   execute our test case in maven project. This plug-in will help us to execute all
   the test cases which are present in test folder.   
                      
   now i will use three important commands on terminal for run the test case like:
   Clean, Compile, Test
   
   first i will go to particular project path on terminal, then execute these commands. 
   Clean-- Clean the project and delete all the temporary files, previous references and 
   builds like clean the project from project level.command is-- mvn clean
   
   Compile-- This command helps to find out the compilation error like Syntax error.
   
   Test-- This command will actually trigger the test case execution, when we hit this
   command then first it will find all dependencies in .m2 repository in our local system,
   then if it is not find, it will connect to maven repository site and bring down
   all the jars according to the project requirement. 
   if we want execute some tests instead of all then will use testng.xml file. for doing 
   this first i will create testng.xml file and add some classes&tests which we want
   to execute, then we configure testng.xml file into POM.xml in maven Surefire plug-in,
   In Surefire plug-in, there is one configuration tag, under that tag i will pass my
   testng.xml suite file. when we will execute the POM.xml file then first it reads the
   testng.xml file and execute the test case according to testng.xml file.
   
   Examples we have 3 classes in test folder and each class have some test case, requirement
   is I want to execute only one class, then we have a command by this way we can execute
   only that particular class. Command is-- mvn -Dtest=classname test. No matter we
   provide testng.xml file in Surefire Plug-in.
   
   if we have two testng.xml files like assume that one have only 10 test case for 
   smoke and other one have some test case for regression, then i have to build profiles
   in POM.xml file,there we can mention both testng.xml file in profile keyword separately.
   after that we can run particular profile which we want to execute, then we will use the command like 
   mvn test -PRegression(profile id name).
   
   One more thing we should keep in mind when we create a class name under package in maven
   test folder, then we should write test keyword at end of the every java class name like
   class name is-- AppiumTest, RestAPITest, SeleniumTest. if we don't put test keyword
   at end of the java class name and when we will execute all the tests, then maven will
   skip that class.                        
   Maven Surefire Reports--                        
                                                     
                            */
public class Maven_Theory {

}
