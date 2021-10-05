Feature: Create company feature

Scenario: Verify that dashboard page is opening when admin logged in
Given Manager is on Admin Home page
When Manager is logged In
|UserName|Password|
|sha@codewalla.com|pass123|
Then Dashboard page is opening

Scenario: Verify that all companies page is opening after clicking on Companies in side menu
Given Manager is on Admin Home page
When Manager is logged In
|UserName|Password|
|sha@codewalla.com|pass123|
And Manager clicks on Settings
And Manager clicks on Companies 
Then All Companies page is opening

Scenario: Verify that add new company page is opening after clicking on add new company button
Given Manager is on Admin Home page
When Manager is logged In
|UserName|Password|
|sha@codewalla.com|pass123|
And Manager clicks on Settings
And Manager clicks on Companies
And Manager clicks on add company button
Then add new company page is opening

Scenario: Verify that save button is showing as disabled if mandetory fields are missing
Given Manager is on Admin Home page
When Manager is logged In
|UserName|Password|
|sha@codewalla.com|pass123|
And Manager clicks on Settings
And Manager clicks on Companies
And Manager clicks on add company button
Then Save button is disabled

Scenario: Verify that company id is autofilling with company name and company id is editable
Given Manager is on Admin Home page
When Manager is logged In
|UserName|Password|
|sha@codewalla.com|pass123|
And Manager clicks on Settings
And Manager clicks on Companies
And Manager clicks on add company button
And Manager enters company name
|CompanyName|
||
Then company id is same as company name
And company id field is editable

Scenario: Verify that company is adding after entering only mandetory fields
Given Manager is on Admin Home page
When Manager is logged In
|UserName|Password|
|sha@codewalla.com|pass123|
And Manager clicks on Settings
And Manager clicks on Companies
And Manager clicks on add company button
And Manager enters company name
|CompanyName|
|AutomationUI2|
And Manager enters company id
|CompanyId|
|Automation2|
And Manager selects country
|CountryName|
|United States|
And Manager selects state
|State Name|
|Alaska|
And Manager selects timezone
|Timezone|
|America/New_York|
Then company is adding

Scenario: Verify that company is adding after entering all fields
Given Manager is on Admin Home page
When Manager is logged In
|UserName|Password|
|sha@codewalla.com|pass123|
And Manager clicks on Settings
And Manager clicks on Companies
And Manager clicks on add company button
And Manager enters company name
|CompanyName|
|AutomationUI2|
And Manager enters company id
|CompanyId|
|Automation2|
And Manager enters industry
|Industry|
|Software|
And Manager selects country
|CountryName|
|United States|
And Manager selects state
|State Name|
|Alaska|
And Manager enters city
|City|
|Newyork|
And Manager selects timezone
|Timezone|
|America/New_York|
Then company is adding