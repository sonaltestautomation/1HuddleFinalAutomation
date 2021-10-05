Feature: Pause Screen Feature

#Given user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#When User selects already created game
#|GameName|
#|GameForLeaderboard|
#When User can click on Play Game button
#And user verify and click on pause button
#Then pause game screen is opening

Scenario: Verify that pause screen is opening and question count is correct on Pause game screen
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user closes tutorial screen for mobile app
And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
When user verify and click on pause button
Then pause game screen is opening
Then question count is correct on Pause screen
Then player points are correct on Pause screen
Then total time is correct on Pause screen
Then player name is corret on pause screen
Then questions to go text is correct on pause screen
When user verify and click on resume game button
Then Category screen is opening

Scenario: Verify that game is ending after clicking on end game button and yes on confirmation popup
Given user is on home page
And User is logged In
  |UserName|Password|
  |player_email|player_pw|
 And user closes tutorial screen for mobile app
 And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
And user verify and click on pause button
And questions to go text is correct on pause screen
When user verify and click on end game button
And user clicks on yes on confirmation
Then Game Over screen is appearing


Scenario: Verify that player points are correct on Pause game screen
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
And user verify and click on pause button
Then player points are correct on Pause screen

Scenario: Verify that total time is correct on pause game

Given user is on home page
And User is logged In
  |UserName|Password|
  |player_email|player_pw|
And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
When user verify and click on pause button
Then total time is correct on Pause screen
Then questions to go text is correct on pause screen

Scenario: Verify that player name is correct on pause game
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|        
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
And user wait for some time
And user verify and click on pause button
Then player name is corret on pause screen

Scenario: Verify that questions to go text is appearing on pause game
Given user is on home page
And User is logged In
  |UserName|Password|
  |player_email|player_pw|
And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
When user verify and click on pause button
Then questions to go text is correct on pause screen
When user verify and click on resume game button
Then Category screen is opening

Scenario: Verify that category screen is appearing after clicking on resume game button
Given user is on home page
And User is logged In
  |UserName|Password|
  |player_email|player_pw|
And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
And user verify and click on pause button
When user verify and click on resume game button
Then Category screen is opening


Scenario: Verify that game name is appearing on Pause game screen
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|      
When Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And click on Done button on gamepreview page
And Schedule Game
|Game Attempts|
|10|
Then user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user selects recently created game
And User can click on Play Game button
And user verify and click on pause button
Then game name is appearing on pause screen

