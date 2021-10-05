Feature: Multilevel Game Play Feature

Scenario: Verify that MLG game is displaying to play after creating it from admin panel with MLG game name, MLG game rule, MLG points and level are showing correctly and other location department players are not able to see it
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Udaipur|Design|pass|
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
And Manager clicks on GamesIcon
And Manager enters random MLG game name
And Manager clicks on Add Level button
And Manger search recently created game and select
|GameNumber|
|0|
And Manager clicks on Add button
And Manager clicks on Add Level button
And Manger search already created game and select
|GameName|
|GameForLeaderboard|
And Manager clicks on Add button
And Manager clicks on Add Criteria button
|Level|
|0|
And Manager selects total points criteria
|SetCriteria|
|Yes|
And Manager selects minium attempts criteria
|SetCriteria|
|Yes|
And Manager selects high score criteria
|SetCriteria|
|Yes|
And Manager clicks on done button
And Manager clicks on Add Criteria button
|Level|
|1|
And Manager selects total points criteria
|SetCriteria|
|Yes|
And Manager selects minium attempts criteria
|SetCriteria|
|Yes|
And Manager selects high score criteria
|SetCriteria|
|Yes|
And Manager clicks on done button
And Manager enters rule
|Rule|
|MLG rule for testing|
And Manager clicks on Add Players button
And Manager clicks on Add button on add players page
And Manager searches location
And Manager selects location
And Manager clicks on done button
And Manager clicks on Add button on add players page
And Manager searches department
And Manager selects department
And Manager clicks on done button
And Manager turns on status
And Manager clicks on Turn On button
Then MLG live success message is appearing
|ExpectedText|
|This Multilevel Game is now live|
When new player is able to login to app
And user refresh page till game is live state on app
Then live MLG is displaying to user
And user selects recently created MLG
Then Rules icon is appearing on the screen
Then MLG game name is correct 
Then Total points are zero before playing game
Then Level indicator is displaying with trophy image
Then Level count is correct
Then Lock image is appearing for levels which are after level one
Then Game over text is appearing
Then Rules are correct after opening rules
Then Player closes rules
And User clicks on back button on select level screen
And User clicks on more Button
And Clicks on Logout button
When User is logged In
  |UserName|Password|
  |player_email|player_pw|
Then MLG is not displaying to other location and department player
Then Manager closes web app if mobile app is opened

Scenario: Verify that MLG is not displaying to same location same dept player and not displaying to same loc and other player if players added after creating MLG
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
And Manager clicks on GamesIcon
And Manager enters random MLG game name
And Manager clicks on Add Level button
And Manger search recently created game and select
|GameNumber|
|0|
And Manager clicks on Add button
And Manager clicks on Add Level button
And Manger search already created game and select
|GameName|
|GameForLeaderboard|
And Manager clicks on Add button
And Manager clicks on Add Criteria button
|Level|
|0|
And Manager selects total points criteria
|SetCriteria|
|Yes|
And Manager selects minium attempts criteria
|SetCriteria|
|Yes|
And Manager selects high score criteria
|SetCriteria|
|Yes|
And Manager clicks on done button
And Manager clicks on Add Criteria button
|Level|
|1|
And Manager selects total points criteria
|SetCriteria|
|Yes|
And Manager selects minium attempts criteria
|SetCriteria|
|Yes|
And Manager selects high score criteria
|SetCriteria|
|Yes|
And Manager clicks on done button
And Manager enters rule
|Rule|
|MLG rule for testing|
And Manager clicks on Add Players button
And Manager clicks on Add button on add players page
And Manager clicks on location side arrow button
And Manager searches specific location for adding players in MLG
|Already Added Location Name|
|Udaipur|
And Manager selects specific location
|Already Added Location Name|
|Udaipur|
And Manager clicks on done button
And Manager clicks on already selected location chip
And Manager searches specific location for adding players in MLG
|Already Added Location Name|
|Mumbai|
And Manager selects specific location
|Already Added Location Name|
|Mumbai|
And Manager clicks on done button
And Manager clicks on Add button on add players page
And Manager searches specific department for adding players in MLG
|Already Added Department Name|
|Development|
And Manager selects already added department
|Already Added Department Name|
|Development|
And Manager clicks on done button
And Manager turns on status
And Manager clicks on Turn On button
Then MLG live success message is appearing
|ExpectedText|
|This Multilevel Game is now live|

