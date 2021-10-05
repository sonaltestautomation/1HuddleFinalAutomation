package com.testH.base.desktopView;
import java.util.HashMap;

import org.openqa.selenium.By;

import com.testH.app.generic.BaseTest;
import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.client.HomePage;


public class HomePageDesktopView extends HomePage {
	
	
	
	BaseTest objBaseTest=new BaseTest();
	//locators
	
	//public static HashMap<String, String> expectedDataUserPlayerApp = new HashMap<String, String>();

	By loc_textBoxEnterEmail=By.xpath("//input[@name='username']");
	By loc_btnNext=By.xpath("//*[contains(text(),'NEXT')]");
	By loc_btnNextDisabled=By.xpath("//*[contains(text(),'NEXT')]/parent::button");
	By loc_textBoxEnterPassword=By.xpath("//input[@name='password']");
	By loc_btnLogin=By.xpath("//*[contains(text(),'LOGIN')]");
	By loc_GamesTextLoggedInScreen=By.xpath("//span[text()='Games']");
	By loc_playerToggleText=By.xpath("//div[contains(text(),'PLAYER')]");
	By loc_managerToggleText=By.xpath("//div[contains(text(),'MANAGER')]");
	By loc_textBoxValidationText=By.xpath("//*[contains(@class,'transitionMessages')]");
	By loc_deactiveValidationText=By.xpath("//div[contains(text(),'Your account has been deactivated')]");
	By loc_leaderBoardTextTitle=By.xpath("//mat-card-title[contains(text(),'LEADERBOARD')]");
	
	By loc_fogotPwLink=By.xpath("//span[contains(text(),'Forgot Your Password?')]");
	By loc_autoFilledEmail=By.xpath("//input[contains(@name,'username')]");
	By loc_textSubTitle=By.xpath("//span[contains(text(),'Please confirm your Email Address to proceed.')]");
	By loc_textConfirmEmail=By.xpath("//span[contains(text(),'Confirm Email')]");
	By loc_okBtn=By.xpath("//span[contains(text(),'OK')]");
	By loc_messageSuccess=By.xpath("//*[contains(@class,'mat-snack')]");
	
	By loc_confirmPassword=By.xpath("//input[@name='confitm-password']");
	By loc_validationPassNotMatch=By.xpath("//mat-hint[contains(text(),'The new password and confirm password do not match ')]");

	By loc_gameListDisplay=By.xpath("//div[contains(@class,'gameName')]//child::div");
	
	By loc_contest_banner=By.xpath("//span[contains(text(),'')]//ancestor::div[@class='contest-wrapper']/child::div[@class='contest-banner']/child::img");


	
	@Override
	public void verifyTitle() {
		
		Pojo.getObjSeleniumFunctions().getTitle().equals("1Huddle");
	}

	@Override
	public void setEmail(String email) {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxEnterEmail, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that button is clicking", Pojo.getObjSeleniumFunctions().click(loc_textBoxEnterEmail));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that text is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxEnterEmail, email));
		playerEmail=email;
		expectedDataUserPlayerApp.put("PlayerEmail", email);
		
	}

	@Override
	public void setPassword(String pw) {
		Pojo.getObjSeleniumFunctions().waitForElementPresence(loc_textBoxEnterPassword);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxEnterPassword, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Veify that password is setting", Pojo.getObjSeleniumFunctions().setText(loc_textBoxEnterPassword, pw));
		
	}

