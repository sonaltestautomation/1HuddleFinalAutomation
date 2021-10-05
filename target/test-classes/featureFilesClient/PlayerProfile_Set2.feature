Feature: Profile Feature-Achievement and Statistics Set 2

Scenario: Verify that total unlocked trophies count is correct and 1st game trophy and 100% trophy details are correct and social sharing is working
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
	|DepartmentName|Password|
	|ALL|pass|
And new player is able to login to app
And user wait for loading animation to be disappeared
And User play already created game and calculate rating
	|GameName|GamePlayCount|AnswerType|
	|GameForLeaderboard|1|all correct|
When user clicks on Profile side menu button
And user wait for loading animation to be disappeared
When user clicks on Trophies
Then total unlocked trophy count is correct
|expectedTrophyCount|
|2|
And user opens trophy
|Trophy Number|
|1|
Then trophy header, trophy title and trophy subtitle is correct
|TrophyTitle|TrophySubTitle|
|1st Game|Boom! You completed your 1st game!|
When user verify and click social share button
Then Share modal title is correct
And Facebook sharing is working
And LinkdIn sharing is working
And Twitter sharing is working
And Mail sharing is working
And user closes trophy popup
And user opens trophy
|Trophy Number|
|3|
Then trophy header, trophy title and trophy subtitle is correct
|TrophyTitle|TrophySubTitle|
|100%|Perfect! You Scored 100% on a game.|
When user verify and click social share button
Then Share modal title is correct
And Facebook sharing is working
And LinkdIn sharing is working
And Twitter sharing is working
And Mail sharing is working

Scenario: Verify that all career trophies are appearing under career trophies and trophy title and subtitle is correct for all trophies
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
	|DepartmentName|Password|
	|ALL|pass|
And new player is able to login to app
And user wait for loading animation to be disappeared
And user clicks on Profile side menu button
And user wait for loading animation to be disappeared
When user clicks on Trophies
And user opens trophy
|Trophy Number|
|1|
Then first game trophy is appearing
|Expected Trophy Name|Expected Trophy Info|
|1st Game|If player completes their 1st game.|
And user closes trophy popup
And user opens trophy
|Trophy Number|
|2|
Then five games in a trophy is appearing
|Expected Trophy Name|Expected Trophy Info|
|5 Games in a Week.|If a player completes 5 games in a week.|
And user closes trophy popup
And user opens trophy
|Trophy Number|
|3|
Then hundred percent correct trophy is appearing
|Expected Trophy Name|Expected Trophy Info|
|100%|If a player completes a game with a perfect score of 100%.|
And user closes trophy popup
And user opens trophy
|Trophy Number|
|4|
Then hundred minute trophy is appearing
|Expected Trophy Name|Expected Trophy Info|
|100 Minutes|If a player completes 100 minutes of game play.|
And user closes trophy popup
And user opens trophy
|Trophy Number|
|5|
Then seven days in a row trophy is appearing
|Expected Trophy Name|Expected Trophy Info|
|7 Days in a Row.|If a player completes a game for 7 consecutive days.|
And user closes trophy popup
And user opens trophy
|Trophy Number|
|6|
Then ten days in a row trophy is appearing
|Expected Trophy Name|Expected Trophy Info|
|10 Days in a Row.|If a player completes a game for 10 consecutive days.|
And user closes trophy popup
And user opens trophy
|Trophy Number|
|7|
Then hundred games trophy is appearing
|Expected Trophy Name|Expected Trophy Info|
|100 Games|If a player completes 100 games.|
And user closes trophy popup
And user opens trophy
|Trophy Number|
|8|
Then one million points trophy is appearing
|Expected Trophy Name|Expected Trophy Info|
|1M Points.|If a player earns 1-Million points or more.|
And user closes trophy popup
And user opens trophy
|Trophy Number|
|9|
Then five million points trophy is appearing
|Expected Trophy Name|Expected Trophy Info|
|5M Points.|If a player earns 5-Million points or more.|
And user closes trophy popup

