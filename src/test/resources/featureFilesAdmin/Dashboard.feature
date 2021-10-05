Feature: Dashboard Admin


#Scenario: Verify that player data is showing correctly on reports
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager_email|manager_pw|
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
#And Manager logs out
#And new player is able to login to app
#And user wait for loading animation to be disappeared
#And User play recently created game for statistics
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager_email|manager_pw|
#Then Dashboard screen is opening
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
#And Manager clicks on filter
#|Filter Type|
#|Mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|Live Games|
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
#And Manager clicks on filter
#|Filter Type|
#|Mode|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|Mode|All Games|
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

Scenario: Verify that player data is showing correctly on reports for Player wise Dashboard. 
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
And Manager logs out
And new player is able to login to app
And user wait for loading animation to be disappeared
And User play recently created game for statistics
|GamePlayCount|AnswerType|
|1|all correct|
And Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
Then Dashboard screen is opening
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Player|
And Manager clicks on filter
|Filter Type|
|Mode|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Mode|All Games|
And Manager clicks on Add a filter button
And Manager clicks on submenu arrow button
|FilterType|
|Player|
And Manager enters recently played player name
And Manager selects searched item
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|This Month|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|Today|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|This Week|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|Last Week|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|Last Month|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on filter
|Filter Type|
|Mode|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Mode|Live Games|
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|This Month|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|Today|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|This Week|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|Last Week|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|Last Month|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And manager clicks on game library
And Manager clicks on options button on recently created game
And manager clicks on schedule in options list
And manager selects limit
And manager clicks on delete button on schedule game screen
And manager clicks on yes button on delete limit confirmation popup
Then correct message is appearing on the page
|Expected Message|
|This game has not been scheduled yet. Click '+' to add new schedule.|
Then manager clicks on dashboard button
And Manager clicks on filter
|Filter Type|
|Mode|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Mode|All Games|
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|This Month|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|Today|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|This Week|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|Last Week|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct
And Manager clicks on time filter
And Manager selects time duration in time filter
|Duration Type|
|Last Month|
Then Practice game count is correct
Then Live game count is correct
Then Trophies achieved count is correct
|Expected Count|
|2|
Then Participation time is correct


Scenario: Verify that player data is showing correctly on team wise dashboard for differnt time durations when specific location is seleted 
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
|Status|All Players|
And Manager clicks on filter
|Filter Type|
|Locations|
And manager clicks on select all checkBox in the textbox
And Manager enters location name and select it
|LocationName|
|Udaipur|
And Manager clicks on done button on the search result list

And Manager gets Game Played count
And Manager gets Thophies achieved count
And Manager gets Participation

And Manager gets Game Played, Trophies and Participation count
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
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Team|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|All Players|
And Manager clicks on filter
|Filter Type|
|Locations|
And manager clicks on select all checkBox in the textbox
And Manager enters location name and select it
|LocationName|
|Udaipur|
And Manager clicks on done button on the search result list
Then games played count, trophies count and participation count is correct for team wise filter
|Expected Count of trophy when 2 players played|
|4|


Scenario: Verify that player data is showing correctly on team wise dashboard for specific location and department with different time filters when
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
|Status|All Players|
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
And Manager gets Game Played, Trophies and Participation count

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
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Team|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|All Players|
And Manager clicks on filter
|Filter Type|
|Locations|
And manager clicks on select all checkBox in the textbox
And Manager enters location name and select it
|LocationName|
|Udaipur|
And Manager clicks on done button on the search result list

Then games played count is correct on dashboard
Then Trophies achieved count is correct for team wise dashboard
|Expected Count of trophy when 2 players played|
|4|
Then participation count is correct on dashboard for team wise filter
#
#Scenario: Verify that player data is showing correctly on team wise dashboard for specific location and department with different time filters when
#Given Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager_email|manager_pw|
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
#And Manager logs out
#And User play recently created game for statistics with different users
#|GamePlayCount|AnswerType|
#|1|all correct|
#And Manager is on Admin Home page
#And Manager is logged In
#|UserName|Password|
#|manager_email|manager_pw|
#Then Dashboard screen is opening
#And Manager clicks on filter
#|Filter Type|
#|By|
#And Manager selects sub filter
#|Filter Name|Sub Filter Name|
#|By|Team|
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

And Manager clicks on Add a filter button
And Manager clicks on filter
|Filter Type|
|Department|
And Manager enters department name and select it
|Department Name|
|Design|
And Manager clicks on done button on the search result list
Then games played count, trophies count and participation count is correct for team wise filter
|Expected Count of trophy when 2 players played|
|4|

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
And Manager gets Game Played, Trophies and Participation count
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
Then games played count, trophies count and participation count is correct for team wise filter for active players
|Expected Count of trophy when 2 players played|
|4|


Scenario: Verify that player data is showing correctly on team wise dashboard for specific location different time filters when status is active players
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
And Manager gets Game Played, Trophies and Participation count
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
Then games played count, trophies count and participation count is correct for team wise filter for active players
|Expected Count of trophy when 2 players played|
|4|


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
And Manager gets Game Played, Trophies and Participation count
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
Then games played count, trophy achieved count and participation count is correct if dashboard type is Game Single Level
|TotalGameTrophyAchieved|
|2|

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
And Manager gets Game Played, Trophies and Participation count
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
Then games played count, trophies count and participation count is correct for active players
|Expected Count of trophy when 2 players played|
|4|

