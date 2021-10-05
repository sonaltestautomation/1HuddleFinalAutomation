Feature: Leaderboard By Player Feature-All, Department and Group

Scenario: Verify that Leaderboard title is correct and company name is appearing on All leaderboard screen and All and Department tabs are appearing if user does not belong to any group
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user wait for loading animation to be disappeared
When User clicks on Leaderboards
Then Leaderboards page is opening
Then company name is appearing on leaderboard screen
|CompanyName|
|AMAZONPRIME|
Then All and Department tabs are appearing

Scenario: Verify that Group tab is appearing if user belongs to group
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user wait for loading animation to be disappeared
When User clicks on Leaderboards
Then All Department and Group tabs are appearing

Scenario: Verify that Department name is correct under Department
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
And user wait for loading animation to be disappeared
And User clicks on Leaderboards
When User clicks on particular leaderboard
|LeaderboardType|
|DEPARTMENT|
And user wait for loading animation to be disappeared
Then Department name is correct
And Manager closes web app if mobile app is opened


Scenario: Verify that Group name is correct under Group
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player with additional information
|DepartmentName|Password|Group|
|ALL|pass|Group A|
And new player is able to login to app
And user wait for loading animation to be disappeared
And User clicks on Leaderboards
And User clicks on group wise leaderboard
And user wait for loading animation to be disappeared
Then Group name is correct
And Manager closes web app if mobile app is opened


Scenario: Verify that player score is showing correctly on leaderboard after ending game
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user wait for loading animation to be disappeared
And User comes to leaderboard screen
When User checks points on leaderboard screen
|Already created Player Name|
|Player|
And User play already created game
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
Then player score is correct


Scenario: Verify that player rank and score is in correct order in list
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user wait for loading animation to be disappeared
And User comes to leaderboard screen
When User checks points on leaderboard screen
|Already created Player Name|
|Player|
And User play already created game
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
Then User ranking order and score order is showing correctly


Scenario: Verify that 1st, 2nd and 3rd ranks are correct
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user wait for loading animation to be disappeared
And User comes to leaderboard screen
And user wait for loading animation to be disappeared
When User checks points on leaderboard screen
|Already created Player Name|
|Player|
And User play already created game
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
Then First Second and Third rank are correct


Scenario: Verify that player is showing in department list
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
And user wait for loading animation to be disappeared
And User clicks on Leaderboards
And User clicks on particular leaderboard
|LeaderboardType|
|DEPARTMENT|
Then user is showing in the list
And Manager closes web app if mobile app is opened


Scenario: Verify that player is showing in group list
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player with additional information
|DepartmentName|Password|Group|
|ALL|pass|Group A|
And new player is able to login to app
And user wait for loading animation to be disappeared
And User clicks on Leaderboards
And User clicks on group wise leaderboard
Then user is showing in the list
And Manager closes web app if mobile app is opened


Scenario: Verify that player rank and score is in correct order for Department type leaderboard in list
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user wait for loading animation to be disappeared
And User comes to leaderboard screen
And User clicks on particular leaderboard
|LeaderboardType|
|DEPARTMENT|
When User checks points on leaderboard screen
|Already created Player Name|
|Player|
And User play already created game
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
And User clicks on particular leaderboard
|LeaderboardType|
|DEPARTMENT|
Then User ranking order and score order is showing correctly

Scenario: Verify that 1st, 2nd and 3rd ranks are correct for department leaderboard
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user wait for loading animation to be disappeared
And User comes to leaderboard screen
And User clicks on particular leaderboard
|LeaderboardType|
|DEPARTMENT|
When User checks points on leaderboard screen
|Already created Player Name|
|Player|
And User play already created game
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
And User clicks on particular leaderboard
|LeaderboardType|
|DEPARTMENT|
Then First Second and Third rank are correct


Scenario: Verify that player rank order and score is in correct order for Group type leaderboard in list
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user wait for loading animation to be disappeared
And User comes to leaderboard screen
And User clicks on group wise leaderboard
When User checks points on leaderboard screen
|Alreafy created Player Name|
|Player|
And User play already created game
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
And User clicks on group wise leaderboard
Then User ranking order and score order is showing correctly

Scenario: Verify that player score is showing correctly on department leaderboard after ending game
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
And user wait for loading animation to be disappeared
And User comes to leaderboard screen
And User clicks on particular leaderboard
|LeaderboardType|
|DEPARTMENT|
When User checks points on leaderboard screen
|Already created Player Name|
|Player|
And User play already created game
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
And User clicks on particular leaderboard
|LeaderboardType|
|DEPARTMENT|
Then player score is correct
And Manager closes web app if mobile app is opened
#
#
Scenario: Verify that player score is showing correctly on group leaderboard after ending game
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user wait for loading animation to be disappeared
And User comes to leaderboard screen
And User clicks on group wise leaderboard
When User checks points on leaderboard screen
|Already created Player Name|
|Player|
And User play already created game
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
And User clicks on group wise leaderboard
Then player score is correct
