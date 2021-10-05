package com.testH.base.pages.androidApp;


import java.util.HashMap;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.desktopView.HomePageDesktopView;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.client.HomePage;

import io.appium.java_client.MobileBy;

public class HomePageAndroidApp extends HomePage {
	
	//public static HashMap<String, String> expectedDataUserPlayerApp = new HashMap<String, String>();

	
	By loc_btnPrefrences=MobileBy.xpath("//android.widget.TextView[@text='Preference']");
	By loc_textPrefrencePage=MobileBy.xpath("//android.widget.TextView[@text='1. Preferences from XML']");
	
	By loc_textVipCode=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/login_frag_sign_up_tv\")");
	By loc_textBoxEnterEmail=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/login_frag_emailId_et\")");
    By loc_btnNext=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/login_frag_login_btn\")");
	By loc_btnNextWebApp=By.xpath("//*[contains(text(),'NEXT')]");
    By loc_btnNextDisabledWebApp=By.xpath("//*[contains(text(),'NEXT')]/parent::button");
    By loc_textValidationMessage=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/message\")");
    By loc_btnOk=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/button1\")");
    By loc_textBoxPw=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/login_frag_pwd_et\")");
    By loc_textHowToPlay=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_btnSkip=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/done_tv\")");
    By loc_textGames=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/fragment_contest_game_tv\")");
	By loc_GamesCenterButton=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_leaderboard_game_play_inner_iv\")");
	By loc_btnForgotPassword=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/login_frag_forgot_pwd_tv\")");
	By loc_textBoxAutofilledConfirmEmail=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/forgot_pwd_dialog_email_et\")");
	By loc_btnOkConfirmEmail=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/forgot_pwd_dialog_ok_tv\")");
	By loc_btnCancelConfirmEmail=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/forgot_pwd_dialog_cancel_tv\")");
	By loc_titleConfirmEmail=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/forgot_pwd_dialog_confirm_title_tv\")");
	By loc_subTitleConfirmEmail=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/forgot_pwd_dialog_confirm_email_tv\")");
	
	By loc_textBoxEnterPasswordWebApp=By.xpath("//input[@name='password']");
	By loc_confirmPasswordWebApp=By.xpath("//input[@name='confitm-password']");
