Feature: Detailed Report

#Scenario: Verify that Detailed Report headers are correct for Player wise report
#
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager add a player to specific location and department
#|LocationName|Department Name|Password|
#|Udaipur|Design|pass|
#And Manager clicks on Dashboard side menu button
#Then Dashboard screen is opening
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Player|
#And Manager clicks on filter
#|Filter Type|
#|Mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|All Games|
#And Manager clicks on Add a filter button
#And Manager clicks on submenu arrow button
#|FilterType|
#|Player|
#And Manager enters recently played player name
#And Manager selects searched item
#Then Column header name is correct on detailed report
#|Expected Text|
#|Games [SP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Time [SP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Points [SP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Last Played [SP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Games [MP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Time [MP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Points [MP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Wins [MP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Last Played [MP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Rating|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Department|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Location|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Group|


#Scenario: Verify that player data is showing correctly on detailed reports
#
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#
#And Manager add a player to specific location department and group
#|LocationName|Department Name|Password|Group|
#|Udaipur|Design|pass|Group A|
#
#And Manager enters random game name
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
#And new player is able to login to app
#And user wait for loading animation to be disappeared
#And User play recently created game for statistics
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Player|
#And Manager clicks on filter
#|Filter Type|
#|mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|all_games|
#And Manager clicks on Add a filter button
#And Manager clicks on submenu arrow button
#|FilterType|
#|Player|
#And Manager enters recently played player name
#And Manager selects searched item
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|This Month|
#Then SP game count is correct on player wise detailed report
#Then Time SP is correct on player wise detailed report
#Then Points SP is correct on player wise detailed report
#Then Last Played SP is correct on player wise detailed report
#Then MP game count is correct on player wise detailed report
#Then MP time is correct on detailed report
#Then Points MP is correct on player wise detailed report
#Then Wins MP is correct on player wise detailed report
#Then Last Played MP is correct on player wise detailed report
#Then Rating is correct on player wise detailed report
#|Expected Rating|
#|100|
#Then Department is correct on player wise detailed report
#Then Location is correct on player wise detailed report
#Then Group is correct on player wise detailed report
#
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|Today|
#Then SP game count is correct on player wise detailed report
#Then Time SP is correct on player wise detailed report
#Then Points SP is correct on player wise detailed report
#Then Last Played SP is correct on player wise detailed report
#Then MP game count is correct on player wise detailed report
#Then MP time is correct on detailed report
#Then Points MP is correct on player wise detailed report
#Then Wins MP is correct on player wise detailed report
#Then Last Played MP is correct on player wise detailed report
#Then Rating is correct on player wise detailed report
#|Expected Rating|
#|100|
#Then Department is correct on player wise detailed report
#Then Location is correct on player wise detailed report
#Then Group is correct on player wise detailed report
#
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|This Week|
#Then SP game count is correct on player wise detailed report
#Then Time SP is correct on player wise detailed report
#Then Points SP is correct on player wise detailed report
#Then Last Played SP is correct on player wise detailed report
#Then MP game count is correct on player wise detailed report
#Then MP time is correct on detailed report
#Then Points MP is correct on player wise detailed report
#Then Wins MP is correct on player wise detailed report
#Then Last Played MP is correct on player wise detailed report
#Then Rating is correct on player wise detailed report
#|Expected Rating|
#|100|
#Then Department is correct on player wise detailed report
#Then Location is correct on player wise detailed report
#Then Group is correct on player wise detailed report
#
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|Last Week|
#Then SP game count is correct on player wise detailed report
#Then Time SP is correct on player wise detailed report
#Then Points SP is correct on player wise detailed report
#Then Last Played SP is correct on player wise detailed report
#Then MP game count is correct on player wise detailed report
#Then MP time is correct on detailed report
#Then Points MP is correct on player wise detailed report
#Then Wins MP is correct on player wise detailed report
#Then Last Played MP is correct on player wise detailed report
#Then Rating is correct on player wise detailed report
#|Expected Rating|
#|100|
#Then Department is correct on player wise detailed report
#Then Location is correct on player wise detailed report
#Then Group is correct on player wise detailed report
#
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|Last Month|
#Then SP game count is correct on player wise detailed report
#Then Time SP is correct on player wise detailed report
#Then Points SP is correct on player wise detailed report
#Then Last Played SP is correct on player wise detailed report
#Then MP game count is correct on player wise detailed report
#Then MP time is correct on detailed report
#Then Points MP is correct on player wise detailed report
#Then Wins MP is correct on player wise detailed report
#Then Last Played MP is correct on player wise detailed report
#Then Rating is correct on player wise detailed report
#|Expected Rating|
#|100|
#Then Department is correct on player wise detailed report
#Then Location is correct on player wise detailed report
#Then Group is correct on player wise detailed report

