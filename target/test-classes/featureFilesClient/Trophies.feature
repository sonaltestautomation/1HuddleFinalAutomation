Feature: Trophies Feature with Social Sharing

Scenario: Verify that player is getting correct trophy for his 1st Game and share trophy is working
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
And user wait for loading animation to be disappeared
When User play game for trophies without giving answers
|GameName|GamePlayCount|
|GameForLeaderboard|1|
Then trophy header, trophy title and trophy subtitle is correct
|TrophyTitle|TrophySubTitle|
|1st Game|Boom! You completed your 1st game!|
When user verify and click social share button
Then Share modal title is correct
And Facebook sharing is working
And LinkdIn sharing is working
And Twitter sharing is working
And Mail sharing is working
And Manager closes web app if mobile app is opened

Scenario: Verify that player is getting correct trophy if player gives 100% correct answer and verify share trophy
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
And user wait for loading animation to be disappeared
When User play game for trophies
|GameName|AnswerType|GamePlayCount|
|GameForLeaderboard|all correct|1|
Then trophy header, trophy title and trophy subtitle is correct
|TrophyTitle|TrophySubTitle|
|100%|Perfect! You Scored 100% on a game.|
When user verify and click social share button
Then Share modal title is correct
And Facebook sharing is working
And LinkdIn sharing is working
And Twitter sharing is working
And Mail sharing is working
And Manager closes web app if mobile app is opened

Scenario: Verify that player is getting correct trophy if player playes 5 games in a week and share trophy options are working
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
And user wait for loading animation to be disappeared
When User play game for trophies without giving answers
|GameName|GamePlayCount|
|GameForLeaderboard|5|
Then trophy header, trophy title and trophy subtitle is correct
|TrophyTitle|TrophySubTitle|
|5 Games in a Week.|You completed 5 games in a week.|
When user verify and click social share button
Then Share modal title is correct
And Facebook sharing is working
And LinkdIn sharing is working
And Twitter sharing is working
And Mail sharing is working
And Manager closes web app if mobile app is opened
#
Scenario: Verify that trophy icon is appearing with gamename and player is getting game trophy after meeting criteria to achieve it
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
And new player is able to login to app
And user wait for loading animation to be disappeared
When User play game for game trophies
|AnswerType|GamePlayCount|
|all correct|1|
Then Game Trophy Title is correct
|Expected Title|
|TROPHY ACHIEVED|
And Game Trophy name is correct after ending game
And Total points, Attempts and High Score is correct
And User closes all the trophies
And user goes to select Game screen
Then Game trophy is appearing with gamename
And Manager closes web app if mobile app is opened






#And user verify and click social share button
#And Share modal title is correct
#And Facebook sharing is working
#And LinkdIn sharing is working
#And Twitter sharing is working
#And Mail sharing is working
#
#
#
#
#
#
#
#Scenario: Verify that player is getting trophy if player play games for 100 mins
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager@automation.com|pass|
#And Manager creates a game
#|GameName|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|Game Preview Title|Game Scenario|Game Attempts|
#|GameForLeaderboard|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|This is game preview for automation testing|This is game scenario for automation testing|10|
#And Manager add a player
#|DepartmentName|Password|
#|ALL|pass|
#And new player is able to login to app
#When User play game for a specific time
#|AnswerType|GamePlayCount|timeMin|
#|all correct|1|2|
#Then trophy header, trophy title and trophy subtitle is correct
#|TrophyTitle|TrophySubTitle|
#|100%|Perfect! You Scored 100% on a game.|
#When user verify and click social share button
#Then Share modal title is correct
#And Facebook sharing is working
#And LinkdIn sharing is working
#And Twitter sharing is working
#And Mail sharing is working