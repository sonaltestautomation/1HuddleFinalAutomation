Feature: Game Play Feature

@GamePlay
Scenario: Verify that total score is showing correctly on end game screen after playing game with all correct answers
Given user is on home page
And User is logged In
  	|UserName|Password|
  	|player_email|player_pw|
And player should be logged In successfully
When User selects already created game
|GameName|
|GameForLeaderboard|
And User can click on Play Game button
And User is selecting category
Then Verify total score after ending game
|AnswerType|
|all correct|

#@GamePlay
#Scenario: Verify that total score is showing correctly on end game screen after playing game with all wrong answers
#Given user is on home page
#And User is logged In
  #	|UserName|Password|
  #	|player_email|player_pw|
#And player should be logged In successfully
#When User selects already created game
#|GameName|
#|GameForLeaderboard|
#And User can click on Play Game button
#And User is selecting category
#Then Verify total score after ending game
#|AnswerType|
#|all wrong|

  	
  	