//	By loc_btnNextFpAndroidApp=By.xpath("//*[contains(text(),'NEXT')]");
	By loc_validationPassNotMatchWebApp=By.xpath("//mat-hint[contains(text(),'The new password and confirm password do not match ')]");
	By loc_messageSuccessWebApp=By.xpath("//*[contains(@class,'mat-snack')]");

	By loc_popupUpdateAvailable=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/label_title\")");
	By loc_btnLaterAppUpdatePopUp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/update_later\")");
	By loc_btnUpdateNowPopUp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/update_now\")");
	
	
	@Override
	public void verifyTitle() {
		// TODO Auto-generated method stub

	}

	

	@Override
	public void clickNext() {
    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next icon is clicking", Pojo.getObjSeleniumFunctions().tap(loc_btnNext));
	}

	@Override
	public void clickLogin() {
	    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next login icon is clicking", Pojo.getObjSeleniumFunctions().tap(loc_btnNext));
		
	}

	@Override
	public void setEmail(String email) {
	
	 Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxEnterEmail, 10);
     Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that email is setting",Pojo.getObjSeleniumFunctions().setText(loc_textBoxEnterEmail,email));
	 playerEmail=email;
	 System.out.println("Player Email "+email);
	 expectedDataUserPlayerApp.put("PlayerEmail", email);
}

	@Override
	public void setPassword(String pw) {
	     Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that pw is setting",Pojo.getObjSeleniumFunctions().setText(loc_textBoxPw,pw));
		
	}

    @Override
	public void verifyLoggedInScreen() {
    	
    	verifyHowToPlayText();
    	verifyAndClickSkipButton();
    	
    	//commenting below if-else condition because app update popup is not appearing and it's taking time to wait for element to display. When app update popup appears then uncomment it. 
//    	if(Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_popupUpdateAvailable)==true)
//    	{
//			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that later button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnLaterAppUpdatePopUp));
//
//    		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Games screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_textGames).trim().equals("GAMES"));
//    	}
//    	else
//    	{
//    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Games screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_textGames).trim().equals("GAMES"));
//	}
    	}



	@Override
	public void verifyPlayerToggleText() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifyManagerToggleText() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifyValidation(String expectedValidationMessage) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void selectUserType(String userType) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifyValidationDeactiveUser(String expectedValidationMessage) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifyLoggedInManagersRole() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifyLoginWithNewlyAddedPlayer() {
		
		setEmail(AllUsersPage.expectedDataUser.get("UserEmail"));
    	clickNext();
    	setPassword(AllUsersPage.expectedDataUser.get("UserPassword"));
    	clickLogin();
    	verifyLoggedInScreen(); 		
	}



	@Override
	public void verifyAndClickForgotPw() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that forgot your password link is appearing",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnForgotPassword));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that forgot your password link is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnForgotPassword));		
	}



	@Override
	public void verifyConfirmEmailPage() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that confirm email page is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleConfirmEmail).trim().equals("Confirm Email"));
		
	}



	@Override
	public void verifyTextOnForgotPassword() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that subtitle is correct", Pojo.getObjSeleniumFunctions().getText(loc_subTitleConfirmEmail).trim().equals("Please confirm your email address to proceed."));
		
	}



	@Override
	public void verifyAutofilledEmail() {
		String expectedEmail=playerEmail;
		String actualEmail=Pojo.getObjSeleniumFunctions().getText(loc_textBoxAutofilledConfirmEmail);
		System.out.println("ExpectedEmail "+expectedEmail);
		System.out.println("ActualEmail "+actualEmail);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that autofilled email is correct",actualEmail.equals(expectedEmail));		
	}



	@Override
	public void verifySuccessMessage(String expectedMessage) {
		   Pojo.getObjSeleniumFunctions().waitFor(2);
		   String actualText=Pojo.getObjSeleniumFunctions().getText(loc_textValidationMessage).trim();
		   System.out.println("Actual Message "+actualText);
		   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is correct",expectedMessage.trim().equals(actualText));		
	}



	@Override
	public void clickOk() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that OK button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnOkConfirmEmail));
		
	}



	@Override
	public void enterNewPassword(String password) {
		//Pojo.getObjSeleniumFunctions().waitForElementPresence(loc_textBoxEnterPasswordWebApp);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxEnterPasswordWebApp, 20);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Veify that password is setting", Pojo.getObjSeleniumFunctions().setText(loc_textBoxEnterPasswordWebApp, password));
		AllUsersPage.expectedDataUser.put("NewPassword",password);
	}		
	



	@Override
	public void enterConfirmPassword(String confirmPassword) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_confirmPasswordWebApp, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Veify that confirm password is setting", Pojo.getObjSeleniumFunctions().setText(loc_confirmPasswordWebApp, confirmPassword));
		AllUsersPage.expectedDataUser.put("ConfirmPassword",confirmPassword);		
	}



	@Override
	public void verifyNextButtonDisabled() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnNextDisabledWebApp,15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is disabled", Pojo.getObjSeleniumFunctions().getAttribute(loc_btnNextDisabledWebApp, "disabled").equals("true"));

		
	}



	@Override
	public void verifyValidationConfirmPasswordMismatch() {
		String expectedText="The new password and confirm password do not match";
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_validationPassNotMatchWebApp, 10);
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_validationPassNotMatchWebApp).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that validation message is correct", expectedText.equals(actualText));		
	}



	@Override
	public void verifySuccessMessageAfterReset() {
		String expectedText="Your password has been updated.";
		   Pojo.getObjSeleniumFunctions().waitFor(2);
		   String actualText=Pojo.getObjSeleniumFunctions().getText(loc_messageSuccessWebApp).trim();
		   System.out.println("Actual Message "+actualText);
		   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is correct",expectedText.equals(actualText));
		
	}



	@Override
	public void verifyLoginWithUpdatedPassword() {
		
		HomePageDesktopView objHomePageDesktopView=new HomePageDesktopView();
		objHomePageDesktopView.setEmail(expectedDataUserPlayerApp.get("PlayerEmail"));
		objHomePageDesktopView.clickNext();
		objHomePageDesktopView.setPassword(AllUsersPage.expectedDataUser.get("ConfirmPassword"));
		objHomePageDesktopView.clickLogin();
		objHomePageDesktopView.verifyLoggedInScreenTutorialSkipped();
		
	}



	@Override
	public void clickPrefrences() {
		
		
		//By loc_abc=By.xpath("//android.widget.TextView[@text='Preference']");
		Pojo.getObjSeleniumFunctions().waitFor(10);
		//Pojo.getAndroidDriver().findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify prefrences selecting", Pojo.getObjSeleniumFunctions().tap(loc_btnPrefrences));
		//Pojo.getObjSeleniumFunctions().androidScroll("WebView");

		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify prefrences selecting", Pojo.getObjSeleniumFunctions().tap(loc_btnPrefrences));
	}



	@Override
	public void verifyPrefrenceScreen() {
	
	Pojo.getObjSeleniumFunctions().waitFor(3);
     String expectedText=Pojo.getObjSeleniumFunctions().getText(loc_textPrefrencePage);
     System.out.println("Expected Text "+expectedText);

	}



	@Override
	public void verifyWebAppUrl() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verify1HuddleHomePage() {
		String expectedText=Pojo.getObjSeleniumFunctions().getText(loc_textVipCode);
		System.out.println("Expected VIP Text "+expectedText);
	}



	@Override
	public void verifyValidationMobileApp(String expectedValidationMessage){
		String text=Pojo.getObjSeleniumFunctions().getText(loc_textValidationMessage).trim();
	    System.out.println("Validation Text "+text);
	    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that validation message is correct for android app",expectedValidationMessage.equals(text));
	}



	@Override
	public void clickAndOkButtonValidationPopUp() {
		
     Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Ok button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnOk));
     Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Ok button is clicking", Pojo.getObjSeleniumFunctions().tap(loc_btnOk));
	}



	@Override
	public void closeBrowserWindowIfMobAppNotOpened() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void closeBroserWindowIfMobileAppOpened() {
		Pojo.getDriver().quit();
	}



	@Override
	public void verifyHowToPlayText() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textHowToPlay, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that How to Play button is displaying", Pojo.getObjSeleniumFunctions().getText(loc_textHowToPlay).trim().equals("How to Play"));
	}



	@Override
	public void verifyAndClickSkipButton() {
		//Pojo.getObjSeleniumFunctions().waitFor(10);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnSkip, 20);
		System.out.println("Actual Skip button text "+Pojo.getObjSeleniumFunctions().getText(loc_btnSkip));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Skip button is displaying", Pojo.getObjSeleniumFunctions().getText(loc_btnSkip).trim().toUpperCase().equals("SKIP"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that skip button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnSkip));
	}



	@Override
	public void verifyAutoSelectedCentreGameIcon() {
		//int count=Pojo.getAndroidDriver().findElementsByAndroidUIAutomator("new UiSelector().selected(true)").size(); 
		//System.out.println("Selected Icon count "+count);
		String value=Pojo.getObjSeleniumFunctions().getAttribute(loc_GamesCenterButton,"focusable");
		System.out.println("Attribute Value "+value);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game icon is in focus ", value.equals("true"));
		//boolean b=Pojo.getAndroidDriver().findElementByAndroidUIAutomator("Game new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/tab_root_view\")").isSelected();
		//System.out.println("Check Selected "+b);
	}



	@Override
	public void clickNextForgotPwScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnNextWebApp);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnNextWebApp));
	}



	@Override
	public void verifyLoggedInScreenTutorialSkipped() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Games screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_textGames).trim().equals("GAMES"));
		
	}



	@Override
	public void takeActionOnAppUpdatePopup(String action) {

		if(Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_popupUpdateAvailable)==true)
		{
			if(action.equalsIgnoreCase("yes"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that update button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnUpdateNowPopUp));
			}
			else
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that later button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnLaterAppUpdatePopUp));

			}
		}
	}



	@Override
	public void verifyLoginWithNewlyAddedPlayer(int playerNumber) {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
