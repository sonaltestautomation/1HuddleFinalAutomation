Feature: Logout Feature For a Player

Scenario: Verify that More options are showing correctly
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
When User clicks on more Button
Then More page is opening
And Correct options are appearing
|EDIT PROFILE|HELP|CHANGE LANGUAGE|LOGOUT|

Scenario: Verify that Logout is working
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
When User clicks on more Button
And Clicks on Logout button
Then Home page is appearing