Scenario: Create game trophy from admin and Verify that Game Trophy is appearing after clicking on it
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
And User play already created game
|GameName|GamePlayCount|AnswerType|
|Trophy Game Play|1|all correct|
When user clicks on Profile side menu button
And user wait for loading animation to be disappeared
When user clicks on Trophies
When user opens single level game trophy
Then Game Trophy Title is correct
|Expected Title|
|TROPHY ACHIEVED|
And Trophy name is correct
And Total points, Attempts and High Score is correct


Scenario: Verify that Statistics tab is selecting and correct screen is opening and LIFETIME, THIS YEAR, THIS MONTH and LAST MONTH tabs are appearing under statistics tab
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully
And user clicks on Profile side menu button
And user wait for loading animation to be disappeared
When user selects perticular tab
|TabName|
|STATISTICS|
Then statistics tab is opening
Then LIFETIME tab is appearing
Then THIS YEAR tab is appearing
Then THIS MONTH tab is appearing
Then LAST MONTH tab is appearing

Scenario: verify that TOTAL POINTS, GAMES, THOPHIES, PERFECT GAMES, CONTEST WON and TIME PLAYED fields are appearing under LIFETIME, THIS YEAR, THIS MONTH and LAST MONTH tab
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully
And user clicks on Profile side menu button
And user wait for loading animation to be disappeared
And user selects perticular tab
|TabName|
|STATISTICS|
And user scroll on the app
|Text Till Scroll|
|TIME PLAYED|
When user selects perticular tab
|TabName|
|LIFETIME|
Then Total Points, Games, Trophies, Perfect Games, Contests won and time played field are appearing
|Expected TotalPointsText|Expected GamesText|Expected TrophiesText|Expected PerfectGamesText|Expected ContestWonText|Expected TimePlayedText|
|TOTAL POINTS|GAMES|TROPHIES|PERFECT GAMES|CONTESTS WON|TIME PLAYED|
When user selects perticular tab
|TabName|
|THIS YEAR|
Then Total Points, Games, Trophies, Perfect Games, Contests won and time played field are appearing
|Expected TotalPointsText|Expected GamesText|Expected TrophiesText|Expected PerfectGamesText|Expected ContestWonText|Expected TimePlayedText|
|TOTAL POINTS|GAMES|TROPHIES|PERFECT GAMES|CONTESTS WON|TIME PLAYED|
When user selects perticular tab
|TabName|
|THIS MONTH|
Then Total Points, Games, Trophies, Perfect Games, Contests won and time played field are appearing
|Expected TotalPointsText|Expected GamesText|Expected TrophiesText|Expected PerfectGamesText|Expected ContestWonText|Expected TimePlayedText|
|TOTAL POINTS|GAMES|TROPHIES|PERFECT GAMES|CONTESTS WON|TIME PLAYED|
When user selects perticular tab
|TabName|
|LAST MONTH|
Then Total Points, Games, Trophies, Perfect Games, Contests won and time played field are appearing
|Expected TotalPointsText|Expected GamesText|Expected TrophiesText|Expected PerfectGamesText|Expected ContestWonText|Expected TimePlayedText|
|TOTAL POINTS|GAMES|TROPHIES|PERFECT GAMES|CONTESTS WON|TIME PLAYED|


Scenario: verify that TOTAL POINTS, GAMES, THOPHIES, PERFECT GAMES, CONTEST WON and TIME PLAYED are correct on Lifetime tab
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
And User play already created game for statistics
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
And User play already created game for statistics
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all wrong|
And user clicks on Profile side menu button
And user wait for loading animation to be disappeared
And user selects perticular tab
|TabName|
|STATISTICS|
And user scroll on the app
|Text Till Scroll|
|TIME PLAYED|
When user selects perticular tab
|TabName|
|LIFETIME|
Then Total Points are correct
Then Games count is correct
Then Trophies count is correct
|Expected Trophy Count|
|2|
Then Perfect games count is correct
Then Contest won count is correct
Then Time Played time is correct


Scenario: verify that TOTAL POINTS, GAMES, THOPHIES, PERFECT GAMES, CONTEST WON and TIME PLAYED are correct on This Year tab
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
And User play already created game for statistics
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
And User play already created game for statistics
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|random|
And user clicks on Profile side menu button
And user wait for loading animation to be disappeared
And user selects perticular tab
|TabName|
|STATISTICS|
And user scroll on the app
|Text Till Scroll|
|TIME PLAYED|
When user selects perticular tab
|TabName|
|THIS YEAR|
And user wait for loading animation to be disappeared
Then Total Points are correct
Then Games count is correct
Then Trophies count is correct
|Expected Trophy Count|
|2|
Then Perfect games count is correct
Then Contest won count is correct
Then Time Played time is correct


