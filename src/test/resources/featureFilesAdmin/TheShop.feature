Feature: The Shop feature scenrios 
Scenario: Check if game categories are shown correctly in the game category dropdown 
	Given Manager is on Admin Home page 
	When SuperAdmin is logged In 
		|UserName|Password|
		|superadmin_email|superadmin_pw|   
    And Selects company from dropdown
	|Company Name|
	|Test Company 2020|       
	When Manager enters random game name 
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
	And Admin clicks on game library menu
	And Admin clicks on more game options 
	And Admin clicks on Add To The Shop option
	And Admin clicks on Game Category Dropdown 
	Then Admin veryfies if game categories are shown correctly 
Scenario: Check if validation message is displayed for invalid game banner image format 
	Given Manager is on Admin Home page 
	When SuperAdmin is logged In 
		|UserName|Password|
		|superadmin_email|superadmin_pw| 
	And Selects company from dropdown
	|Company Name|
	|Test Company 2020|           
	When Manager enters random game name 
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
	And Admin clicks on game library menu
	And Admin clicks on more game options 
	And Admin clicks on Add To The Shop option
	And Admin clicks on plus icon to select banner image
	And Admin uploads game banner image with invalid format Other than PNG,JPG and JPEG 
	Then Verify validation message is displayed
	|Validation Message| 
	|Please make sure that you are selecting a PNG / JPG / JPEG image file.|
Scenario: Check if game is successfully added in The Shop 
	Given Manager is on Admin Home page 
	When SuperAdmin is logged In 
		|UserName|Password|
		|superadmin_email|superadmin_pw| 
	And Selects company from dropdown
	|Company Name|
	|Test Company 2020|            
	When Manager enters random game name 
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
    And Admin clicks on game library menu
	And Admin clicks on more game options 
	And Admin clicks on Add To The Shop option
	And Admin clicks on plus icon to select banner image
	And Admin uploads valid game banner image 
	And Admin clicks on done button
	And Admin clicks on Game Category Dropdown 
	And Admin Selects game category 
	|Game category|
	|Workplace Safety|
	And Admin Enters valid Author Name 
	|Author Name|
	|Automation Test|
	And Admin Enters valid discription 
	|Description|
	|Game is added through automation|
	And Admin clicks on ADD button 
	Then Verify if validation message is displayed after adding game to the shop 
	|Validation Message|
	|Game added to The Shop successfully.|
	And Click on The Shop menu 
	And Click on view all option of selected category 
	And Select number from pagination dropdown
	Then Verify if game is displayed under selected game category on the shop page 
	|Game category|
	|Workplace Safety|
	Then Verify author name and description on the shop game card 
	Then Verify if game is added in the last postion 