Scenario: Verify that player data is showing correctly on single player game dashboard for specific Group different time filters when status is all players
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
And Manager gets Game Played, Trophies and Participation count
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
And Manager mouse hove on filter
|Filter Type|
|Group|
And Manager enters group name and select it
|GroupName|
|Group A|
And Manager clicks on done button on the search result list
Then games played count, trophy achieved count and participation count is correct if dashboard type is Game Single Level
|TotalGameTrophyAchieved|
|2|

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
And Manager gets Game Played, Trophies and Participation count
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
Then games played count, trophies count and participation count is correct for active players
|Expected Count of trophy when 2 players played|
|4|

Scenario: Verify that player data is showing correctly on MLG for Status All
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Game - Multilevel|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|All|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Multilevel Game|
And Manager enters already created MLG name and select it
|MLG Game Name|
|Automation MLG Game|
And Manager gets Game Played, Trophies and Participation count
And Manager add players to specific location and department
|Player Count|LocationName|Department Name|Password|
|2|Udaipur|Design|pass|
And Manager logs out
And user is on home page
And recently created players login to the app
|Player Number|
|1|
And user selects already created MLG
|MLG Game Name|
|Automation MLG Game|
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
|1|1|all correct|Trophy|2|
Then Player closes level popup
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|Verify Trophy Or Level|TotalLevels|
|2|1|all correct|Level|2|
Then Player closes level popup
And User clicks on back button on select level screen
Then user closes MLG trophy
And User clicks on more Button
And Clicks on Logout button
And recently created players login to the app
|Player Number|
|2|
And user selects already created MLG
|MLG Game Name|
|Automation MLG Game|
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
|1|1|all wrong|Trophy|2|
And Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Game - Multilevel|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|All|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Multilevel Game|
And Manager enters already created MLG name and select it
|MLG Game Name|
|Automation MLG Game|
Then games played count, trophies achieved count and participation count is correct for MLG dashboard if status all
|Expected Trophy Count|
|1|




Scenario: Verify that player data is showing correctly on MLG for Status In Progress
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Game - Multilevel|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|In Progress|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Multilevel Game|
And Manager enters already created MLG name and select it
|MLG Game Name|
|Automation MLG Game|
And Manager gets Game Played, Trophies and Participation count
And Manager add players to specific location and department
|Player Count|LocationName|Department Name|Password|
|2|Udaipur|Design|pass|
And Manager logs out
And user is on home page
And recently created players login to the app
|Player Number|
|1|
And user selects already created MLG
|MLG Game Name|
|Automation MLG Game|
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
|1|1|all correct|Trophy|2|
Then Player closes level popup
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|Verify Trophy Or Level|TotalLevels|
|2|1|all wrong|Level|2|
And User clicks on back button on select level screen
And User clicks on more Button
And Clicks on Logout button
And recently created players login to the app
|Player Number|
|2|
And user selects already created MLG
|MLG Game Name|
|Automation MLG Game|
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
|1|1|all wrong|Trophy|2|
And Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Game - Multilevel|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|In Progress|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Multilevel Game|
And Manager enters already created MLG name and select it
|MLG Game Name|
|Automation MLG Game|
Then games played count, trophies achieved count and participation count is correct for MLG dashboard if status inProgress
|Expected Trophy Count|
|0|


Scenario: Verify that player data is showing correctly on MLG for Status is won
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Game - Multilevel|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|Won|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Multilevel Game|
And Manager enters already created MLG name and select it
|MLG Game Name|
|Automation MLG Game|
And Manager gets Game Played, Trophies and Participation count
And Manager add players to specific location and department
|Player Count|LocationName|Department Name|Password|
|2|Udaipur|Design|pass|
And Manager logs out
And user is on home page
And recently created players login to the app
|Player Number|
|1|
And user selects already created MLG
|MLG Game Name|
|Automation MLG Game|
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
|1|1|all correct|Trophy|2|
Then Player closes level popup
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|Verify Trophy Or Level|TotalLevels|
|2|1|all correct|Level|2|
Then Player closes level popup
And User clicks on back button on select level screen
Then user closes MLG trophy
And User clicks on more Button
And Clicks on Logout button
And recently created players login to the app
|Player Number|
|2|
And user selects already created MLG
|MLG Game Name|
|Automation MLG Game|
And user plays SP game of mlg
|LevelNumber|gamecount|anstype|Level or trophy|TotalLevels|
|1|1|all correct|Trophy|2|
And Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Game - Multilevel|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|Won|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|Won|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Multilevel Game|
And Manager enters already created MLG name and select it
|MLG Game Name|
|Automation MLG Game|
Then games played count, trophies achieved count and participation count is correct for MLG dashboard if status is won
|game count increased|Expected Trophy Count|Participation who won trophy|
|2|1|1|