And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Mumbai|Development|pass|
And new player is able to login to app
And user refresh page till game is live state on app
Then live MLG is displaying to user
And User clicks on more Button
And Clicks on Logout button

And Manager is on Admin Home page
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Udaipur|Design|pass|
When new player is able to login to app
Then MLG is not displaying to same location but other department player
Then Manager closes web app if mobile app is opened

Scenario: Verify that MLG is not displaying to same location and other department for already exist player on particular location department
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Udaipur|Design|pass|
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
And Manager clicks on GamesIcon
And Manager enters random MLG game name
And Manager clicks on Add Level button
And Manger search recently created game and select
|GameNumber|
|0|
And Manager clicks on Add button
And Manager clicks on Add Level button
And Manger search already created game and select
|GameName|
|GameForLeaderboard|
And Manager clicks on Add button
And Manager clicks on Add Criteria button
|Level|
|0|
And Manager selects total points criteria
|SetCriteria|
|Yes|
And Manager selects minium attempts criteria
|SetCriteria|
|Yes|
And Manager selects high score criteria
|SetCriteria|
|Yes|
And Manager clicks on done button
And Manager clicks on Add Criteria button
|Level|
|1|
And Manager selects total points criteria
|SetCriteria|
|Yes|
And Manager selects minium attempts criteria
|SetCriteria|
|Yes|
And Manager selects high score criteria
|SetCriteria|
|Yes|
And Manager clicks on done button
And Manager enters rule
|Rule|
|MLG rule for testing|
And Manager clicks on Add Players button
And Manager clicks on Add button on add players page
And Manager searches location
And Manager selects location
And Manager clicks on done button
And Manager clicks on already selected location chip
And Manager searches specific location for adding players in MLG
|Already Added Location Name|
|Mumbai|
And Manager selects specific location
|Already Added Location Name|
|Mumbai|
And Manager clicks on done button
And Manager clicks on Add button on add players page
And Manager searches specific department for adding players in MLG
|Already Added Department Name|
|Development|
And Manager selects already added department
|Already Added Department Name|
|Development|
And Manager clicks on done button
And Manager turns on status
And Manager clicks on Turn On button
Then MLG live success message is appearing
|ExpectedText|
|This Multilevel Game is now live|
When new player is able to login to app
Then MLG is not displaying to same location but other department player
Then Manager closes web app if mobile app is opened


Scenario: Verify that level details button is appearing on profile screen and Level number, Level Name, How to win text, maximum points, maximum attempts, high score are correct and close button is working and also verify that Level number, Level Name, How to win text, maximum points, maximum attempts, high score are correct and lets go is disabled if level is unlocked  
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user selects already created MLG
|MLG Game Name|
|Automation MLG Game|
And user opens and verify level for alreay created MLG
|LevelNumber|
|1|
And Player clicks on LetsGo button
Then Game preview screen is opening
Then Level details icon is appearing on game preview screen
Then Level popup is appearing after clicking on level details icon
Then Game name is correct on level popup for already created MLG
|GameName|
|GameForHighScore|
Then How to Win Text is appearing
Then Points criteria is correct for already created MLG
|Points Criteria|
|100|
Then Attempt criteria is correct for already created MLG
|Attempt Criteria|
|1|
Then High score criteria is correct for already created MLG
|HighScore Criteria|
|100|
Then Player closes level popup
And player clicks on back button game preview screen
And user opens and verify level for alreay created MLG
|LevelNumber|
|1|
Then Game name is correct on level popup for already created MLG
|GameName|
|GameForHighScore|
Then How to Win Text is appearing
Then Points criteria is correct for already created MLG
|Points|
|100|
Then Attempt criteria is correct for already created MLG
|Attempts Criteria|
|1|
Then High score criteria is correct for already created MLG
|HighScore|
|100|
Then Lets Go button is enabled
Then Player clicks on LetsGo button
Then Game preview screen is opening
And player clicks on back button game preview screen
And user opens and verify level for alreay created MLG
|LevelNumber|
|2|
Then Game name is correct on level popup for already created MLG
|GameName|
|GameForLeaderboard|
Then How to Win Text is appearing
Then Points criteria is correct for already created MLG
|Points Criteria|
|100|
Then Attempt criteria is correct for already created MLG
|Attempt Criteria|
|1|
Then High score criteria is correct for already created MLG
|Highscore Criteria|
|100|
Then Lets Go button is disabled
Then Manager closes web app if mobile app is opened


