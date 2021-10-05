Feature: Create game from admin to use in webApp
Given Manager is logged In
|UserName|Password|
|vishal.1huddle+1@gmail.com|pass|
When Manager creates a game
|GameName|Category 1|Category 2|Category 3|Category 4|Category 5|Question 1|Question 2|Question 3|Question 4|Question 5|Question 6|Question 7|Question 8|Question 9|Questio 10|Option 1|Option 2|Option 3|Option 4|Category Count|Question in each cat|Ans Option for each question|Game Preview Title|Game Scenario|Game Attempts|
|GameTechnology|Category A|Category B|Category C|Category D|Category E|This is question 1|This is question 2|This is question 3|This is question 4|This is question 5|This is question 6|This is question 7|This is question 8|This is question 9|This is question 10|CorrectOption 1|WrongOption 2|WrongOption 3|WrongOption 4|2|2|4|This is game preview for automation testing|This is game scenario for automation testing|2|
Then correct game is in live state