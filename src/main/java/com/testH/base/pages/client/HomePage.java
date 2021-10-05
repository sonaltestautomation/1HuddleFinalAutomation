package com.testH.base.pages.client;

import java.util.HashMap;

public abstract class HomePage 
{
	     // locators
		 
		
		// Abstract methods
	
	    public static HashMap<String, String> expectedDataUserPlayerApp = new HashMap<String, String>();
		public abstract void verifyTitle();
		public abstract void setEmail(String email);
		public abstract void setPassword(String pw);
		public abstract void clickNext();
		public abstract void clickLogin();
		public abstract void verifyLoggedInScreen();
		public abstract void verifyLoggedInScreenTutorialSkipped();
		public abstract void verifyPlayerToggleText();
		public abstract void verifyManagerToggleText();
		public abstract void verifyValidation(String expectedValidationMessage);
		public abstract void verifyValidationMobileApp(String expectedValidationMessage);
		public abstract void clickAndOkButtonValidationPopUp();


		public abstract void verifyValidationDeactiveUser(String expectedValidationMessage);
		public abstract void verifyLoggedInManagersRole();
		public abstract void verifyLoginWithNewlyAddedPlayer();
		public abstract void verifyLoginWithNewlyAddedPlayer(int playerNumber);

		
		public abstract void selectUserType(String userType); //Select user type. PLAYER or MANAGER
		public String playerEmail="";
		
		public abstract void verifyAndClickForgotPw();
		public abstract void verifyConfirmEmailPage();
		public abstract void verifyTextOnForgotPassword();
		public abstract void verifyAutofilledEmail();
		public abstract void clickOk();
		public abstract void verifySuccessMessage(String expectedMessage);

		public abstract void enterNewPassword(String password);
		public abstract void enterConfirmPassword(String confirmPassword);
		public abstract void verifyNextButtonDisabled();
		public abstract void verifyValidationConfirmPasswordMismatch();
		public abstract void verifySuccessMessageAfterReset();
		public abstract void verifyLoginWithUpdatedPassword();
		
		public abstract void clickPrefrences();
		public abstract void verifyPrefrenceScreen();
		public abstract void verifyWebAppUrl();
		public abstract void verify1HuddleHomePage();
		
		public abstract void closeBrowserWindowIfMobAppNotOpened();
		public abstract void closeBroserWindowIfMobileAppOpened();
		
		public abstract void verifyHowToPlayText();
		public abstract void verifyAndClickSkipButton();
		public abstract void verifyAutoSelectedCentreGameIcon();
		
		public abstract void clickNextForgotPwScreen();
		public abstract void takeActionOnAppUpdatePopup(String action);
		
  
}
