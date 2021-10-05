Feature: Game Pause Feature


Scenario: Verify that pause screen is opening after clicking on Pause Game button and game name is appearing on Pause game screen

Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And User selects already created game
|GameName|
|GameForHighScore|
And User can click on Play Game button
And user verify and click on pause button
Then pause game screen is opening
Then game name is appearing on pause screen


Scenario: Verify that question count,player points,total time and Questions to go is correct on Pause game screen
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And User selects already created game
|GameName|
|GameForHighScore|
And User can click on Play Game button
And user verify and click on pause button
Then question count is correct on Pause screen
Then player points are correct on Pause screen
Then total time is correct on Pause screen
Then questions to go text is correct on pause screen

Scenario: Verify that player name is correct on pause game
Given user is on home page
And User is logged In
  |UserName|Password|
  |player_email|player_pw|
Then player should be logged In successfully
And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
And user wait for some time
And user verify and click on pause button
Then player name is corret on pause screen
#
#
Scenario: Verify that category screen is appearing after clicking on resume game button
Given user is on home page
And User is logged In
  |UserName|Password|
  |player_email|player_pw|
Then player should be logged In successfully
And User selects already created game
|GameName|
|GameForHighScore|
And User can click on Play Game button
And user verify and click on pause button
When user verify and click on resume game button
Then Category screen is opening


Scenario: Verify that game is ending after clicking on end game button and yes on confirmation popup
Given user is on home page
And User is logged In
  |UserName|Password|
  |player_email|player_pw|
Then player should be logged In successfully
And User selects already created game
|GameName|
|GameForHighScore|
And User can click on Play Game button
And user verify and click on pause button
And questions to go text is correct on pause screen
When user verify and click on end game button
And user clicks on yes on confirmation
Then Game Over screen is appearing