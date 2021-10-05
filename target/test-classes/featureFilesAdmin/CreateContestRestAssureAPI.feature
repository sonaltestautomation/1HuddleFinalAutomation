Feature: Create contest using rest assured

Scenario: Create contest using rest assured API
Given I am an authorized user
|username|pw|
|manager@automation.com|pass|
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
Then Contest publish successfully