	@Override
	public void clickNext() {
	
	Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnNext);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnNext));
	}

	@Override
	public void clickLogin() {
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnLogin);
		
	    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that click login is working",Pojo.getObjSeleniumFunctions().click(loc_btnLogin));		
       // Pojo.getObjSeleniumFunctions().waitFor(5);
	    Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();
	    Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameListDisplay, 15);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_contest_banner, 30);

	}

	@Override
	public void verifyLoggedInScreen() {
		
		Pojo.getObjSeleniumFunctions().waitForElementPresence(loc_GamesTextLoggedInScreen);
		System.out.println("Game Title "+Pojo.getObjSeleniumFunctions().getText(loc_GamesTextLoggedInScreen));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that user is on logged In screen", Pojo.getObjSeleniumFunctions().getText(loc_GamesTextLoggedInScreen).trim().equals("Games"));
		
	}

	@Override
	public void verifyPlayerToggleText() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerToggleText, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that toggle text is correct",Pojo.getObjSeleniumFunctions().getText(loc_playerToggleText).trim().equals("PLAYER"));
	}

	@Override
	public void verifyManagerToggleText() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerToggleText,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that toggle button text is correct",Pojo.getObjSeleniumFunctions().getText(loc_playerToggleText).trim().equals("PLAYER"));

	}

	@Override
	public void verifyValidation(String expectedValidationMessage) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxValidationText, 3);
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_textBoxValidationText).trim();
		System.out.println("Actual Validation Message "+actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that validation message is correct", actualText.equals(expectedValidationMessage.trim()));
	}

	@Override
	public void selectUserType(String userType) {
		By loc_userType=By.xpath("//div[contains(text(),'"+userType+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_userType, 20);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct user type is selecting", Pojo.getObjSeleniumFunctions().click(loc_userType));
	}

	@Override
	public void verifyValidationDeactiveUser(String expectedValidationMessage) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_deactiveValidationText, 5);
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_deactiveValidationText).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that validation message is correct", actualText.equals(expectedValidationMessage.trim()));
		
	}

	@Override
	public void verifyLoggedInManagersRole() {
		Pojo.getObjSeleniumFunctions().waitForElementPresence(loc_leaderBoardTextTitle);
		System.out.println("Leaderboard Title "+Pojo.getObjSeleniumFunctions().getText(loc_leaderBoardTextTitle));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that user is on logged In screen", Pojo.getObjSeleniumFunctions().getText(loc_leaderBoardTextTitle).trim().equals("LEADERBOARD"));
		
	}

	@Override
	public void verifyLoginWithNewlyAddedPlayer() {
		//objBaseTest.loadWebAppUrl();
    	setEmail(AllUsersPage.expectedDataUser.get("UserEmail"));
    	clickNext();
    	setPassword(AllUsersPage.expectedDataUser.get("UserPassword"));
    	clickLogin();
    	verifyLoggedInScreen(); 
	}
	
	@Override
	public void verifyLoginWithNewlyAddedPlayer(int playerNumber) {
		
		System.out.println(playerNumber+" Player Email "+AllUsersPage.expectedDataUSerEmailAndPassword.get("UserEmail"+playerNumber).get(0).toString());
		System.out.println(playerNumber+" Player Password "+AllUsersPage.expectedDataUSerEmailAndPassword.get("UserEmail"+playerNumber).get(1).toString());

		setEmail(AllUsersPage.expectedDataUSerEmailAndPassword.get("UserEmail"+playerNumber).get(0).toString());
    	clickNext();
    	setPassword(AllUsersPage.expectedDataUSerEmailAndPassword.get("UserEmail"+playerNumber).get(1).toString());
    	clickLogin();
    	verifyLoggedInScreen(); 
	}

	@Override
	public void verifyAndClickForgotPw() {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that forgot your password link is appearing",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_fogotPwLink));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that forgot your password link is clicking", Pojo.getObjSeleniumFunctions().click(loc_fogotPwLink));
	}

	@Override
	public void verifyConfirmEmailPage() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that confirm email page is opening", Pojo.getObjSeleniumFunctions().getText(loc_textConfirmEmail).trim().equals("Confirm Email"));
	}

	@Override
	public void verifyTextOnForgotPassword() {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that subtitle is correct", Pojo.getObjSeleniumFunctions().getText(loc_textSubTitle).trim().equals("Please confirm your Email Address to proceed."));

	}

	@Override
	public void verifyAutofilledEmail() {
		
		String expectedEmail=playerEmail;
		String actualEmail=Pojo.getObjSeleniumFunctions().getAttribute(loc_autoFilledEmail, "value");
		System.out.println("ExpectedEmail "+expectedEmail);
		System.out.println("ActualEmail "+actualEmail);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that autofilled email is correct",actualEmail.equals(expectedEmail));
	}
	
	@Override
	public void clickOk() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that OK button is clicking", Pojo.getObjSeleniumFunctions().click(loc_okBtn));
		
	}

	@Override
   public void verifySuccessMessage(String expectedMessage) {
   Pojo.getObjSeleniumFunctions().waitFor(2);
   Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_messageSuccess, 5);
   String actualText=Pojo.getObjSeleniumFunctions().getText(loc_messageSuccess).trim();
   System.out.println("Actual Message "+actualText);
   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is correct",expectedMessage.trim().equals(actualText));
	}

	@Override
	public void enterNewPassword(String password) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxEnterPassword, 15);

	//	Pojo.getObjSeleniumFunctions().waitForElementPresence(loc_textBoxEnterPassword);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Veify that password is setting", Pojo.getObjSeleniumFunctions().setText(loc_textBoxEnterPassword, password));
		AllUsersPage.expectedDataUser.put("NewPassword",password);
	}

	@Override
	public void enterConfirmPassword(String confirmPassword) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Veify that confirm password is setting", Pojo.getObjSeleniumFunctions().setText(loc_confirmPassword, confirmPassword));
		AllUsersPage.expectedDataUser.put("ConfirmPassword",confirmPassword);

	}

	@Override
	public void verifyNextButtonDisabled() {

		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnNextDisabled, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is disabled", Pojo.getObjSeleniumFunctions().getAttribute(loc_btnNextDisabled, "disabled").equals("true"));
	//	System.out.println("Button Status" +Pojo.getObjSeleniumFunctions().getAttribute(loc_btnNextDisabled, "disabled"));;
	}

	@Override
	public void verifyValidationConfirmPasswordMismatch() {
		
		String expectedText="The new password and confirm password do not match";
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_validationPassNotMatch, 10);
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_validationPassNotMatch).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that validation message is correct", expectedText.equals(actualText));
		
	}

	@Override
	public void verifySuccessMessageAfterReset() {
		String expectedText="Your password has been updated.";
		  // Pojo.getObjSeleniumFunctions().waitFor(3);
		   Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_messageSuccess, 5);
		   String actualText=Pojo.getObjSeleniumFunctions().getText(loc_messageSuccess).trim();
		   System.out.println("Actual Message "+actualText);
		   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is correct",expectedText.equals(actualText));
		
	}

	@Override
	public void verifyLoginWithUpdatedPassword() {
		
		setEmail(expectedDataUserPlayerApp.get("PlayerEmail"));
    	clickNext();
    	setPassword(AllUsersPage.expectedDataUser.get("ConfirmPassword"));
    	clickLogin();
    	verifyLoggedInScreen(); 
		
	}

	@Override
	public void clickPrefrences() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyPrefrenceScreen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyWebAppUrl() {
		String url=Pojo.getObjSeleniumFunctions().getCurrentURL();
		System.out.println("Url "+Pojo.getObjSeleniumFunctions().getCurrentURL());
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that user can enter url", Pojo.getObjConfig().get("AUT_URL").equals(url));		
	}

	@Override
	public void verify1HuddleHomePage() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that page title is correct", Pojo.getObjSeleniumFunctions().getTitle().equals("1Huddle"));

	}

	@Override
	public void verifyValidationMobileApp(String expectedValidationMessage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickAndOkButtonValidationPopUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeBrowserWindowIfMobAppNotOpened() {
		Pojo.getDriver().close();
	}

	@Override
	public void closeBroserWindowIfMobileAppOpened() {
		//Implemented for mobile app
		
	}

	@Override
	public void verifyHowToPlayText() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyAndClickSkipButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyAutoSelectedCentreGameIcon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickNextForgotPwScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnNext);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnNext));
		
	}

	@Override
	public void verifyLoggedInScreenTutorialSkipped() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeActionOnAppUpdatePopup(String action) {
		// TODO Auto-generated method stub
		
	}

	
}
