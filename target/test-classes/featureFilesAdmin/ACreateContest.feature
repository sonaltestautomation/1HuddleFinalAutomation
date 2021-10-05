Feature: Create,schedule and delete contest
Scenario: To check if contest is created and contest state is verified
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager clicks on Contests icon
And Manager clicks on Create a contest option 
And Manager enters contest name
And Manager clicks on Create Button
And Manager clicks on Contest Library option 
Then Verify state of created contest 
|State|
|DRAFT|
Scenario: To check if contest is scheduled and contest state is verified
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|Correct ans option count|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And Add Information title and description
|TotalInformationCount|
|2|
And click on Done button on gamepreview page
And Schedule Game
|Game Attempts|
|1|
And Manager clicks on Contests icon
And Manager clicks on Create a contest option 
And Manager enters contest name
And Manager clicks on Create Button
And Manager adds game to the contest which is already created in the company
And Manager adds rules,rewards and players to the contest
And Manager clicks on schedule button
Then Verfiy confirmarion popup
Then Verify state of scheduled contest 
|State|
|READY|
Scenario: To check if contest is searched by Contest Name
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|correct ans option count|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And Add Information title and description
|TotalInformationCount|
|2|
And click on Done button on gamepreview page
And Schedule Game
|Game Attempts|
|1|
And Manager clicks on Contests icon
And Manager clicks on Create a contest option 
And Manager enters contest name
And Manager clicks on Create Button
And Manager adds game to the contest which is already created in the company
And Manager adds rules,rewards and players to the contest
And Manager clicks on schedule button
And Verfiy confirmarion popup
And Manager clicks on Add a filter button
And Manager enters contest name in contest name filter
Then verify if correct contest is displayed on the page
Scenario: To check if contest is searched by Contest State filter
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|correct ans option count|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And Add Information title and description
|TotalInformationCount|
|2|
And click on Done button on gamepreview page
And Schedule Game
|Game Attempts|
|1|
And Manager clicks on Contests icon
And Manager clicks on Create a contest option 
And Manager enters contest name
And Manager clicks on Create Button
And Manager adds game to the contest which is already created in the company
And Manager adds rules,rewards and players to the contest
And Manager clicks on schedule button
And Verfiy confirmarion popup
And Manager clicks on Add a filter button
And Manager selects contest state from state filter
Then Verify if contest is correct
Scenario: Verify if ready contest is moved to draft and deleted in admin panel
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|correct ans option count|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And Add Information title and description
|TotalInformationCount|
|2|
And click on Done button on gamepreview page
And Schedule Game
|Game Attempts|
|1|
And Manager clicks on Contests icon
And Manager clicks on Create a contest option 
And Manager enters contest name
And Manager clicks on Create Button
And Manager adds game to the contest which is already created in the company
And Manager adds rules,rewards and players to the contest
And Manager clicks on schedule button
And Verfiy confirmarion popup
And Manager clicks on more option
And Manager clicks on move to draft option
And Manager clicks on yes button on confirmation popup
Then Verify if validation message is displayed about contest is moved to draft state
And Manager clicks on more option
And Manager clicks on delete option
And Manager clicks on yes button on confirmation popup
Then Verify if validation message is displayed about contest deletion
Scenario: To check if all reward categories are displayed correctly in the category dropdown in contest 
	Given Manager is on Admin Home page 
	And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
	And Manager clicks on Contests icon 
	And Manager clicks on Create a contest option 
	And Manager enters contest name 
	And Manager clicks on Create Button 
	And Manager clicks on Reward button 
	And Manager clicks on Reward Category dropdown
	Then Verify if all reward categories are displayed correctly in the category dropdown 		
Scenario: To check if contest rewards are displayed in the dropdown as per selected reward category in contest
Given Manager is on Admin Home page 
	And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
	And Manager clicks on Contests icon 
	And Manager clicks on Create a contest option 
	And Manager enters contest name 
	And Manager clicks on Create Button 
	And Manager clicks on Reward button 
	And Manager selects Reward Category from the dropdown
	|Reward Category|
	|Cash|
	|Experiences|
	|Health & Fitness|
	|Personal Development|
	|Recognition|
	|Swag|
	|Team Building|
	|Time Off|
	|Travel|
	Then Verify if contest rewards are displayed in the dropdown as per selected reward category	
