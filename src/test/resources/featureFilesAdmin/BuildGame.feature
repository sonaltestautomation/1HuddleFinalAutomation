Feature: Create game with manager login and verify game data on Web App

Scenario: Verify that question data is correct on web app with question image and question sound
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|           
When Manager enters random game name
And Manager Enters Category
|Category Number|CategoryName|
|1|CATEGORY A|
And Manager selects a particular category to add question in it
|Category Number|
|0|
And Manager enters question data
|QuestionTitle|Option1|Option2|Option3|Option4|Ans Option count for each question|Correct ans option count|CategoryName|Timer|Points|tag|
|This is test question|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|4|1|CATEGORY A|10|300|qaQuestion|
And Manager uploads question image
And Manager clicks on Done button in Select Question Image popup
And Manager uploads question sound
And Manager clicks on Done checkmark button
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And click on Done button on gamepreview page
And Schedule Game 
|Game Attempts|
|1|
Then user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user closes tutorial screen for mobile app
And user refresh page till game is live state on app
Then customized question data is correct

Scenario: Verify that correct game is in live state and live game is displaying on webapp and game preview title, scenario, information and category name is correct
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
And Add Information title and description
|Info Count|
|1|
And click on Done button on gamepreview page
And Schedule Game 
|Game Attempts|
|1|
Then correct game is in live state
And Manager closes web app if mobile app is opened
Then user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user closes tutorial screen for mobile app
And user refresh page till game is live state on app
Then Game name is correct on app
Then Game preview title scenario and information is correct on webapp
Then User can click on Play Game button
Then Verify Category name is correct on category screen

Scenario: Verify that question title and question options are correct on webapp
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|           
When Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|correct ans option|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|2|2|4|1|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And click on Done button on gamepreview page
And Schedule Game
|Game Attempts|
|10|
And Manager closes web app if mobile app is opened
Then user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user closes tutorial screen for mobile app
And user refresh page till game is live state on app
Then Question title and question options are correct on web app

Scenario: Verify that trophy details are appearing on game preview page and Total points, Attempts and High Score is correct on game preview screen

Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
	|DepartmentName|Password|
  |ALL|pass|          
And Manager clicks on GamesIcon
And Manager clicks on Trophies
And Manager selects tab
|Tab name|
|By Game|
And Manager selects Trophy filter
And Manager enters already created game trophy name and search
|Game Name|
|Trophy Game Play|
And Manager clicks on option burger button
And Manager clicks on edit button
And Manager enters point
|Points|
|100|
And Manager enters attempts
|Attempts|
|1|
And Manager selects high score
|High Score|
|100|
And Manager enters trophy description
|Description|
|This is test description|
And Manager clicks on Update button
And Manager closes web app if mobile app is opened
And user is on home page
When User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user closes tutorial screen for mobile app

When User selects already created game
|GameName|
|Trophy Game Play|
Then Game preview screen is opening
Then Trophy field is appearing on preview screen
Then Trophy description is correct
Then Total points, Attempts and High Score is correct on game preview screen

Scenario: Verify that all of the above option is appearing when manager selects all the options as correct while adding question
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|           
When Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|Correct ans option|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|4|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And click on Done button on gamepreview page
And Schedule Game
|Game Attempts|
|10|
And Manager closes web app if mobile app is opened
Then user is on home page
And User is logged In
  	|UserName|Password|
    |player_email|player_pw|
And user closes tutorial screen for mobile app

And user refresh page till game is live state on app
Then Question options are correct on web app
#
Scenario: Verify that correct ans option is appearing when manager selects two options as correct while adding question
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|      
When Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|Correct ans option|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|2|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And click on Done button on gamepreview page
And Schedule Game
|Game Attempts|
|10|
And Manager closes web app if mobile app is opened
Then user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user closes tutorial screen for mobile app
And user refresh page till game is live state on app
Then Question options are correct on web app








#Scenario: Verify that remaining attempt count is showing correctly on game preview screen
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|           
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
#Then user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#And user selects recently created game
#Then attempt count is correct on game preview screen
#When User can click on Play Game button
#And User is selecting category
#Then Verify total score after ending game
#|AnswerType|
#|all wrong|
#And User clicks on home button on end game screen
#And user goes to select Game screen
#Then disabled check icon is appearing with game name
#Then user selects recently created game
#Then attempt count is correct on game preview screen
#Then Play button is disabled on preview screen

#Scenario: Verify that Game Attempt and End Game date text is correct and play game button is showing as disabled after playing game
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|           
#When Manager enters random game name
#And Enters Categories Questions and Options
#|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|No of correct option|
#|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
#And Click on Preview button
#And Add Game Preview Title and Scenario
#|Game Preview Title|Game Scenario|
#|This is game preview for automation testing|This is game scenario for automation testing|
#And manager tries to schedule game
#|ScheduleGame|
#|No|
#And Manager clicks on options button on recently created game
#And Manager moves game to ready state
#And user refreshes page
#And Manager clicks on attempts
#And Manager clicks on add attempts button
#And Manager searches game
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
#|1|
#And click on done button
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|player@automation.com|pass| 
#And user selects recently created game