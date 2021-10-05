package com.testH.base.desktopView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.client.MorePage;

public class MorePageDesktopView extends MorePage  {
	
	

	By loc_btnMore=By.xpath("//span[text()='More']/parent::div");
	By loc_titleMorePage=By.xpath("//mat-card-title[text()='MORE ']");
	By loc_listMoreItems=By.xpath("//div[contains(@class,'centerAlign')]//child::mat-card");
	
	By loc_btnLogOut=By.xpath("//img[contains(@class,'settingIconLogout')]");
	
	By loc_btnChangeLanguage=By.xpath("//span[text()='CHANGE LANGUAGE']");
	By loc_titleChangeLanguage=By.xpath("//span[text()=' CHANGE LANGUAGE ']");
	By loc_listLanguages=By.xpath("//mat-radio-group[@role='radiogroup']//child::mat-radio-button");
	By loc_clickSave=By.xpath("//span[contains(text(),'SAVE')]");
	
	
	By loc_btnHelp=By.xpath("//span[text()='HELP']");
	By loc_titleHelp=By.xpath("//mat-card-title[text()='HELP']");
	By loc_drpDwnSelectTopic=By.xpath("//span[text()='Please select a topic:']");
	By loc_listHelpTopics=By.xpath("//div[contains(@class,'mat-select-content')]//child::mat-option");
	By loc_companyNameText=By.xpath("//input[contains(@name,'companyName')]");
	By loc_commentBox=By.xpath("//textarea[contains(@name,'comments')]");
	By loc_btnSubmit=By.xpath("//span[text()='SUBMIT']");
	By loc_btnSubmitText=By.xpath("//span[text()='SUBMIT']/parent::button");
	By loc_editFirstName=By.xpath("//input[contains(@name,'firstname')] ");
	By loc_editLastName=By.xpath("//input[contains(@name,'lastname')] ");
	By loc_btnCancel=By.xpath("//span[contains(text(),'CANCEL')]");
	By loc_TitleFirstNameHelp=By.xpath("//input[contains(@placeholder,'First')]/following-sibling::span/child::label");
	By loc_TitleBoxLastNameHelp=By.xpath("//input[contains(@placeholder,'Last')]/following-sibling::span/child::label");
	By loc_textBoxCompNameHelp=By.xpath("//input[contains(@placeholder,'Company')]/following-sibling::span/child::label");
	By loc_textPleaseSelectTopic=By.xpath("//span[contains(text(),'Please select a topic')]/parent::div");
	By loc_TitletextAreaComments=By.xpath("//textarea[contains(@placeholder,'Comments')]/following-sibling::span/child::label");
	By loc_attachFileText=By.xpath("//i[text()='attach_file']/parent::div");
	By loc_textNoFileChosen=By.xpath("//span[text()='No File chosen']");
	By loc_successMsg=By.xpath("//*[contains(@class,'mat-snack')]");


	By loc_gameList=By.xpath("//div[contains(@class,'gameList')]");
	
	
	
	By loc_editProfile=By.xpath("//*[text()='EDIT PROFILE']");
	By loc_titleEditProfile=By.xpath("//mat-card-title[text()='EDIT PROFILE ']");
	By loc_textBoxFirstName=By.xpath("//input[@placeholder='First Name']");
	By loc_textBoxLastName=By.xpath("//input[@name='lastname']");
	By loc_textBoxTitle=By.xpath("//input[@name='title']");
	By loc_textBoxCity=By.xpath("//input[@name='city']");
	By loc_textBoxCollege=By.xpath("//input[@name='college']");
	By loc_textBoxCollegeMajor=By.xpath("//input[@name='collegemajor']");
	By loc_textBoxStatus=By.xpath("//textarea[@placeholder='Add Status']");
    By loc_DrpDownCountry=By.xpath("//mat-select[@aria-label='Country']");
    By loc_DrpDownState=By.xpath("//mat-select[@aria-label='State']");
    By loc_DrpDownYear=By.xpath("//mat-select[@aria-label='Year']");
    By loc_DrpDownQualification=By.xpath("//mat-select[@aria-label='Qualification']");
    By loc_ListQualification=By.xpath("//div[contains(@class,'mat-select-content')]//child::mat-option");
    By loc_empIdTextBox=By.xpath("//input[@placeholder='Employee ID' and @disabled]");
    By loc_btnChangePw=By.xpath("//span[contains(text(),'Change Password')]");
    By loc_titleChangePw=By.xpath("//span[contains(text(),'CHANGE PASSWORD')]");
    By loc_textboxCurrentPw=By.xpath("//input[@placeholder='Current Password']");
    By loc_textboxNewPw=By.xpath("//input[@placeholder='New Password']");
    By loc_textboxConfirmPw=By.xpath("//input[@placeholder='Confirm New Password']");
    By loc_btnSaveChangePw=By.xpath("//section[@id='changePasswordPopUp']//child::span[contains(text(),'SAVE')]");
    By loc_btnCancelEditPlayer=By.xpath("//span[contains(text(),'CANCEL')]");


    
    
