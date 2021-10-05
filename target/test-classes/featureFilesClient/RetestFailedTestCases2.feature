Feature: Retest Failed Casee

Scenario: Verify that player data is showing correctly on team wise dashboard for specific location and department different time filters when status is active players
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Team|
And Manager clicks on filter
|Filter Type|
|Mode|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Mode|All Games|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|Active Players|
And Manager clicks on filter
|Filter Type|
|Locations|
And manager clicks on select all checkBox in the textbox
And Manager enters location name and select it
|LocationName|
|Udaipur|
And Manager clicks on done button on the search result list
And Manager clicks on Add a filter button
And Manager clicks on filter
|Filter Type|
|Department|
And Manager enters department name and select it
|Department Name|
|Design|
And Manager clicks on done button on the search result list
And Manager gets Game Played count
And Manager gets Thophies achieved count
And Manager gets Participation
And Manager add players to specific location and department
|Player Count|LocationName|Department Name|Password|
|2|Udaipur|Design|pass|
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
And Manager logs out
And User play recently created game for statistics with different users
|GamePlayCount|AnswerType|
|1|all correct|
And Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
Then Dashboard screen is opening
And Manager clicks on user icon in side menu
And Manager clicks on Players button in side menu
And Manager deactive all the recently added players
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Team|
And Manager clicks on filter
|Filter Type|
|Locations|
And manager clicks on select all checkBox in the textbox
And Manager enters location name and select it
|LocationName|
|Udaipur|
And Manager clicks on done button on the search result list
And Manager clicks on Add a filter button
And Manager clicks on filter
|Filter Type|
|Department|
And Manager enters department name and select it
|Department Name|
|Design|
And Manager clicks on done button on the search result list
Then games played count is correct on dashboard for active players
Then Trophies achieved count is correct on dashboard for active players
|Expected Count of trophy when 2 players played|
|4|
Then participation count is correct on dashboard for active players

Scenario: Verify that player data is showing correctly on single player game dashboard for specific location different time filters when status is all players
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
And Manager mouse hover on game icon
And Manager clicks on Trophies
And Manager selects tab
|Tab name|
|By Game|
And Manager selects Trophy filter
And Manager enters recently created game name and select it on game trophies screen
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
And Manager clicks on Save button
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Game - Single Level|
And Manager clicks on filter
|Filter Type|
|Mode|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Mode|All Games|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|All Players|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Game|
And Manager enters recently created game name and select it
And Manager clicks on Add a filter button
And Manager clicks on filter
|Filter Type|
|Location|
And Manager enters location name and select it
|LocationName|
|Udaipur|
And Manager clicks on done button on the search result list
And Manager clicks on Add a filter button
And Manager mouse hove on filter
|Filter Type|
|Department|
And Manager enters department name and select it
|Department Name|
|Design|
And Manager clicks on done button on the search result list
And Manager gets Game Played count
And Manager gets Thophies achieved count
And Manager gets Participation
And Manager add players to specific location and department
|Player Count|LocationName|Department Name|Password|
|2|Udaipur|Design|pass|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Location|
And Manager enters location name and select it
|LocationName|
|Udaipur|
And Manager clicks on done button on the search result list
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Department|
And Manager enters department name and select it
|Department Name|
|Design|
And Manager clicks on done button on the search result list
And Manager gets total player count from all players screen
And Manager logs out
And User play recently created game for statistics with different users
|GamePlayCount|AnswerType|
|1|all correct|
And Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Game - Single Level|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|All Players|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Game|
And Manager enters recently created game name and select it
And Manager clicks on Add a filter button
And Manager clicks on filter
|Filter Type|
|Location|
And Manager enters location name and select it
|LocationName|
|Udaipur|
And Manager clicks on done button on the search result list
And Manager clicks on Add a filter button
And Manager mouse hove on filter
|Filter Type|
|Department|
And Manager enters department name and select it
|Department Name|
|Design|
And Manager clicks on done button on the search result list
Then games played count is correct on dashboard
Then Trophies achieved count is correct for if dashboard type is Game Single Level
|TotalGameTrophyAchieved|
|2|
Then participation count is correct on dashboard for team wise filter

