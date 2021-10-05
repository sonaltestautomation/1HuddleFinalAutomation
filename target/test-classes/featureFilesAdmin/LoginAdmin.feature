Feature: Login feature for admin

Scenario: Manager Login with valid user name and password
Given Manager is on Admin Home page 
When Manager enters valid username
|UserName|                         
|vishal.1huddle+1@gmail.com|
And Manager clicks next button
And Manager enters valid password
|Password|
|pass|
And Manager clicks next button
Then Manager should be logged In