#Scenario: Verify that user is getting custom detailed report
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager add a player to specific location and department
#|LocationName|Department Name|Password|
#|Udaipur|Design|pass|
#And Manager clicks on Dashboard side menu button
#Then Dashboard screen is opening
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Player|
#And Manager clicks on filter
#|Filter Type|
#|Mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|All Games|
#And Manager clicks on Add a filter button
#And Manager clicks on submenu arrow button
#|FilterType|
#|Player|
#And Manager enters recently played player name
#And Manager selects searched item
#And Manager clicks on time filter
#And Manager selects custom duration from duration list
#Then correct modal is opening
#|Modal Name|
#|Send by Email|
#And user closes default email id chip
#And user clicks on Add Email chip
#And user enters email and hit enter
#|Email|
#|vishal.1huddle@gmail.com|
#And user clicks on button on the modal
#|Button Name|
#|SEND EMAIL|
#Then success message is appearing after sending detailed report
#|Expected Text|
#|It's on the way! The report will be e-mailed to the selected e-mail addresses.|
#And user is on Gmail home page
#Then detailed report should be received to manager on his email
#|Email|Password|
#|vishal.1huddle@gmail.com|Vk@131991|


#Scenario: Verify that player rating is correct in detailed report
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager add a player to specific location and department
#|LocationName|Department Name|Password|
#|Udaipur|Design|pass|
#And new player is able to login to app
#And user wait for loading animation to be disappeared
#And User play already created game and calculate rating
#|GameName|GamePlayCount|AnswerType|
#|GameForLeaderboard|2|random|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Player|
#And Manager clicks on filter
#|Filter Type|
#|mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|all_games|
#And Manager clicks on Add a filter button
#And Manager clicks on submenu arrow button
#|FilterType|
#|Player|
#And Manager enters recently played player name
#And Manager selects searched item
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|This Month|
#Then Rating is correct on player wise detailed report if player gives random answers