Scenario: Verify that player data is showing correctly on single player game dashboard for specific location and dept for different time filters when status is active players
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
And Manager mouse hover on game icon
And Manager clicks on Trophies
And Manager selects tab
|Tab name|
|By Game|
And Manager selects Trophy filter
And Manager enters recently created game name and select it on game trophies screen
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
And Manager clicks on Save button
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Game - Single Level|
And Manager clicks on filter
|Filter Type|
|Mode|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Mode|All Games|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|All Players|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Game|
And Manager enters recently created game name and select it
And Manager clicks on Add a filter button
And Manager clicks on filter
|Filter Type|
|Location|
And Manager enters location name and select it
|LocationName|
|Udaipur|
And Manager clicks on done button on the search result list
And Manager clicks on Add a filter button
And Manager mouse hove on filter
|Filter Type|
|Department|
And Manager enters department name and select it
|Department Name|
|Design|
And Manager clicks on done button on the search result list
And Manager gets Game Played count
And Manager gets Thophies achieved count
And Manager gets Participation
And Manager add players to specific location and department
|Player Count|LocationName|Department Name|Password|
|2|Udaipur|Design|pass|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Location|
And Manager enters location name and select it
|LocationName|
|Udaipur|
And Manager clicks on done button on the search result list
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Department|
And Manager enters department name and select it
|Department Name|
|Design|
And Manager clicks on done button on the search result list
And Manager gets total player count from all players screen
And Manager logs out
And User play recently created game for statistics with different users
|GamePlayCount|AnswerType|
|1|all correct|
And Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
Then Dashboard screen is opening
And Manager clicks on user icon in side menu
And Manager clicks on Players button in side menu
And Manager deactive all the recently added players
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Game - Single Level|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|Active Players|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Game|
And Manager enters recently created game name and select it
And Manager clicks on Add a filter button
And Manager clicks on filter
|Filter Type|
|Location|
And Manager enters location name and select it
|LocationName|
|Udaipur|
And Manager clicks on done button on the search result list
And Manager clicks on Add a filter button
And Manager mouse hove on filter
|Filter Type|
|Department|
And Manager enters department name and select it
|Department Name|
|Design|
And Manager clicks on done button on the search result list
Then games played count is correct on dashboard for active players
Then Trophies achieved count is correct on dashboard for active players
|Expected Count of trophy when 2 players played|
|4|
Then participation count is correct on dashboard for active players

Scenario: Verify that player data is showing correctly on single player game dashboard for specific Group different time filters when status is active players
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
And Manager mouse hover on game icon
And Manager clicks on Trophies
And Manager selects tab
|Tab name|
|By Game|
And Manager selects Trophy filter
And Manager enters recently created game name and select it on game trophies screen
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
And Manager clicks on Save button
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Game - Single Level|
And Manager clicks on filter
|Filter Type|
|Mode|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Mode|All Games|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|All Players|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Game|
And Manager enters recently created game name and select it
And Manager clicks on Add a filter button
And Manager mouse hove on filter
|Filter Type|
|Group|
And Manager enters group name and select it
|GroupName|
|Group A|
And Manager clicks on done button on the search result list
And Manager gets Game Played count
And Manager gets Thophies achieved count
And Manager gets Participation
And Manager add players to specific location, department and group
|Player Count|LocationName|Department Name|Password|Group Name|
|2|Udaipur|Design|pass|Group A|
And Manager clicks on Add a filter button
And Manager mouse hove on filter
|Filter Type|
|Group|
And Manager enters group name and select it
|GroupName|
|Group A|
And Manager clicks on done button on the search result list
And Manager gets total player count from all players screen
And Manager logs out
And User play recently created game for statistics with different users
|GamePlayCount|AnswerType|
|1|all correct|
And Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
Then Dashboard screen is opening
And Manager clicks on user icon in side menu
And Manager clicks on Players button in side menu
And Manager deactive all the recently added players
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Game - Single Level|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|Active Players|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Game|
And Manager enters recently created game name and select it
And Manager clicks on Add a filter button
And Manager mouse hove on filter
|Filter Type|
|Group|
And Manager enters group name and select it
|GroupName|
|Group A|
And Manager clicks on done button on the search result list
Then games played count is correct on dashboard for active players
Then Trophies achieved count is correct on dashboard for active players
|Expected Count of trophy when 2 players played|
|4|
Then participation count is correct on dashboard for active players