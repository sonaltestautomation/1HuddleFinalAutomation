Feature: VIP code feature

Scenario: Verify that VIP Code button is appearing on home screen
Given user is on home page
Then VIP Code button is appearing

Scenario: Verify that VIP code screen is opening after clicking on VIP code
Given user is on home page
And user clicks on Vip Code button
Then Enter Vip code screen is opening


Scenario: Verify that need help button is appering on Enter VIP code screen
Given user is on home page
And user clicks on Vip Code button
Then help button is appearing

Scenario: Verify that correct validation message is appearing if user enters wrong VIP code and Ok button is working
Given user is on home page
And user clicks on Vip Code button
And user enters VIP code
|InvalidVIPCode|
|TYHH1@|
And user tap on next button
Then correct validation should get appeared for vip code
|Expected Error Message|
|We could not recognize the VIP Code you entered.|
And user clicks on Ok button on validation popup
Then Enter Vip code screen is opening

Scenario: Verify that correct validation message is appearing if user enters expired VIP code

Given Manager is on Admin Home page
And Manager is logged In
       |UserName|Password|
       |manager_email|manager_pw|
And Manager clicks on Settings
And Manager clicks on VIP codes under settings
And Manager clicks on Add new vip code button
And Manager enters random VIP code
And Manager selects a specific location
|Location Name|
|Udaipur|
And Manager selects a specific department
|Department Name|
|Design|
And Manager selects expiration date
|Date|
|10/3/2021|
And Manager clicks on Add button to create vip code
And Manager clicks on expire vip code button with recently created vip code
And Manager clicks on Yes button in confirmation popup
And Manager closes web app if mobile app is opened
And user is on home page
And user clicks on Vip Code button
And user enters recently created VIP code
And user tap on next button
Then correct validation should get appeared for vip code
|Expected Error Message|
|VIP Code Expired|

Scenario: Verify that Singup screen is opening if user enters valid VIP code
Given Manager is on Admin Home page
And Manager is logged In
       |UserName|Password|
       |manager_email|manager_pw|
And Manager clicks on Settings
And Manager clicks on VIP codes under settings
And Manager clicks on Add new vip code button
And Manager enters random VIP code
And Manager selects a specific location
|Location Name|
|Udaipur|
And Manager selects a specific department
|Department Name|
|Design|
And Manager selects expiration date
|Date|
|10/3/2021|
And Manager clicks on Add button to create vip code
And Manager closes web app if mobile app is opened
And user is on home page
And user clicks on Vip Code button
And user enters recently created VIP code
And user tap on next button
Then Signup screen is opening for vip code

Scenario: Verify that correct validation is appearing if user enters invalid first name, last name, email,password and confirm password
Given user is on home page
And user clicks on Vip Code button
And user enters VIP code
|ValidVIPCode|
|DoNotDelete|
And user tap on next button
Then Signup screen is opening for vip code
And user tap on submit button
Then toast error message is correct
|Expected Error Message|
|First name should be least 2 characters long.|
And user enters first name for vip code signup
|FirstName|
|AutomationFirst|
And user tap on submit button
Then toast error message is correct
|Expected Error Message|
|Last name should be least 2 characters long.|
And user enters last name for vip code code signup
|Last Name|
|AutomationLast|
And user tap on submit button
Then toast error message is correct
|Expected Error Message|
|Please enter your email address.|
And user enters email id for vip code signup
|Email|
|vishal.1huddle@gmail.com|
And user tap on submit button
Then toast error message is correct
|Expected Error Message|
|Password should be at least 4 characters long.|
And user enters password for vip code signup
|Password|
|pass|
And user tap on submit button
Then toast error message is correct
|Expected Error Message|
|Password should be at least 4 characters long.|
And user enters confirm password for vip code signup
|Password|
|pas|
And user tap on submit button
Then toast error message is correct
|Expected Error Message|
|Password should be at least 4 characters long.|

Scenario: Verify that correct validation is appearing if password and confirm password does not match
Given user is on home page
And user clicks on Vip Code button
And user enters VIP code
|ValidVIPCode|
|DoNotDelete|
And user tap on next button
Then Signup screen is opening for vip code
And user enters first name for vip code signup
|FirstName|
|AutomationFirst|
And user enters last name for vip code code signup
|Last Name|
|AutomationLast|
And user enters email id for vip code signup
|Email|
|vishal.1huddle@gmail.com|
And user enters password for vip code signup
|Password|
|pass|
And user hides keyboard
And user enters confirm password for vip code signup
|Password|
|pass1|
And user tap on submit button
Then toast error message is correct
|Expected Error Message|
|The new password and confirmation password do not match.|