Scenario: Verify that next level is unlocking after meeting all criterias for current level and points, attempts, high score updating and also points are updating on select level screen and leaderboard screen
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Udaipur|Design|pass|
And new player is able to login to app
And User comes to leaderboard screen
When User checks points on leaderboard screen
|Already created Player Name|
|Automation|
And user goes to select Game screen
And user selects already created MLG
|MLG Game Name|
|Automation MLG Game|
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
|1|1|all correct|Trophy|2|
And user refreshes page
And user close level popup if it appears
And user opens and verify level for alreay created MLG
|LevelNumber|
|1|
Then Points are updating on level popup for already created MLG
Then Attempts are updating on level popup for already created MLG
Then High Score is updating on level popup for already created MLG
Then Player closes level popup
Then Next level is getting unlocked after meeting all the criteria for already created MLG
|TotalPoints|Total Attempts|High Score|
|100|1|100|
And player clicks on back button game preview screen
Then verify that total points are correct on select level screen
And User clicks on back button on select level screen
And User comes to leaderboard screen
Then MLG points are adding to leaderboard
|AlreayAddedPlayerName|
|Automation|
Then Manager closes web app if mobile app is opened


Scenario: Verify that level is not unlocking if maximum points and maximum attempts meet but high score does not meet and green tick is appearing with matched criteria
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Udaipur|Design|pass|
And new player is able to login to app
And user selects already created MLG
|MLG Game Name|
|Automation MLG Game|
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|level or trophy|TotalLevels|
|1|1|random|Trophy|2|
And user refreshes page
And user opens and verify level for alreay created MLG
|LevelNumber|
|1|
Then Next level is not getting unlocked if criteria does not match for already created MLG
|TotalPoints|Total Attempts|High Score|
|100|1|100|


Scenario: Verify that level is not unlocking if maximum points and high score meet but maximum attempts does not meet
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Udaipur|Design|pass|
And new player is able to login to app
And user selects already created MLG
|MLG Game Name|
|AutomationAttemptLocked|
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|level or trophy|TotalLevels|
|1|1|all correct|Trophy|2|
And user refreshes page
And user opens and verify level for alreay created MLG
|LevelNumber|
|1|
Then Next level is not getting unlocked if criteria does not match for already created MLG
|TotalPoints|Total Attempts|High Score|
|100|5|100|

