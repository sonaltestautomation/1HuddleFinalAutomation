package com.testH.base.pages.client;

import java.io.IOException;
import java.util.HashMap;

public abstract class MorePage {
	
	public static HashMap<String, String> expectedData = new HashMap<String, String>();

	public abstract void clickMoreOption();
	public abstract void clickMoreOptionMobApp();
	
	public abstract void verifyMoreOptions(String editProfileText,String helpText,String languageText,String logOutText);
	public abstract void verifyMorePage();
	public abstract void verifyMorePageDesktopOnly();
	

	public abstract void clickLogout();
	public abstract void verifyLogOut();
	public abstract void clickChangeLanguage();
	public abstract void verifyChangeLanguagePage();
	public abstract void verifyLanguages();
	public abstract void verifySaveLanguage();
	public abstract void verifyAndClickCancel();
	public abstract void clickHelp();
	public abstract void verifyHelpPage();
	public abstract void editFirstName(String fName);
	public abstract void editLastName(String lName);
	public abstract void verifyCompanyName(String cName);
	public abstract void verifyTopics();
	public abstract void selectTopic(String topicName);
	public abstract void enterCommnet(String Comments);
	public abstract void verifySubmitBtnHelp();
	public abstract void clickSubmitButton();
	public abstract void verifyCancelBtn();
	public abstract void verifySaveBtn();
	public abstract void verifyFirstNameField();
	public abstract void verifyLastNameField();
	public abstract void verifyCompanyNameField();
	public abstract void verifySelectATopicField();
	public abstract void verifyCommentsField();
	public abstract void verifyAttachScreenShotField();
	public abstract void verifyNoFileChosenText();
	public abstract void verifyCompanyNameDisabled();
	public abstract void verifyDisaledSubmitBtn();
	public abstract void verifySuccessMessageHelp(String message);
	public abstract void AttachScreenShot() throws IOException;
	

	

    public abstract void verifyHelpInAdmin();
	public abstract void clickEditProfile();
	public abstract void verifyEditProfilePage();
	public abstract void verifyAndEditFirstName();
	public abstract void verifyAndEditLastName();
	public abstract void verifyAndEnterTitle();
	public abstract void verifyAndSelectCountry(String country);
	public abstract void verifyAndSelectState(String state);
	public abstract void verifyAndEnterCity();
	public abstract void verifyAndEnterCollege();
	public abstract void verifyAndSelectYear(String year);
	public abstract void verifyAndEnterCollegeMajor();
	public abstract void verifyQualificationListItems();
	public abstract void selectQualification();
	public abstract void addStatus();
	public abstract void verifyDefaultStatus();
	public abstract void verifyChangePwBtn();
	public abstract void clickChangePw();
	public abstract void verifyChangePwScreen();
	public abstract void enterCurrentPw();
	public abstract void enterNewPw(String newPw);
	public abstract void enterConfirmPw(String confirmPw);
	public abstract void clickSaveChangePw();
	public abstract void verifySuccessPasswordChange();
	public abstract void clickCancelEditPlayer();

	
	public abstract void clickSave();
	public abstract void clickCancel();
	public abstract void verifyEmpIdDisable();
	public abstract void verifyProfileDataWeb();
	public abstract void verifyProfileDataAdmin();
	public abstract void selectLanguage(String expectedLanguage);
	public abstract void selectLanguageMobileApp(String expectedLanguage);
	public abstract void verifyConvertedText(String expectedText,String mobAppStatus);
	public abstract void veriyMoreTextSideMenu(String expectedText);
	public abstract void verifyMoreTextMorePage(String expectedText);
	public abstract void verifyLeaderboardTextSideMenu(String expectedText);
	public abstract void verifyProfileTextSideMenu(String expectedText);
	public abstract void verifyGamesTextSideMenu(String expectedText);
	public abstract void verifyValidationIfTopicNotSelected(String expectedText);
	public abstract void verifyValidationIfCommentNotEntered(String expectedText);
	public abstract void verifySoundTextConverted(String expectedText);
	public abstract void verifyEnterEmailText(String expectedText);
	


}
