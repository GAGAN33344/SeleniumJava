Feature: Banking Application Login

Scenario: Home Page default Login
Given User is on Netbanking landing page
When User login into application with username "Gagan" and password "1234"
Then Home page is populated
And cards Displayed are "true"


Scenario: Home Page default Login
Given User is on Netbanking landing page
When User login into application with username "Mann" and password "3456"
Then Home page is populated
And cards Displayed are "false"