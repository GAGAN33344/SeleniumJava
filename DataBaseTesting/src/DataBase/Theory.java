package DataBase;

/* Selenium/Appium scripting with database validation
 whole process is--
 1. Download MySQL
 2.Creating database and tables
 3.JDBC connection with java programming
 4. Selenium/Appium integration with JDBC Code
 5. Retrieving data from database and executing with Selenium/Appum
 
 After successfully download the MySql, click on that and open it, and click on start 
 MySql server, it means MySql server instance is running, now i will connect to server 
 by using some clients, there are two ways to connect the server to database, one is 
 by using the terminal and other one is by using MySql workbench to connect with server.
 if we want to use MySql workbench, then we have to download from MySql site and 
 downloading and installing it.
 if we want to connect with MySql server through terminal, then first we have to set the 
 MySql path in .bash profile, like export PATH=${PATH}:/usr/local/mysql/bin/
  after creating the path, i will give another command like
 mysql -u root -p, by using this command we can connect with Sql server. after write this
 command, hit enter, then enter the password which one we set during installation time.
 we can change the password by using this command on terminnal like
 ALTER USE 'root'@'localhost' IDENTIFIED BY 'newpassword';
 now i will give the command to see the default database in MySql server.
 show databases; hit enter, now you will see default database
 if we want to use any database from default database, then we have to give the command 
 like-- use databasename; and hit enter, now i will enter the particular database,
 now i will give the command to see the tables in that particular database--command is
 show tables;
 By this way we can interact the database by using terminal.
 
  other-way by using MySql workbench
  now i will create database on MySql Workbench editor with the help of queries.
  create database, table and insert some values into table.
  
  Now integration of Database with Eclipse with JDBC API
  JDBC means--Java Database Connectivity (JDBC) is an application programming interface
  (API) for the programming language Java, which defines how a client may access a database.
  JBDC connection with java programming.
  so now we have to download JDBC jar and configure in our project.
  jar name is-- mysql-connector-java jar
  
  now i will create a class and i will use one line of code which helps to connect our
  java programming with MySql database
  the line is---- DriverManager.getConnection(url, user, password);
  Connection url is -- "jdbc:mysql://"+host+":"+port+"/databasename";
  port means-- at what port this database is running in your machine, it will be by default 
  3306,
  host means-- at what machine like local machine so host will be localhost. 
  user means-- use that username when we start the MySql server
  password means -- use that password when we start the MySql server.
  
  after that i will pull the data from database and pass into selenium test cases.
 
 */
public class Theory {

}