    By loc_textMoreSideMenu=By.xpath("//mat-list-item[5]//child::span");
    By loc_textMore_MorePage=By.xpath("//section[@id='settingSection']//div/div/div/div/div[1]");
    By loc_textLeaderboardSideMenu=By.xpath("//mat-list-item[2]//child::span");
    By loc_profileTextSideMenu=By.xpath("//mat-list-item[3]//child::span");
    By loc_gamesTextSideMenu=By.xpath("//mat-list-item[1]//child::span");

    
	
	

	

	
	
	
	@Override
	public void clickMoreOption() {
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnMore,15);
		//Pojo.getObjSeleniumFunctions().waitFor(3);
	//	Pojo.getObjUtilitiesFunctions().waitForPageLoad(10);
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameList, 25);
		
	//	Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnMore,20);
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that more button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnMore));
	}
	
	@Override
	public void verifyMorePage() {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleMorePage, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that more page is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleMorePage).trim().equals("MORE"));
		
	}

	@Override
	public void verifyMoreOptions(String editProfileText,String helpText,String changeLanguageText,String logoutText) {
		
		List<String> moreOptions=new ArrayList<String>();
		moreOptions.add(editProfileText);
		moreOptions.add(helpText);
		moreOptions.add(changeLanguageText);
		moreOptions.add(logoutText);
		
List<WebElement> ListMore=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listMoreItems);