#Scenario: Check if admin can update shop banner image 
#	Given Manager is on Admin Home page 
#	When Manager is logged In 
#		|UserName|Password|
#		|sha@codewalla.com|pass123| 
#	And Click on The Shop menu 
#	Then Verify if admin can update shop banner image 
#Scenario:
#Check if super admin can edit Game category, Author name & description and updated information is correctly shown 
#	Given Manager is on Admin Home page 
#	When Manager is logged In 
#		|UserName|Password|
#		|sha@codewalla.com|pass123|           
#	When Manager enters random game name 
#	And Enters Categories Questions and Options 
#		|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|No of correct option|
#		|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
#	And Click on Preview button 
#	And Add Game Preview Title and Scenario
#		|Game Preview Title|Game Scenario|
#		|This is game preview for automation testing|This is game scenario for automation testing|
#	And click on Done button on gamepreview page 
#	And Schedule Game 
#		|Game Attempts|
#		|1|
#	And Admin clicks on more game options 
#	And Admin clicks on Add To The Shop button 
#	And Admin uploads valid game image 
#	And Admin Selects game category 
#	And Admin Enters valid Author Name 
#	And Admin Enters valid discription 
#	And Admin clicks on ADD button 
#	And Click on The Shop menu 
#	And Click on view all option of selected category 
#	And Click on more option on the shop game card 
#	And Click on Edit button 
#	And Admin Selects game category 
#	And Admin Enters valid Author Name 
#	And Admin Enters valid discription 
#	And Admin clicks on ADD button 
#	And Click on view all option of selected category 
#	Then Verify if game is displayed under selected game category on the shop page 
#	Then Verify author name and description on the shop game card 
#Scenario: Check shop game delete functionality 
#	Given Manager is on Admin Home page 
#	When Manager is logged In 
#		|UserName|Password|
#		|sha@codewalla.com|pass123|           
#	When Manager enters random game name 
#	And Enters Categories Questions and Options 
#		|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|No of correct option|
#		|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
#	And Click on Preview button 
#	And Add Game Preview Title and Scenario
#		|Game Preview Title|Game Scenario|
#		|This is game preview for automation testing|This is game scenario for automation testing|
#	And click on Done button on gamepreview page 
#	And Schedule Game 
#		|Game Attempts|
#		|1|
#	And Admin clicks on more game options 
#	And Admin clicks on Add To The Shop button 
#	And Admin uploads valid game image 
#	And Admin Selects game category 
#	And Admin Enters valid Author Name 
#	And Admin Enters valid discription 
#	And Admin clicks on ADD button 
#	And Click on The Shop menu 
#	And Click on view all option of selected category 
#	And Click  on more option on the shop game card 
#	And Click on Delete option 
#	And Click on confirmation pop up 
#	Then Verify deleted validation message 
#	And Click on view all option of selected category 
#	Then Verify if game is removed from selected category 
#Scenario: Check if manager can add shop game to the library 
#	Given Manager is on Admin Home page 
#	When Manager is logged In 
#		|UserName|Password|
#		|sha@codewalla.com|pass123|           
#	When Manager enters random game name 
#	And Enters Categories Questions and Options 
#		|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|No of correct option|
#		|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
#	And Click on Preview button 
#	And Add Game Preview Title and Scenario
#		|Game Preview Title|Game Scenario|
#		|This is game preview for automation testing|This is game scenario for automation testing|
#	And click on Done button on gamepreview page 
#	And Schedule Game 
#		|Game Attempts|
#		|1|
#	And Admin clicks on more game options 
#	And Admin clicks on Add To The Shop button 
#	And Admin uploads valid game image 
#	And Admin Selects game category 
#	And Admin Enters valid Author Name 
#	And Admin Enters valid discription 
#	And Admin clicks on ADD button 
#	And closes current window 
#	Given Manager is on Admin Home page 
#	When Manager is logged In 
#		|UserName|Password|
#		|manager@automation.com|pass|
#	And Click on The Shop menu 
#	And Click on view all option of selected category 
#	And Click on plus button to add shop game to the library 
#	Then Verify the game added validation message 
#	And manager clicks on game library 
#	Then Verify if game added from the shop is displayed in the game library with Category 'The Shop' 
#Scenario:
#Check if on shop game preview screen admin can edit game rating and description 
#	Given Manager is on Admin Home page 
#	When Manager is logged In 
#		|UserName|Password|
#		|sha@codewalla.com|pass123|           
#	When Manager enters random game name 
#	And Enters Categories Questions and Options 
#		|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|No of correct option|
#		|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
#	And Click on Preview button 
#	And Add Game Preview Title and Scenario
#		|Game Preview Title|Game Scenario|
#		|This is game preview for automation testing|This is game scenario for automation testing|
#	And click on Done button on gamepreview page 
#	And Schedule Game 
#		|Game Attempts|
#		|1|
#	And Admin clicks on more game options 
#	And Admin clicks on Add To The Shop button 
#	And Admin uploads valid game image 
#	And Admin Selects game category 
#	And Admin Enters valid Author Name 
#	And Admin Enters valid discription 
#	And Admin clicks on ADD button 
#	And Click on The Shop menu 
#	And Click on view all option of selected category 
#	And Click on the added shop game 
#	And Click on edit option 
#	And Update the Rating & Description 
#	And Click on save button 
#	And Click on the category in the breadcrumb 
#	And Click on the added shop game 
#	Then Verify the updated Rating & description 
#Scenario: Check if on shop game preview screen admin can add screenshots 
#	Given Manager is on Admin Home page 
#	When Manager is logged In 
#		|UserName|Password|
#		|sha@codewalla.com|pass123|           
#	When Manager enters random game name 
#	And Enters Categories Questions and Options 
#		|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|No of correct option|
#		|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
#	And Click on Preview button 
#	And Add Game Preview Title and Scenario
#		|Game Preview Title|Game Scenario|
#		|This is game preview for automation testing|This is game scenario for automation testing|
#	And click on Done button on gamepreview page 
#	And Schedule Game 
#		|Game Attempts|
#		|1|
#	And Admin clicks on more game options 
#	And Admin clicks on Add To The Shop button 
#	And Admin uploads valid game image 
#	And Admin Selects game category 
#	And Admin Enters valid Author Name 
#	And Admin Enters valid discription 
#	And Admin clicks on ADD button 
#	And Click on The Shop menu 
#	And Click on view all option of selected category 
#	And Click on the added shop game 
#	And Click on edit option 
#	And Add screenshot 
#	And Click on save button 
#	And Click on the category in the breadcrumb 
#	And Click on the added shop game 
#	Then Verify the updated screenshot 
#Scenario:
#Check if manager can add shop game to the library from shop game preview screen 
#	Given Manager is on Admin Home page 
#	When Manager is logged In 
#		|UserName|Password|
#		|sha@codewalla.com|pass123|           
#	When Manager enters random game name 
#	And Enters Categories Questions and Options 
#		|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|No of correct option|
#		|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|1|1|4|1|
#	And Click on Preview button 
#	And Add Game Preview Title and Scenario
#		|Game Preview Title|Game Scenario|
#		|This is game preview for automation testing|This is game scenario for automation testing|
#	And click on Done button on gamepreview page 
#	And Schedule Game 
#		|Game Attempts|
#		|1|
#	And Admin clicks on more game options 
#	And Admin clicks on Add To The Shop button 
#	And Admin uploads valid game image 
#	And Admin Selects game category 
#	And Admin Enters valid Author Name 
#	And Admin Enters valid discription 
#	And Admin clicks on ADD button 
#	And closes current window 
#	Given Manager is on Admin Home page 
#	When Manager is logged In 
#		|UserName|Password|
#		|manager@automation.com|pass|
#	And Click on The Shop menu 
#	And Click on view all option of selected category 
#	And Click on the added shop game 
#	And Click on add to library option 
#	Then Verify the game added validation message 
#	And manager clicks on game library 
#	Then Verify if game added from the shop is displayed in the game library with Category 'The Shop' 
#	
