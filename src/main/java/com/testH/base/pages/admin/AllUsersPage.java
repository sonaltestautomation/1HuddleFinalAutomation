package com.testH.base.pages.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.BaseTest;
import com.testH.app.generic.Pojo;
import com.testH.base.desktopView.HomePageDesktopView;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.client.HomePage;

public class AllUsersPage {
	
	private BaseTest objBaseTest;
	private HomePage objHomePage;

    
   public AllUsersPage()
   	{
	objBaseTest=new BaseTest();
	objHomePage= new PageFactory().getObjHomePage();
   	}
	public static  HashMap<String, String> expectedDataUser = new HashMap<String, String>();
	public static  HashMap<String, List> expectedDataUSerEmailAndPassword = new HashMap<String, List>();


	
	By loc_usersIcon=By.xpath("//mat-icon[text()='group_add']");
	By loc_player=By.xpath("//p[contains(text(),'Players')]");
	By loc_addAfilter=By.xpath("//input[contains(@id,'chips')]");
	By loc_filterEmail=By.xpath("//span[contains(text(),'Email')]");
	By loc_enterEmailTextBox=By.xpath("//input[@placeholder='Enter Email']");
	By loc_1hLogo=By.xpath("//img[@src='/assets/img/1huddle_tm.png']");
	By loc_Done=By.xpath("//button[@type='submit']");
	By loc_searchUser=By.xpath("//table/child::tbody/child::tr[1]");
	By loc_allPlayersPageTitle=By.xpath("//li[contains(text(),'Players')]");
	By loc_allManagersPageTitle=By.xpath("//li[contains(text(),'Managers')]");
	
	By loc_addUserButton=By.xpath("//mat-icon[contains(text(),'add')]//parent::span");
	By loc_addPlayerPageTitle=By.xpath("//div[contains(text(),'Add Player')]");
	By loc_btnMoreBurger=By.xpath("//mat-icon[contains(text(),'more')]");
	By loc_btnDownload=By.xpath("//span[contains(text(),'Download')]");
	By loc_btnUpload=By.xpath("//*[contains(text(),'Upload')]");
	By loc_btnDownloadSampleCsv=By.xpath("//span[contains(text(),'Download Sample CSV')]");
	
	
	
	
	By loc_editProfile=By.xpath("//*[text()='EDIT PROFILE']");
	By loc_titleEditProfile=By.xpath("//mat-card-title[text()='EDIT PROFILE ']");
	By loc_textBoxFirstName=By.xpath("//input[@placeholder='Enter First Name']");
	By loc_textBoxLastName=By.xpath("//input[@name='last_name']");
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
	By loc_DrpDownDept=By.xpath("//input[@placeholder='Select Department']");
	By loc_DrpDownLoct=By.xpath("//input[@placeholder='Select Location']");
	By loc_txtBoxEmailAddUser=By.xpath("//input[@type='email']");
	By loc_passwordTxtBox=By.xpath("//input[@name='userpassword']");
	By loc_confirmPasswordTxtBox=By.xpath("//input[@name='confirmpassword']");
	By loc_btnAdd=By.xpath("//div[contains(text(),'ADD')]");
	By loc_checkBoxUser=By.xpath("//td[contains(@class,'checkboxes')]");
	By loc_optionsBtn=By.xpath("//mat-icon[contains(text(),'more_vert')]");
	By loc_deactiveBtn=By.xpath("//span[contains(text(),'Deactivate')]");
	By loc_ManagersSideMenu=By.xpath("//p[contains(text(),'Managers')]");
	By loc_addManagerPageTitle=By.xpath("//div[contains(text(),'Add Manager')]");
	By loc_userType=By.xpath("//select[@name='type']");
	
	By loc_additionalInfo=By.xpath("//div[contains(text(),'Additional Information')]");
	By loc_selectGroup=By.xpath("//input[contains(@placeholder,'Select Group')]");
	By loc_btnCloseChip=By.xpath("//mat-chip//child::mat-icon");
	
