Feature: Create,schedule and delete contest Set 1
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

