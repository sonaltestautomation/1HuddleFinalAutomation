Feature: In App Notification Feature

#Bug already logged for clearr all hence commented

#Scenario: Verify that Clear All button is working
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#When Manager clicks game icon
#And Manager clicks on Notifications
#And Manager clicks on Custom Notification
#And Manager Enters Notification message
#|NotificationMessage|
#|This is test notification by automation script|
#And Manager clicks on Send button
#And Manager clicks on Ok button on success popup
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.1huddle@gmail.com|pass| 
#And user wait for loading animation to be disappeared
#And player clicks on notifications
#And player clicks on clearall
#And player clicks on yes on confirmation popup
#Then No Notifications text is appearing on the screen

#Scenario: Verify that notification count is correct in red bubble, notification time is correct, notification is highlighted when unread,mark as read is working and no notification text is appering after clearing all notifications
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|           
#When Manager enters random game name
#And Enters Categories Questions and Options
#|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|No of correct option|
#|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
#And Click on Preview button
#And Add Game Preview Title and Scenario
#|Game Preview Title|Game Scenario|
#|This is game preview for automation testing|This is game scenario for automation testing|
#And click on Done button on gamepreview page
#And Schedule Game 
#|Game Attempts|
#|1|
#And user is on home page
#When User is logged In
  #	|UserName|Password|
  #	|vishal.1huddle@gmail.com|pass|
#Then notification count is correct in red bubble
#When player clicks on notifications
#Then notification time details are correct
#|ExpectedTime|
#|Today|
#And notification is highlighted
#When player clicks on burger icon
#Then player verify and clicks on mark as read
#Then notification is seen
#When player clicks on clearall
#And player clicks on yes on confirmation popup
#Then No Notifications text is appearing on the screen
#
#Scenario: Verify that new game notification is appearing and user is redirecting to the Games preview screen after clicking on it
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|           
#When Manager enters random game name
#And Enters Categories Questions and Options
#|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|No of correct option|
#|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
#And Click on Preview button
#And Add Game Preview Title and Scenario
#|Game Preview Title|Game Scenario|
#|This is game preview for automation testing|This is game scenario for automation testing|
#And click on Done button on gamepreview page
#And Schedule Game 
#|Game Attempts|
#|1|
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.1huddle@gmail.com|pass|
#And player clicks on notifications
#Then notification text is correct new game
#And player clicks on new game live notification
#		|Notification_Type|
#		|New Game Available!|
#Then player is redirecting to the game preview screen
#Then player clicks on back button game preview screen
#Then player clicks on notifications
#And player clicks on clearall
#And player clicks on yes on confirmation popup
#Then No Notifications text is appearing on the screen

Scenario: Verify that custom notification is appearing 
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
When Manager clicks game icon
And Manager clicks on Notifications
And Manager clicks on Custom Notification
And Manager Enters Notification message
|NotificationMessage|
|This is test notification by automation script|
And Manager clicks on Send button
And Manager clicks on Ok button on success popup
And user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared

And player clicks on notifications
Then notification text is correct custom notification
|ExpectedNotificationMessage|
|This is test notification by automation script|
And Player selects custom notification
|Notification_Type|
|New Message|
Then Correct notification text is appearing
|ExpectedNotificationMessage|
|This is test notification by automation script|
#And player clicks on clearall
#And player clicks on yes on confirmation popup
#Then No Notifications text is appearing on the screen


#Scenario: Verify that leaderboard reset notification is aappearing user is redirecting to the Leaderboard screen after clicking on it
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|           
#And Manager clicks on Settings
#And Manager clicks on Leaderboard
#And Manager selects next reset date
#|CalendarType|Date|
#|StartDate|1/13/2019|
#And Manager Save changes
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.1huddle@gmail.com|pass| 
#And player clicks on notifications
#Then notification text is correct leaderboard reset
#And player clicks on leaderboard update notification
#	  |Notification_Type|
#		|Leaderboard Updated|
#Then Leaderboards page is opening
#And player clicks on notifications
#And player clicks on clearall
#And player clicks on yes on confirmation popup
#Then No Notifications text is appearing on the screen
 
 
#Scenario: Verify that new game attempt notification is appearing to user after adding new attempt and user redirecting to the game play screen
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|  
#And Manager clicks on attempts
#And Manager clicks on add attempts button
#And Manager searches already created game
#|GameName|
#|GameForLeaderboard|
#And Manager selects game
#And Manager clicks on Next
#And Manager clicks on Add a filter
#And Manager selecyt name filter
#And Manager enters player name
#|PlayerName|
#|player automation|
#And Manager clicks on done icon
#And Manager selects player
#And Manager clicks on Next
#And Manager enter extra attempts
#|ExtraAttempt|
#|2|
#And click on done button
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.1huddle@gmail.com|pass| 
#And player clicks on notifications
#Then notification text is correct extra attempt
#And player clicks on extra attempt notification
#	  |Notification_Type|
#		|New Attempt(s)|
#Then User is on select game screen
#|CompanyName|
#|AmazonPrime|
#And player clicks on notifications
#And player clicks on clearall
#And player clicks on yes on confirmation popup
#Then No Notifications text is appearing on the screen

