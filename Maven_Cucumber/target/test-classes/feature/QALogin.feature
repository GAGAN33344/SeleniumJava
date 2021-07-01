Feature: QAClickAcademy Application Login

Scenario: Positive Test Validation Login
Given Initialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com" site
And Click on Login link in home page to land on secure sign in page
When User enters "Gagan.mann@ymail.com" and "123345" and logs in
Then Verify that user is successfully logged in