#Scenario: Verify that Detailed Report headers are correct for MLG detailed report
#
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager clicks on Dashboard side menu button
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Multilevel|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|All|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Multilevel Game|
#And Manager enters already created MLG name and select it
#|MLG Game Name|
#|Automation MLG Game|
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|Last Month|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Games [SP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Player|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Games [SP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Time [SP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Points [SP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Last Played [SP]|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Rating|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Department|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Location|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Group|

#Scenario: Verify that detailed report is showing correctly for MLG
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager add a player to specific location and department
#|LocationName|Department Name|Password|
#|Udaipur|Design|pass|
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
#|No|
#And Manager selects minium attempts criteria
#|SetCriteria|
#|Yes|
#And Manager selects high score criteria
#|SetCriteria|
#|No|
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
#|No|
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
#|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
#|1|1|all wrong|Trophy|2|
#And user refreshes page
#And user close level popup if it appears
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
#|2|1|all correct|Trophy|2|
#And Manager is on Admin Home page
#And Manager clicks on Dashboard side menu button
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Multilevel|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|won|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|won|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Multilevel Game|
#And Manager enters recently created mlg game name and select it
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|This Month|
#Then player name is correct in MLG detailed report
#Then games count is correct in MLG detailed report
#Then Time is correct in MLG detailed report
#Then Points are correct in MLG detailed report
#Then Last Played date is correct in MLG detailed report
#Then Rating is correct in MLG detailed report
#|ExpectedRating|
#|40|
#Then Department is correct in MLG detailed report
#Then Location is correct in MLG detailed report
#Then Group is correct in MLG detailed report


#Scenario: Verify that single level game detailed report is showing correctly
#
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#
#And Manager add a player to specific location department and group
#|LocationName|Department Name|Password|Group|
#|Udaipur|Design|pass|Group A|
#
#And Manager enters random game name
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
#And new player is able to login to app
#And user wait for loading animation to be disappeared
#And User play recently created game for statistics
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Single Level|
#And Manager clicks on filter
#|Filter Type|
#|status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|all_players|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Game|
#And Manager enters recently created game name and select it
#And Manager clicks on Add a filter button
#And Manager clicks on filter
#|Filter Type|
#|Location|
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#And Manager clicks on Add a filter button
#And Manager mouse hove on filter
#|Filter Type|
#|Department|
#And Manager enters department name and select it
#|Department Name|
#|Design|
#And Manager clicks on done button on the search result list
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|This Month|
#And Manager clicks on column header to sorting
#|Header Name|
#|Games [SP]|
#Then SP game count is correct on single level detailed report
#Then Time SP is correct on single level detailed report
#Then Points SP is correct on single level detailed report
#Then Last Played SP is correct on single level detailed report
#Then MP game count is correct on single level  detailed report
#Then MP time is correct on single level detailed report
#Then Points MP is correct on single detailed report
#Then Wins MP is correct on single level detailed report
#Then Last Played MP is correct on single level detailed report
#Then Rating is correct on single level detailed report
#|Expected Rating|
#|100|
#Then Department is correct on single level detailed report
#Then Location is correct single level detailed report
#Then Group is correct on single level detailed report


#Scenario: Verify that total game play report is appearing after clicking on a player in detailed report list and player game played data is showing correctly
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager add a player to specific location department and group
#|LocationName|Department Name|Password|Group|
#|Udaipur|Design|pass|Group A|
#And Manager enters random game name
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
#|10|
#And new player is able to login to app
#And user wait for loading animation to be disappeared
#And User play recently created game for statistics
#|GamePlayCount|AnswerType|
#|2|all correct|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Player|
#And Manager clicks on filter
#|Filter Type|
#|mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|all_games|
#And Manager clicks on Add a filter button
#And Manager clicks on submenu arrow button
#|FilterType|
#|Player|
#And Manager enters recently played player name
#And Manager selects searched item
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|This Month|
#And Manager clicks on player to open its report
#Then Verify that correct tabs are appearing on player report card
#|Tab Name|
#|Total Gameplay|
#Then Verify that correct tabs are appearing on player report card
#|Tab Name|
#|Single Player Games|
#Then Verify that correct tabs are appearing on player report card
#|Tab Name|
#|Multiplayer Games|
#Then Verify that correct tabs are appearing on player report card
#|Tab Name|
#|Achievement|
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|SINGLE PLAYER|
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|MULTIPLAYER|
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|Games Played|
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|Time Played|
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|Games Played|
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|Time Played|
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|Rookie|
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|Starter|
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|Professional|
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|All Star|
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|Master|
#Then verify that game played count is correct for Single Player game on the card
#Then verify that time played is correct for Single Player game on the card
#Then verify that game played count is correct for Multi Player game on the card
#Then verify that time played is correct for Multi Player game on the card
#Then verify that achieved date is correct with rookie level card
#Then game count is correct with Rookie, Starter, Professional, All Star and Master level in player card under detailed report
#|RookieGameCount|StarterGameCount|ProfessionalGameCount|AllStarGameCount|MasterGameCount|
#|1|100|350|500|1,000|


#Scenario: Verify that single player games report is appearing after clicking on single player games tab in detailed report list and game played data is showing correctly
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager add a player to specific location department and group
#|LocationName|Department Name|Password|Group|
#|Udaipur|Design|pass|Group A|
#And Manager enters random game name
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
#|10|
#And new player is able to login to app
#And user wait for loading animation to be disappeared
#And User play recently created game for statistics
#|GamePlayCount|AnswerType|
#|1|random|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Player|
#And Manager clicks on filter
#|Filter Type|
#|mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|all_games|
#And Manager clicks on Add a filter button
#And Manager clicks on submenu arrow button
#|FilterType|
#|Player|
#And Manager enters recently played player name
#And Manager selects searched item
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|This Month|
#And Manager clicks on player to open its report
#And Manager selects tab in detailed report
#|Tab Name|
#|Single Player Games|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Game|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Points|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Accuracy|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Time Spent|
#Then Column header name is correct on detailed report
#|Expected Text|
#|Played On|
#Then verify that total games in game list is showing correctly in single player games report
#Then verify that game name is showing correctly in the single player games report
#Then verify that points are showing correctly in the single player games report
#Then verify that game accuracy is showing correctly in the single player games report
#Then verify that time spent is showing corectly in the single player games report
#Then verify that played on date is showing corectly in the single player games report
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|Items per page:|
#Then verify that items per page count is showing correctly

#Scenario: verify that options icon, download report and send email is appearing and working and Download and Send by Email options are working
#
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager add a player to specific location department and group
#|LocationName|Department Name|Password|Group|
#|Udaipur|Design|pass|Group A|
#And Manager enters random game name
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
#|10|
#And new player is able to login to app
#And user wait for loading animation to be disappeared
#And User play recently created game for statistics
#|GamePlayCount|AnswerType|
#|1|random|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Player|
#And Manager clicks on filter
#|Filter Type|
#|mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|all_games|
#And Manager clicks on Add a filter button
#And Manager clicks on submenu arrow button
#|FilterType|
#|Player|
#And Manager enters recently played player name
#And Manager selects searched item
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|This Month|
#And Manager clicks on player to open its report
#Then options icon is appearing and working on detailed report
#Then download button is appearing under option on detailed report
#|Expected Text|
#|Download|
#Then send by email button is appearing under option on detailed report
#|Expected Text|
#|Send by Email|
#And Manager clicks on send by email button
#Then correct modal is opening
#|Modal Name|
#|Send by Email|
#And user closes default email id chip
#And user clicks on Add Email chip
#And user enters email and hit enter
#|Email|
#|vishal.1huddle@gmail.com|
#And user clicks on button on the modal
#|Button Name|
#|SEND EMAIL|
#Then success message is appearing after sending detailed report
#|Expected Text|
#|It's on the way! The report will be e-mailed to the selected e-mail addresses.|
#Then options icon is appearing and working on detailed report
#And Manager clicks on download button
#Then success message is appearing after downloading report
#|Expected Text|
#|Downloading reports...|

#Scenario: Verify that No records found is appearing if player not played any MP game
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager add a player to specific location department and group
#|LocationName|Department Name|Password|Group|
#|Udaipur|Design|pass|Group A|
#And Manager enters random game name
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
#|10|
#And new player is able to login to app
#And user wait for loading animation to be disappeared
#And User play recently created game for statistics
#|GamePlayCount|AnswerType|
#|1|random|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Player|
#And Manager clicks on filter
#|Filter Type|
#|mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|all_games|
#And Manager clicks on Add a filter button
#And Manager clicks on submenu arrow button
#|FilterType|
#|Player|
#And Manager enters recently played player name
#And Manager selects searched item
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|This Month|
#And Manager clicks on player to open its report
#And Manager selects tab in detailed report
#|Tab Name|
#|Multiplayer Games|
#Then text is correct on blank screen
#|Expected Text|
#|No records found.|


#Scenario: Verify that achievements are showing correctly in detailed report and download icon is showing as disabled
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager add a player
#	|DepartmentName|Password|
  #|ALL|pass|          
#And Manager clicks on GamesIcon
#And Manager clicks on Trophies
#And Manager selects tab
#|Tab name|
#|By Game|
#And Manager selects Trophy filter
#And Manager enters already created game trophy name and search
#|Game Name|
#|Trophy Game Play|
#And Manager clicks on option burger button
#And Manager clicks on edit button
#And Manager enters point
#|Points|
#|100|
#And Manager enters attempts
#|Attempts|
#|1|
#And Manager selects high score
#|High Score|
#|100|
#And Manager enters trophy description
#|Description|
#|This is test description|
#And Manager clicks on Update button
#And new player is able to login to app
#And user wait for loading animation to be disappeared
#When User play game for game trophies
#|AnswerType|GamePlayCount|
#|all correct|1|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Player|
#And Manager clicks on filter
#|Filter Type|
#|mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|all_games|
#And Manager clicks on Add a filter button
#And Manager clicks on submenu arrow button
#|FilterType|
#|Player|
#And Manager enters recently played player name
#And Manager selects searched item
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|This Month|
#And Manager clicks on player to open its report
#And Manager selects tab in detailed report
#|Tab Name|
#|Achievement|
#Then verify that total achieved trophy count is correct
#|Expected Count|
#|3|
#Then verify that trophy title and sub title is correct under achievement tab in detailed report
#|Title|Sub Title|
#|100%|Perfect! You Scored 100% on a game.|
#Then verify that trophy title and sub title is correct under achievement tab in detailed report
#|Title|Sub Title|
#|1st Game|Boom! You completed your 1st game!|
#Then verify that trophy title and sub title is correct under achievement tab in detailed report
#|Title|Sub Title|
#|Trophy Game Play|Boom! Trophy unlocked.|


Scenario: Verify that attempted question report is showing correctly
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|vishal.1huddle+1@gmail.com|pass|
And Manager add a player to specific location department and group
|LocationName|Department Name|Password|Group|
|Udaipur|Design|pass|Group A|
And Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|No of correct option|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|4|4|1|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And click on Done button on gamepreview page
And Schedule Game 
|Game Attempts|
|10|
And new player is able to login to app
And user wait for loading animation to be disappeared
And User play recently created game for statistics
|GamePlayCount|AnswerType|
|1|random|
And Manager is on Admin Home page
Then Dashboard screen is opening
And Manager clicks on Detailed Report tab
And Manager clicks on filter
|Filter Type|
|by|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Player|
And Manager clicks on filter
|Filter Type|
|mode|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Mode|all_games|
And Manager clicks on Add a filter button
And Manager clicks on submenu arrow button
|FilterType|
|Player|
And Manager enters recently played player name
And Manager selects searched item
And Manager clicks on time filter
And Manager selects time duration in time filter on detailed report page
|Duration Type|
|This Month|
And Manager clicks on player to open its report
And Manager selects tab in detailed report
|Tab Name|
|Single Player Games|
And Manager clicks on game to open question attempt report
Then Verify that correct text is appearing on the card
|Expected Text|
|Showing All Attempted Questions|
Then Column header name is correct on detailed report
|Expected Text|
|Card#|
Then Column header name is correct on detailed report
|Expected Text|
|Question|
Then Column header name is correct on detailed report
|Expected Text|
|Points|
Then Column header name is correct on detailed report
|Expected Text|
|Time|
Then verify that correct tick is appearing with the correct answered question and points and time is correct with the question















#Then verify that points are showing correctly in the single player games report
#Then verify that game accuracy is showing correctly in the single player games report
#Then verify that time spent is showing corectly in the single player games report
#Then verify that played on date is showing corectly in the single player games report
#Then Verify that correct text is appearing on the card
#|Expected Text|
#|Items per page:|
#Then verify that items per page count is showing correctly






























#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|Today|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|This Week|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|Last Week|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|Last Month|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on filter
#|Filter Type|
#|mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|live_games|
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|This Month|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|Today|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|This Week|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|Last Week|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|Last Month|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#
#And manager clicks on game library
#And Manager clicks on options button on recently created game
#And manager clicks on schedule in options list
#And manager selects limit
#And manager clicks on delete button on schedule game screen
#And manager clicks on yes button on delete limit confirmation popup
#Then correct message is appearing on the page
#|Expected Message|
#|This game has not been scheduled yet. Click '+' to add new schedule.|
#Then manager clicks on dashboard button
#
#And Manager clicks on filter
#|Filter Type|
#|mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|All Games|
#
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|This Month|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|Today|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|This Week|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|Last Week|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct
#And Manager clicks on time filter
#And Manager selects time duration in time filter
#|Duration Type|
#|Last Month|
#Then Practice game count is correct
#Then Live game count is correct
#Then Trophies achieved count is correct
#|Expected Count|
#|2|
#Then Participation time is correct

#Scenario: Verify that player data is showing correctly on team wise dashboard for differnt time durations when specific location is seleted 
#
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Team|
#And Manager clicks on filter
#|Filter Type|
#|Mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|All Games|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|All Players|
#And Manager clicks on filter
#|Filter Type|
#|Locations|
#And manager clicks on select all checkBox in the textbox
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#And Manager gets Game Played count
#And Manager gets Thophies achieved count
#And Manager gets Participation
#And Manager add players to specific location and department
#|Player Count|LocationName|Department Name|Password|
#|2|Udaipur|Design|pass|
#And Manager enters random game name
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
#And User play recently created game for statistics with different users
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Team|
#And Manager clicks on filter
#|Filter Type|
#|Locations|
#And manager clicks on select all checkBox in the textbox
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#
#
#Then games played count is correct on dashboard
#Then Trophies achieved count is correct for team wise dashboard
#|Expected Count of trophy when 2 players played|
#|4|
#Then participation count is correct on dashboard for team wise filter
#
#Scenario: Verify that player data is showing correctly on team wise dashboard for specific location and department with different time filters when
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Team|
#And Manager clicks on filter
#|Filter Type|
#|Mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|All Games|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|All Players|
#And Manager clicks on filter
#|Filter Type|
#|Locations|
#And manager clicks on select all checkBox in the textbox
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#
#And Manager clicks on Add a filter button
#And Manager clicks on filter
#|Filter Type|
#|Department|
#And Manager enters department name and select it
#|Department Name|
#|Design|
#And Manager clicks on done button on the search result list
#
#And Manager gets Game Played count
#And Manager gets Thophies achieved count
#And Manager gets Participation
#And Manager add players to specific location and department
#|Player Count|LocationName|Department Name|Password|
#|2|Udaipur|Design|pass|
#And Manager enters random game name
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
#And User play recently created game for statistics with different users
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Team|
#And Manager clicks on filter
#|Filter Type|
#|Locations|
#And manager clicks on select all checkBox in the textbox
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#
#And Manager clicks on Add a filter button
#And Manager clicks on filter
#|Filter Type|
#|Department|
#And Manager enters department name and select it
#|Department Name|
#|Design|
#And Manager clicks on done button on the search result list
#Then games played count is correct on dashboard
#Then Trophies achieved count is correct for team wise dashboard
#|Expected Count of trophy when 2 players played|
#|4|
#Then participation count is correct on dashboard for team wise filter
#
#Scenario: Verify that player data is showing correctly on team wise dashboard for specific location and department different time filters when status is active players
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Team|
#And Manager clicks on filter
#|Filter Type|
#|Mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|All Games|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|Active Players|
#And Manager clicks on filter
#|Filter Type|
#|Locations|
#And manager clicks on select all checkBox in the textbox
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#And Manager clicks on Add a filter button
#And Manager clicks on filter
#|Filter Type|
#|Department|
#And Manager enters department name and select it
#|Department Name|
#|Design|
#And Manager clicks on done button on the search result list
#And Manager gets Game Played count
#And Manager gets Thophies achieved count
#And Manager gets Participation
#And Manager add players to specific location and department
#|Player Count|LocationName|Department Name|Password|
#|2|Udaipur|Design|pass|
#And Manager enters random game name
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
#And User play recently created game for statistics with different users
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on user icon in side menu
#And Manager clicks on Players button in side menu
#And Manager deactive all the recently added players
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Team|
#And Manager clicks on filter
#|Filter Type|
#|Locations|
#And manager clicks on select all checkBox in the textbox
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#And Manager clicks on Add a filter button
#And Manager clicks on filter
#|Filter Type|
#|Department|
#And Manager enters department name and select it
#|Department Name|
#|Design|
#And Manager clicks on done button on the search result list
#
#Then games played count is correct on dashboard for active players
#Then Trophies achieved count is correct on dashboard for active players
#|Expected Count of trophy when 2 players played|
#|4|
#Then participation count is correct on dashboard for active players
#
#Scenario: Verify that player data is showing correctly on team wise dashboard for specific location different time filters when status is active players
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Team|
#And Manager clicks on filter
#|Filter Type|
#|Mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|All Games|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|Active Players|
#And Manager clicks on filter
#|Filter Type|
#|Locations|
#And manager clicks on select all checkBox in the textbox
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#And Manager gets Game Played count
#And Manager gets Thophies achieved count
#And Manager gets Participation
#And Manager add players to specific location and department
#|Player Count|LocationName|Department Name|Password|
#|2|Udaipur|Design|pass|
#And Manager enters random game name
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
#And User play recently created game for statistics with different users
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on user icon in side menu
#And Manager clicks on Players button in side menu
#And Manager deactive all the recently added players
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Team|
#And Manager clicks on filter
#|Filter Type|
#|Locations|
#And manager clicks on select all checkBox in the textbox
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#Then games played count is correct on dashboard for active players
#Then Trophies achieved count is correct on dashboard for active players
#|Expected Count of trophy when 2 players played|
#|4|
#Then participation count is correct on dashboard for active players
#
#
#Scenario: Verify that player data is showing correctly on single player game dashboard for specific location different time filters when status is all players
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager enters random game name
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
#And Manager mouse hover on game icon
#And Manager clicks on Trophies
#And Manager selects tab
#|Tab name|
#|By Game|
#And Manager selects Trophy filter
#And Manager enters recently created game name and select it on game trophies screen
#And Manager clicks on option burger button
#And Manager clicks on edit button
#And Manager enters point
#|Points|
#|100|
#And Manager enters attempts
#|Attempts|
#|1|
#And Manager selects high score
#|High Score|
#|100|
#And Manager enters trophy description
#|Description|
#|This is test description|
#And Manager clicks on Save button
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Single Level|
#And Manager clicks on filter
#|Filter Type|
#|Mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|All Games|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|All Players|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Game|
#And Manager enters recently created game name and select it
#And Manager clicks on Add a filter button
#And Manager clicks on filter
#|Filter Type|
#|Location|
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#And Manager clicks on Add a filter button
#And Manager mouse hove on filter
#|Filter Type|
#|Department|
#And Manager enters department name and select it
#|Department Name|
#|Design|
#And Manager clicks on done button on the search result list
#And Manager gets Game Played count
#And Manager gets Thophies achieved count
#And Manager gets Participation
#And Manager add players to specific location and department
#|Player Count|LocationName|Department Name|Password|
#|2|Udaipur|Design|pass|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Location|
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Department|
#And Manager enters department name and select it
#|Department Name|
#|Design|
#And Manager clicks on done button on the search result list
#And Manager gets total player count from all players screen
#And User play recently created game for statistics with different users
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Single Level|
#And Manager clicks on filter
#|Filter Type|
#|status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|all_players|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Game|
#And Manager enters recently created game name and select it
#And Manager clicks on Add a filter button
#And Manager clicks on filter
#|Filter Type|
#|Location|
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#And Manager clicks on Add a filter button
#And Manager mouse hove on filter
#|Filter Type|
#|Department|
#And Manager enters department name and select it
#|Department Name|
#|Design|
#And Manager clicks on done button on the search result list
#Then games played count is correct on dashboard
#Then Trophies achieved count is correct for if dashboard type is Game Single Level
#|TotalGameTrophyAchieved|
#|2|
#Then participation count is correct on dashboard for team wise filter
#
#Scenario: Verify that player data is showing correctly on single player game dashboard for specific location and dept for different time filters when status is active players
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager enters random game name
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
#And Manager mouse hover on game icon
#And Manager clicks on Trophies
#And Manager selects tab
#|Tab name|
#|By Game|
#And Manager selects Trophy filter
#And Manager enters recently created game name and select it on game trophies screen
#And Manager clicks on option burger button
#And Manager clicks on edit button
#And Manager enters point
#|Points|
#|100|
#And Manager enters attempts
#|Attempts|
#|1|
#And Manager selects high score
#|High Score|
#|100|
#And Manager enters trophy description
#|Description|
#|This is test description|
#And Manager clicks on Save button
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Single Level|
#And Manager clicks on filter
#|Filter Type|
#|Mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|All Games|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|All Players|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Game|
#And Manager enters recently created game name and select it
#And Manager clicks on Add a filter button
#And Manager clicks on filter
#|Filter Type|
#|Location|
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#And Manager clicks on Add a filter button
#And Manager mouse hove on filter
#|Filter Type|
#|Department|
#And Manager enters department name and select it
#|Department Name|
#|Design|
#And Manager clicks on done button on the search result list
#And Manager gets Game Played count
#And Manager gets Thophies achieved count
#And Manager gets Participation
#And Manager add players to specific location and department
#|Player Count|LocationName|Department Name|Password|
#|2|Udaipur|Design|pass|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Location|
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Department|
#And Manager enters department name and select it
#|Department Name|
#|Design|
#And Manager clicks on done button on the search result list
#And Manager gets total player count from all players screen
#And User play recently created game for statistics with different users
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on user icon in side menu
#And Manager clicks on Players button in side menu
#And Manager deactive all the recently added players
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Single Level|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|Active Players|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Game|
#And Manager enters recently created game name and select it
#And Manager clicks on Add a filter button
#And Manager clicks on filter
#|Filter Type|
#|Location|
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#And Manager clicks on Add a filter button
#And Manager mouse hove on filter
#|Filter Type|
#|Department|
#And Manager enters department name and select it
#|Department Name|
#|Design|
#And Manager clicks on done button on the search result list
#Then games played count is correct on dashboard for active players
#Then Trophies achieved count is correct on dashboard for active players
#|Expected Count of trophy when 2 players played|
#|4|
#Then participation count is correct on dashboard for active players
#
#Scenario: Verify that player data is showing correctly on single player game dashboard for specific Group different time filters when status is all players
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager enters random game name
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
#And Manager mouse hover on game icon
#And Manager clicks on Trophies
#And Manager selects tab
#|Tab name|
#|By Game|
#And Manager selects Trophy filter
#And Manager enters recently created game name and select it on game trophies screen
#And Manager clicks on option burger button
#And Manager clicks on edit button
#And Manager enters point
#|Points|
#|100|
#And Manager enters attempts
#|Attempts|
#|1|
#And Manager selects high score
#|High Score|
#|100|
#And Manager enters trophy description
#|Description|
#|This is test description|
#And Manager clicks on Save button
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Single Level|
#And Manager clicks on filter
#|Filter Type|
#|Mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|All Games|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|All Players|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Game|
#And Manager enters recently created game name and select it
#And Manager clicks on Add a filter button
#And Manager mouse hove on filter
#|Filter Type|
#|Group|
#And Manager enters group name and select it
#|GroupName|
#|Group A|
#And Manager clicks on done button on the search result list
#And Manager gets Game Played count
#And Manager gets Thophies achieved count
#And Manager gets Participation
#And Manager add players to specific location, department and group
#|Player Count|LocationName|Department Name|Password|Group Name|
#|2|Udaipur|Design|pass|Group A|
#And Manager clicks on Add a filter button
#And Manager mouse hove on filter
#|Filter Type|
#|Group|
#And Manager enters group name and select it
#|GroupName|
#|Group A|
#And Manager clicks on done button on the search result list
#And Manager gets total player count from all players screen
#And User play recently created game for statistics with different users
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Single Level|
#And Manager clicks on filter
#|Filter Type|
#|status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|all_players|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Game|
#And Manager enters recently created game name and select it
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Group|
#And Manager enters group name and select it
#|GroupName|
#|Group A|
#And Manager clicks on done button on the search result list
#Then games played count is correct on dashboard
#Then Trophies achieved count is correct for if dashboard type is Game Single Level
#|TotalGameTrophyAchieved|
#|2|
#Then participation count is correct on dashboard for team wise filter
#
#
#Scenario: Verify that player data is showing correctly on single player game dashboard for specific Group different time filters when status is active players
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager enters random game name
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
#And Manager mouse hover on game icon
#And Manager clicks on Trophies
#And Manager selects tab
#|Tab name|
#|By Game|
#And Manager selects Trophy filter
#And Manager enters recently created game name and select it on game trophies screen
#And Manager clicks on option burger button
#And Manager clicks on edit button
#And Manager enters point
#|Points|
#|100|
#And Manager enters attempts
#|Attempts|
#|1|
#And Manager selects high score
#|High Score|
#|100|
#And Manager enters trophy description
#|Description|
#|This is test description|
#And Manager clicks on Save button
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Single Level|
#And Manager clicks on filter
#|Filter Type|
#|Mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|All Games|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|All Players|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Game|
#And Manager enters recently created game name and select it
#And Manager clicks on Add a filter button
#And Manager mouse hove on filter
#|Filter Type|
#|Group|
#And Manager enters group name and select it
#|GroupName|
#|Group A|
#And Manager clicks on done button on the search result list
#And Manager gets Game Played count
#And Manager gets Thophies achieved count
#And Manager gets Participation
#And Manager add players to specific location, department and group
#|Player Count|LocationName|Department Name|Password|Group Name|
#|2|Udaipur|Design|pass|Group A|
#And Manager clicks on Add a filter button
#And Manager mouse hove on filter
#|Filter Type|
#|Group|
#And Manager enters group name and select it
#|GroupName|
#|Group A|
#And Manager clicks on done button on the search result list
#And Manager gets total player count from all players screen
#And User play recently created game for statistics with different users
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on user icon in side menu
#And Manager clicks on Players button in side menu
#And Manager deactive all the recently added players
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Single Level|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|Active Players|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Game|
#And Manager enters recently created game name and select it
#And Manager clicks on Add a filter button
#And Manager mouse hove on filter
#|Filter Type|
#|Group|
#And Manager enters group name and select it
#|GroupName|
#|Group A|
#And Manager clicks on done button on the search result list
#
#Then games played count is correct on dashboard for active players
#Then Trophies achieved count is correct on dashboard for active players
#|Expected Count of trophy when 2 players played|
#|4|
#Then participation count is correct on dashboard for active players
#
#Scenario: Verify that player data is showing correctly on MLG for Status All
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Multilevel|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|All|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Multilevel Game|
#And Manager enters already created MLG name and select it
#|MLG Game Name|
#|Automation MLG Game|
#And Manager gets Game Played count
#And Manager gets Thophies achieved count
#And Manager gets Participation
#And Manager add players to specific location and department
#|Player Count|LocationName|Department Name|Password|
#|2|Udaipur|Design|pass|
#And user is on home page
#And recently created players login to the app
#|Player Number|
#|1|
#And user selects already created MLG
#|MLG Game Name|
#|Automation MLG Game|
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
#|1|1|all correct|Trophy|2|
#Then Player closes level popup
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Verify Trophy Or Level|TotalLevels|
#|2|1|all correct|Level|2|
#Then Player closes level popup
#And User clicks on back button on select level screen
#Then user closes MLG trophy
#And User clicks on more Button
#And Clicks on Logout button
#And recently created players login to the app
#|Player Number|
#|2|
#And user selects already created MLG
#|MLG Game Name|
#|Automation MLG Game|
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
#|1|1|all wrong|Trophy|2|
#And Manager is on Admin Home page
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Multilevel|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|all|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Multilevel Game|
#And Manager enters already created MLG name and select it
#|MLG Game Name|
#|Automation MLG Game|
#Then games played count is correct on dashboard
#Then Trophies achieved count is correct for MLG dashboard
#|Expected Count|
#|1|
#Then participation count is correct for mlg dashboard
#
#
#Scenario: Verify that player data is showing correctly on MLG for Status In Progress
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Multilevel|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|In Progress|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Multilevel Game|
#And Manager enters already created MLG name and select it
#|MLG Game Name|
#|Automation MLG Game|
#And Manager gets Game Played count
#And Manager gets Thophies achieved count
#And Manager gets Participation
#And Manager add players to specific location and department
#|Player Count|LocationName|Department Name|Password|
#|2|Udaipur|Design|pass|
#And user is on home page
#And recently created players login to the app
#|Player Number|
#|1|
#And user selects already created MLG
#|MLG Game Name|
#|Automation MLG Game|
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
#|1|1|all correct|Trophy|2|
#Then Player closes level popup
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Verify Trophy Or Level|TotalLevels|
#|2|1|all wrong|Level|2|
#And User clicks on back button on select level screen
#And User clicks on more Button
#And Clicks on Logout button
#And recently created players login to the app
#|Player Number|
#|2|
#And user selects already created MLG
#|MLG Game Name|
#|Automation MLG Game|
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
#|1|1|all wrong|Trophy|2|
#And Manager is on Admin Home page
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Multilevel|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|in_progress|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Multilevel Game|
#And Manager enters already created MLG name and select it
#|MLG Game Name|
#|Automation MLG Game|
#Then games played count is correct on dashboard
#Then Trophies achieved count is correct for MLG dashboard
#|Expected Count|
#|0|
#Then participation count is correct for mlg dashboard
#
#Scenario: Verify that player data is showing correctly on MLG for Status is won
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Multilevel|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|Won|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Multilevel Game|
#And Manager enters already created MLG name and select it
#|MLG Game Name|
#|Automation MLG Game|
#And Manager gets Game Played count
#And Manager gets Thophies achieved count
#And Manager gets Participation
#And Manager add players to specific location and department
#|Player Count|LocationName|Department Name|Password|
#|2|Udaipur|Design|pass|
#And user is on home page
#And recently created players login to the app
#|Player Number|
#|1|
#And user selects already created MLG
#|MLG Game Name|
#|Automation MLG Game|
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
#|1|1|all correct|Trophy|2|
#Then Player closes level popup
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Verify Trophy Or Level|TotalLevels|
#|2|1|all correct|Level|2|
#Then Player closes level popup
#And User clicks on back button on select level screen
#Then user closes MLG trophy
#And User clicks on more Button
#And Clicks on Logout button
#And recently created players login to the app
#|Player Number|
#|2|
#And user selects already created MLG
#|MLG Game Name|
#|Automation MLG Game|
#And user plays SP game of mlg
#|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
#|1|1|all correct|Trophy|2|
#And Manager is on Admin Home page
#And Manager clicks on Dashboard side menu button
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Multilevel|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|won|
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|won|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Multilevel Game|
#And Manager enters already created MLG name and select it
#|MLG Game Name|
#|Automation MLG Game|
#Then games played count is correct on dashboard for mlg dashboard if status is won
#|game count increased|
#|2|
#Then Trophies achieved count is correct for MLG dashboard
#|Expected Count|
#|1|
#Then participation count is correct for mlg dashboard if status is won
#|Participation who won trophy|
#|1|


#Scenario: Verify that single level game detailed report is showing correctly
#
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#
#And Manager add a player to specific location department and group
#|LocationName|Department Name|Password|Group|
#|Udaipur|Design|pass|Group A|
#
#And Manager enters random game name
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
#And new player is able to login to app
#And user wait for loading animation to be disappeared
#And User play recently created game for statistics
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#And Manager clicks on Detailed Report tab
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Game - Single Level|
#And Manager clicks on filter
#|Filter Type|
#|status|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Status|all_players|
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Game|
#And Manager enters recently created game name and select it
#And Manager clicks on Add a filter button
#And Manager clicks on filter
#|Filter Type|
#|Location|
#And Manager enters location name and select it
#|LocationName|
#|Udaipur|
#And Manager clicks on done button on the search result list
#And Manager clicks on Add a filter button
#And Manager mouse hove on filter
#|Filter Type|
#|Department|
#And Manager enters department name and select it
#|Department Name|
#|Design|
#And Manager clicks on done button on the search result list
#And Manager clicks on time filter
#And Manager selects time duration in time filter on detailed report page
#|Duration Type|
#|This Month|
#
#Then SP game count is correct on single level detailed report
#Then Time SP is correct on single level detailed report
#Then Points SP is correct on single level detailed report
#Then Last Played SP is correct on single level detailed report
#Then MP game count is correct on single level  detailed report
#Then MP time is correct on single level detailed report
#Then Points MP is correct on single detailed report
#Then Wins MP is correct on single level detailed report
#Then Last Played MP is correct on single level detailed report
#Then Rating is correct on single level detailed report
#|Expected Rating|
#|100|
#Then Department is correct on single level detailed report
#Then Location is correct single level detailed report
#Then Group is correct on single level detailed report