	By loc_paginatorNos=By.xpath("//div[contains(@class,'paginator')]/child::div[contains(text(),'1 -')]");

	

	
	
	public void clickUsersIcon()
	{
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_usersIcon);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that user icon is clicking",Pojo.getObjSeleniumFunctions().click(loc_usersIcon));
	}
	
	public void clickPlayers()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_player, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Players is clicking",Pojo.getObjSeleniumFunctions().click(loc_player));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that mouse hover",Pojo.getObjSeleniumFunctions().mouseHover(loc_1hLogo));

	}
	
	public void clickFilter()
	
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_addAfilter, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Add a filter is clicking",Pojo.getObjSeleniumFunctions().click(loc_addAfilter));

	}
	
	public void clickEmail()
	{
		//Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_filterEmail, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that email is clicking",Pojo.getObjSeleniumFunctions().click(loc_filterEmail));
	}
	
	public void enterEmail()
	{
		
		String userEmail=objHomePage.expectedDataUserPlayerApp.get("PlayerEmail");
		System.out.println("User Email "+userEmail);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_enterEmailTextBox, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that email is entering",Pojo.getObjSeleniumFunctions().setText(loc_enterEmailTextBox, userEmail));
	}
	public void clickDone()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_Done, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Done is clicking",Pojo.getObjSeleniumFunctions().click(loc_Done));
	}
	
	public void selectUser()  //Select user from list manager or player
	{
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_searchUser, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that user is clicking",Pojo.getObjSeleniumFunctions().click(loc_searchUser));

	}
	
	public void verifyAllPlayersPage()
	{
		String actualTitle=Pojo.getObjSeleniumFunctions().getText(loc_allPlayersPageTitle).trim();
		String expectedTitle="Players";
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that All player page is opening", actualTitle.equals(expectedTitle));
	}
	
	public void clickAddUserButton() //For adding player or manager
	{
		//Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_addUserButton);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_addUserButton, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add user button is clicking", Pojo.getObjSeleniumFunctions().click(loc_addUserButton));
	}
	
	public void verifyAddPlayerPage()
	{
		Pojo.getObjSeleniumFunctions().waitForElementPresence(loc_addPlayerPageTitle);
		String actualTitle=Pojo.getObjSeleniumFunctions().getText(loc_addPlayerPageTitle).trim();
		String expectedTitle="Add Player";
		System.out.println("Expected Add Player Title "+expectedTitle);
		System.out.println("Actual Add Player Title "+actualTitle);
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that All player page is opening", actualTitle.equals(expectedTitle));
	}
	
	public void addFirstName()
	{
		Pojo.getObjSeleniumFunctions().waitForElementPresence(loc_textBoxFirstName);
		String firstName=Pojo.getObjTestData().getFirstName();
		System.out.println("First Name: "+firstName);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that first name is adding", Pojo.getObjSeleniumFunctions().setText(loc_textBoxFirstName, firstName));
		expectedDataUser.put("FirstName",firstName);
	}
	
	public void addLastName()
	{
		String lastName=Pojo.getObjTestData().getLastName();
		System.out.println("Last Name: "+lastName);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last name is adding", Pojo.getObjSeleniumFunctions().setText(loc_textBoxLastName, lastName));
		expectedDataUser.put("LastName",lastName);
	}
	
	public void addDepartment(String Dept)
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DrpDownDept, 10);
		Pojo.getObjSeleniumFunctions().waitFor(3);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Department drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_DrpDownDept));
		By loc_dept=By.xpath("//span[contains(text(),'"+Dept+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_dept, 15);
		Pojo.getObjSeleniumFunctions().waitFor(2);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Dept is selecting", Pojo.getObjSeleniumFunctions().click(loc_dept));
		expectedDataUser.put("Department", Dept);
	}
	
	public void addLocation(String location)
	{
		//Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DrpDownLoct, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_DrpDownLoct));
		By loc_location=By.xpath("//span[contains(text(),'"+location+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_location, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location is selecting", Pojo.getObjSeleniumFunctions().click(loc_location));
		expectedDataUser.put("Location", location);
	}
	
	public void addUserEmail()
	{
		//Pojo.getObjSeleniumFunctions().waitFor(2);
		String userEmail=Pojo.getObjTestData().getRandomEmail();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_txtBoxEmailAddUser, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Email adding while creating user", Pojo.getObjSeleniumFunctions().setText(loc_txtBoxEmailAddUser, userEmail));

		expectedDataUser.put("UserEmail", userEmail);
	}
	
	public void setUserEmailaAndPassword(int userNo, String pw)
	{
		//Pojo.getObjSeleniumFunctions().waitFor(2);
		
		List<String> userEmailPass=new ArrayList<String>();
		
		String userEmail=Pojo.getObjTestData().getRandomEmail();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_txtBoxEmailAddUser, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Email adding while creating user", Pojo.getObjSeleniumFunctions().setText(loc_txtBoxEmailAddUser, userEmail));
		userEmailPass.add(userEmail);
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that password adding", Pojo.getObjSeleniumFunctions().setText(loc_passwordTxtBox, pw));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that confirm password adding", Pojo.getObjSeleniumFunctions().setText(loc_confirmPasswordTxtBox, pw));
		userEmailPass.add(pw);

		
		expectedDataUSerEmailAndPassword.put("UserEmail"+userNo, userEmailPass);
	}
	
	public void setPassword(String pw)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that password adding", Pojo.getObjSeleniumFunctions().setText(loc_passwordTxtBox, pw));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that confirm password adding", Pojo.getObjSeleniumFunctions().setText(loc_confirmPasswordTxtBox, pw));
		expectedDataUser.put("UserPassword", pw);
	}
	
	public void clickAddBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Add button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAdd));
		Pojo.getObjSeleniumFunctions().waitFor(5);
	}
	
	public void verifyNewlyAddedUser()
	{
		
		By loc_userList=By.xpath("//tbody//child::tr//child::td[3]");
		String expectedUserFirstName=expectedDataUser.get("FirstName");
		String expectedUserLastName=expectedDataUser.get("LastName");
		String userFullName=expectedUserFirstName+" "+expectedUserLastName;
		System.out.println("ExpectedFullName "+userFullName);
		
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_addUserButton);
		List<String> userNamesStr=new ArrayList<String>();
		List<WebElement> userNames=Pojo.getObjSeleniumFunctions().getWebElementList(loc_userList);
		System.out.println("List Size "+userNames.size());
		
		for(WebElement userName:userNames)
		{
			userNamesStr.add(userName.getText().trim());
			System.out.println("User name "+userName.getText());
	    }

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that newly added user is displaying in list", userNamesStr.contains(userFullName));
}
	

	
	public void selectUserCheckbox()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_checkBoxUser,10);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that checkbox is selecting", Pojo.getObjSeleniumFunctions().click(loc_checkBoxUser));
	}
	
	public void clickOptions()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that options burger button is clicking", Pojo.getObjSeleniumFunctions().click(loc_optionsBtn));

	}
	
	public void clickDeactiveBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that deactivate button is clicking", Pojo.getObjSeleniumFunctions().click(loc_deactiveBtn));

	}
	
	public void deactivateUser()
	{
		clickFilter();
		clickEmail();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_enterEmailTextBox, 15);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Enter email to search", Pojo.getObjSeleniumFunctions().setText(loc_enterEmailTextBox,expectedDataUser.get("UserEmail")));
		clickDone();
		selectUserCheckbox();
		clickOptions();
		clickDeactiveBtn();
	}
	
	public void searchSpecificPlayer()
	{
		clickFilter();
		clickEmail();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_enterEmailTextBox, 15);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Enter email to search", Pojo.getObjSeleniumFunctions().setText(loc_enterEmailTextBox,expectedDataUser.get("UserEmail")));
		clickDone();
	}
	public void searchSpecificManager()
	{
		clickFilter();
		clickEmail();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_enterEmailTextBox, 15);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Enter email to search", Pojo.getObjSeleniumFunctions().setText(loc_enterEmailTextBox,expectedDataUser.get("UserEmail")));
		clickDone();
	}
	
	public void deactivatAllRecentlyAddedUsers()
	{
		  int playerCount=expectedDataUSerEmailAndPassword.size();
		  System.out.println("Player Count "+playerCount);
		  String playerEmail;
		  
		  while(playerCount!=0)
		  {
			playerEmail=expectedDataUSerEmailAndPassword.get("UserEmail"+playerCount).get(0).toString();
            System.out.println("Player Email "+playerCount+" "+playerEmail);
		
		clickFilter();
		clickEmail();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_enterEmailTextBox, 15);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Enter email to search", Pojo.getObjSeleniumFunctions().setText(loc_enterEmailTextBox,playerEmail));
		clickDone();
		selectUserCheckbox();
		clickOptions();
		clickDeactiveBtn();
		closeChip();
		playerCount--;
	}}
	
	public void closeChip()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that chip is closing", Pojo.getObjSeleniumFunctions().click(loc_btnCloseChip));
	}
	
	public void clickManagers()
	{
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_ManagersSideMenu);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Managers side menu item is clicking",Pojo.getObjSeleniumFunctions().click(loc_ManagersSideMenu));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that mouse hover",Pojo.getObjSeleniumFunctions().mouseHover(loc_1hLogo));
    }
	public void verifyManagersPage()
	{
		String actualTitle=Pojo.getObjSeleniumFunctions().getText(loc_allManagersPageTitle).trim();
		String expectedTitle="Managers";
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that All managers page is opening", actualTitle.equals(expectedTitle));
	}
	
	public void verifyAddManagersPage()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_addManagerPageTitle, 5);
		String actualTitle=Pojo.getObjSeleniumFunctions().getText(loc_addManagerPageTitle).trim();
		String expectedTitle="Add Manager";
		System.out.println("Actual Title" +actualTitle);
		System.out.println("Expected Title" +expectedTitle);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Add manager page is opening", actualTitle.equals(expectedTitle));
	}
	
	public void selectUserType(String userType)
	{
		//Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_userType, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that User Type drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_userType));
		By loc_userType=By.xpath("//option[(text()='"+userType+"')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that user is selecting", Pojo.getObjSeleniumFunctions().click(loc_userType));
		expectedDataUser.put("UserType", userType);
	}
	
	public void clickAdditionalInfo()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that additional info button is clicking", Pojo.getObjSeleniumFunctions().click(loc_additionalInfo));
	}
	
	public void selectGroup(String group)
	{
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_selectGroup, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Group drp down is clicking",Pojo.getObjSeleniumFunctions().click(loc_selectGroup));
		By loc_group=By.xpath("//span[contains(text(),'"+group+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_group,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that group is selecting", Pojo.getObjSeleniumFunctions().click(loc_group));
		expectedDataUser.put("Group", group);
	}
	
	public int getTotalPlayerCount()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_paginatorNos, 10);
		String paginatorNo=Pojo.getObjSeleniumFunctions().getText(loc_paginatorNos).trim();
		String[] separated = paginatorNo.split("of");
		separated[1]=separated[1].replaceAll("[^0-9]", "");
		int totalPlayers=Integer.parseInt(separated[1]);
		System.out.println("Total Players "+totalPlayers);
		return totalPlayers;
		
	}
	
	public void verifyAndClickOptionBurgerBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that more burger button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnMoreBurger));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that more button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnMoreBurger));
	}
	public void verifyDownloadBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that download button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnDownload));
		
	}
	public void verifyUploadBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that upload button is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnUpload));
		
	}
	public void clickDownloadBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that download button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownload));
	}
	
	public void clickUploadBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that upload button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnUpload));
	
	
}
	public void clickDownloadSampleCsv()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that download sample csv is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownloadSampleCsv));
	
	
}}