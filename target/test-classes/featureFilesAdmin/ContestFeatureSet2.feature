Feature: Create,schedule and delete contest Set 2

Scenario: Check if new label for LIVE contest is displayed on web app before launching the contest for the first time
Given Manager is on Admin Home page
    And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
    And Manager add a player
       |DepartmentName|Password|
       |ALL|pass|
	And I am an authorized user
	|UserName|Password|
  |manager_email|manager_pw|
	When I add new contest
	|CompanyId|
	|321|
	And I add reward to contest
	|Reward|
	|Reward for testing|
	And I update contest
	And I add game to contest
	|gameId|LimitType|
	|15131|DAILY|
	And I add assignment in contest
	|LocationId|LocationName|DeptId|
	|2711|Mumbai|3965|
	And Contest publish successfully
    And user is on home page
  	And user enters recently added email
  	And clicks on Next button
  	And user enters recently added password
  	And user click on login button
  	And Refresh the page till created contest is visible
  	And User wait for banner image to be load
Then Verify new label is displayed for the contest

Scenario: Check if launch contest button is enabled on web app 
Given I am an authorized user
|UserName|Password|
|manager_email|manager_pw|
	When I add new contest
	|CompanyId|
	|321|
	And I add reward to contest
	|Reward|
	|Reward for testing|
	And I update contest
	And I add game to contest
	|gameId|LimitType|
	|15131|DAILY|
	And I add assignment in contest
	|LocationId|LocationName|DeptId|
	|2711|Mumbai|3965|
	And Contest publish successfully
	And user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And User wait for banner image to be load
Then Verify if launch contest button is enabled for the contest
	
Scenario: Verify if game is displayed on games tab when clicked on launch contest
	Given I am an authorized user
	|UserName|Password|
|manager_email|manager_pw|
	When I add new contest
	|CompanyId|
	|321|
	And I add reward to contest
	|Reward|
	|Reward for testing|
	And I update contest
	And I add game to contest
	|gameId|LimitType|
	|15131|DAILY|
	And I add assignment in contest
	|LocationId|LocationName|DeptId|
	|2711|Mumbai|3965|
	And Contest publish successfully
	And user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
   And User wait for banner image to be load
   And Verify if launch contest button is enabled for the contest	
	And user clicks on launch contest button
	And user clicks on games tab
	Then verify game which is added in the contest is displayed in games tab		

Scenario: Verify if proper message is displayed on contest LB when user is playing for the first time
    Given I am an authorized user
	|UserName|Password|
|manager_email|manager_pw|
	When I add new contest
	|CompanyId|
	|321|
	And I add reward to contest
	|Reward|
	|Reward for testing|
	And I update contest
	And I add game to contest
	|gameId|LimitType|
	|15131|DAILY|
	And I add assignment in contest
	|LocationId|LocationName|DeptId|
	|2711|Mumbai|3965|
	And Contest publish successfully
    And Manager is on Admin Home page
  And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
    And Manager add a player
       |DepartmentName|Password|
       |ALL|pass|
    And user is on home page
  	And user enters recently added email
  	And clicks on Next button
  	And user enters recently added password
  	And user click on login button
  	And User wait for banner image to be load
  	And user clicks on launch contest button
  	Then Verify message displayed on contest leaderboard  
  		
Scenario: Check if score is not updated on contest LB and global LB after game play with wrong answer	
    Given I am an authorized user
	|UserName|Password|
|manager_email|manager_pw|
	When I add new contest
	|CompanyId|
	|321|
	And I add reward to contest
	|Reward|
	|Reward for testing|
	And I update contest
	And I add game to contest
	|gameId|LimitType|
	|15131|DAILY|
	And I add assignment in contest
	|LocationId|LocationName|DeptId|
	|2711|Mumbai|3965|
	And Contest publish successfully	
	And user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
  And User wait for banner image to be load
	And User clicks on Leaderboards
	And User checks the score on global leaderboard screen
	|Already created Player Name|
	|Player Automation|
	And user clicks on Games tab in player app
	And User wait for banner image to be load
	And user clicks on launch contest button
	And Check the score on contest LB
	|Existing Player|
	|Player Automation|
	And user clicks on games tab
	And user clicks on game
	|GameForLiveContest|
	|Automation Game for live contest|
	And User can click on Play Game button
	And User is selecting category
	And Verify total score after ending game
	|AnswerType|
	|all wrong|
	And User clicks on home button and checks the score 
	Then Verify score on contest LB after game play
	And User clicks on back button on contest page
	And User wait for banner image to be load
	
	And User clicks on Leaderboards
	And User checks the score on global leaderboard screen
	|Existing Player|
	|Player Automation|
	Then Verify score on global LB after game play		
