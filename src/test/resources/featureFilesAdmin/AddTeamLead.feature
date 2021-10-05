Feature: Create teamlead and perform operations on added Manager

Scenario: Verify that teamlead is adding and newly added teamlead is showing on list
Given Manager is on Admin Home page
And Manager is logged In
|UserName|Password|
|vishal.1huddle+1@gmail.com|pass|
When Manager clicks on users
And Manager clicks on Managers
And Manager clicks on add new manager button
And Manager selects user type
|UserType|
|TeamLead|
And Manager enters basic teamlead info
|DepartmentName|Password|
|ALL|pass|
And Manager clicks on ADD button
Then new teamlead is adding