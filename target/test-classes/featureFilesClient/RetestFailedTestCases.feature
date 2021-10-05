Feature: Retest Failed Cases











#Scenario: Verify that player data is showing correctly on reports for Player report

#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|vishal.1huddle+1@gmail.com|pass|
#And Manager add a player to specific location and department
#|LocationName|Department Name|Password|
#|Udaipur|Design|pass|
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
#And Manager clicks on filter
#|Filter Type|
#|by|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Player|
#
#
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

#Scenario: Verify that player data is showing correctly on reports/ Team
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
#
#
#Then games played count is correct on dashboard
#Then Trophies achieved count is correct for team wise dashboard
#|Expected Count of trophy when 2 players played|
#|4|
#Then participation count is correct on dashboard for team wise filter


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
#
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
#
#
#
#And Manager is on Admin Home page
#Then Dashboard screen is opening
#
#And Manager clicks on user icon in side menu
#And Manager clicks on Players button in side menu
#And Manager deactive all the recently added players
#
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
#Then Trophies achieved count is correct for team wise dashboard for active players
#|Expected Count of trophy when 2 players played|
#|4|
#Then participation count is correct on dashboard for team wise filter for active players


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
#Then Trophies achieved count is correct for team wise dashboard for active players
#|Expected Count of trophy when 2 players played|
#|4|
#Then participation count is correct on dashboard for team wise filter for active players

#Scenario: Verify that player data is showing correctly on single player game dashboard for specific location different time filters when status is active players
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

#Scenario: Verify that player data is showing correctly on single player game dashboard for specific location different time filters when status is active players
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
#
#
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Status|
#
#And Manager clicks on filter
#|Filter Type|
#|Status|
#And Manager clicks on filter
#|Filter Type|
#|Active|
#
#
#
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


#Scenario: Verify that player data is showing correctly on single player game dashboard for specific location different time filters when status is active players
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




#Scenario: verify that options icon, download report and send email is appearing and working and Download and Send by Email options are working
#
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager_email|manager_pw|
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
#And correct data is showing in downloaded csv
#|Player Name|Player Email|Total Time Played-Single Player|Total Time Played-Multi Player|Number of Games Played-Single Player|Number of Games Played-Multi Player|No|Level Name|Level Achieved|Level Achieved Date|



#Scenario: verify that players data is correct in sample downloaded players csv
#
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager_email|manager_pw|
#And Manager add a player to specific location department and group
#|LocationName|Department Name|Password|Group|
#|Udaipur|Design|pass|Group A|
#
#Then options burger button is appearing and working
#Then Upload button is appearing under option on all players page
#And Manager clicks on upload button
#And Manager clicks on download sample csv button
#Then success message is appearing after downloading report
#|Expected Text|
#|Downloading file...|
#Then correct data is showing in sample player csv
#|Important!|Please read this section to avoid inconsistencies later!|Please don't make any change to any of the header titles like: First_name, Email, Etc.|All the columns are mandatory fields except Groups, do not leave any cell blank for mandatory fields.|Department and Location name should be exactly similar to that of what is linked and present in the Admin Panel.|Please only use valid email IDs.|For your convenience we have set players password to "gametime" already||First_Name|Last_Name|Department|Location|Email|Group|Test User|Test User|IT|Seattle|test_user@gmail.com||


#Scenario: Verify that question data is correct in downloaded csv
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager_email|manager_pw|           
#When Manager enters random game name
#And Manager Enters Category
#|Category Number|CategoryName|
#|1|CATEGORY A|
#And Manager selects a particular category to add question in it
#|Category Number|
#|0|
#And Manager enters question data
#|QuestionTitle|Option1|Option2|Option3|Option4|Ans Option count for each question|Correct ans option count|CategoryName|Timer|Points|tag|
#|This is test question|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|4|1|CATEGORY A|10|300|qaQuestion|
#And Manager clicks on Done checkmark button
#And Click on Preview button
#And Add Game Preview Title and Scenario
#|Game Preview Title|Game Scenario|
#|This is game preview for automation testing|This is game scenario for automation testing|
#And click on Done button on gamepreview page
#And Schedule Game 
#|Game Attempts|
#|1|
#And Manager mouse hover on game icon
#And Manger clicks on Questions in side menu
#And Manager mouse hover on 1h logo on admin
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Game|
#And Manager enters recently created game name and select it
#Then options burger button is appearing and working
#And Manager clicks on download button
#Then success message is appearing after downloading report
#|Expected Text|
#|Downloading file...|
#Then correct data is showing in downloaded question csv
#|Card|Question Category Name|Points|Timer|Question Type|Questions|Answer|Option 1|Option 2|Option 3|Option 4|Option 5|Option 6|Option 7|Option 8|Option 9|Option 10|Tag Keywords|