Scenario: Verify palyer name and check if score on contest LB and global LB is getting updated after game play with correct answer
    Given I am an authorized user
	|UserName|Password|
|manager_email|manager_pw|
	When I add new contest
	|CompanyId|
	|321|
	And I add reward to contest
	|Reward|
	|Reward for testing|
	And I update contest
	And I add game to contest
	|gameId|LimitType|
	|15131|DAILY|
	And I add assignment in contest
	|LocationId|LocationName|DeptId|
	|2711|Mumbai|3965|
	And Contest publish successfully	
    And Manager is on Admin Home page
   And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
    And Manager add a player
       |DepartmentName|Password|
       |ALL|pass|
    And user is on home page
  	And user enters recently added email
  	And clicks on Next button
  	And user enters recently added password
  	And user click on login button
  	And User wait for banner image to be load
  	And User clicks on Leaderboards
	And User checks the score on global leaderboard screen
	|Already created Player Name|
	|Player Automation|
	And user clicks on Games tab in player app
	And User wait for banner image to be load
	And user clicks on launch contest button
	And Check the score on contest LB
	|Already created Player Name|
	|Player Automation|
	And user clicks on games tab
	And user clicks on game
	|GameForLiveContest|
	|Automation Game for live contest|
	And User can click on Play Game button
	And User is selecting category
	And Verify total score after ending game
	|AnswerType|
	|all correct|
	And user closes all the tropies achieved
	And User clicks on home button and checks the score
	Then Verify score on contest LB after game play
	And Verify player name on contest LB
	And User clicks on back button on contest page
	And User wait for banner image to be load
	And User clicks on Leaderboards
	And User checks the score on global leaderboard screen
	|Already created Player Name|
	|Player Automation|
	Then Verify score on global LB after game play

Scenario: Check if score on contest LB and global LB is getting updated after The Shop game play which is added in the contest
	Given user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
	And user clicks on launch button for the existing contest
	|LiveContestName|
	|The Shop-Automation Contest|
	And Check the score on contest LB
	|Existing Player|
	|Player Automation|
	And user clicks on games tab
	And user clicks on game
	|GameForLiveContest|
	|TheShopAutomationGame|
	And User can click on Play Game button
	And User is selecting category
	And Verify total score after ending game
	|AnswerType|
	|all correct|
	And User clicks on home button and checks the score
	Then Verify score on contest LB after game play	
	
Scenario: Verify if score on contest LB is same as on player's profile
   Given I am an authorized user
	|UserName|Password|
|manager_email|manager_pw|
	When I add new contest
	|CompanyId|
	|321|
	And I add reward to contest
	|Reward|
	|Reward for testing|
	And I update contest
	And I add game to contest
	|gameId|LimitType|
	|15131|DAILY|
	And I add assignment in contest
	|LocationId|LocationName|DeptId|
	|2711|Mumbai|3965|
	And Contest publish successfully
    And user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
  And User wait for banner image to be load
	And User clicks on Leaderboards
	And user clicks on Games tab in player app
	And User wait for banner image to be load
	And user clicks on launch contest button
	And user clicks on games tab
	And user clicks on game
	|GameForLiveContest|
	|Automation Game for live contest|
	And User can click on Play Game button
	And User is selecting category
	And Verify total score after ending game
	|AnswerType|
	|all correct|
	And User clicks on home button and checks the score
	And Check the score on contest LB
	|Existing Player|
	|Player Automation|
	And User clicks on name on contest LB
	Then Verify if player's profile page is opening
	Then Verify if score on contest LB is same as player's profile
	
Scenario: Verify player's ranking on contest LB
    Given I am an authorized user
	|UserName|Password|
