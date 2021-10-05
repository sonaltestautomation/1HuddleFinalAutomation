Feature: Create mid manager and perform operations on added middle manager

Scenario: Verify that middle manager is adding and newly added middle manager is showing on list
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|vishal.1huddle+1@gmail.com|pass|
When Manager clicks on users
And Manager clicks on Managers
And Manager clicks on add new manager button
And Manager selects user type
|UserType|
|Mid-Manager|
And Manager enters basic middle manager info
|DepartmentName|Password|
|ALL|pass|
And Manager clicks on ADD button
Then new middle manager is adding