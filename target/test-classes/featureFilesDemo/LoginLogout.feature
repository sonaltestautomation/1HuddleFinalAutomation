Feature: Login and Logout Feature for a player. 

  @smokeTest
  Scenario: Verify that player is logged in successfully after entering valid credentials
  	Given player is on home page
  	When player enters valid email
  	|UserName|                         
  	|vishal.automation@codewalla.com|
  	And clicks on Next button
  	And player enters valid password
  	|Password|
  	|pass|
  	And player click on login button
  	Then player should be logged In successfully	
  
  @smokeTest
  Scenario: Verify that More options are showing correctly
   Given User is logged In
  	|UserName|Password|
  	|vishal.automation@codewalla.com|pass|
  When User clicks on more Button
  Then More page is opening
  And Correct options are appearing
  |ExpectedEditProfileOption|ExpectedHelpOption|ExpectedChangeLanguageOption|ExpectedEditProfileOption|
  |EDIT PROFILE|HELP1|CHANGE LANGUAGE|LOGOUT|
  
 @smokeTest
 Scenario: Verify that Logout is working
  Given User is logged In
  	|UserName|Password|
  	|vishal.automation@codewalla.com|pass|
  When User clicks on more Button
  And Clicks on Logout button
  Then Home page is appearing