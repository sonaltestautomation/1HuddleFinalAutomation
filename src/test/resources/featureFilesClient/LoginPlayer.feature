Feature: Login and Logout Feature for Players

Scenario: Verify that home page is opening and correct validation message is appearing if player enters invalid email
    Given user is on home page
    Then One Huddle page should be opened
    And user selects user type
    |UserType|
    |PLAYER|
  	And user enters email
  	|InValidEmail|                         
  	|vis@a.com|
  	When clicks on Next button
    Then validation message is appearing
  	|ExpectedValidationMessageForWebApp|ExpectedValidationMessageForAndroid|
    |Email address is not registered. Please contact your Admin.|We could not recognize your email address.|

Scenario: Verify that correct validation message is appearing if admin deactive a player and player enters deactivated player email
  	Given Manager is on Admin Home page
    And Manager is logged In
       |UserName|Password|
       |manager_email|manager_pw|
    And Manager add a player
       |DepartmentName|Password|
       |ALL|pass|
    And Manager deactive a user
    And Manager closes web app if mobile app is opened
    And user is on home page
  	And user enters recently added email
    When clicks on Next button
    Then deactive user validation message is appearing
    |ExpectedValidationMessageForWebApp|ExpectedValidationMessageForAndroid|
    |Your account has been deactivated, please contact your manager.|Your account has been deactivated, please contact your manager.|
    Then clicks on OK button on validation message popup
    Then One Huddle page should be opened
    
Scenario: Verify that correct validation message is appearing if player enters wrong password
  	Given user is on home page
  	And user enters email
    |ValidEmail|                         
    |vishal.1huddle@gmail.com|
  	And clicks on Next button
  	And user enters password
  	|InvalidPassword|
  	|pas|
  	When user click on login button
  	Then validation message is appearing
  	|ExpectedValidationMessage|ExpectedValidationMessageAndroid|
  	|Invalid password. Please contact your Admin.|Email address and password do not match.|
  	
Scenario: Verify that player is logged in and logged out successfully after entering valid credentials and middle game icon is selected by default for mobile app
  	Given Manager is on Admin Home page
    And Manager is logged In
       |UserName|Password|
       |manager_email|manager_pw|
    And Manager add a player
       |DepartmentName|Password|
       |ALL|pass|
    And Manager closes web app if mobile app is opened
    And user is on home page
  	And user enters recently added email
  	And clicks on Next button
  	And user enters recently added password
  	When user click on login button
  	Then player should be logged In successfully
  	Then Games icon should be selected by default for mobile app
  	And User clicks on more Button
    And Clicks on Logout button
    Then One Huddle page should be opened
  