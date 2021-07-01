package Alpha;


/* Apache Log 4j-- is reliable, fast and flexible logging framework(API's) WRITTEN IN Java, which
is distributed under the Apache software license. which can be integrated with our 
Selenium framework and we can log our output.
* Now we use System.out.println() for see some output in console, if we want to see 
something in console output about all logging stuff, then we can use logging 4j API.
* When we use logs in our framework, and when we perform some actions, in the mean time,
if we got any error, with the help of logs, which one we mention in our test cases,
we can clearly understand the error is coming in which section by reading this logs. 
* when we perform some action, then we need to log about that action like I clicked
on button, I got the output.
* If we have 2 packages, one package have 30 test and other have 50 and client requirement
he needs only error logs from one package and all the logs from second package like
error log, successful log and many more, then how we can differentiate it. with the
help of system.out.println(), we cannot find out this is error log or successful log.
* Logs with TimeStamp-- like in package, one test case is failed , we can verify with the
help of TimeStamp log that the test is fail on which particular time like which minute
and second.
* Log file of last week-- Sometimes product are released for production, In production
phase, product getting some errors and it's not passed. on that particular situation,
client can ask from testing team, how did you automate in testing phase and show me log
report and i want to check it's passed or failed. on that time we can show the log report
which generated last week.
* so we need Apache Log4j2 API jars for doing this everything. we need two jars for
simple project or two dependencies for Maven project, dependencies or jar names are
log4j-core or log4j-api.
* Before using the log jars we need to create a object of LogManager.getLogger()
LogManager is the API and getLogger is the function. 
private static Logger log = LogManager.getLogger(Demo.class.getName()); this is the common
step, when we use logs.
* with the help of object we can access lots of methods, all methods print the output.also
it tells us, we need which type of log message like debug, error, success and fatal message.
* we need one configuration file to control all the logs, this file plays the vital role
for logs,if we will not setup and configuration file, then default configuration only
show error logs only. Based on configuration file, all the logs first read this file and 
whatever the information we pass on this file, based upon that these logs will act.
there are two main tags in configuration file like Appenders and Loggers.
* Where to log?--create xml configuration file on project level, there are two ways of
logging, we can simple log in the console window or we can log the entire text messages
into Separate file. where to log information we have to provide in configuration file,
under the appenders tag.if we mention console under the appender tag, then logs output
will be print on console, if we give file name, then output will store in that separate file.
How to log--when we see log output on console window, there is some text before actual message,that
text is the format like how text message should be printed in console.whcih include date,
minutes, hours,seconds and then class name.so this is the pattern where asking to pre-fix
the console log message.
what to log-- this is done under Logger section.under the Logger tag in configuration
file, there is one root level tag,when we mention in root level, then it's applicable 
to entire project, if we mention error in root level tag, then we will see only error
logs in console or in file.if want to print the all logs like error logs, success logs,
info logs and many more, then we have to pass trace keyword in root level.
* Create a xml Configuration file-- just create a new Resource folder on package level, under that folder, i will
create a new xml file.in which xml file i will paste the basic configuration information,
which one i copy from Apache Log4j2 site. After creating the resource folder,
then right click on project, click on configure build path, then click on source folder,
under that source folder,then click on add folder,then click on this resource folder.
so i need to add this folder in build path of project.
* If client require only error log messages from one package and all log messages from 
other package, what will we do, in this situation, now i will in configuration file, under
the logger tag, one logger name is available.in this logger name i will pass the
package and class name which required only errors and also pass level value is error, then
this class of particular package will show only error logs.
* If we want our log output in separate file, then we have to make some changes in
configuration file under appenders tag.
<RollingFile name="File" fileName="${basePath}/prints.log" filePattern="${basePath}/prints-%d{yyyy-MM-dd}.log">
<PatternLayout pattern="%d{HH:mm:ss:SSS} [%t] %-5level %logger{36} - %msg%n"/>
<SizeBasedTriggeringPolicy size="500" />
</RollingFile>
For creating the file, first i will create a folder on project level, under that folder,i will create 
text file. and give the path of that file in configuration file under filename.
* I will add one more tag properties in configuration file before the appenders tag.
<Properties>
    <Property name="basePath">./Logs</Property>
    </Properties>
when we pass the property name, then control will automatically comes project level.
then i will pass the location of Logs folder under property name.
* when we will run our script through maven command on terminal, if we want to run our
Log4j configuration file through maven, then we have to pass this log4j file in 
POM xml file.
we have to use below syntex
<build>

<resources>
<resource>
        <directory>src/main/resources</directory>
        <filtering>true</filtering>
      </resource>
      </resources>
      
      </build>
      
      
      
      
*/




public class Log4J_Theory {

}