Scenario: Verify that level is not unlocking if maximum attempt and high score meet but maximum points does not meet
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Udaipur|Design|pass|
And new player is able to login to app
And user selects already created MLG
|MLG Game Name|
|AutomationPointsLocked|
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|level or trophy|TotalLevels|
|1|1|all correct|Trophy|2|
And user refreshes page
And user opens and verify level for alreay created MLG
|LevelNumber|
|1|
Then Next level is not getting unlocked if criteria does not match for already created MLG
|TotalPoints|Total Attempts|High Score|
|1000|1|100|
#
#
Scenario: Verify level complete popup after completing level and verify level complete text and verify level trophy is displaying after closing level complete popup and trophy details are correct and level trophy is displaying with the game on select game screen
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Udaipur|Design|pass|
And new player is able to login to app
And user selects already created MLG
|MLG Game Name|
|Automation MLG Game|
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|level or trophy|TotalLevels|
|1|1|all correct|Trophy|2|
Then Level number is correct on level popup
Then Complete text is appearing on level popup
|Expected Text|
|COMPLETE!|
Then Game name is correct on level popup for already created MLG
|GameName|
|GameForHighScore|
Then Points criteria is correct for already created MLG
|Points Criteria|
|100|
Then Attempt criteria is correct for already created MLG
|Attempt Criteria|
|1|
Then High score criteria is correct for already created MLG
|HighScore Criteria|
|100|
Then Points are updating on level popup for already created MLG
Then Attempts are updating on level popup for already created MLG
Then High Score is updating on level popup for already created MLG
Then Player closes level popup
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|Verify Trophy Or Level|TotalLevels|
|2|1|all correct|Level|2|
Then Level number is correct on level popup
Then Complete text is appearing on level popup
|Expected Text|
|COMPLETE!|
Then Game name is correct on level popup for already created MLG
|GameName|
|GameForLeaderboard|
Then Points criteria is correct for already created MLG
|Points Criteria|
|100|
Then Attempt criteria is correct for already created MLG
|Attempt Criteria|
|1|
Then High score criteria is correct for already created MLG
|HighScore Criteria|
|100|
Then Points are updating on level popup for already created MLG
Then Attempts are updating on level popup for already created MLG
Then High Score is updating on level popup for already created MLG
Then Player closes level popup
Then Text is correct on MLG trophy
|ExpectedTitleText|
|YOU WIN!|
Then Text is correct on MLG trophy
|ExpectedText|
|YOU HAVE SUCCESSFULLY UNLOCKED ALL LEVELS TO EARN THE TROPHY FOR THIS GAME.|
Then Text is correct on MLG trophy
|ExpectedText|
|CERTIFICATE OF COMPLETION|
Then MLG game name is correct on MLG trophy for already created MLG
|ExpectedMLGName|
|Automation MLG Game|
Then user closes MLG trophy
And User clicks on back button on select level screen
Then verify that achieved tropgy icon is appearing with already created MLG game
|MLGname|
|Automation MLG Game|




























