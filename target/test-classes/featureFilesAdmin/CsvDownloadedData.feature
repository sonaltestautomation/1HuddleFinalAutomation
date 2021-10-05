Feature: Download CSV and Verify Data on various pages of the application

Scenario: verify that player csv data is showing correctly for statistics report

Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location department and group
|LocationName|Department Name|Password|Group|
|Udaipur|Design|pass|Group A|
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
|10|
And new player is able to login to app
And user wait for loading animation to be disappeared
And User play recently created game for statistics
|GamePlayCount|AnswerType|
|1|random|
And Manager is on Admin Home page
Then Dashboard screen is opening
And Manager clicks on Detailed Report tab
And Manager clicks on filter
|Filter Type|
|by|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Player|
And Manager clicks on filter
|Filter Type|
|mode|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Mode|all_games|
And Manager clicks on Add a filter button
And Manager clicks on submenu arrow button
|FilterType|
|Player|
And Manager enters recently played player name
And Manager selects searched item
And Manager clicks on time filter
And Manager selects time duration in time filter on detailed report page
|Duration Type|
|This Month|
And Manager clicks on player to open its report
Then options icon is appearing and working on detailed report
Then download button is appearing under option on detailed report
|Expected Text|
|Download|
Then send by email button is appearing under option on detailed report
|Expected Text|
|Send by Email|
And Manager clicks on send by email button
Then correct modal is opening
|Modal Name|
|Send by Email|
And user closes default email id chip
And user clicks on Add Email chip
And user enters email and hit enter
|Email|
|vishal.1huddle@gmail.com|
And user clicks on button on the modal
|Button Name|
|SEND EMAIL|
Then success message is appearing after sending detailed report
|Expected Text|
|It's on the way! The report will be e-mailed to the selected e-mail addresses.|
Then options icon is appearing and working on detailed report
And Manager clicks on download button
Then success message is appearing after downloading report
|Expected Text|
|Downloading reports...|
And correct data is showing in downloaded csv for player statistics
|Player Name|Player Email|Total Time Played-Single Player|Total Time Played-Multi Player|Number of Games Played-Single Player|Number of Games Played-Multi Player|No|Level Name|Level Achieved|Level Achieved Date|


Scenario: verify that player csv data is showing correctly for detailed report

Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location department and group
|LocationName|Department Name|Password|Group|
|Udaipur|Design|pass|Group A|
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
|10|
And new player is able to login to app
And user wait for loading animation to be disappeared
And User play recently created game for statistics
|GamePlayCount|AnswerType|
|1|random|
And Manager is on Admin Home page
Then Dashboard screen is opening
And Manager clicks on Detailed Report tab
And Manager clicks on filter
|Filter Type|
|by|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|By|Player|
And Manager clicks on filter
|Filter Type|
|mode|
And Manager selects sub filter
|Filter Name|Sub Filter Name|
|Mode|all_games|
And Manager clicks on Add a filter button
And Manager clicks on submenu arrow button
|FilterType|
|Player|
And Manager enters recently played player name
And Manager selects searched item
And Manager clicks on time filter
And Manager selects time duration in time filter on detailed report page
|Duration Type|
|This Month|
Then options icon is appearing and working on detailed report
Then download button is appearing under option on detailed report
|Expected Text|
|Download|
Then send by email button is appearing under option on detailed report
|Expected Text|
|Send by Email|
And Manager clicks on send by email button
Then correct modal is opening
|Modal Name|
|Send by Email|
And user closes default email id chip
And user clicks on Add Email chip
And user enters email and hit enter
|Email|
|vishal.1huddle@gmail.com|
And user clicks on button on the modal
|Button Name|
|SEND EMAIL|
Then success message is appearing after sending detailed report
|Expected Text|
|It's on the way! The report will be e-mailed to the selected e-mail addresses.|
Then options icon is appearing and working on detailed report
And Manager clicks on download button
Then success message is appearing after downloading report
|Expected Text|
|Downloading reports...|
And correct data is showing in downloaded csv for player detail report
|No|Player|Player Email|Games[SP]|Time[SP]|Points[SP]|Last Played[SP]|Games[MP]|Time[MP]|Points[MP]|Wins[MP]|Last Played[MP]|Rating|Department|Location|Group|

