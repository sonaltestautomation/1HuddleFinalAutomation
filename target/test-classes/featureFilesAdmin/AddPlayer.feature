Feature: Create player and perform operations on added player

Scenario: Verify that all players page is opening
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|vishal.1huddle+1@gmail.com|pass|
When Manager clicks on users
And Manager clicks on players
Then Players page is opening

Scenario: Verify that Add Player page is opening after clicking on add player button
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|vishal.1huddle+1@gmail.com|pass|
When Manager clicks on users
And Manager clicks on players
And Manager clicks on add player button
Then Add player page is opening

Scenario: Verify that player is adding and newly added player is showing on list
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|vishal.1huddle+1@gmail.com|pass|
When Manager clicks on users
And Manager clicks on players
And Manager clicks on add player button
And Manager enters all basic details
|DepartmentName|Password|
|ALL|pass|
And Manager clicks on ADD button
Then new player is adding
