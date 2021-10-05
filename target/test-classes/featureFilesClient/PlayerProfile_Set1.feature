Feature: Profile Feature-Achievement and Statistics Set 1

Scenario: Verify that profile screen is opening after clicking on Profile Achievements and Statistics tabs are appearing and score card is opening
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then player should be logged In successfully
And user wait for loading animation to be disappeared
And user clicks on Profile side menu button
Then player profile screen is opening
Then Achievements and Statistics tabs are appearing
When user verify and click Scorecard button
Then Scorecard popup is opening


Scenario: Verify that Player name, Department, Location, Active Since, Ratings and Status are correct on side menu if player plays only SP game
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location and department
|LocationName|Department Name|Password|
|Udaipur|Design|pass|
And new player is able to login to app
And user wait for loading animation to be disappeared
And User play already created game and calculate rating
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|2|random|
And user clicks on Profile side menu button
Then Player name, Department, Location, Active Since, Ratings and status are correct



Scenario: Verify that Whats Next, Download Scorecard, Share on social/resume text and social icons is appearing on card and download button is appearing on card and success is appearing after clicking on download button
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully
And user clicks on Profile side menu button
When user verify and click Scorecard button
Then What Next, Download Scorecard, Share on social/resume text and social icons are appearing on card
Then Download button is appearing on scorecard
Then success message is appearing after clicking on download button on scorecard

Scenario: Verify that close button is working on scorecard and player is navigating to correct screen
Given user is on home page
And User is logged In
   |UserName|Password|
   |player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully
When user clicks on Profile side menu button
And user verify and click Scorecard button
And user verify and click on close button
Then player profile screen is opening

Scenario: Verify that level image with My level text is displaying and share level is working
Given user is on home page
And User is logged In
   |UserName|Password|
   |player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully
When user clicks on Profile side menu button
Then My Level text is appearing
Then level image is displaying
When user verify and click on level share icon on profile screen
Then Share modal title is correct for levels
And Facebook sharing is working
And LinkdIn sharing is working
And Twitter sharing is working
And Mail sharing is working


Scenario: Verify that game count is correct with every level before playing game
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
Then game count is correct with Rookie, Starter, Professional, All Star and Master level
|RookieGameCount|StarterGameCount|ProfessionalGameCount|AllStarGameCount|MasterGameCount|
|1|100|350|500|1,000|

Scenario: Verify that level is showing as Achieved if it is achieved after playing a game
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
Then game count is correct with Rookie, Starter, Professional, All Star and Master level
|RookieGameCount|StarterGameCount|ProfessionalGameCount|AllStarGameCount|MasterGameCount|
|1|100|350|500|1,000|


Scenario: Verify that My Accomplishments field is displaying and Trophies, Contest Rewards and Multilevel sub items appearing under it
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully
And user clicks on Profile side menu button
Then My Accomplishments field is appearing
Then Trophies field is appearing under My Accomplishments field
Then Contests field is appearing under My Accomplishments field
Then Rewards field is appearing under My Accomplishments field


Scenario: Verify that trophies count is correct in black bubble
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
	|DepartmentName|Password|
	|ALL|pass|
And new player is able to login to app
And user wait for loading animation to be disappeared
And User play already created game
|GameName|GamePlayCount|AnswerType|
|GameForLeaderboard|1|all correct|
When user clicks on Profile side menu button
And user wait for loading animation to be disappeared
Then trophy count is correct in bubble
|ExpectedTrophyCount|
|2|

Scenario: Verify that TROPHIES screen is opening after clicking on Trophies and user is redirect to level screen after clicking on back button
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully
And user clicks on Profile side menu button
When user clicks on Trophies
Then Thophies screen is opening 
Then user clicks on back button
Then Achievements and Statistics tabs are appearing

Scenario: Verify that Contest screen is opening after clicking on Contests and user is redirect to level screen after clicking on back button
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully
And user clicks on Profile side menu button
When user clicks on Contests
Then Contests screen is opening
Then user clicks on back button
Then Achievements and Statistics tabs are appearing

Scenario: Verify that Rewards screen is opening after clicking on Rewards and user is redirect to level screen after clicking on back button
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully
And user clicks on Profile side menu button
When user clicks on Rewards
Then Rewards screen is opening 
Then user clicks on back button
Then Achievements and Statistics tabs are appearing

Scenario: Verify that total unlocked, career trophies, Multilevel games and single level games fields are appearing on trophies screen
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully
And user clicks on Profile side menu button
When user clicks on Trophies
Then total unlocked field is appearing on trophies screen
|Expected Field|
|TOTAL UNLOCKED|
Then career unloacked field is appearing on trophies screen
|Expected Field|
|CAREER TROPHIES|
Then multilevel game field is appearing with trophies screen
|Expected Field|
|MULTILEVEL GAMES|
Then single level game field is appearing with trophies screen
|Expected Field|
|SINGLE LEVEL GAMES|

Scenario: Verify that Total Wins and Contest Trophies fields are appearing on contest screen
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully
And user clicks on Profile side menu button
When user clicks on Contests
Then Total Wins fiels is appearing on contest screen
|Expected Field|
|TOTAL WINS|
Then Contest Trophies field is appearing on contest screen
|Expected Field|
|CONTEST TROPHIES|

Scenario: Verify total unlocked and contest rewards fields are appearing on rewards screen
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And user wait for loading animation to be disappeared
Then player should be logged In successfully
And user clicks on Profile side menu button
And user wait for loading animation to be disappeared
When user clicks on Rewards
Then total unlocked field is apparing on rewards screen
|Expected Field|
|TOTAL UNLOCKED|
Then contest rewards field is appearing on rewards screen
|Expected Field|
|CONTEST REWARDS|

#Scenario: Verify that weekly streak count is showing correctly
#Given user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|vishal.1huddle@gmail.com|pass|
#And user wait for loading animation to be disappeared
#Then player should be logged In successfully
#And user clicks on Profile side menu button
#And user wait for loading animation to be disappeared
#When user selects perticular tab
#|TabName|
#|STATISTICS|
#Then weekly streak container is appearing
#Then weekly streak count is correct