Feature: Levels

@TheShop
Scenario: Verify that player is achieving correct level after playing 1st game
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
When User play game for levels
|AnswerType|GamePlayCount|GameNameAlreadyCreated|
|all wrong|1|GameForLeaderboard|
Then level header and level title are correct
|TrophyTitle|TrophySubTitle|
|ACHIEVED|Rookie|
When user verify and click social share button
Then Share modal title is correct for levels
And Facebook sharing is working
And LinkdIn sharing is working
And Twitter sharing is working
And Mail sharing is working