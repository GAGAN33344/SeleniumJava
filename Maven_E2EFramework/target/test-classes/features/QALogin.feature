Feature: QAClickAcademy Application Login

Scenario Outline: Positive Test Validation Login
Given Initialize the browser with chromee
And Navigate to "http://www.qaclickacademy.com" sitee
And Click on Login link in home page to land on secure sign in pagee
When User enters <username> and <password> and logs inn
Then Verify that user is successfully logged inn
And Close the browserr

Examples:
|username				|password		|          
|gagan.mann@ymail.com	|Chahal@1988	| 