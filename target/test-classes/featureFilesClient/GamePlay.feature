Feature: Game Play And End Game Feature

Scenario: Verify that select game screen is opening and game list is appearing
Given user is on home page
When User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
Then User is on select game screen
    |CompanyName|
    |AMAZONPRIME|
Then Game list should be appeared

Scenario: Verify that user is able to select game
Given user is on home page
When User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
Then User should be able to select game

Scenario: Verify that game preview screen is opening
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
Then Game preview screen is opening

Scenario: Verify that Category screen is opening with pause button, end game button and total time field
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And User selects already created game
|GameName|
|GameForLeaderboard|
Then Game preview screen is opening
And User can click on Play Game button
Then Category screen is opening
And  Pause Game button is appearing
Then End Game button is appearing
And Total Time field is appearing


Scenario: Verify that total question count is correct on category screen
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|No of correct option|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And click on Done button on gamepreview page
And Schedule Game 
|Game Attempts|
|1|
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user refresh page till game is live state on app
And user selects recently created game
Then Game preview screen is opening
And User can click on Play Game button
Then Question count is correct on category screen
Then Manager closes web app if mobile app is opened

Scenario: Verify the user score on end game screen if user give all correct answers
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForHighScore|
When User can click on Play Game button
And User is selecting category
Then Verify total score after ending game
|AnswerType|
|all correct|


Scenario: Verify the user score on end game screen if user give all wrong answers
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForHighScore|
When User can click on Play Game button
And User is selecting category
Then Verify total score after ending game
|AnswerType|
|all wrong|


Scenario: Verify the user score on end game screen if user give random answers
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
When User can click on Play Game button
And User is selecting category
Then Verify total score after ending game
|AnswerType|
|random|


Scenario: Verify that Game Over text, Game name, Total time fileds are appearing on end game screen
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
When User can click on Play Game button
And User is selecting category
And Verify total score after ending game
|AnswerType|
|random|
Then Game Over text, Game name and Total time fields are appearing on end game screen

Scenario: Verify that category screen is opening after clicking on back button on select answer screen
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
When User can click on Play Game button
And User is selecting category
And User gives answer
|AnswerType|
|correct|
And User clicks on Back button
Then Category screen is opening

Scenario: Verify that category name is correct with the question
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
When User can click on Play Game button
Then Category name is correct with questions


Scenario: Verify that points are appearing with the question
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
When User can click on Play Game button
Then Points are appearing with the questions

Scenario: Verify that Timer is appearing with every question
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
When User can click on Play Game button
Then Timer is appearing with every question

Scenario: Verify that Done button is appearing with last question and game is ending after clicking on it
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
When User can click on Play Game button
Then Verify and click done button with last question
Then Game Over screen is appearing


Scenario: Verify that Back button is disabled with last question
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
When User can click on Play Game button
Then Verify that Back button is disabled with last question
Then Verify that Back button is not disable with last question on mobile app


Scenario: Verify that Back button and Next button is disabled if user doesn't give answer
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
When User can click on Play Game button
And User is selecting category
Then Verify that Next and Back button is disabled

Scenario: Verify that game is ending after clicking on End game on category screen
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
When User can click on Play Game button
And User clicks on end game button on category screen
And user clicks on yes on confirmation
Then Game Over screen is appearing


Scenario: Verify that total score is correct on end game screen and success message is appearing after send record
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
When User can click on Play Game button
And User is selecting category
And Verify total score after ending game
|AnswerType|
|random|
And User clicks on Send Record button
Then success message is appearing after sending record
|ExpectedSuccessMessage|
|Game record has been sent to your registered Email Address.|

Scenario: Verify that total score is correct on end game screen and success message is appearing after send record for the shop game
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User selects already created game
|GameName|
|TheShopAutomationGame|
When User can click on Play Game button
And User is selecting category
And Verify total score after ending game
|AnswerType|
|random|
And User clicks on Send Record button
Then success message is appearing after sending record
|ExpectedSuccessMessage|
|Game record has been sent to your registered Email Address.|