Scenario: To check if delete game in contest functionality is working properly
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|correct ans option count|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And Add Information title and description
|TotalInformationCount|
|2|
And click on Done button on gamepreview page
And Schedule Game
|Game Attempts|
|1|
And Manager clicks on Contests icon
And Manager clicks on Create a contest option 
And Manager enters contest name
And Manager clicks on Create Button
And Manager adds game to the contest which is already created in the company
And Manager clicks on delete game 
Then Verify game deletion confirmation popup and manager clicks on yes button
Then Verify if game is deleted from the contest
Then Manager clicks on Contest Library option
Scenario: Check if contest with ready state is displayed on web app
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|correct ans option count|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And Add Information title and description
|TotalInformationCount|
|2|
And click on Done button on gamepreview page
And Schedule Game
|Game Attempts|
|1|
And Manager clicks on Contests icon
And Manager clicks on Create a contest option 
And Manager enters contest name
And Manager clicks on Create Button
And Manager adds game to the contest which is already created in the company
And Manager adds rules,rewards and players to the contest
And Manager clicks on schedule button
Then user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
Then Verify if contest is displayed with correct name on web app
Then Verify if COMING SOON label is displayed for the contest
Then Verify rules and reward category are displyed correctly
Then Verify launch contest button is disabled
Scenario: To check if contest name field kept blank then create button is disabled
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager clicks on Contests icon
And Manager clicks on Create a contest option 
Then verify if create button is disabled when contest name field is blank
Scenario: Verify confirmation popup when fields kept blank while scheduling contest
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager enters random game name
And Enters Categories Questions and Options
|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|correct ans option count|
|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And Add Information title and description
|TotalInformationCount|
|2|
And click on Done button on gamepreview page
And Schedule Game
|Game Attempts|
|1|
And Manager clicks on Contests icon
And Manager clicks on Create a contest option 
And Manager enters contest name
And Manager clicks on Create Button
And Manager adds game to the contest which is already created in the company
And Manager clicks on schedule button
Then Verify the confirmation popup on schedule button when fields are blank 
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
	|2711|Mumbai|3512|
	And Contest publish successfully
    And user is on home page
  	And user enters recently added email
  	And clicks on Next button
  	And user enters recently added password
  	And user click on login button
  	And Refresh the page till created contest is visible
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
	|2711|Mumbai|3512|
	And Contest publish successfully
	And user is on home page 
	And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
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
	|2711|Mumbai|3512|
	And Contest publish successfully
	And user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
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
	|2711|Mumbai|3512|
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
	|2711|Mumbai|3512|
	And Contest publish successfully	
	And user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
	And User clicks on Leaderboards
	And User checks the score on global leaderboard screen
	|Already created Player Name|
	|Player Automation|
	And user clicks on Games tab in player app
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
	|2711|Mumbai|3512|
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
  	And User clicks on Leaderboards
	And User checks the score on global leaderboard screen
	|Already created Player Name|
	|Player Automation|
	And user clicks on Games tab in player app
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
	#|Shop-Automation Game|
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
	|2711|Mumbai|3512|
	And Contest publish successfully
    And user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
	And User clicks on Leaderboards
	And user clicks on Games tab in player app
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
	|2711|Mumbai|3512|
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
	And User clicks on more option
	And Clicks on Logout button	
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
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
	|2711|Mumbai|3512|
	And Contest publish successfully
 	Given Manager is on Admin Home page
	And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
	And Manager add a player to specific location and department
	|LocationName|Department Name|Password|
	|Mumbai|Design|pass|
    And user is on home page
  	And user enters recently added email
  	And clicks on Next button
  	And user enters recently added password
  	And user click on login button
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
	|2711|Mumbai|3512|
	And Contest publish successfully
	And user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
	And User clicks on Leaderboards
	And user clicks on Games tab in player app
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
Scenario: Verify the functionality of Stop Contest 
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
	|2711|Mumbai|3512|
	And Contest publish successfully
	And user is on home page 
	And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
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
	And User clicks on the leaderboard of ended contest
	Then Verify if player gets YOU WON trophy with correct details
	Then Verify player gets contest reward trophy