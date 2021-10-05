 Feature: Forgot Password Feature for Players

Scenario: Verify that Confirm email page is opening and Confirm Email and Please confirm your email address to proceed text is appearing and email address is autofilled on confirm email screen
Given user is on home page
And user selects user type
    |UserType|
    |PLAYER|
And user enters email
  	|ValidEmail|                         
  	|vishal.1huddle@gmail.com|
And clicks on Next button
When user clicks on Forgot Your Password link
Then Confirm email page is opening
Then Confirm email and Please confirm your email address to proceed text is appearing
And Email field is autofilled with user email

Scenario: Verify that success message is appearing after cliking on OK button
Given user is on home page
And user selects user type
    |UserType|
    |PLAYER|
And user enters email
  	|ValidEmail|                         
  	|vishal.1huddle@gmail.com|
And clicks on Next button
When user clicks on Forgot Your Password link
And user clicks on Ok button
Then success message is appearing
|ExpectedMessage|
|You'll get an email to reset your password shortly.|

Scenario: Verify that user is getting reset password email and  Next button is disabled if password is less than 3 char
Given user is on home page
And user selects user type
    |UserType|
    |PLAYER|
And user enters email
  	|ValidEmail|                         
  	|vishal.1huddle@gmail.com|
And clicks on Next button
When user clicks on Forgot Your Password link
And user clicks on Ok button
And success message is appearing
|ExpectedMessage|
|You'll get an email to reset your password shortly.|
And closes current window
And user is on Gmail home page
And user verify and open reset password link in email
|Email|Password|
|gmail_email|gmail_pw|
And user enters new password
|password|
|invalid_Pw|
And user enters confirm password
|confirmPassword|
|invalid_Pw|
Then Next button is disabled
And Manager closes web app if mobile app is opened

Scenario: Verify that validation messsage is appearing if new password and confirm password is not same
Given user is on home page
And user selects user type
    |UserType|
    |PLAYER|
And user enters email
  	|ValidEmail|                         
  	|vishal.1huddle@gmail.com|
And clicks on Next button
When user clicks on Forgot Your Password link
And user clicks on Ok button
And success message is appearing
|ExpectedMessage|
|You'll get an email to reset your password shortly.|
And closes current window
And user is on Gmail home page
And user verify and open reset password link in email
|Email|Password|
|gmail_email|gmail_pw|
And user enters new password
|new_Pw|
|new_Pw|
And user enters confirm password
|confirmPassword|
|invalid_Pw1|
And clicks on Next button on password reset screen
Then validation message is appearing for password mismatch
And Manager closes web app if mobile app is opened


Scenario: Verify that success message is appearing and user is able to login with new password after reset password
Given user is on home page
And user selects user type
    |UserType|
    |PLAYER|
And user enters email
  	|ValidEmail|                         
  	|vishal.1huddle@gmail.com|
And clicks on Next button
When user clicks on Forgot Your Password link
And user clicks on Ok button
And success message is appearing
|ExpectedMessage|
|You'll get an email to reset your password shortly.|
And closes current window
And user is on Gmail home page
And user verify and open reset password link in email
|Email|Password|
|gmail_email|gmail_pw|
And user enters new password
|password|
|new_Pw|
And user enters confirm password
|confirmPassword|
|confirm_Pw|
And clicks on Next button on password reset screen
Then Verify that success message
And Verify user is able to login with new password
And Manager closes web app if mobile app is opened