#Scenario: Verify that level details button is appearing on profile screen and Level number, Level Name, How to win text, maximum points, maximum attempts, high score are correct and close button is working and also verify that Level number, Level Name, How to win text, maximum points, maximum attempts, high score are correct and lets go is disabled if level is unlocked  
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop: GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|No|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|200|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|2|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|70|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop(Clone): GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|No|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|500|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|3|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches specific location and clicks on select all
#|LocationName|
#||
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches specific department and clicks on select all
#|DeptName|
#||
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#Given user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|player@automation.com|pass|
#And user refresh page till game is live state on app
#And user selects recently created MLG
#And user opens and verify level
#|LevelNumber|
#|1|
#And Player clicks on LetsGo button
#Then Game preview screen is opening
#Then Level details icon is appearing on game preview screen
#Then Level popup is appearing after clicking on level details icon
#Then Game name is correct on level popup
#Then How to Win Text is appearing
#Then Points criteria is correct
#Then Attempt criteria is correct
#Then High score criteria is correct
#Then Player closes level popup
#And player clicks on back button game preview screen
#And user opens and verify level
#|LevelNumber|
#|1|
#Then Game name is correct on level popup
#Then How to Win Text is appearing
#Then Points criteria is correct
#Then Attempt criteria is correct
#Then High score criteria is correct
#Then Lets Go button is enabled
#Then Player clicks on LetsGo button
#Then Game preview screen is opening
#And player clicks on back button game preview screen
#And user opens and verify level
#|LevelNumber|
#|2|
#Then Game name is correct on level popup
#Then How to Win Text is appearing
#Then Points criteria is correct
#Then Attempt criteria is correct
#Then High score criteria is correct
#Then Lets Go button is disabled
#
#
#Scenario: Verify that next level is unlocking after meeting all criterias for current level and points, attempts, high score updating and also points are updating on select level screen and leaderboard screen
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop: GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|No|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|200|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|2|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|70|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop: GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|No|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|500|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|3|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches specific location and clicks on select all
#|LocationName|
#||
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches specific department and clicks on select all
#|DeptName|
#||
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#And User comes to leaderboard screen
#When User checks points on leaderboard screen
#|Already created Player Name|
#|Automation|
#And user goes to select Game screen
#And user refresh page till game is live state on app
#And user selects recently created MLG
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or trophy|
#|1|2|all correct|Trophy|
#And user refreshes page
#And user close level popup if it appears
#And user opens and verify level
#|LevelNumber|
#|1|
#Then Points are updating on level popup
#Then Attempts are updating on level popup
#Then High Score is updating on level popup
#Then Player closes level popup
#Then Next level is getting unlocked after meeting all the criteria
#And player clicks on back button game preview screen
#Then verify that total points are correct on select level screen
#And User clicks on back button on select level screen
#And User comes to leaderboard screen
#Then MLG points are adding to leaderboard
#|AlreayAddedPlayerName|
#|Automation|
#
#
#Scenario: Verify that level is not unlocking if maximum points and maximum attempts meet but high score does not meet and green tick is appearing with matched criteria
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop(Clone): GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|100|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|100|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop(Clone): GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|500|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches specific location and clicks on select all
#|LocationName|
#||
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches specific department and clicks on select all
#|DeptName|
#||
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#And user is on home page
#And User is logged In
   #|UserName|Password|
   #|vishal.automation@codewalla.com|pass|