Scenario: verify that TOTAL POINTS, GAMES, THOPHIES, PERFECT GAMES, CONTEST WON and TIME PLAYED are correct on This Month tab
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
And User play already created game for statistics
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all wrong|
And user clicks on Profile side menu button
And user wait for loading animation to be disappeared
And user selects perticular tab
|TabName|
|STATISTICS|
And user scroll on the app
|Text Till Scroll|
|TIME PLAYED|
When user selects perticular tab
|TabName|
|THIS MONTH|
And user wait for loading animation to be disappeared
Then Total Points are correct
Then Games count is correct
Then Trophies count is correct
|Expected Trophy Count|
|1|
Then Perfect games count is correct
Then Contest won count is correct
Then Time Played time is correct


Scenario: verify that TOTAL POINTS, GAMES, THOPHIES, PERFECT GAMES, CONTEST WON and TIME PLAYED are correct on Last Month tab
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|
And new player is able to login to app
And User play already created game for statistics
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
And User play already created game for statistics
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
And user clicks on Profile side menu button
And user wait for loading animation to be disappeared
And user selects perticular tab
|TabName|
|STATISTICS|
And user scroll on the app
|Text Till Scroll|
|TIME PLAYED|
When user selects perticular tab
|TabName|
|LAST MONTH|
Then Total Points are correct for last month
Then Games count is correct for last month
Then Trophies count is correct
|Expected Trophy Count|
|0|
Then Perfect games count is correct for last month
Then Contest won count is correct for last month
Then Time Played time is correct for last month

Scenario: Verify that other player's profile is opening after clicking on it through leaderboard
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
When User clicks on Leaderboards
And User selects a random player
Then player profile screen is opening
Then current and lifetime tabs are appearing
|ExpectedTextCurrentTab|ExpectedTextLifetimeTab|
|CURRENT|LIFETIME|


Scenario: Verify that other players name, Department, Location, Active Since, Ratings and Status are correct on side menu if players clicks on it
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Pune|ALL|pass|
And new player is able to login to app
And User play already created game and calculate rating
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|2|random|
And User clicks on more Button
And Clicks on Logout button
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
When User clicks on Leaderboards
And User clicks on particular leaderboard
|LeaderboardType|
|DEPARTMENT|
And user wait for loading animation to be disappeared
And user selects a player to view its profile
Then Player name, Department, Location, Active Since, Ratings and status are correct
#
#
Scenario: verify that TOTAL POINTS, GAMES, THOPHIES, PERFECT GAMES, CONTEST WON and TIME PLAYED are correct on Lifetime and Current tab of other user
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Pune|ALL|pass|
And new player is able to login to app
And User play already created game for statistics
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
And User play already created game for statistics
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all wrong|
And User clicks on more Button
And Clicks on Logout button
And User is logged In
  |UserName|Password|
  |player_email|player_pw|
When User clicks on Leaderboards
And User clicks on particular leaderboard
|LeaderboardType|
|DEPARTMENT|
And user selects a player to view its profile
When user selects perticular tab
|TabName|
|CURRENT|
And user scroll on the app
|Text Till Scroll|
|TIME PLAYED|
And user wait for loading animation to be disappeared
Then Total Points are correct
Then Games count is correct
Then Trophies count is correct
|Expected Trophy Count|
|2|
Then Perfect games count is correct
Then Contest won count is correct
Then Time Played time is correct
And user scroll on the app
|Text Till Scroll|
|Player's Level|
Then Player's Level text is appearing
|ExpectedText|
|Player's Level|
When user selects perticular tab
|TabName|
|LIFETIME|
And user wait for loading animation to be disappeared
Then Total Points are correct
Then Games count is correct
Then Trophies count is correct
|Expected Trophy Count|
|2|
Then Perfect games count is correct
Then Contest won count is correct
Then Time Played time is correct
Then Player's Level text is appearing
|ExpectedText|
|Player's Level|