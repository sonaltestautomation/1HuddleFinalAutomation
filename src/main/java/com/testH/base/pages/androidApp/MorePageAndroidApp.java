package com.testH.base.pages.androidApp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.client.MorePage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

public class MorePageAndroidApp extends MorePage {
	
	String language="";
	
	By loc_btnChangeLanguage=MobileBy.xpath("//android.widget.TextView[@text='Change Language']");
	By loc_clickSave=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/footer_layout_submit_tv\")");
	
	By loc_btnMore=MobileBy.xpath("//android.widget.HorizontalScrollView[@resource-id='com.ionicframework.SaleshuddleApp:id/leaderboard_activity_tab_layout']/android.widget.LinearLayout[@index='0']/*[@index='4']");
    By loc_btnLogout=MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.ionicframework.SaleshuddleApp:id/fragment_setting_recycle_view']//child::android.widget.LinearLayout[6]");
	By loc_titleChangeLanguage=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_listLanguages=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/language_view_english_title_tv\")");
	By loc_titleHelp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_drpDwnSelectTopic=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/help_screen_spinner\")");
	By loc_listHelpTopics=MobileBy.xpath("//android.widget.TextView[@text='Select Topic']//following-sibling::android.widget.TextView");
	By loc_btnSubmit=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/footer_layout_submit_tv\")");
	By loc_titleEditProfile=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_textBoxFirstName=MobileBy.xpath("//android.widget.TextView[@text='First Name']//following-sibling::android.widget.EditText");

	By loc_textBoxTitle=MobileBy.xpath("//android.widget.TextView[@text='Title']//following-sibling::android.widget.EditText");
	By loc_DrpDownCountry=MobileBy.xpath("//android.widget.TextView[@text='Country']//following-sibling::android.widget.Spinner");
	By loc_DrpDownState=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_edit_profile_state_view\")");
	By loc_textBoxCity=MobileBy.xpath("//android.widget.TextView[@text='City']//following-sibling::android.widget.EditText");
	By loc_textBoxCollege=MobileBy.xpath("//android.widget.TextView[@text='College']//following-sibling::android.widget.EditText");
	By loc_DrpDownYear=MobileBy.xpath("//android.widget.TextView[@text='Year']//following-sibling::android.widget.Spinner/child::android.widget.TextView");
	By loc_textBoxCollegeMajor=MobileBy.xpath("//android.widget.TextView[@text='College Major']//following-sibling::android.widget.EditText");
	By loc_DrpDownQualification=MobileBy.xpath("//android.widget.TextView[@text='Qualification']//following-sibling::android.widget.Spinner/child::android.widget.TextView");
	By loc_ListQualification=MobileBy.xpath("//android.widget.TextView[@text='Select Highest Qualification']//following-sibling::android.widget.TextView");
	By loc_textBoxStatus=MobileBy.xpath("//android.widget.TextView[@text='Status']//following-sibling::android.widget.EditText");
	By loc_editProfile=MobileBy.xpath("//android.widget.TextView[@text='Edit Profile']");
	By loc_titleMorePage=MobileBy.xpath("//android.widget.TextView[@text='More']");
	By loc_empIdTextBox=MobileBy.xpath("//android.widget.TextView[@text='Employee ID']//following-sibling::android.widget.EditText");
	By loc_textBoxLastName=MobileBy.xpath("//android.widget.TextView[@text='Last Name']//following-sibling::android.widget.EditText");
	By loc_textMoreSideMenu=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_profile_title_tv\")");
	By loc_textMore_MorePage=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_textLeaderboardSideMenu=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_profile_title_tv\")");
	By loc_profileTextSideMenu=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_profile_title_tv\")");
	By loc_gamesTextSideMenu=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_profile_title_tv\")");
	By loc_btnCancel=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/footer_layout_cancel_tv\")");
	By loc_TitleFirstNameHelp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/help_screen_first_name_et\")");
	By loc_TitleBoxLastNameHelp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/help_screen_last_name_et\")");
	By loc_textBoxCompNameHelp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/help_screen_comp_name_et\")");
	By loc_textPleaseSelectTopic=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/help_screen_spinner\")");
	
	
	By loc_textNoFileChosen=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_profile_title_tv\")");
	By loc_companyNameText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/help_screen_comp_name_et\")");
	By loc_btnSubmitText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/footer_layout_submit_tv\")");
	By loc_successMsg=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/message\")");
	By loc_btnOk=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/button1\")");
	By loc_btnChangePw=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_edit_profile_change_password_tv\")");
	By loc_titleChangePw=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_textboxCurrentPw=MobileBy.xpath("//android.widget.TextView[@text='Current Password']//following-sibling::android.widget.EditText");
	By loc_textboxNewPw=MobileBy.xpath("//android.widget.TextView[@text='New Password']//following-sibling::android.widget.EditText");
	By loc_textboxConfirmPw=MobileBy.xpath("//android.widget.TextView[@text='Confirm New Password']//following-sibling::android.widget.EditText");
	By loc_btnSaveChangePw=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/footer_layout_submit_tv\")");
	By loc_btnCancelEditPlayer=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/footer_layout_cancel_tv\")");

	By loc_btnHelp=MobileBy.xpath("//android.widget.TextView[@text='Help']");
	By loc_firstNameHelp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/help_screen_first_name_et\")");
	By loc_lastNameHelp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/help_screen_last_name_et\")");
	By loc_companyNameHelp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/help_screen_comp_name_et\")");
	By loc_TitletextAreaComments=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/help_screen_comment_tv\")");
	By loc_attachFileText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/help_screen_choose_file_tv\")");
	By loc_selectTopicHelp=MobileBy.xpath("//android.widget.TextView[@text='Select Topic']");
	By loc_validationHelp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"android:id/message\")");
	By loc_textAreaComments=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/help-screen_comment_et\")");
	
	@Override
	public void verifyLogOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyChangeLanguagePage() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleChangeLanguage, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that change language page is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleChangeLanguage).trim().equals("Change Language"));
		
	}

	@Override
	public void verifyLanguages() {
		List<String> languages=new ArrayList<String>();
		languages.add("عربي");
		languages.add("简体中文）");
		languages.add("中國傳統的）");
		languages.add("English");
		languages.add("français");
		languages.add("français (Canada)");
		languages.add("Deutsche");
		languages.add("Italiano");
		languages.add("日本語");
		languages.add("한국어");
		languages.add("Español");
		
		List<AndroidElement> ListLanguages=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_listLanguages);
		
		for(int i=0;i<=ListLanguages.size()-1;i++)
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct language is appearing",ListLanguages.get(i).getText().trim().equals(languages.get(i)));
		}		
	}

	@Override
	public void verifySaveLanguage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyAndClickCancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyHelpPage() {
        Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleHelp, 10);
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Help page is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleHelp).trim().equals("Help"));
		
	}

	@Override
	public void verifyCompanyName(String cName) {
		
		if(Pojo.getObjConfig().get("AUT_ADMIN_URL").equals("https://admin.1huddle.co/login"))
		{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that company name is showing correctly", Pojo.getObjSeleniumFunctions().getText(loc_companyNameHelp).equals("AutomationQA"));
		}
		else
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that company name is showing correctly", Pojo.getObjSeleniumFunctions().getText(loc_companyNameHelp).equals(cName));

		}
	}

	@Override
	public void verifyTopics() {
		List<String> topics=new ArrayList<String>();
		topics.add("Technical Issue");
		topics.add("Game Issue");
		topics.add("Feedback/Comments");
		topics.add("New Feature Request");
		topics.add("Other");
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that select topic drop down is clicking ",Pojo.getObjSeleniumFunctions().click(loc_drpDwnSelectTopic));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		List<AndroidElement> listTopics=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_listHelpTopics);
		for(int i=0;i<=listTopics.size()-1;i++)
		{
			System.out.println("Actual More Options: "+listTopics.get(i).getText().trim());

			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct topic is appearing",listTopics.get(i).getText().trim().equals(topics.get(i)));
		}
		
	}

	@Override
	public void selectTopic(String topicName) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that select topic drop down is clicking ",Pojo.getObjSeleniumFunctions().click(loc_drpDwnSelectTopic));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		By topicXpath=MobileBy.xpath("//android.widget.TextView[@text='"+topicName+"']");
		//By topicXpath=By.xpath("//span[contains(text(),'"+topicName+"')] ");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that topic is selecting", Pojo.getObjSeleniumFunctions().click(topicXpath));
		
	}

	@Override
	public void enterCommnet(String Comments) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that comment is adding", Pojo.getObjSeleniumFunctions().setText(loc_textAreaComments, Comments));
		
	}

	@Override
	public void clickSubmitButton() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that submit button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnSubmit));
		
	}

	@Override
	public void verifyHelpInAdmin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyEditProfilePage() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Edit profile page is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleEditProfile).trim().equals("Edit Profile"));
		
	}

	@Override
	public void verifyAndEditFirstName() {
		Pojo.getObjSeleniumFunctions().waitFor(7);
		String firstName=Pojo.getObjTestData().getFirstName();
		System.out.println("First Name: "+firstName);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that first name is editing", Pojo.getObjSeleniumFunctions().setText(loc_textBoxFirstName, firstName));
		expectedData.put("FirstName",firstName );
		
	}

	@Override
	public void verifyAndEditLastName() {
		Pojo.getObjSeleniumFunctions().waitFor(7);
		String lastName=Pojo.getObjTestData().getLastName();
		System.out.println("Last Name: "+lastName);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last name is editing", Pojo.getObjSeleniumFunctions().setText(loc_textBoxLastName, lastName));
		expectedData.put("LastName",lastName );
		
	}

	@Override
	public void verifyAndEnterTitle() {
		Pojo.getObjSeleniumFunctions().waitFor(3);
		String title=Pojo.getObjTestData().getTitle();
		System.out.println("Title "+title);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that title is editing", Pojo.getObjSeleniumFunctions().setText(loc_textBoxTitle, title));
		
		expectedData.put("Title", title);
		
	}

	@Override
	public void verifyAndSelectCountry(String country) {
		Pojo.getObjSeleniumFunctions().androidScroll("City");
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that country drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_DrpDownCountry) );
		Pojo.getObjSeleniumFunctions().androidScroll(country);
		By loc_country=MobileBy.xpath("//android.widget.TextView[@text='"+country+"']");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that country is selecting", Pojo.getObjSeleniumFunctions().click(loc_country));
		expectedData.put("Country", country);
		
	}

	@Override
	public void verifyAndSelectState(String state) {
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that state drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_DrpDownState) );
		By loc_state=MobileBy.xpath("//android.widget.TextView[@text='"+state+"']");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that state is selecting", Pojo.getObjSeleniumFunctions().click(loc_state));
		expectedData.put("State", state);
		
	}

	@Override
	public void verifyAndEnterCity() {
		String city=Pojo.getObjTestData().getCity();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that city is editing", Pojo.getObjSeleniumFunctions().setText(loc_textBoxCity, city));
		expectedData.put("City", city);

		
	}

	@Override
	public void verifyAndEnterCollege() {
		String college=Pojo.getObjTestData().getCollege();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that college is editing", Pojo.getObjSeleniumFunctions().setText(loc_textBoxCollege, college));
		expectedData.put("College", college);
		
	}

	@Override
	public void verifyAndSelectYear(String year) {
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjSeleniumFunctions().androidScroll("College Major");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that year drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_DrpDownYear) );
		By loc_year=MobileBy.xpath("//android.widget.TextView[@text='"+year+"']");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that state is selecting", Pojo.getObjSeleniumFunctions().click(loc_year));
		expectedData.put("Year", year);
		
	}

	@Override
	public void verifyAndEnterCollegeMajor() {
		String collegeMajor=Pojo.getObjTestData().getCollegeMajor();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that college major is editing", Pojo.getObjSeleniumFunctions().setText(loc_textBoxCollegeMajor, collegeMajor));
		expectedData.put("CollegeMajor", collegeMajor);
		
	}

	@Override
	public void verifyQualificationListItems() {
		List<String> qualification=new ArrayList<String>();
		qualification.add("High School");
		qualification.add("Undergraduate");
		qualification.add("Graduate");
		
		//Pojo.getObjSeleniumFunctions().scrollToView(loc_textBoxStatus);
		Pojo.getObjSeleniumFunctions().androidScroll("College Major");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that select qualification drop down is clicking ",Pojo.getObjSeleniumFunctions().click(loc_DrpDownQualification));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		List<AndroidElement> listqualification=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_ListQualification);

		//List<WebElement> listqualification=Pojo.getObjSeleniumFunctions().getWebElementList(loc_ListQualification);
		for(int i=0;i<=listqualification.size()-1;i++)
		{
			System.out.println("Actual qualification Options: "+listqualification.get(i).getText().trim());

			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct qualification is appearing",listqualification.get(i).getText().trim().equals(qualification.get(i)));
		}
		
	}

	@Override
	public void selectQualification() {
		//Pojo.getObjSeleniumFunctions().androidScroll("College");
		//Pojo.getObjSeleniumFunctions().scrollToView(loc_textBoxStatus);
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DrpDownQualification, 10);
	//	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that select qualification drop down is clicking ",Pojo.getObjSeleniumFunctions().click(loc_DrpDownQualification));
		String qualification=Pojo.getObjTestData().getQualification().trim();
		System.out.println("Qualification "+qualification);
		//android.widget.TextView[@text='High School']
		By loc_Qualification=MobileBy.xpath("//android.widget.TextView[@text='"+qualification+"']");
		//By loc_Qualification=By.xpath("//*[contains(text(),'"+qualification+" ')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_Qualification, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that qualification is selecting", Pojo.getObjSeleniumFunctions().click(loc_Qualification));
		expectedData.put("Qualification", qualification);
		
	}

	@Override
	public void addStatus() {
		Pojo.getObjSeleniumFunctions().androidScroll("First Name");
		String status=Pojo.getObjTestData().getStatus();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that new status is adding", Pojo.getObjSeleniumFunctions().setText(loc_textBoxStatus, status));
		expectedData.put("Status", status);
		
	}

	@Override
	public void clickSave() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that save button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_clickSave));
		Pojo.getObjSeleniumFunctions().waitFor(5);
	}

	@Override
	public void clickCancel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickMoreOption() {
		//Pojo.getAndroidDriver().findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/leaderboard_activity_tab_layout\")[4])").click();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnMore, 10);
		System.out.println(Pojo.getObjSeleniumFunctions().waitFor(5));
		System.out.println("Vishal");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that more button is tapping", Pojo.getObjSeleniumFunctions().tap(loc_btnMore));
		
	}

	@Override
	public void clickLogout() {
		//Pojo.getObjSeleniumFunctions().androidScroll("Logout");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that logout button is tapping", Pojo.getObjSeleniumFunctions().tap(loc_btnLogout));

	}

	@Override
	public void clickChangeLanguage() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnChangeLanguage, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that change language button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnChangeLanguage));		
	}

	@Override
	public void clickHelp() {
		   Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnHelp,10);
		   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Help is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnHelp));
		
	}

	@Override
	public void clickEditProfile() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_editProfile,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that edit profile button is clicking", Pojo.getObjSeleniumFunctions().click(loc_editProfile));
		
	}

	@Override
	public void verifyMorePage() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that more page is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleMorePage).trim().equals("MORE"));
		
	}

	@Override
	public void editFirstName(String fName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editLastName(String lName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyEmpIdDisable() {
		Pojo.getObjSeleniumFunctions().androidScroll("Qualification");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_empIdTextBox, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that empid field is displaying as disabled", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_empIdTextBox));		
	}

	@Override
	public void verifyProfileDataWeb() {
Pojo.getObjSeleniumFunctions().waitFor(15);
		
		System.out.println("Expected First Name "+expectedData.get("FirstName"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that First name is correct", Pojo.getObjSeleniumFunctions().getText(loc_textBoxFirstName).trim().equals(expectedData.get("FirstName")));
		

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Last name is correct", Pojo.getObjSeleniumFunctions().getText(loc_textBoxLastName).trim().equals(expectedData.get("LastName")));
		
		System.out.println("Actual Status "+Pojo.getObjSeleniumFunctions().getText(loc_textBoxStatus).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that status is correct", Pojo.getObjSeleniumFunctions().getText(loc_textBoxStatus).trim().equals(expectedData.get("Status")));
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Title is correct", Pojo.getObjSeleniumFunctions().getText(loc_textBoxTitle).trim().equals(expectedData.get("Title")));
		
		Pojo.getObjSeleniumFunctions().androidScroll("College");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that City is correct", Pojo.getObjSeleniumFunctions().getText(loc_textBoxCity).trim().equals(expectedData.get("City")));
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that College is correct", Pojo.getObjSeleniumFunctions().getText(loc_textBoxCollege).trim().equals(expectedData.get("College")));
		
		Pojo.getObjSeleniumFunctions().androidScroll("College Major");
		System.out.println("Actual Year "+Pojo.getObjSeleniumFunctions().getText(loc_DrpDownYear).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Year is correct", Pojo.getObjSeleniumFunctions().getText(loc_DrpDownYear).trim().equals(expectedData.get("Year")));
		
		Pojo.getObjSeleniumFunctions().androidScroll("Qualification");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that College Major is correct", Pojo.getObjSeleniumFunctions().getText(loc_textBoxCollegeMajor).trim().equals(expectedData.get("CollegeMajor")));
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Qualification is correct", Pojo.getObjSeleniumFunctions().getText(loc_DrpDownQualification).trim().equals(expectedData.get("Qualification")));
		
		
		
	}

	@Override
	public void verifyProfileDataAdmin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyMoreOptions(String editProfileText, String helpText, String languageText, String logOutText) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectLanguage(String expectedLanguage) {
		
		
	}

	@Override
	public void verifyConvertedText(String expectedText,String mobAppStatus) {
		String s1;
		String s2;
		if(language.equalsIgnoreCase("English"))
		{
			if(expectedText.contains(" "))
			{
				System.out.println("Expected Text "+expectedText);
				String[] splitStr = expectedText.split("\\s+");
				s1=splitStr[0].toString().substring(0, 1)+splitStr[0].toString().substring(1).toLowerCase();
				s2=splitStr[1].toString();
				s2=s2.substring(0, 1).toUpperCase()+s2.toString().substring(1).toLowerCase();
				expectedText=s1+" "+s2;
			}
			else
			{
				expectedText=expectedText.toString().substring(0,1)+expectedText.toString().substring(1).toLowerCase();
				

			}
		}
		
		if(mobAppStatus.equalsIgnoreCase("yes"))
		{
		String expectedLocText=expectedText.replaceAll("[*]", "").trim();
		By loc_buttonText=By.xpath("//android.widget.TextView[contains(@text,'"+expectedLocText+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_buttonText, 10);
		System.out.println("Actual Text "+Pojo.getObjSeleniumFunctions().getText(loc_buttonText).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that expected text is displaying "+expectedText, Pojo.getObjSeleniumFunctions().getText(loc_buttonText).trim().equals(expectedText));
		}
		else
		{
			System.out.println("This feature is not for mobile app");
		}
		
	}

	@Override
	public void veriyMoreTextSideMenu(String expectedText) {
	//	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that more text is correct side menu", Pojo.getObjSeleniumFunctions().getText(loc_textMoreSideMenu).trim().equals(expectedText));
		
	}

	@Override
	public void verifyMoreTextMorePage(String expectedText) {
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that more text is correct side menu", Pojo.getObjSeleniumFunctions().getText(loc_textMore_MorePage).trim().equals(expectedText));
		
	}

	@Override
	public void verifyLeaderboardTextSideMenu(String expectedText) {
	//	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify leaderboard text is correct side menu", Pojo.getObjSeleniumFunctions().getText(loc_textLeaderboardSideMenu).trim().equals(expectedText));
		
	}

	@Override
	public void verifyProfileTextSideMenu(String expectedText) {
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify profile text is correct side menu", Pojo.getObjSeleniumFunctions().getText(loc_profileTextSideMenu).trim().equals(expectedText));
		
	}

	@Override
	public void verifyGamesTextSideMenu(String expectedText) {
		
	}

	@Override
	public void verifyCancelBtn() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnCancel, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Cancel button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnCancel));
	}

	@Override
	public void verifySaveBtn() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnSubmit, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Submit button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnSubmit));

	}

	@Override
	public void verifyFirstNameField() {
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_TitleFirstNameHelp, 10);
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that first name field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_TitleFirstNameHelp).trim().equals("First Name *"));
		System.out.println("Expected First Name "+AllUsersPage.expectedDataUser.get("FirstName"));
		System.out.println("Actual First Name "+Pojo.getObjSeleniumFunctions().getText(loc_firstNameHelp));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that First name is correct", Pojo.getObjSeleniumFunctions().getText(loc_firstNameHelp).trim().equals(AllUsersPage.expectedDataUser.get("FirstName")));

	}

	@Override
	public void verifyLastNameField() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_TitleBoxLastNameHelp, 10);
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last name field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_TitleBoxLastNameHelp).trim().equals("Last Name *"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Last name is correct", Pojo.getObjSeleniumFunctions().getText(loc_lastNameHelp).trim().equals(AllUsersPage.expectedDataUser.get("LastName")));

	}

	@Override
	public void verifyCompanyNameField() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxCompNameHelp, 10);
		
		if(Pojo.getObjConfig().get("AUT_ADMIN_URL").equals("https://admin.1huddle.co/login")) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that company name field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textBoxCompNameHelp).trim().equals("AutomationQA"));
		}
		else
		{
			
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that company name field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textBoxCompNameHelp).trim().equals("AmazonPrime"));

		}
	}

	@Override
	public void verifySelectATopicField() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_selectTopicHelp, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that select a topic field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_selectTopicHelp).trim().equals("Select Topic"));
		
	}

	@Override
	public void verifyCommentsField() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_TitletextAreaComments, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that comments field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_TitletextAreaComments).trim().equals("Comments:"));
		
	}

	@Override
	public void verifyAttachScreenShotField() {
		System.out.println("Attach Scr field "+Pojo.getObjSeleniumFunctions().getText(loc_attachFileText).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attach screenshot field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_attachFileText).trim().equals("Attach Screenshot"));
		
	}

	@Override
	public void verifyNoFileChosenText() {
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textNoFileChosen, 10);

		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that no file chosen field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textNoFileChosen).trim().equals("No File chosen"));
		
	}

	@Override
	public void verifyCompanyNameDisabled() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_companyNameHelp, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that company name field is disabled ", Pojo.getObjSeleniumFunctions().getAttribute(loc_companyNameHelp, "enabled").equals("false"));
	}

	@Override
	public void verifyDisaledSubmitBtn() {
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnSubmitText, 10);

		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Submit button is disabled", Pojo.getObjSeleniumFunctions().getAttribute(loc_btnSubmitText, "disabled").equals("true"));
		
	}

	@Override
	public void verifySuccessMessageHelp(String message) {
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is appearing", Pojo.getObjSeleniumFunctions().getText(loc_successMsg).equals(message));
	}

	@Override
	public void AttachScreenShot() throws IOException {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attach screenshot button is clicking", Pojo.getObjSeleniumFunctions().click(loc_attachFileText));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Runtime.getRuntime().exec("src/test/resources/autoitScripts/WebAppValidImage.exe");
	}

	@Override
	public void verifyDefaultStatus() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxStatus, 15);
		//Pojo.getObjSeleniumFunctions().androidScroll("");
		//Pojo.getObjSeleniumFunctions().click(loc_textBoxStatus);
		//Pojo.getObjSeleniumFunctions().waitFor(2);
		System.out.println("Actual Status "+Pojo.getObjSeleniumFunctions().getText(loc_textBoxStatus).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that default status is correct", Pojo.getObjSeleniumFunctions().getText(loc_textBoxStatus).trim().equals("Hey! I am crushing it with 1Huddle 😎"));
		
	}

	@Override
	public void verifyChangePwBtn() {
		Pojo.getObjSeleniumFunctions().androidScroll("Qualification");

		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnChangePw,10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that change pw button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnChangePw));
		
	}

	@Override
	public void clickChangePw() {
		Pojo.getObjSeleniumFunctions().androidScroll("Qualification");

		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnChangePw,10);
		Pojo.getObjSeleniumFunctions().waitFor(2);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that change pw button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnChangePw));
	}

	@Override
	public void verifyChangePwScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleChangePw,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that change pw screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleChangePw).trim().equals("Change Password"));
		
	}

	@Override
	public void enterCurrentPw() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textboxCurrentPw, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that current pw is entering", Pojo.getObjSeleniumFunctions().setText(loc_textboxCurrentPw,  AllUsersPage.expectedDataUser.get("UserPassword")));
	}

	@Override
	public void enterNewPw(String newPw) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that new pw is entering", Pojo.getObjSeleniumFunctions().setText(loc_textboxNewPw,newPw));		
	}

	@Override
	public void enterConfirmPw(String confirmPw) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that confirm pw is entering", Pojo.getObjSeleniumFunctions().setText(loc_textboxConfirmPw,confirmPw));		
		AllUsersPage.expectedDataUser.put("ConfirmPassword", confirmPw);
	}

	@Override
	public void clickSaveChangePw() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Save button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnSaveChangePw));
		
	}

	@Override
	public void verifySuccessPasswordChange() {
		String expectedText="Password changed successfully.";
		  // Pojo.getObjSeleniumFunctions().waitFor(3);
		   Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_successMsg, 5);
		   String actualText=Pojo.getObjSeleniumFunctions().getText(loc_successMsg).trim();
		   System.out.println("Actual Message "+actualText);
		   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is correct",expectedText.equals(actualText));
		   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that ok button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnOk));

	}

	@Override
	public void clickCancelEditPlayer() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnCancelEditPlayer, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that cancel button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnCancelEditPlayer));
	}

	@Override
	public void verifySubmitBtnHelp() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that submit button is displaying", Pojo.getObjSeleniumFunctions().getText(loc_btnSubmit).trim().equals("SUBMIT"));
		
	}

	@Override
	public void verifyValidationIfTopicNotSelected(String expectedText) {
		clickSubmitButton();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that validation message is correct", Pojo.getObjSeleniumFunctions().getText(loc_validationHelp).trim().equals(expectedText));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that ok button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_btnOk));
		verifyHelpPage();
	}

	@Override
	public void verifyValidationIfCommentNotEntered(String expectedText) {
		selectTopic("Game Issue");
		clickSubmitButton();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that validation message is correct", Pojo.getObjSeleniumFunctions().getText(loc_validationHelp).trim().equals(expectedText));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that ok button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_btnOk));
		verifyHelpPage();
		
	}

	@Override
	public void verifyMorePageDesktopOnly() {

		
	}

	@Override
	public void clickMoreOptionMobApp() {
		//Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnMore,20);
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that more button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnMore));		
	}

	@Override
	public void verifySoundTextConverted(String expectedText) {
		String expectedLocText=expectedText.replaceAll("[*]", "").trim();
		By loc_buttonText=By.xpath("//android.widget.TextView[contains(@text,'"+expectedLocText+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_buttonText, 10);
		System.out.println("Actual Text "+Pojo.getObjSeleniumFunctions().getText(loc_buttonText).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that expected text is displaying "+expectedText, Pojo.getObjSeleniumFunctions().getText(loc_buttonText).trim().equals(expectedText));
		
	}

	@Override
	public void verifyEnterEmailText(String expectedText) {
		String expectedLocText=expectedText.replaceAll("[*]", "").trim();
		By loc_buttonText=By.xpath("//android.widget.EditText[contains(@text,'"+expectedLocText+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_buttonText, 10);
		System.out.println("Actual Text "+Pojo.getObjSeleniumFunctions().getText(loc_buttonText).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that expected text is displaying "+expectedText, Pojo.getObjSeleniumFunctions().getText(loc_buttonText).trim().equals(expectedText));		
	}

	@Override
	public void selectLanguageMobileApp(String expectedLanguage) {
		language=expectedLanguage;
		By loc_language=MobileBy.xpath("//android.widget.TextView[@text='"+expectedLanguage+"']");
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that scrolling is working", Pojo.getObjSeleniumFunctions().androidScroll(expectedLanguage));
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that language is selecting", Pojo.getObjSeleniumFunctions().click(loc_language));
	}

	
	}

	


