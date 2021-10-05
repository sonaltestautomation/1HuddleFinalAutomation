Feature: Perform various operations on created game

Scenario: Verify that games are deleting
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|manager_email|manager_pw|
And manager clicks on game library
#And Manager selects gametype
#|Game Type|
#|MULTILEVEL|
And manager selects game state
|State Type|
|Ready|
And manager enters game name
|GameName|
|Random|
And manager delete game
|gameCountToDelete|
|300|
Then game is deleting
