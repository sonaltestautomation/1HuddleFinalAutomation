Feature: Edit Player Profile

Scenario: Verify that Profile page is opening
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User clicks on more Button
And User clicks on edit profile button
Then edit profile page is opening

Scenario: Verify that Qualification list is correct and verify qualification is selecting
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User clicks on more Button
And User clicks on edit profile button
Then correct qualification list is appearing 
And User can click and select Qualification


Scenario: Verify that Emp id is disabled for player
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User clicks on more Button
And User clicks on edit profile button
Then Emp id field is disabled

Scenario: Verify that default status is showing correctly
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Udaipur|Design|pass|
And new player is able to login to app
When User clicks on more Button
And User clicks on edit profile button
Then defaut status message is appearing
#
Scenario: Verify that User is able to edit details and correct details are reflecting to user and admin panel after saving
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player2_email|player2_pw|
Then player should be logged In successfully
When User clicks on more Button
And User clicks on edit profile button
And User edit first name
And User edit last name
And User enters Title
#And User selects DOB
#	|DOB|
#	|13-11-91|
And User selects country
	|Country|
	|United States|
And User selects state
	|State|
	|Alaska|
And User enters City
And User enters College
And User enters year
    |Year|
    |2016|
And User enters college Major
And correct qualification list is appearing 
And User can click and select Qualification
And User update status
Then All details are saving and reflecting to user
And closes current window
And Manager opens new tab
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
Then All details are reflecting in admin panel
Then Manager closes web app if mobile app is opened
    

Scenario: Verify that change password button is displaying on edit profile screen
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And User clicks on more Button
And User clicks on edit profile button
Then change password button is displaying

Scenario: Verify that change password screen is opening after clicking on change password button
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And User clicks on more Button
And User clicks on edit profile button
And User clicks on change password button
Then change password screen is opening
#
Scenario: Verify that new password is setting and user is able to login with new password
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|player_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Udaipur|Design|pass|
And new player is able to login to app
And User clicks on more Button
And User clicks on edit profile button
And User clicks on change password button
And User enters current password for resetting password through edit profile
And user enters new password for resetting password through edit profile
|password|
|pass123|
And user enters confirm password for resetting password through edit profile
|confirmPassword|
|pass123|
And user clicks on save button on change password screen
Then Verify that success message after changing password
And user clicks on cancel button on edit profile screen
And Clicks on Logout button
Then Verify user is able to login with new password