Scenario: verify that players data is correct in downloaded players csv

Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location department and group
|LocationName|Department Name|Password|Group|
|Udaipur|Design|pass|Group A|
And Manager searches specific player
Then options burger button is appearing and working
Then Upload button is appearing under option on all players page
Then download button is appearing under option on all players page
And Manager clicks on download button
Then success message is appearing after downloading report
|Expected Text|
|Downloading file...|
And correct data is showing in downloaded players csv
|No|Player Name|Status|Company Name|Email|Location|Department|Group|Job Title|Country|State|City|Gender|Date Of Birth|College|College Graduation Year|College Major|Highest Degree|Employee_ID|Ethnicity|Created On|User Name|

Scenario: verify that managers data is correct in downloaded csv

Given Manager is on Admin Home page
    And Manager is logged In
       |UserName|Password|
       |manager_email|manager_pw|
    And Manager add a manager
       |UserType|Password|
       |Manager|pass|
And Manager searches specific manager
Then options burger button is appearing and working
And Manager clicks on download button
Then success message is appearing after downloading report
|Expected Text|
|Downloading file...|
And correct data is showing in downloaded manager csv
|No|Manager Name|Status|Company Name|Email|Type|Location|Department|Job Title|Country|State|City|Gender|Date Of Birth|College|College Graduation Year|College Major|Highest Degree|Employee ID|Ethnicity|Created On|User Name|

Scenario: verify that players data is correct in sample downloaded players csv

Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player to specific location department and group
|LocationName|Department Name|Password|Group|
|Udaipur|Design|pass|Group A|

Then options burger button is appearing and working
Then Upload button is appearing under option on all players page
And Manager clicks on upload button
And Manager clicks on download sample csv button
Then success message is appearing after downloading report
|Expected Text|
|Downloading file...|
Then correct data is showing in sample player csv
|Important!|Please read this section to avoid inconsistencies later!|Please don't make any change to any of the header titles like: First_name, Email, Etc.|All the columns are mandatory fields except Groups, do not leave any cell blank for mandatory fields.|Department and Location name should be exactly similar to that of what is linked and present in the Admin Panel.|Please only use valid email IDs.|For your convenience we have set players password to "gametime" already||First_Name|Last_Name|Department|Location|Email|Group|Test User|Test User|IT|Seattle|test_user@gmail.com||


Scenario: Verify that question data is correct in downloaded csv
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|           
When Manager enters random game name
And Manager Enters Category
|Category Number|CategoryName|
|1|CATEGORY A|
And Manager selects a particular category to add question in it
|Category Number|
|0|
And Manager enters question data
|QuestionTitle|Option1|Option2|Option3|Option4|Ans Option count for each question|Correct ans option count|CategoryName|Timer|Points|tag|
|This is test question|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|4|1|CATEGORY A|10|300|qaQuestion|
And Manager clicks on Done checkmark button
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And click on Done button on gamepreview page
And Schedule Game 
|Game Attempts|
|1|
And Manager mouse hover on game icon
And Manger clicks on Questions in side menu
And Manager mouse hover on 1h logo on admin
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Game|
And Manager enters recently created game name and select it
Then options burger button is appearing and working
And Manager clicks on download button
Then success message is appearing after downloading report
|Expected Text|
|Downloading file...|
Then correct data is showing in downloaded question csv
|Card|Question Category Name|Points|Timer|Question Type|Questions|Answer|Option 1|Option 2|Option 3|Option 4|Option 5|Option 6|Option 7|Option 8|Option 9|Option 10|Tag Keywords|


Scenario: Verify that question data is correct in downloaded csv while creating game
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|           
When Manager enters random game name
And Manager Enters Category
|Category Number|CategoryName|
|1|CATEGORY A|
And Manager selects a particular category to add question in it
|Category Number|
|0|
And Manager enters question data
|QuestionTitle|Option1|Option2|Option3|Option4|Ans Option count for each question|Correct ans option count|CategoryName|Timer|Points|tag|
|This is test question|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|4|1|CATEGORY A|10|300|qaQuestion|
And Manager clicks on Done checkmark button
Then options burger button is appearing and working
And Manager clicks on download button
Then success message is appearing after downloading report
|Expected Text|
|Downloading file...|
Then correct data is showing in downloaded question csv
|Card|Question Category Name|Points|Timer|Question Type|Questions|Answer|Option 1|Option 2|Option 3|Option 4|Option 5|Option 6|Option 7|Option 8|Option 9|Option 10|Tag Keywords|

