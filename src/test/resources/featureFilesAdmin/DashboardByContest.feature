Feature: Dashboard By Contest

Scenario: Verify that player data is showing correctly on reports for the contest when State: All Contests and Status: All Players
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
And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Contest|
And Manager clicks on filter
|Filter Type|
|State|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|State|All Contests|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|All Players|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Contest|
And Manager enters recently created contest name and select it
Then games played count is correct on dashboard
And participation count is correct for contest dashboard

Scenario: Verify that player data is showing correctly on reports for the contest when State: All Contests and Status: Active Players
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
    And Manager clicks on Dashboard side menu button
And Manager clicks on filter
|Filter Type|
|By|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Contest|
And Manager clicks on filter
|Filter Type|
|State|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|State|All Contests|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|Active Players|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Contest|
And Manager enters recently created contest name and select it
Then games played count is correct on dashboard
And participation count is correct for contest dashboard
	
Scenario: Verify that player data is showing correctly on reports for the contest when State: Live Contests and Status: All Players
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
|By|Contest|
And Manager clicks on filter
|Filter Type|
|State|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|State|Live Contests|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|All Players|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Contest|
And Manager enters recently created contest name and select it
Then games played count is correct on dashboard
And participation count is correct for contest dashboard

Scenario: Verify that player data is showing correctly on reports for the contest when State: Live Contests and Status: Active Players
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
|By|Contest|
And Manager clicks on filter
|Filter Type|
|State|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|State|Live Contests|
And Manager clicks on filter
|Filter Type|
|Status|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Status|Active Players|
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Contest|
And Manager enters recently created contest name and select it
Then games played count is correct on dashboard
And participation count is correct for contest dashboard
    