for(int i=0;i<=ListMore.size()-1;i++)
{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct option is appearing",ListMore.get(i).getText().trim().equals(moreOptions.get(i)));
	System.out.println("Actual More Options: "+ListMore.get(i).getText().trim());
}
}

   @Override
	public void clickLogout() {
	    Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnLogOut, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that logout button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnLogOut));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		
	}
   
   @Override
	public void clickChangeLanguage() {
	   Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnChangeLanguage, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that change language button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnChangeLanguage));
	}
	
	@Override
	public void verifyChangeLanguagePage() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleChangeLanguage, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that change language page is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleChangeLanguage).trim().equals("CHANGE LANGUAGE"));
		
	}

	@Override
	public void verifyLanguages() {
		List<String> languages=new ArrayList<String>();
		languages.add("عربي");
		languages.add("简体中文");
		languages.add("中國傳統的");
		languages.add("English");
		languages.add("Français");
		languages.add("Français (Canada)");
		languages.add("German");
		languages.add("Italian");
		languages.add("Japanese");
		languages.add("Korean");
		languages.add("Spanish");
		
		List<WebElement> ListLanguages=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listLanguages);
		for(int i=0;i<=ListLanguages.size()-1;i++)
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct language is appearing",ListLanguages.get(i).getText().trim().equals(languages.get(i)));
			System.out.println("Actual More Options: "+ListLanguages.get(i).getText().trim());
		}
		}

	@Override
	public void clickSave() {
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that save button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_clickSave));
			Pojo.getObjSeleniumFunctions().waitFor(5);
	}
	
   @Override
	public void verifySaveLanguage() {
		
		}
	
   @Override
	public void clickHelp() {
	   
	   Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnHelp,10);
	   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Help is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnHelp));
		
   		}
   
	@Override
	public void verifyHelpPage() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleHelp, 10);
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Help page is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleHelp).trim().equals("HELP"));
	}
	
	@Override
	public void verifyCompanyName(String cName) //company name is disable. Discussion needed with developer to get text
	{ 
		
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
		List<WebElement> listTopics=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listHelpTopics);
		for(int i=0;i<=listTopics.size()-1;i++)
		{
			System.out.println("Actual More Options: "+listTopics.get(i).getText().trim());

			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct topic is appearing",listTopics.get(i).getText().trim().equals(topics.get(i)));
		}
		
	}
	
	@Override
	public void editFirstName(String fName) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_editFirstName, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that first name is editing", Pojo.getObjSeleniumFunctions().setText(loc_editFirstName, fName));
		
	}

	@Override
	public void editLastName(String lName) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_editLastName, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last name is editing", Pojo.getObjSeleniumFunctions().setText(loc_editLastName, lName));
		
	}
	
	@Override
	public void selectTopic(String topicName) {

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that select topic drop down is clicking ",Pojo.getObjSeleniumFunctions().click(loc_drpDwnSelectTopic));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		By topicXpath=By.xpath("//span[contains(text(),'"+topicName+"')] ");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that topic is selecting", Pojo.getObjSeleniumFunctions().click(topicXpath));
	}
	
	@Override
	public void enterCommnet(String Comments) {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that comment is adding", Pojo.getObjSeleniumFunctions().setText(loc_commentBox, Comments));
	}

	@Override
	public void clickSubmitButton() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that submit button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnSubmit));
		}

	@Override
	public void clickEditProfile() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_editProfile,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that edit profile button is clicking", Pojo.getObjSeleniumFunctions().click(loc_editProfile));
	}
	
	@Override
	public void verifyEditProfilePage() {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleEditProfile, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Edit profile page is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleEditProfile).trim().equals("EDIT PROFILE"));

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
		Pojo.getObjSeleniumFunctions().waitFor(3);
		String lastName=Pojo.getObjTestData().getLastName();
		System.out.println("Last Name "+lastName);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last name is editing", Pojo.getObjSeleniumFunctions().setText(loc_textBoxLastName, lastName));
		expectedData.put("LastName", lastName);
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
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that country drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_DrpDownCountry) );
		By loc_country=By.xpath("//*[contains(text(),' "+country+" ')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that country is selecting", Pojo.getObjSeleniumFunctions().click(loc_country));
		expectedData.put("Country", country);
	}
	@Override
	public void verifyAndSelectState(String state) {
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that state drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_DrpDownState) );
		By loc_state=By.xpath("//*[contains(text(),' "+state+" ')]");
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
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that year drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_DrpDownYear) );
		By loc_year=By.xpath("//*[contains(text(),' "+year+" ')]");
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
		
		Pojo.getObjSeleniumFunctions().scrollToView(loc_textBoxStatus);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that select qualification drop down is clicking ",Pojo.getObjSeleniumFunctions().click(loc_DrpDownQualification));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		List<WebElement> listqualification=Pojo.getObjSeleniumFunctions().getWebElementList(loc_ListQualification);
		for(int i=0;i<=listqualification.size()-1;i++)
		{
			System.out.println("Actual qualification Options: "+listqualification.get(i).getText().trim());

			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct qualification is appearing",listqualification.get(i).getText().trim().equals(qualification.get(i)));
		}

	}
	@Override
	public void selectQualification() {
		Pojo.getObjSeleniumFunctions().scrollToView(loc_textBoxStatus);
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DrpDownQualification, 10);
	//	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that select qualification drop down is clicking ",Pojo.getObjSeleniumFunctions().click(loc_DrpDownQualification));
		String qualification=Pojo.getObjTestData().getQualification().trim();
		System.out.println("Qualification "+qualification);
		By loc_Qualification=By.xpath("//*[contains(text(),'"+qualification+" ')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_Qualification, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that qualification is selecting", Pojo.getObjSeleniumFunctions().click(loc_Qualification));
		expectedData.put("Qualification", qualification);
	}
	@Override
	public void addStatus() {
		String status=Pojo.getObjTestData().getStatus();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that new status is adding", Pojo.getObjSeleniumFunctions().setText(loc_textBoxStatus, status));
		expectedData.put("Status", status);
	}
	@Override
	public void clickCancel() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void verifyLogOut() {
		// TODO Auto-generated method stub
		}
	@Override
	public void verifyAndClickCancel() {
		// TODO Auto-generated method stub
		}
	@Override
	public void verifyHelpInAdmin() {
		// TODO Auto-generated method stub
		}

	@Override
	public void verifyEmpIdDisable() {   //Need discussion with the developers for this. Will update after discussion
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_empIdTextBox, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that empid field is displaying as disabled", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_empIdTextBox));
	}

	@Override
	public void verifyProfileDataWeb() {
		
		Pojo.getObjSeleniumFunctions().waitFor(15);
		
		System.out.println("Expected First Name "+expectedData.get("FirstName"));
		System.out.println("Actual First Name "+Pojo.getObjSeleniumFunctions().getAttribute(loc_textBoxFirstName, "value"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that First name is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_textBoxFirstName, "value").trim().equals(expectedData.get("FirstName")));
		

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Last name is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_textBoxLastName, "value").trim().equals(expectedData.get("LastName")));
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Title is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_textBoxTitle, "value").trim().equals(expectedData.get("Title")));
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that City is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_textBoxCity, "value").trim().equals(expectedData.get("City")));
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that College is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_textBoxCollege,"value").trim().equals(expectedData.get("College")));
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Year is correct", Pojo.getObjSeleniumFunctions().getText(loc_DrpDownYear).trim().equals(expectedData.get("Year")));
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that College Major is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_textBoxCollegeMajor, "value").trim().equals(expectedData.get("CollegeMajor")));
		
		Pojo.getObjSeleniumFunctions().scrollToView(loc_textBoxStatus);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Qualification is correct", Pojo.getObjSeleniumFunctions().getText(loc_DrpDownQualification).trim().equals(expectedData.get("Qualification")));
		
		System.out.println("Actual Status "+Pojo.getObjSeleniumFunctions().getAttribute(loc_textBoxStatus, "value").trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that staus is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_textBoxStatus, "value").trim().equals(expectedData.get("Status")));


		
	}

	@Override
	public void verifyProfileDataAdmin() {
		
		
	}

	@Override
	public void selectLanguage(String expectedLanguage) {
		By loc_language=By.xpath("//div[contains(text(),'"+expectedLanguage+"')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that scrolling is working", Pojo.getObjSeleniumFunctions().scrollToView(loc_language));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that language is selecting", Pojo.getObjSeleniumFunctions().click(loc_language));
	}

	@Override
	public void verifyConvertedText(String expectedText,String mobAppStatus) {
		String expectedLocText=expectedText.replaceAll("[*]", "").trim();
		By loc_buttonText=By.xpath("//*[contains(text(),'"+expectedLocText+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_buttonText, 10);
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_buttonText).trim();
		System.out.println("Actual Text "+actualText);
		System.out.println("Expected Text "+expectedText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that expected text is displaying",actualText.equals(expectedText) );
	}

	@Override
	public void veriyMoreTextSideMenu(String expectedText) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that more text is correct side menu", Pojo.getObjSeleniumFunctions().getText(loc_textMoreSideMenu).trim().equals(expectedText));
	}

	@Override
	public void verifyMoreTextMorePage(String expectedText) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that more text is correct side menu", Pojo.getObjSeleniumFunctions().getText(loc_textMore_MorePage).trim().equals(expectedText));
		
	}

	@Override
	public void verifyLeaderboardTextSideMenu(String expectedText) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify leaderboard text is correct side menu", Pojo.getObjSeleniumFunctions().getText(loc_textLeaderboardSideMenu).trim().equals(expectedText));

	}

	@Override
	public void verifyProfileTextSideMenu(String expectedText) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify profile text is correct side menu", Pojo.getObjSeleniumFunctions().getText(loc_profileTextSideMenu).trim().equals(expectedText));
		
	}

	@Override
	public void verifyGamesTextSideMenu(String expectedText) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify profile text is correct side menu", Pojo.getObjSeleniumFunctions().getText(loc_gamesTextSideMenu).trim().equals(expectedText));
		
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
	}

	@Override
	public void verifyLastNameField() {
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_TitleBoxLastNameHelp, 10);

		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last name field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_TitleBoxLastNameHelp).trim().equals("Last Name *"));
		
	}

	@Override
	public void verifyCompanyNameField() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxCompNameHelp, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that company name field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textBoxCompNameHelp).trim().equals("Company Name"));

	}

	@Override
	public void verifySelectATopicField() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textPleaseSelectTopic, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that select a topic field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textPleaseSelectTopic).trim().equals("Please select a topic:"));
		
	}

	@Override
	public void verifyCommentsField() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_TitletextAreaComments, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that comments field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_TitletextAreaComments).trim().equals("Comments: *"));
		
	}

	@Override
	public void verifyAttachScreenShotField() {
		System.out.println("Attach Scr field "+Pojo.getObjSeleniumFunctions().getTextNode(loc_attachFileText,1).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attach screenshot field is appearing", Pojo.getObjSeleniumFunctions().getTextNode(loc_attachFileText,1).trim().equals("Attach Screenshot"));
		
	}

	@Override
	public void verifyNoFileChosenText() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textNoFileChosen, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that no file chosen field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textNoFileChosen).trim().equals("No File chosen"));
		
	}

	@Override
	public void verifyCompanyNameDisabled() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_companyNameText, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that company name field is disabled ", Pojo.getObjSeleniumFunctions().getAttribute(loc_companyNameText, "aria-required").equals("false"));
	}

	@Override
	public void verifyDisaledSubmitBtn() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnSubmitText, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Submit button is disabled", Pojo.getObjSeleniumFunctions().getAttribute(loc_btnSubmitText, "disabled").equals("true"));
		
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
		Pojo.getObjSeleniumFunctions().scrollToView(loc_textBoxStatus);
		Pojo.getObjSeleniumFunctions().click(loc_textBoxStatus);
		Pojo.getObjSeleniumFunctions().waitFor(2);
		System.out.println("Actual Status "+Pojo.getObjSeleniumFunctions().getAttribute(loc_textBoxStatus, "value").trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that default status is correct", Pojo.getObjSeleniumFunctions().getAttribute(loc_textBoxStatus, "value").trim().equals("Hey! I am crushing it with 1Huddle 😎"));
		
	}

	@Override
	public void verifyChangePwBtn() {
		Pojo.getObjSeleniumFunctions().scrollToView(loc_textBoxStatus);

		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnChangePw,10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that change pw button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnChangePw));
		
	}

	@Override
	public void clickChangePw() {
		Pojo.getObjSeleniumFunctions().scrollToView(loc_textBoxStatus);

		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnChangePw,10);
		Pojo.getObjSeleniumFunctions().waitFor(2);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that change pw button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnChangePw));
	}

	@Override
	public void verifyChangePwScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleChangePw,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that change pw screen is opening", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_titleChangePw));
		
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
		String expectedText="Password changed successfully";
		  // Pojo.getObjSeleniumFunctions().waitFor(3);
		   Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_successMsg, 5);
		   String actualText=Pojo.getObjSeleniumFunctions().getText(loc_successMsg).trim();
		   System.out.println("Actual Message "+actualText);
		   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is correct",expectedText.equals(actualText));
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyValidationIfCommentNotEntered(String expectedText) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyMorePageDesktopOnly() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that more page is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleMorePage).trim().equals("MORE"));

		
	}

	@Override
	public void clickMoreOptionMobApp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifySoundTextConverted(String expectedText) {
		// TODO Auto-generated method stub
		System.out.println("This is not on web app");
		
	}

	@Override
	public void verifyEnterEmailText(String expectedText) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectLanguageMobileApp(String expectedLanguage) {
		// TODO Auto-generated method stub
		
	}

	
	}