Scenario: Verify that High Score Percentage is correct after playing single level game
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
Then Game list should be appeared
Then Hign score percentage text is appearing with single level game name
|GameName|
|GameForHighScore|
Then High score is correct if user play game with random answers
|TotalQuestionsInGame|AnswerType|GamePlayCount|GameName|
|3|random|1|GameForHighScore|
Then High score is correct if user play game with all correct answers
|TotalQuestionsInGame|AnswerType|GamePlayCount|GameName|
|3|all correct|1|GameForHighScore|
Then High score is correct if user play game with all wrong
|TotalQuestionsInGame|AnswerType|GamePlayCount|GameName|
|3|all wrong|1|GameForHighScore|

Scenario: Verify that attempt count is showing correctly on game preview screen
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|         
When Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|No of correct option|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And click on Done button on gamepreview page
And manager selects all locations on schedule game screen
And manager selects all departments on schedule game screen
And manager enters attempts on schedule game screen
|Game Attempts|
|1|
And manager set a random date on schedule game screen
And manager clicks on apply button on schedule game screen
Then user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user refresh page till game is live state on app
And user selects recently created game
Then attempt count is correct on game preview screen
When User can click on Play Game button
And User is selecting category
Then Verify total score after ending game
|AnswerType|
|all wrong|
And User clicks on home button on end game screen
And user goes to select Game screen
Then disabled check icon is appearing with game name
Then user selects recently created game
Then attempt count is correct on game preview screen
Then Play button is disabled on preview screen

















#Scenario: Verify that user is getting Game Report in email
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager creates a game
#|GameName|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|Game Preview Title|Game Scenario|Game Attempts|
#|GameForLeaderboard|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|This is game preview for automation testing|This is game scenario for automation testing|10|
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#And user selects recently created game
#When User can click on Play Game button
#And User is selecting category
#And Verify total score after ending game
#|AnswerType|
#|random|
#When User clicks on Send Record button
#And user is on Gmail home page
#Then user verify and open game report 
#|Email|Password|
#|vishal.k@codewalla.com|Vk@131991|

#Scenario: Verify that welcome text is appearing on game report email
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager creates a game
#|GameName|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|Game Preview Title|Game Scenario|Game Attempts|
#|GameForLeaderboard|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|This is game preview for automation testing|This is game scenario for automation testing|10|
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#And user selects recently created game
#When User can click on Play Game button
#And User is selecting category
#And Verify total score after ending game
#|AnswerType|
#|random|
#When User clicks on Send Record button
#And user is on Gmail home page
#And user verify and open game report 
#|Email|Password|
#|vishal.k@codewalla.com|Vk@131991|
#Then Welcome text is appearing
#|ExpectedText|
#|Great game! The below Game Summary is a recap of total performance in today's game.|
#
#
#Scenario: Verify that date, time, name of game and length of game is correct
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager creates a game
#|GameName|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|Game Preview Title|Game Scenario|Game Attempts|
#|GameForLeaderboard|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|This is game preview for automation testing|This is game scenario for automation testing|10|
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#And user selects recently created game
#When User can click on Play Game button
#And User is selecting category
#And Verify total score after ending game
#|AnswerType|
#|random|
#When User clicks on Send Record button
#And user is on Gmail home page
#And user verify and open game report 
#|Email|Password|
#|vishal.k@codewalla.com|Vk@131991|
#Then Date Time GameName and LengthOfGame is correct on game report
#Then Player Name and Points are correct on game report
#Then Twitter Facebook Instagram and LinkedIn icons are present on game report



#Scenario: Verify that correct percentage are correct
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager creates a game
#|GameName|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|Game Preview Title|Game Scenario|Game Attempts|
#|GameForLeaderboard|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|This is game preview for automation testing|This is game scenario for automation testing|10|
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#When user selects recently created game
#When User can click on Play Game button
#And User is selecting category
#And Verify total score after ending game
#|AnswerType|
#|random|
#Then correct percentage is correct on end game



#Scenario: Verifty that user is able to select category
#Given user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#When User selects game
#Then User can click on Play Game button
#Then User is selecting category