#Scenario: Verify that question data is correct in downloaded csv while creating game
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager_email|manager_pw|           
#When Manager enters random game name
#And Manager Enters Category
#|Category Number|CategoryName|
#|1|CATEGORY A|
#And Manager selects a particular category to add question in it
#|Category Number|
#|0|
#And Manager enters question data
#|QuestionTitle|Option1|Option2|Option3|Option4|Ans Option count for each question|Correct ans option count|CategoryName|Timer|Points|tag|
#|This is test question|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|4|1|CATEGORY A|10|300|qaQuestion|
#And Manager clicks on Done checkmark button
#Then options burger button is appearing and working
#And Manager clicks on download button
#Then success message is appearing after downloading report
#|Expected Text|
#|Downloading file...|
#Then correct data is showing in downloaded question csv
#|Card|Question Category Name|Points|Timer|Question Type|Questions|Answer|Option 1|Option 2|Option 3|Option 4|Option 5|Option 6|Option 7|Option 8|Option 9|Option 10|Tag Keywords|


#Scenario: Verify that question data is correct in downloaded csv while creating game
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager_email|manager_pw|           
#When Manager enters random game name
#Then options burger button is appearing and working
#Then Upload button is appearing under option on all players page
#And Manager clicks on upload button
#And Manager clicks on download sample csv button
#Then success message is appearing after downloading report
#|Expected Text|
#|Downloading file...|
#Then correct data is showing in downloaded sample question csv
#|Card|Question Category Name|Points|Timer|Question Type|Questions|Answer|Option 1|Option 2|Option 3|Option 4|Option 5|Option 6|Option 7|Option 8|Option 9|Option 10|Tagkeyword|
#|111|Overview|100|60|1|SP-11|2,3,4|option 1|option 2|option 3|option 4|1|2|3|4|5|6|55|


#Scenario: Verify that accuracy report data is showing correctly in downloaded csv
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager_email|manager_pw|
#And Manager add a player
#|DepartmentName|Password|
#|ALL|pass|    
#When Manager enters random game name
#And Manager Enters Category
#|Category Number|CategoryName|
#|1|CATEGORY A|
#And Manager selects a particular category to add question in it
#|Category Number|
#|0|
#And Manager enters question data
#|QuestionTitle|Option1|Option2|Option3|Option4|Ans Option count for each question|Correct ans option count|CategoryName|Timer|Points|tag|
#|This is test question|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|4|1|CATEGORY A|10|300|qaQuestion|
#And Manager clicks on Done checkmark button
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
#|1|random|
#And Manager is on Admin Home page
#And Manager mouse hover on game icon
#And Manager clicks on reports in side menu
#And Manager clicks on side menu sub item
#|Sub Item Name|
#|Accuracy|
#And Manager mouse hover on 1h logo on admin
#And Manager clicks on Add a filter button
#And Manager selects menu item filter
#|Filter Type|
#|Player|
#And Manager enters recently played player name
#And Manager selects searched item
#Then options icon is appearing and working on detailed report
#And Manager clicks on download button
#Then correct data is showing in downloaded accuracy report csv
#|No|Question Title|Game Name|Card Number|Question Count|Correct Answer Count|Incorrect Answer Count|Accuracy Percentage|


Scenario: Verify that 1st game general trophy report column names are correct in downloaded csv
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager mouse hover on game icon
And Manager clicks on reports in side menu
And Manager clicks on side menu sub item
|Sub Item Name|
|Trophy Report|
And Manager mouse hover on 1h logo on admin
And Manager clicks on general trophy type
|Trophy Type|
|1st Game|
And Manager clicks on filter
|Filter Type|
|Trophy|
And Manager selects item from the list
|Item Name|
|Achieved|
And Manager clicks on download icon
Then success message is appearing after downloading report
|Expected Text|
|Downloading file...|
Then correct data is showing in downloaded fix trophy report


Scenario: Verify that 1st game general trophy report column names are correct in downloaded csv
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager mouse hover on game icon
And Manager clicks on reports in side menu
And Manager clicks on side menu sub item
|Sub Item Name|
|Trophy Report|
And Manager mouse hover on 1h logo on admin
And Manager clicks on general trophy type
|Trophy Type|
|5 Games in a Week.|
And Manager clicks on filter
|Filter Type|
|Trophy|
And Manager selects item from the list
|Item Name|
|Achieved|
And Manager clicks on download icon
Then success message is appearing after downloading report
|Expected Text|
|Downloading file...|
Then correct data is showing in downloaded fix trophy report




#Scenario: Verify that 5 games in a week general trophy report column names are correct in downloaded csv
#Scenario: Verify that 100% general trophy report column names are correct in downloaded csv
#Scenario: Verify that 100 minutes general trophy report column names are correct in downloaded csv
#Scenario: Verify that 7 days in a row general trophy report column names are correct in downloaded csv
#Scenario: Verify that 10 days in a row general trophy report column names are correct in downloaded csv
#Scenario: Verify that 100 games general trophy report column names are correct in downloaded csv
#Scenario: Verify that 1M Points general trophy report column names are correct in downloaded csv
#Scenario: Verify that 5M points general trophy report column names are correct in downloaded csv
#
#Scenario: Verify that single level game trophy csv data is showing correctly for achieved players
#Scenario: Verify that single level game trophy csv data columns are showing correctly for not achieved players
#
#Scenario: Verify that MLG trophy csv data is showing correctly for trophy won
#Scenario: Verify that MLG trophy csv data is showing correctly for trophy in progess
#
#Scenario: Verify that contest csv data column names are correct in downloaded csv