#And user refresh page till game is live state on app
#And user selects recently created MLG
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|level or trophy|
#|1|1|random|Trophy|
#And user refreshes page
#And user opens and verify level
#|LevelNumber|
#|1|
#Then Next level is not getting unlocked if criteria does not match
#
#Scenario: Verify that level is not unlocking if maximum points and high score meet but maximum attempts does not meet
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|100|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|2|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|100|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|500|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches specific location and clicks on select all
#|LocationName|
#||
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches specific department and clicks on select all
#|DeptName|
#||
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#And user refresh page till game is live state on app
#And user selects recently created MLG
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level Or Trophy|
#|1|1|all correct|Trophy|
#Then Next level is not getting unlocked if criteria does not match
#Then grren tick is appearing with points if points criteria matched
#Then green tick is appearing with attempts if attempt criteria matched
#Then green tick is appearing with high score if high score criteria matched
#
#
#Scenario: Verify that level is not unlocking if maximum attempt and high score meet but maximum points does not meet
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop(Clone): GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|2000|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|100|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop: GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|No|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|500|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches specific location and clicks on select all
#|LocationName|
#||
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches specific department and clicks on select all
#|DeptName|
#||
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#And user refresh page till game is live state on app
#And user selects recently created MLG
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or Trophy|
#|1|1|all correct|Trophy|
#Then Next level is not getting unlocked if criteria does not match
#
#Scenario: Verify level complete popup after completing level and verify level complete text and verify level trophy is displaying after closing level complete popup and trophy details are correct and level trophy is displaying with the game on select game screen
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop(Clone): GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|100|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|50|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|No|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|100|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches specific location and clicks on select all
#|LocationName|
#||
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches specific department and clicks on select all
#|DeptName|
#||
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#And user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.automation@codewalla.com|pass|
#And user refresh page till game is live state on app
#And user selects recently created MLG
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or Trophy|
#|1|1|all correct|Level|
#Then Level number is correct on level popup
#Then Complete text is appearing on level popup
#|Expected Text|
#|COMPLETE!|
#Then Game name is correct on level popup
#Then Points criteria is correct
#Then Attempt criteria is correct
#Then High score criteria is correct
#Then Points are updating on level popup
#Then Attempts are updating on level popup
#Then High Score is updating on level popup
#Then Player closes level popup
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Verify Trophy Or Level|
#|2|1|all correct|Level|
#Then Level number is correct on level popup
#Then Complete text is appearing on level popup
#|Expected Text|
#|COMPLETE!|
#Then Game name is correct on level popup
#Then Points criteria is correct
#Then Attempt criteria is correct
#Then High score criteria is correct
#Then Points are updating on level popup
#Then Attempts are updating on level popup
#Then High Score is updating on level popup
#Then Player closes level popup
#Then Text is correct on MLG trophy
#|ExpectedTitleText|
#|YOU WIN!|
#Then Text is correct on MLG trophy
#|ExpectedText|
#|You have successfully unlocked all levels and earned the|
#Then Text is correct on MLG trophy
#|ExpectedText|
#|Game Trophy.|
#Then MLG game name is correct on MLG trophy
#Then user closes MLG trophy
#And User clicks on back button on select level screen
#Then verify that achieved tropgy icon is appearing with MLG game
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#This is a bug, Without refreshing level complete popup does not appears sometimes, specially for levels before last levels
#@TheShop
#Scenario: Verify that level complete popup is appearing after completing game
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager add a player to specific location and department
#|LocationName|Department Name|Password|
#|Udaipur|Design|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop(Clone): GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|100|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|50|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop: GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|No|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|100|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches location
#And Manager selects location
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches department
#And Manager selects department
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#And new player is able to login to app
#And user refresh page till game is live state on app
#And user selects recently created MLG
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or Trophy|
#|1|1|all correct|Level|
#Then Level number is correct on level popup
#Then Complete text is appearing on level popup
#|Expected Text|
#|COMPLETE!|
#
#Scenario: Verify that MLG game name, MLG game rule, MLG points and level are showing correctly
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager add a player to specific location and department
#|LocationName|Department Name|Password|
#|Udaipur|Design|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop: GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|200|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|2|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|70|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop: GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|500|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|3|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches location
#And Manager selects location
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches department
#And Manager selects department
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#And new player is able to login to app
#And user refresh page till game is live state on app
#And user selects recently created MLG
#Then Rules icon is appearing on the screen
#Then MLG game name is correct 
#Then Total points are zero before playing game
#Then Level indicator is displaying with trophy image
#Then Level count is correct
#Then Lock image is appearing for levels which are after level one
#Then Game over text is appearing
#Then Rules are correct after opening rules 
#
#Scenario: Verify that level details button is appearing on profile screen and Level number, Level Name, How to win text, maximum points, maximum attempts, high score are correct and close button is working
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager add a player to specific location and department
#|LocationName|Department Name|Password|
#|Udaipur|Design|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop: GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|No|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|200|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|2|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|70|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop: GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|No|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|500|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|3|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches location
#And Manager selects location
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches department
#And Manager selects department
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#And new player is able to login to app
#And user refresh page till game is live state on app
#And user selects recently created MLG
#And user opens and verify level
#|LevelNumber|
#|1|
#And Player clicks on LetsGo button
#Then Game preview screen is opening
#Then Level details icon is appearing on game preview screen
#Then Level popup is appearing after clicking on level details icon
#Then Game name is correct on level popup
#Then How to Win Text is appearing
#Then Points criteria is correct
#Then Attempt criteria is correct
#Then High score criteria is correct
#Then Player closes level popup
#
#
#Scenario: Verify that total points are updating on leaderboard after playing game under MLG
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager add a player to specific location and department
#|LocationName|Department Name|Password|
#|Udaipur|Design|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop(Clone): GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|2000|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|100|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop(Clone): GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|No|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|500|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches location
#And Manager selects location
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches department
#And Manager selects department
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#And new player is able to login to app
#And user refresh page till game is live state on app
#And user selects recently created MLG
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or Trophy|
#|1|1|all correct|Trophy|
#Then verify that total points are correct on select level screen
#And User clicks on back button on select level screen
#And User comes to leaderboard screen
#Then MLG points are adding to leaderboard
#|AlreayAddedPlayerName|
#|Brian|
#
#
#Scenario: Verify that green tick mark is appearing if crteria matched on level popup
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager add a player to specific location and department
#|LocationName|Department Name|Password|
#|Udaipur|Design|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop: GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|5000|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|50|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop(Clone): GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|No|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|500|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches location
#And Manager selects location
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches department
#And Manager selects department
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#And new player is able to login to app
#And user refresh page till game is live state on app
#And user selects recently created MLG
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or Trophy|
#|1|1|all correct|Trophy|
#And user refreshes page
#And user opens and verify level
#|LevelNumber|
#|1|
#Then grren tick is appearing with points if points criteria matched
#Then green tick is appearing with attempts if attempt criteria matched
#Then green tick is appearing with high score if high score criteria matched
#
#Scenario: Verify that points, attempts and high score are updating after playing game
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager add a player to specific location and department
#|LocationName|Department Name|Password|
#|Udaipur|Design|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop: GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|2000|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|100|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop(Clone): GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|No|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|500|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches location
#And Manager selects location
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches department
#And Manager selects department
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#And new player is able to login to app
#And user refresh page till game is live state on app
#And user selects recently created MLG
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or Trophy|
#|1|1|all correct|Trophy|
#And user refreshes page
#And user opens and verify level
#|LevelNumber|
#|1|
#Then Points are updating on level popup
#Then Attempts are updating on level popup
#Then High Score is updating on level popup
#
#Scenario: Verify that level trophy is achieving after unlocking all the levels and level trophy is displaying with the game on select game screen
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager add a player to specific location and department
#|LocationName|Department Name|Password|
#|Udaipur|Design|pass|
#And Manager enters random MLG game name
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop: GameForHighScore|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|0|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|Yes|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|0|100|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|0|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|0|50|
#And Manager clicks on Add Level button
#And Manger search already created game and select
#|GameName|
#|The Shop(Clone): GameForLeaderboard|
#And Manager clicks on Add button
#And Manager clicks on Add Criteria button
#|Level|
#|1|
#And Manager selects total points criteria
#|SetCriteria|
#|Yes|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|No|
#And Manager clicks on done button
#And Manager enters total points for MLG
#|Level|Total Points|
#|1|100|
#And Manager enters minimum attempts for MLG
#|Level|Total Attempts|
#|1|1|
#And Manager enters high score of MLG
#|Level|High Score|
#|1|60|
#And Manager enters rule
#|Rule|
#|MLG rule for testing|
#And Manager clicks on Add Players button
#And Manager clicks on Add button on add players page
#And Manager searches location
#And Manager selects location
#And Manager clicks on done button
#And Manager clicks on Add button on add players page
#And Manager searches department
#And Manager selects department
#And Manager clicks on done button
#And Manager turns on status
#And Manager clicks on Turn On button
#And MLG live success message is appearing
#|ExpectedText|
#|This Multilevel Game is now live|
#And new player is able to login to app
#And user refresh page till game is live state on app
#And user selects recently created MLG
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or Trophy|
#|1|1|all correct|Trophy|
#And user refreshes page
#And user close level popup if it appears
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or Trophy|
#|2|1|all correct|Trophy|
#Then Text is correct on MLG trophy
#|ExpectedTitleText|
#|YOU WIN!|
#Then Text is correct on MLG trophy
#|ExpectedText|
#|You have successfully unlocked all levels and earned the|
#Then Text is correct on MLG trophy
#|ExpectedText|
#|Game Trophy.|
#Then MLG game name is correct on MLG trophy
#Then user closes MLG trophy
#And User clicks on back button on select level screen
#Then verify that achieved tropgy icon is appearing with MLG game