|manager_email|manager_pw|
	When I add new contest
	|CompanyId|
	|321|
	And I add reward to contest
	|Reward|
	|Reward for testing|
	And I update contest
	And I add game to contest
	|gameId|LimitType|
	|15131|DAILY|
	And I add assignment in contest
	|LocationId|LocationName|DeptId|
	|2711|Mumbai|3965|
	And Contest publish successfully
	And Manager is on Admin Home page
   And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
    And Manager add a player
       |DepartmentName|Password|
       |ALL|pass|
    And user is on home page
  	And user enters recently added email
  	And clicks on Next button
  	And user enters recently added password
  	And user click on login button
  	And User wait for banner image to be load
  	And user clicks on launch contest button
  	And user clicks on games tab
	And user clicks on game
	|GameForLiveContest|
	|Automation Game for live contest|
	And User can click on Play Game button
	And User is selecting category
	And Verify total score after ending game
	|AnswerType|
	|all wrong|
	And User closes tropies achieved for 1st game
	And User clicks on home button and checks the score	
	And User clicks on back button on contest page
	And User wait for banner image to be load
	And User clicks on more option
	And Clicks on Logout button	
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
  And User wait for banner image to be load
	And Verify if launch contest button is enabled for the contest
  	And user clicks on launch contest button
  	And user clicks on games tab
	And user clicks on game
	|GameForLiveContest|
	|Automation Game for live contest|
	And User can click on Play Game button
	And User is selecting category
	And Verify total score after ending game
	|AnswerType|
	|all correct|
	And User clicks on home button and checks the score
	Then Verify ranking of the players on contest LB

Scenario: Verify if contest is available for the newly added player in existing location & dept
Given I am an authorized user
	|UserName|Password|
|manager_email|manager_pw|
	When I add new contest
	|CompanyId|
	|321|
	And I add reward to contest
	|Reward|
	|Reward for testing|
	And I update contest
	And I add game to contest
	|gameId|LimitType|
	|15131|DAILY|
	And I add assignment in contest
	|LocationId|LocationName|DeptId|
	|2711|Mumbai|3965|
	And Contest publish successfully
 	Given Manager is on Admin Home page
	And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
	And Manager add a player to specific location and department
	|LocationName|Department Name|Password|
	|Mumbai|Development|pass|
    And user is on home page
  	And user enters recently added email
  	And clicks on Next button
  	And user enters recently added password
  	And user click on login button
  	And User wait for banner image to be load
  	Then Verify if launch contest button is enabled for the contest
  	
Scenario: Verify if contest game is grayed out after daily one attempt
 Given I am an authorized user
	|UserName|Password|
|manager_email|manager_pw|
	When I add new contest
	|CompanyId|
	|321|
	And I add reward to contest
	|Reward|
	|Reward for testing|
	And I update contest
	And I add game to contest
	|gameId|LimitType|
	|15131|DAILY|
	And I add assignment in contest
	|LocationId|LocationName|DeptId|
	|2711|Mumbai|3965|
	And Contest publish successfully
	And user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
  And User wait for banner image to be load
	And User clicks on Leaderboards
	And user clicks on Games tab in player app
	And User wait for banner image to be load
	And Verify if launch contest button is enabled for the contest
	And user clicks on launch contest button
	And user clicks on games tab
	And user clicks on game
	|GameForLiveContest|
	|Automation Game for live contest|
	And User can click on Play Game button
	And User is selecting category
	And Verify total score after ending game
	|AnswerType|
	|all correct|
	And User clicks on home button and checks the score
	And user clicks on games tab
	Then Verify if game is grayed out

Scenario: Verify the functionality of Stop Contest feature
 Given I am an authorized user
	|UserName|Password|
|manager_email|manager_pw|
	When I add new contest
	|CompanyId|
	|321|
	And I add reward to contest
	|Reward|
	|Reward for testing|
	And I update contest
	And I add game to contest
	|gameId|LimitType|
	|15131|DAILY|
	And I add assignment in contest
	|LocationId|LocationName|DeptId|
	|2711|Mumbai|3965|
	And Contest publish successfully
	And user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
  And User wait for banner image to be load
	And Verify if launch contest button is enabled for the contest
	And user clicks on launch contest button
	And user clicks on games tab
	And user clicks on game
	|GameForLiveContest|
	|Automation Game for live contest|
	And User can click on Play Game button
	And User is selecting category
	And Verify total score after ending game
	|AnswerType|
	|all correct|
	And User clicks on home button and checks the score	
    And closes current window
	And Manager opens new tab
	Given Manager is on Admin Home page
	And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
	And Manager clicks on Contests icon
	And Manager clicks on Contest Library option 
	And Manager clicks on more option for live contest
    And Manager clicks on stop the contest option
    And Manager clicks on end now button
    Then verify admin gets contest ended validation message
    Then verify ended contest status
    And user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
  And User wait for banner image to be load
	And User clicks on the leaderboard of ended contest
	Then Verify if player gets YOU WON trophy with correct details
	Then Verify player gets contest reward trophy