Scenario: Verify that question data is correct in downloaded csv while creating game
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|           
When Manager enters random game name
Then options burger button is appearing and working
Then Upload button is appearing under option on all players page
And Manager clicks on upload button
And Manager clicks on download sample csv button
Then success message is appearing after downloading report
|Expected Text|
|Downloading file...|
Then correct data is showing in downloaded sample question csv
|Card|Question Category Name|Points|Timer|Question Type|Questions|Answer|Option 1|Option 2|Option 3|Option 4|Option 5|Option 6|Option 7|Option 8|Option 9|Option 10|Tagkeyword|
|111|Overview|100|60|1|SP-11|2,3,4|option 1|option 2|option 3|option 4|1|2|3|4|5|6|55|

Scenario: Verify that accuracy report data is showing correctly in downloaded csv
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager add a player
|DepartmentName|Password|
|ALL|pass|    
When Manager enters random game name
And Manager Enters Category
|Category Number|CategoryName|
|1|CATEGORY A|
And Manager selects a particular category to add question in it
|Category Number|
|0|
And Manager enters question data
|QuestionTitle|Option1|Option2|Option3|Option4|Ans Option count for each question|Correct ans option count|CategoryName|Timer|Points|tag|
|This is test question|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|4|1|CATEGORY A|10|300|qaQuestion|
And Manager clicks on Done checkmark button
And Click on Preview button
And Add Game Preview Title and Scenario
|Game Preview Title|Game Scenario|
|This is game preview for automation testing|This is game scenario for automation testing|
And click on Done button on gamepreview page
And Schedule Game 
|Game Attempts|
|1|
And new player is able to login to app
And user wait for loading animation to be disappeared
And User play recently created game for statistics
|GamePlayCount|AnswerType|
|1|random|
And Manager is on Admin Home page
And Manager mouse hover on game icon
And Manager clicks on reports in side menu
And Manager clicks on side menu sub item
|Sub Item Name|
|Accuracy|
And Manager mouse hover on 1h logo on admin
And Manager clicks on Add a filter button
And Manager selects menu item filter
|Filter Type|
|Player|
And Manager enters recently played player name
And Manager selects searched item
Then options icon is appearing and working on detailed report
And Manager clicks on download button
Then correct data is showing in downloaded accuracy report csv
|No|Question Title|Game Name|Card Number|Question Count|Correct Answer Count|Incorrect Answer Count|Accuracy Percentage|

Scenario: Verify that 1st game general trophy report column names are correct in downloaded csv
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager mouse hover on game icon
And Manager clicks on reports in side menu
And Manager clicks on side menu sub item
|Sub Item Name|
|Trophy Report|
And Manager mouse hover on 1h logo on admin
And Manager clicks on general trophy type
|Trophy Type|
|1st Game|
And Manager clicks on filter
|Filter Type|
|Trophy|
And Manager selects item from the list
|Item Name|
|Achieved|
And Manager clicks on download icon
Then success message is appearing after downloading report
|Expected Text|
|Downloading file...|
Then correct data is showing in downloaded fix trophy report


Scenario: Verify that 5M points general trophy report column names are correct in downloaded csv
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And Manager mouse hover on game icon
And Manager clicks on reports in side menu
And Manager clicks on side menu sub item
|Sub Item Name|
|Trophy Report|
And Manager mouse hover on 1h logo on admin
And Manager clicks on general trophy type
|Trophy Type|
|5M Points.|
And Manager clicks on filter
|Filter Type|
|Trophy|
And Manager selects item from the list
|Item Name|
|Achieved|
And Manager clicks on download icon
Then success message is appearing after downloading report
|Expected Text|
|Downloading file...|
Then correct data is showing in downloaded fix trophy report
