Feature: Login and Logout Feature for Teamlead

  
    Scenario: Verify that correct validation message is appearing if manager deactive team lead and team lead enters deactivated player's email
    Given Manager is on Admin Home page
    And Manager is logged In
       |UserName|Password|
       |manager_email|manager_pw|
    And Manager add a teamlead
       |UserType|Department|Password|
       |TeamLead|ALL|pass|
    And Manager deactive a user
    And user is on home page
    When user selects user type
    |UserType|
    |MANAGER|
  	And user enters recently added email
  	And clicks on Next button
  	Then deactive user validation message is appearing
    |ExpectedValidationMessageForWebApp|ExpectedValidationMessageForAndroid|
    |Your account has been deactivated, please contact your admin.|Your account has been deactivated, please contact your manager.|
  	
  	Scenario: Verify that correct validation message is appearing if team lead enters wrong password
    Given user is on home page
    When user selects user type
    |UserType|
    |MANAGER|
  	When user enters email
  	|ValidEmail|                         
  	|team.lead+1@automation.com|
  	And clicks on Next button
  	And user enters password
  	|InvalidPassword|
  	|pas|
  	And user click on login button
  	Then validation message is appearing
  	|ExpectedValidationMessage|ExpectedValidationMessageAndroid|
  	|Invalid password. Please contact your Admin.|Email address and password do not match.|
  	
    Scenario: Verify that team lead is logged in and logged out successfully after entering valid credentials
  	Given Manager is on Admin Home page
    And Manager is logged In
       |UserName|Password|
       |manager_email|manager_pw|
    And Manager add a teamlead
       |UserType|Department|Password|
       |TeamLead|ALL|pass|
  	And user is on home page
  	When user selects user type
    |UserType|
    |MANAGER|
  	And user enters recently added email
  	And clicks on Next button
  	And user enters recently added password
  	And user click on login button
  	Then user should be logged In successfully
  	And User clicks on more Button
    And Clicks on Logout button
    Then Home page is appearing
  	