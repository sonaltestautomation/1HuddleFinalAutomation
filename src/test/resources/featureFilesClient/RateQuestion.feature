Feature: Rate Question Feature

Scenario: Verify that Rate Question option is enabled with every question
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And User selects already created game
|GameName|
|GameForLeaderboard|
When User can click on Play Game button
Then Rate question option is enabled with every question

Scenario: Verify that Rate Question screen is opening and Question is correct & I like it, Question is correct but I have a suggesstion and Question is wrong options are appearing
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
And User is selecting category
And User gives answer
|AnswerType|
|correct|
When user clicks on Rate Question button
Then Rate question screen is opening
Then Rate question options are showing correctly


Scenario: Select answer screen is opening after clicking on Cancel button
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
And User is selecting category
And User gives answer
|AnswerType|
|correct|
And user clicks on Rate Question button
When user clicks on Cancel button
Then Question screen is opening with rate question button


Scenario: Verify that Enter Your feedback here field is disabled if user selects Question is correct & I like it option
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
And User is selecting category
And User gives answer
|AnswerType|
|all correct|
And user clicks on Rate Question button
When user selects Question is correct and I like it option
Then enter your feedback field is disabled


Scenario: Verify that success is appearing after submit Question is correct and I like it option and correct feedback, correct question with no ques comment is appearing on admin when user end game after submitting feedback
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
And User is selecting category
And User gives answer
|AnswerType|
|all correct|
And user clicks on Rate Question button
And user selects Question is correct and I like it option
When user selects Submit button
Then success message is appearing after submitting feedback
And user gets question title
And User clicks on Back button
And User clicks on end game button on category screen
And user clicks on yes on confirmation
And closes current window
And Manager opens new tab
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager clicks on GamesIcon
And Manager clicks on Player Feedback
Then question and no comment is appearing on feedback page of admin panel for correct question
Then Manager closes web app if mobile app is opened

Scenario: Verify that success is appearing if user enters feedback and selects Question is correct but I have a suggesstion option and correct feedback, correct question and correct question comment is appearing on admin while user end game after submitting feedback
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
And User is selecting category
And User gives answer
|AnswerType|
|all correct|
And user clicks on Rate Question button
And user selects Question is correct but I have suggestion option
And user enters feedback
|userFeedback|
|This is a test feedback for automation testing|
When user selects Submit button
Then success message is appearing after submitting feedback
And user gets question title
And User clicks on Back button
And User clicks on end game button on category screen
And user clicks on yes on confirmation
And closes current window
And Manager opens new tab
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager clicks on GamesIcon
And Manager clicks on Player Feedback
Then question and comment is appearing on feedback page of admin panel for question correct but have suggestion
Then Manager closes web app if mobile app is opened
#
#Bug already logged for this hence comeented

#Scenario: Verify that success is appearing if user enters feedback and selects Question is wrong option and correct feedback, correct question and correct question comment while user submit feedback but does not end game
#Given user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.1huddle@gmail.com|pass|
#Then player should be logged In successfully
#And User selects already created game
#|GameName|
#|GameForLeaderboard|
#And User can click on Play Game button
#And User is selecting category
#And User gives answer
#|AnswerType|
#|correct|
#And user clicks on Rate Question button
#And user selects Question is wrong feedback
#And user enters feedback
#|userFeedback|
#|This is a test feedback for wrong question|
#When user selects Submit button
#Then success message is appearing after submitting feedback
#And user gets question title
#And Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager clicks on GamesIcon
#And Manager clicks on Player Feedback
#Then question and comment is appearing on feedback page of admin panel for wrong question
#Then Manager closes web app if mobile app is opened