Scenario: Verify that correct validation is appearing if user enters already created email id
Given user is on home page
And user clicks on Vip Code button
And user enters VIP code
|ValidVIPCode|
|DoNotDelete|
And user tap on next button
Then Signup screen is opening for vip code
And user enters first name for vip code signup
|FirstName|
|AutomationFirst|
And user enters last name for vip code code signup
|Last Name|
|AutomationLast|
And user enters email id for vip code signup
|Email|
|vishal.1huddle@gmail.com|
And user enters password for vip code signup
|Password|
|pass|
And user hides keyboard
And user enters confirm password for vip code signup
|Password|
|pass|
And user tap on submit button
Then correct validation should get appeared for vip code
|Expected Error Message|
|This email address is already registered. Please login or register a new email address.|
And user clicks on Ok button on validation popup
Then Signup screen is opening for vip code

Scenario: Verify that correct success is appearing if user enters all valid details and click on submit
Given user is on home page
And user clicks on Vip Code button
And user enters VIP code
|ValidVIPCode|
|DoNotDelete|
And user tap on next button
Then Signup screen is opening for vip code
And user enters first name for vip code signup
|FirstName|
|AutomationFirst|
And user enters last name for vip code code signup
|Last Name|
|AutomationLast|
And user enters random email id for vip code signup
And user enters password for vip code signup
|Password|
|pass|
And user hides keyboard
And user enters confirm password for vip code signup
|Password|
|pass|
And user tap on submit button
And user closes tutorial screen for mobile app
Then verify that verify email alert is appearing
|Expected Alert Title|
|Verify Email|
Then verify that alert sub title is correct
|Expected Alert Sub Title|
|Welcome to 1Huddle!|
Then verify that alert description is correct
|Expected Alert description|
|Check your email for a verification link. Please verify your email address within 24 hours to gain full access to 1Huddle.|
And user clicks on Ok button on alert popup
Then User is on select game screen
    |CompanyName|
    |AMAZONPRIME|
Then limited access is appearing on select game screen


Scenario: Verify that user is getting email after submitting all the details and limited access is removing after verifying email
Given user is on home page
And user clicks on Vip Code button
And user enters VIP code
|ValidVIPCode|
|DoNotDelete|
And user tap on next button
Then Signup screen is opening for vip code
And user enters first name for vip code signup
|FirstName|
|AutomationFirst|
And user enters last name for vip code code signup
|Last Name|
|AutomationLast|
And user enters unique email id for vip code signup
|Email|
|vishal.1huddle@gmail.com|
And user enters password for vip code signup
|Password|
|pass|
And user hides keyboard
And user enters confirm password for vip code signup
|Password|
|pass|
And user tap on submit button
And user closes tutorial screen for mobile app
And user is on Gmail home page
And user verify and open account activation link
|Email|Password|
|vishal.1huddle@gmail.com|Vk@131991|
And user clicks on active button
And user clicks on continue to login button
And user enters player email generated through vip code
And clicks on Next button on web app if mob app is opened
And user enters player password generated through vip code
When user click on login button on web app if mob app is opened
Then player should be logged In on web app successfully if mob app is opened
And User clicks on Leaderboards on web app if mob app is opened
Then Leaderboards page is opening on web app if mob app is opened
Then All and Department tabs are appearing on web app if mob app is opened
#
#
Scenario: Verify that Resend Link is working
Given user is on home page
And user clicks on Vip Code button
And user enters VIP code
|ValidVIPCode|
|DoNotDelete|
And user tap on next button
Then Signup screen is opening for vip code
And user enters first name for vip code signup
|FirstName|
|AutomationFirst|
And user enters last name for vip code code signup
|Last Name|
|AutomationLast|
And user enters random email id for vip code signup
And user enters password for vip code signup
|Password|
|pass|
And user hides keyboard
And user enters confirm password for vip code signup
|Password|
|pass|
And user tap on submit button
And user closes tutorial screen for mobile app
And user clicks on Ok button on alert popup
And User clicks on Leaderboards
Then info message is correct on leaderboard to verify email
|Expected Message|
|Please verify your email to view your ranking on the leaderboard.|
And user tap on resend link button
Then verify that success is appearing for verification link




