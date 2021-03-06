Feature: Help Feature

Scenario: Verify that Help page is opening
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User clicks on more Button
And User clicks on Help button
Then Help page is opening

Scenario: Verify that Cancel and Submit buttons are appearing on Help page
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User clicks on more Button
And User clicks on Help button
Then Cancel button is displaying
Then Submit button is displaying

Scenario: Verify that First Name, Last Name, Company Name, topic, Comments and attach screenshot field is appearing
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Udaipur|Design|pass|
And new player is able to login to app
When User clicks on more Button
And User clicks on Help button
Then Help page is opening
Then First name field is appearing on help screen
Then Lasr name field is appearing on help screen
Then Company name field is appearing on help screen
Then topics field is appearing on help screen
Then Comments field is appearing on help screen
Then attach screen shot field is appearing on help screen
And Manager closes web app if mobile app is opened


Scenario: Verify that Comapny name field is not editable
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User clicks on more Button
And User clicks on Help button
Then Help page is opening
Then company name field is not editable

Scenario: Verify that submit button is disabled if required field is missing
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User clicks on more Button
And User clicks on Help button
Then Help page is opening
Then submit button is disabled for webapp
Then validation messagen is appering if player does not select topic and click on submit button for mobile app
|Expected Validation Message|
|Please select a topic|
Then validation message is appearing if player does not enter comment and click on submit button for mobile app
|Expected Validation Message|
|Please Enter your Comments.|

Scenario: Verify that company name and Help topic are correct
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User clicks on more Button
And User clicks on Help button
Then Company name is showing correctly
    |CompanyName|
    |AmazonPrime|
And Topics are showing correctly

Scenario: Verify that Help details are submitting and showing correctly on email when topic is Game issue
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User clicks on more Button
And User clicks on Help button
And User edits first name
  |FirstName|
  |Vish|
And User edits last name
  |LastName|
  |Auto|
And User selects a topic
   |topic|
   |Game Issue|
And User enter comments
  |Comment|
  |Generated by automation script. Please ignore|
  
  
  
  
  
#And User clicks on Submit button
#Then Success message is appearing
#|Message|
#|We got it! The 1HUDDLE team will review & respond shortly.|
#And closes current window
#And user is on Gmail home page
#And user verify and open support email
#|Email|Password|
#|vishal.k@codewalla.com|xyz|

#Scenario: Verify that Help details are submitting and showing correctly on email when topic is technical issue
#Given user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#When User clicks on more Button
#And User clicks on Help button
#And User edits first name
  #|FirstName|
  #|Vish|
#And User edits last name
  #|LastName|
  #|Auto|
#And User selects a topic
   #|topic|
   #|Technical Issue|
#And User enter comments
  #|Comment|
  #|Generated by automation script. Please ignore|
#And User clicks on Submit button
#Then Success message is appearing
#|Message|
#|We got it! The 1HUDDLE team will review & respond shortly.|
#And closes current window
#And user is on Gmail home page
#And user verify and open support email
#|Email|Password|
#|vishal.k@codewalla.com|Vk@131991|
#
#Scenario: Verify that Help details are submitting and showing correctly on email when topic is Feedback/Comments
#Given user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#When User clicks on more Button
#And User clicks on Help button
#And User edits first name
  #|FirstName|
  #|Vish|
#And User edits last name
  #|LastName|
  #|Auto|
#And User selects a topic
   #|topic|
   #|Feedback/Comments|
#And User enter comments
  #|Comment|
  #|Generated by automation script. Please ignore|
#And User clicks on Submit button
#Then Success message is appearing
#|Message|
#|We got it! The 1HUDDLE team will review & respond shortly.|
#And closes current window
#And user is on Gmail home page
#And user verify and open support email
#|Email|Password|
#|vishal.k@codewalla.com|Vk@131991|
#
#Scenario: Verify that Help details are submitting and showing correctly on email when topic is New Feature Request
#Given user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#When User clicks on more Button
#And User clicks on Help button
#And User edits first name
  #|FirstName|
  #|Vish|
#And User edits last name
  #|LastName|
  #|Auto|
#And User selects a topic
   #|topic|
   #|New Feature Request|
#And User enter comments
  #|Comment|
  #|Generated by automation script. Please ignore|
#Then Success message is appearing
#|Message|
#|We got it! The 1HUDDLE team will review & respond shortly.|
#And closes current window
#And user is on Gmail home page
#And user verify and open support email
#|Email|Password|
#|vishal.k@codewalla.com|Vk@131991|
#
#Scenario: Verify that Help details are submitting and showing correctly on email when topic is Others
#Given user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#When User clicks on more Button
#And User clicks on Help button
#And User edits first name
  #|FirstName|
  #|Vish|
#And User edits last name
  #|LastName|
  #|Auto|
#And User selects a topic
   #|topic|
   #|Others|
#And User enter comments
  #|Comment|
  #|Generated by automation script. Please ignore|
#Then Success message is appearing
#|Message|
#|We got it! The 1HUDDLE team will review & respond shortly.|
#And closes current window
#And user is on Gmail home page
#And user verify and open support email
#|Email|Password|
#|vishal.k@codewalla.com|Vk@131991|
#
#
#Scenario: Verify that Help details are submitting successfully when screen shot is attached and details are showing in email
#Given user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#When User clicks on more Button
#And User clicks on Help button
#And User edits first name
  #|FirstName|
  #|Vish|
#And User edits last name
  #|LastName|
  #|Auto|
#And User selects a topic
   #|topic|
   #|Game Issue|
#And User enter comments
  #|Comment|
  #|Generated by automation script. Please ignore|
#And User attaches screenshot
#And User clicks on Submit button
#Then Success message is appearing
#|Message|
#|We got it! The 1HUDDLE team will review & respond shortly.|
#And closes current window
#And user is on Gmail home page
#And user verify and open support email
#|Email|Password|
#|vishal.k@codewalla.com|Vk@131991|