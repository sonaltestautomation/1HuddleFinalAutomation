Feature: Create Manager and perform operations on added Manager

Scenario: Verify that all managers page is opening
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|vishal.1huddle+1@gmail.com|pass|
When Manager clicks on users
And Manager clicks on Managers
Then Managers page is opening

Scenario: Verify that Add Manager page is opening after clicking on add manager button
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|vishal.1huddle+1@gmail.com|pass|
When Manager clicks on users
And Manager clicks on Managers
And Manager clicks on add new manager button
Then Add manager page is opening

Scenario: Verify that manager is adding and newly added manager is showing on list
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|vishal.1huddle+1@gmail.com|pass|
When Manager clicks on users
And Manager clicks on Managers
And Manager clicks on add new manager button
And Manager selects user type
|UserType|
|Manager|
And Manager enters basic manager info
|Password|
|pass|
And Manager clicks on ADD button
Then new manager is adding 