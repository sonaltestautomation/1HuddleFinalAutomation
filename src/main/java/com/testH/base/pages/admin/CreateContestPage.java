package com.testH.base.pages.admin;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.google.common.base.Strings;
import com.testH.app.generic.Pojo;
import com.testH.base.desktopView.LeaderboardPageDesktopView;

public class CreateContestPage {
	
	String contestName="";
	String gameName="";	
	String status;
	String score_GamePlay;
	int score_onEndGame;
	//String liveContestName="Random Automation Contest-Live";
	String liveContestGamename="Automation Game for live contest";
	String playerName="";
	
	By loc_contesstIcon= By.xpath("//mat-icon[contains(text(),'card_giftcard')]");
	By loc_createContest= By.xpath("//p[contains(text(),' Create a Contest ')]");
	By loc_contestName= By.xpath("//input[@id='contest']");
	By loc_submitContestButton= By.xpath("//button[@type='submit']");
	By loc_createContestPopup=By.xpath("//div[contains(text(),'Create a Contest')]");
	By loc_contestLibrary= By.xpath("//p[contains(text(),' Contest Library ')]//parent::div//preceding-sibling::mat-icon");
	By loc_contestOptions= By.xpath("//div[contains(text(),'"+contestName+"')]/ancestor::div[@class='contest-wrapper']//preceding-sibling::div[@class='image-wrapper']//preceding-sibling::button/span/mat-icon");
	By loc_delete= By.xpath("//mat-icon[contains(text(),'delete')]");
	By loc_yesOption= By.xpath("//span[contains(text(),'YES')]");
	By loc_moveToDraft= By.xpath("//span[contains(text(),'Move to Draft')]");
	By loc_addGameInContestIcon= By.xpath("//mat-icon[text()='add']");
	By loc_searchGame= By.xpath("//input[@type='search']");
	By loc_selectGame= By.xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]");
	By loc_addGame= By.xpath("//span[contains(text(),'ADD TO CONTEST')]");
	By loc_rulesbutton= By.xpath("//mat-icon[contains(text(),' assignment ')]");
	By loc_rulesArea= By.xpath("//textarea[@name='contest-rules']");
	By loc_rewardbutton= By.xpath("//mat-icon[contains(text(),' assignment ')]//parent::div//following-sibling::div[1]");
	By loc_rewardCategoryDropdown= By.xpath("//input[@placeholder='Select Category']");
	By loc_done= By.xpath("//span[contains(text(),'DONE')]/parent::button");
	By loc_contestRewardDropdown= By.xpath("//input[@placeholder='Select Contest Reward']");
	By loc_addPlayers= By.xpath("//mat-icon[contains(text(),'person_add')]");
	By loc_locationDepartment= By.xpath("//div[@role='menu']");
	By loc_donePlayers= By.xpath("//mat-toolbar[contains(text(),'DONE')]");
	By loc_addchip= By.xpath("//input[@id='chips']");
	By loc_selectAll= By.xpath("//div[@class='select-all-checkbox']");
	By loc_schedule= By.xpath("//span[contains(text(),'SCHEDULE')]");
	By loc_contestConfirmationHeader= By.xpath("//div[contains(text(),' Contest Created ')]");
	By loc_contestConfirmationTitle= By.xpath("//span[contains(text(),'Congrats! You created a contest!')]");
	By loc_deleteGameFromContestIcon= By.xpath("//td[contains(text(),'"+gameName+"')]//parent::td/following-sibling::td[3]/child::div/child::mat-icon[contains(text(),'delete')]");
	By loc_gamesListAddedInContest= By.xpath("//tr[@class=\"game-row mat-row ng-star-inserted\"]//child::td//child::div[@class='delete-icon handCursor']");
	By loc_contestNameOnContestLibrary= By.xpath("//div[@class='contest-title']");
	By loc_rewardList= By.xpath("//mat-option[@role='option']//child::div//child::span");
	By loc_stopContest=By.xpath("//span[text()='Stop Contest']");
	By loc_gamesTab=By.xpath("//span[contains(text(),'GAMES')]//parent::div//parent::button/parent::mat-button-toggle");
	//By loc_contestFilter= By.xpath("//input[@id='chips']");
	By loc_contestFilter= By.xpath("//input[@id='chips']/following-sibling::div");
	//By loc_contestFilter= By.xpath("//input[@id='chips']");
	By loc_infoBlackScrLbContest=By.xpath("//div[contains(text(),'Gameplay in Progress.')]");


	
	private BuildSpGamePage objBuildSpGamePage=new BuildSpGamePage();
	private AllUsersPage objAllUsersPage= new AllUsersPage();
	private LeaderboardPageDesktopView objLeaderboardPageDesktopView=new LeaderboardPageDesktopView();
	public static HashMap<String, String> contestinfo = new HashMap<String, String>(); 
	public static HashMap<String, String> conteststatus = new HashMap<String, String>(); 
	ArrayList<WebElement> gamesInContest;
	ArrayList<String> list_rewardCategoryName;
	ArrayList<String> actualList_contestRewardName;
	public static HashMap<String, String> contestLeaderboardScore = new HashMap<>(); 
	public HashMap<String, Integer> globalLeaderboardScore = new HashMap<>(); 
	private ApiTestPage apitest= new ApiTestPage();
	String liveContestName=apitest.liveContestName.get("Live Contest Name");	
	
	By loc_contest_banner=By.xpath("//span[contains(text(),'"+liveContestName+"')]//ancestor::div[@class='contest-wrapper']/child::div[@class='contest-banner']/child::img");

	

	
	
	public void clickContestsIcon()
	{
		//Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_contesstIcon);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_contesstIcon, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify if contests icon is clicking", Pojo.getObjSeleniumFunctions().click(loc_contesstIcon));
	}
	public void clickCreateAContest()
	{
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify if create a contest menu is clicking", Pojo.getObjSeleniumFunctions().click(loc_createContest));
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_createContestPopup, 10);
		String actual_createContestPopupTitle= Pojo.getObjSeleniumFunctions().getText(loc_createContestPopup).trim();
		String expected_createContestPopupTitle= "Create a Contest";		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify title of create contest pop up", actual_createContestPopupTitle.equals(expected_createContestPopupTitle) );	
	}
	public void enterContestName()
	{	
		
		contestName= "Random Automation Contest "+Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 1000);
		Pojo.getObjSeleniumFunctions().waitFor(4);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify contest name is entered ", Pojo.getObjSeleniumFunctions().setText(loc_contestName, contestName));	
	    contestinfo.put("Contestname", contestName);
	}
	public void clickCreateContestButton()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on create contest button", Pojo.getObjSeleniumFunctions().click(loc_submitContestButton));
		Pojo.getObjSeleniumFunctions().waitFor(2);
	}
	public void clickContestLibrary()
	{
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on contest library", Pojo.getObjSeleniumFunctions().click(loc_contestLibrary));	
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Mouse hovering on company logo", Pojo.getObjSeleniumFunctions().mouseHover(By.xpath("//img[@class='logo small_name']")));
		setContestStatus();
	}
	public void setContestStatus()
	{
		contestName=contestinfo.get("Contestname");
		String status=Pojo.getObjSeleniumFunctions().isElementDisplayed(By.xpath("//div[contains(text(),'"+contestName+"')]/ancestor::div[@class='contest-wrapper']//preceding-sibling::div[@class='image-wrapper']//parent::figure//child::span[contains(text(),'DRAFT')]"))?"DRAFT"
				:Pojo.getObjSeleniumFunctions().isElementDisplayed(By.xpath("//div[contains(text(),'"+contestName+"')]/ancestor::div[@class='contest-wrapper']//preceding-sibling::div[@class='image-wrapper']//parent::figure//child::span[contains(text(),'READY')]"))?"READY"
				:Pojo.getObjSeleniumFunctions().isElementDisplayed(By.xpath("//div[contains(text(),'"+contestName+"')]/ancestor::div[@class='contest-wrapper']//preceding-sibling::div[@class='image-wrapper']//parent::figure//child::span[contains(text(),'LIVE')]"))?"LIVE"
		        :"ENDED";
		
		conteststatus.put(contestName, status);	
	}
	public String getContestStatus()
	{
		return conteststatus.get(contestinfo.get("Contestname"));
	}
    public void verifyContestStatus(String expected_ContestStatus )
    {
    	String actual_ContestStatus= getContestStatus();
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying contest status", actual_ContestStatus.equals(expected_ContestStatus));   	
    }	
	public void deleteContest()
	{
		System.out.println("Deleting Contest");
		status=getContestStatus();
		if(status.equalsIgnoreCase("DRAFT"))
		{
			moreContestOption();
			deleteOption();
			click_yesButtonOn_ConfirmationPopup();
		}
		else if(status.equalsIgnoreCase("READY"))
		{		
			moreContestOption();
			moveToDraftOption();
			deleteOption();
			click_yesButtonOn_ConfirmationPopup();			
			Pojo.getObjSeleniumFunctions().waitFor(2);
			moreContestOption();
			deleteOption();
			click_yesButtonOn_ConfirmationPopup();
		}		
	}
	public void moreContestOption()
	{
		Pojo.getObjSeleniumFunctions().waitFor(2);
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on contest option", Pojo.getObjSeleniumFunctions().click(loc_contestOptions));
		//By loc_deleteSuccessMsg=By.xpath("//span[contains(text(),'Contest Deleted Successfully')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on contest option", Pojo.getObjSeleniumFunctions().click(loc_contestOptions));
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on delete button", Pojo.getObjSeleniumFunctions().click(loc_delete));
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on Yes option", Pojo.getObjSeleniumFunctions().click(loc_yesOption));
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_deleteSuccessMsg, 10);
		//String actual_deleteValidationMessage=Pojo.getObjSeleniumFunctions().getText(loc_deleteSuccessMsg).trim();
		//String expected_deleteValidationMessage= "Contest Deleted Successfully.";
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying delete validation message", actual_deleteValidationMessage.equals(expected_deleteValidationMessage));
	}
	public void moveToDraftOption()
	{
		Pojo.getObjSeleniumFunctions().waitFor(1);
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on contest option", Pojo.getObjSeleniumFunctions().click(loc_contestOptions));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on move to draft option", Pojo.getObjSeleniumFunctions().click(loc_moveToDraft));
	}
	public void click_yesButtonOn_ConfirmationPopup()
	{
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on delete button", Pojo.getObjSeleniumFunctions().click(loc_delete));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on Yes option", Pojo.getObjSeleniumFunctions().click(loc_yesOption));
		Pojo.getObjSeleniumFunctions().waitFor(1);
	}
	public void verify_confirmationMessageOn_Movetodraft()
	{
		By loc_actualConfirmation=By.xpath("//span[contains(text(),'Contest moved to draft successfully')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_actualConfirmation, 10);
		String actual_moveToDraftValidationMessage=Pojo.getObjSeleniumFunctions().getText(loc_actualConfirmation).trim();
		String expected_moveToDraftValidationMessage= "Contest moved to draft successfully";
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying move to draft validation message", actual_moveToDraftValidationMessage.equals(expected_moveToDraftValidationMessage));
		Pojo.getObjSeleniumFunctions().waitFor(4);		
	}
	public void deleteOption()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on delete button", Pojo.getObjSeleniumFunctions().click(loc_delete));
	}
	public void verify_confirmationMessageOn_contestDeletion()
	{
		By loc_deleteValidationMessage=By.xpath("//span[contains(text(),'Contest Deleted Successfully')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_deleteValidationMessage, 10);
		String actual_deleteValidationMessage=Pojo.getObjSeleniumFunctions().getText(loc_deleteValidationMessage).trim();
		String expected_deleteValidationMessage= "Contest Deleted Successfully.";
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying delete validation message", actual_deleteValidationMessage.equals(expected_deleteValidationMessage));
	}
	public void addGameToContest()
	{	
		Pojo.getObjSeleniumFunctions().waitFor(15);
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_addGameInContestIcon, 10);
		//Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_addGameInContestIcon);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Adding game for contest", Pojo.getObjSeleniumFunctions().click(loc_addGameInContestIcon));
		Pojo.getObjSeleniumFunctions().waitFor(2);
		gameName=objBuildSpGamePage.expectedData.get("GameName").get(0);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Searching game for contest", Pojo.getObjSeleniumFunctions().setText(loc_searchGame, gameName));
		Pojo.getObjSeleniumFunctions().waitFor(4);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_selectGame, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Selecting game for contest", Pojo.getObjSeleniumFunctions().click(loc_selectGame));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Adding game in contest", Pojo.getObjSeleniumFunctions().click(loc_addGame));	
		gamesInContest= new ArrayList<WebElement>();
		List<WebElement> gamesAddedInContest= Pojo.getObjSeleniumFunctions().getWebElementList(loc_gamesListAddedInContest);
		for(WebElement game:gamesAddedInContest)
		{
			gamesInContest.add(game);
		}
	}
	public void addRulesRewardsPlayers(String rules,String rewardCategory,String contestReward)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on rules", Pojo.getObjSeleniumFunctions().click(loc_rulesbutton));
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjSeleniumFunctions().clearText(loc_rulesArea);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Entering rules", Pojo.getObjSeleniumFunctions().setText(loc_rulesArea, rules));
		contestinfo.put("Rules", rules);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on done rules", Pojo.getObjSeleniumFunctions().click(loc_done));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_rewardbutton,15);
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on rewards", Pojo.getObjSeleniumFunctions().click(loc_rewardbutton));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on reward category dropdown", Pojo.getObjSeleniumFunctions().click(loc_rewardCategoryDropdown));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		By loc_rewardCategory= By.xpath("//span[contains(text(),'"+rewardCategory+"')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Selecting reward category", Pojo.getObjSeleniumFunctions().click(loc_rewardCategory));
		contestinfo.put("Reward Category", rewardCategory);
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Selecting contest reward dropdown", Pojo.getObjSeleniumFunctions().click(loc_contestRewardDropdown));
		By loc_contestReward= By.xpath("//span[contains(text(),'"+contestReward+"')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Selecting contest reward", Pojo.getObjSeleniumFunctions().click(loc_contestReward));
		contestinfo.put("Contest Reward", contestReward);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_done, 15);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on done rewards", Pojo.getObjSeleniumFunctions().click(loc_done));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on add players", Pojo.getObjSeleniumFunctions().click(loc_addPlayers));
		Pojo.getObjSeleniumFunctions().waitFor(4);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on add chip", Pojo.getObjSeleniumFunctions().click(loc_addchip));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Mouse hover on location", Pojo.getObjSeleniumFunctions().mouseHover(loc_locationDepartment));
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Selecting all locations", Pojo.getObjSeleniumFunctions().click((loc_selectAll)));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on done location", Pojo.getObjSeleniumFunctions().click(loc_donePlayers));	
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on add chip", Pojo.getObjSeleniumFunctions().click(loc_addchip));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Mouse hover on department", Pojo.getObjSeleniumFunctions().mouseHover(loc_locationDepartment));
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Selecting all departments", Pojo.getObjSeleniumFunctions().click((loc_selectAll)));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on done department", Pojo.getObjSeleniumFunctions().click(loc_donePlayers));
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on done add players", Pojo.getObjSeleniumFunctions().click(loc_done));	
		Pojo.getObjSeleniumFunctions().waitFor(1);
	}
	public void clickOnScheduleButton()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on schedule button", Pojo.getObjSeleniumFunctions().click(loc_schedule));
	}
	public void verifyConfirmationPopup()
	{
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_contestConfirmationHeader, 10);
		String actual_confirmationHeader= Pojo.getObjSeleniumFunctions().getText(loc_contestConfirmationHeader).trim();
		String expected_confirmationHeader= "Contest Created";
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying confirmation popup header", actual_confirmationHeader.equals(expected_confirmationHeader));		
		String actual_confirmationTitle= Pojo.getObjSeleniumFunctions().getText(loc_contestConfirmationTitle).trim();
		String expected_confirmationTitle= "Congrats! You created a contest!";
		System.out.println(expected_confirmationTitle);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying confirmation popup title", actual_confirmationTitle.equals(expected_confirmationTitle));		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on OK", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[contains(text(),'OK')]")));	
		setContestStatus();	
	}
	public void click_ContestFilter()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_contestFilter, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking add a filter button", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_contestFilter));
	}
	public void enter_ContestName_inContestFilter()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on contest option", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[text()=' Contest ']")));
		//Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(By.xpath("//input[@placeholder='Enter Contest Name']"));
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Entering contest name in contest filter", Pojo.getObjSeleniumFunctions().setText(By.xpath("//input[@placeholder='Enter Contest Name']"), contestName));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Click on done button of filter", Pojo.getObjSeleniumFunctions().click(By.xpath("//mat-icon[contains(text(),'done')]")));
		setContestStatus();	
	}
	public void select_contestState_inStateFilter()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on state filter", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[contains(text(),'State')]")));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Selecting reday state", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[contains(text(),'Ready')]")));				
		setContestStatus();	
	}
	public void verify_ContestOnContestLibrary_Page()
	{
		String actual_contest=Pojo.getObjSeleniumFunctions().getText(By.xpath("//div[contains(text(),'"+contestName+"')]")).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying correct contest is displayed",actual_contest.equals(contestName));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Closing filter", Pojo.getObjSeleniumFunctions().click(By.xpath("//mat-icon[contains(text(),'cancel')]")));
	}
	public void clickOn_DeleteGame_InContestIcon()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on delete game from contest icon", Pojo.getObjSeleniumFunctions().click(loc_deleteGameFromContestIcon));
	}
	public void deleteGame_FromContest_ConfirmationPopup()
	{
		String actual_confirmationText=Pojo.getObjSeleniumFunctions().getText(By.xpath("//div[contains(text(),'remove this game from contest?')]")).trim();
		String expected_confirmationText="Are you sure you want to remove this game from contest?";
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying text on delete game from contest confirmation popup", actual_confirmationText.equals(expected_confirmationText));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on yes button on confirmation popup", Pojo.getObjSeleniumFunctions().click(loc_yesOption));
		Pojo.getObjSeleniumFunctions().waitFor(1);
	}
	public void verify_gameIsDeletedFromContest()
	{
		assertFalse(gamesInContest.contains(gameName));		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if game is deleted from contest page", Pojo.getObjSeleniumFunctions().checkElementNOTDisplayed(By.xpath("//td[contains(text(),'"+gameName+"')]")));
	}
	public void verify_contestIsDisplayed_OnWebApp()
	{
		Pojo.getObjSeleniumFunctions().waitFor(8);
		List<WebElement> contestListOnWebapp= Pojo.getObjSeleniumFunctions().getWebElementList(By.xpath("//div[@class='contest-items']/span[1]"));
		ArrayList<String> contestNameList= new ArrayList<String>();
		for(WebElement contest:contestListOnWebapp)
		{
			String contestNameFromWebapp=contest.getText().trim();
			contestNameList.add(contestNameFromWebapp);		
		}
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if correct contest is displayed on webapp",contestNameList.contains(contestName));			
	}
	public void verify_commingSoonlabel()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying COMMING SOON label for contest on webapp", Pojo.getObjSeleniumFunctions().isElementDisplayed(By.xpath("//span[contains(text(),'"+contestName+"')]/ancestor::div[@class='contest-properties']/preceding-sibling::div/child::span[contains(text(),'COMING SOON')]")));
	}
	public void verify_RulesRewards_OnWebApp()
	{
		By loc_actualRule=By.xpath("//span[contains(text(),'"+contestName+"')]/parent::div/child::div/span/following-sibling::p");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_actualRule, 15);
		Pojo.getObjSeleniumFunctions().waitFor(2);
		String actual_Rule= Pojo.getObjSeleniumFunctions().getText(loc_actualRule).trim();
		String expected_Rule= contestinfo.get("Rules");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying rules for contest on web app", actual_Rule.equals(expected_Rule));	
		String actual_Reward= Pojo.getObjSeleniumFunctions().getText(By.xpath("//span[contains(text(),'"+contestName+"')]/parent::div/following-sibling::div/descendant::div[5]/span")).trim();
		String expected_Reward= contestinfo.get("Reward Category");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying rwards for contest on web app", actual_Reward.equals(expected_Reward));				
	}
	public void verify_launchContestButton()
	{
		By loc_launchContestButton=By.xpath("//span[contains(text(),'"+contestName+"')]/ancestor::div[@class='contest-properties']/preceding-sibling::div/child::button[contains(text(),'LAUNCH CONTEST')]");	
		boolean status=Pojo.getObjSeleniumFunctions().getAttribute(loc_launchContestButton, "class").contains("contestDisable");		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if launch contest button is disabled for ready contest",status==true);
	}
	public void verify_createContestButton_Disabled()
	{
		boolean status= Pojo.getObjSeleniumFunctions().checkElementEnabled(loc_submitContestButton);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying is create contest button is disabled if contest name field is blank", status==false);		
	}
	public void verify_confirmationPopupOn_Schedule_BlankFields()
	{
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying pop up title", Pojo.getObjSeleniumFunctions().checkElementDisplayed(By.xpath("//div[contains(text(),'Contest Incomplete')]")));
		String blank_rule= Pojo.getObjSeleniumFunctions().getText(By.xpath("//span[contains(text(),'rules')]/preceding-sibling::mat-icon"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if cross sign for blank rule is displayed", blank_rule.equals("close"));
		String blank_reward= Pojo.getObjSeleniumFunctions().getText(By.xpath("//span[contains(text(),'reward')]/preceding-sibling::mat-icon"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if cross sign for blank reward is displayed", blank_reward.equals("close"));
		//String blank_game= Pojo.getObjSeleniumFunctions().getText(By.xpath("//span[contains(text(),' at least one (1) game')]/preceding-sibling::mat-icon"));
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if cross sign for blank game is displayed", blank_game.equals("close"));
		String blank_player= Pojo.getObjSeleniumFunctions().getText(By.xpath("//span[contains(text(),'players selected')]/preceding-sibling::mat-icon"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if cross sign for blank player is displayed", blank_player.equals("close"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on ok button", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[contains(text(),'OK')]")));
	}
	public void click_on_RewardButton()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on rewards", Pojo.getObjSeleniumFunctions().click(loc_rewardbutton));		
	}
	public void click_on_RewardCategoryDropdown()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on reward category dropdown", Pojo.getObjSeleniumFunctions().click(loc_rewardCategoryDropdown));
	}
	public void verify_rewardCategories()
	{
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_rewardList, 15);
		List<WebElement> list_rewardCategory=Pojo.getObjSeleniumFunctions().getWebElementList(loc_rewardList);
		
		
		list_rewardCategoryName= new ArrayList<String>();
		for(WebElement ele_category:list_rewardCategory)
		{
			String rewardCategoryName=ele_category.getText().trim();
			list_rewardCategoryName.add(rewardCategoryName);		
		}
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward categories", list_rewardCategoryName.get(0).equals("Cash"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward categories", list_rewardCategoryName.get(1).equals("Experiences"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward categories", list_rewardCategoryName.get(2).equals("Health & Fitness"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward categories", list_rewardCategoryName.get(3).equals("Personal Development"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward categories", list_rewardCategoryName.get(4).equals("Recognition"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward categories", list_rewardCategoryName.get(5).equals("Swag"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward categories", list_rewardCategoryName.get(6).equals("Team Building"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward categories", list_rewardCategoryName.get(7).equals("Time Off"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward categories", list_rewardCategoryName.get(8).equals("Travel"));		
	}
	public void selectAndVerifyRewardCategoryFromDropdown(String Category)
	{
		click_on_RewardCategoryDropdown();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on reward category", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[contains(text(),'"+Category+"')]")));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Selecting contest reward dropdown", Pojo.getObjSeleniumFunctions().click(loc_contestRewardDropdown));
		List<WebElement> list_contestReward=Pojo.getObjSeleniumFunctions().getWebElementList(loc_rewardList);
		actualList_contestRewardName= new ArrayList<String>();
		/*
		 * for(WebElement ele_reward:list_contestReward) { String
		 * rewardName=ele_reward.getText();
		 * actualList_contestRewardName.add(rewardName); }
		 */
		
		list_contestReward.forEach(ele_reward->{
			String rewardName=ele_reward.getText();
						actualList_contestRewardName.add(rewardName);
			});	
		if(Category.equalsIgnoreCase("Cash"))
		{
			ArrayList <String> expectedList_cash_contestRewardName= new ArrayList<String>();	
			expectedList_cash_contestRewardName.addAll(Arrays.asList("Custom","Cash Money","Donation to a Charity","Gift Card","Java Jolt","Lottery Tickets"));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward list of cash category", actualList_contestRewardName.equals(expectedList_cash_contestRewardName));			
		}
		else if(Category.equalsIgnoreCase("Experiences"))
		{
			ArrayList <String> expectedList_experiences_contestRewardName= new ArrayList<String>();	
			expectedList_experiences_contestRewardName.addAll(Arrays.asList("Custom","Babysitting","Boss Meal","Brewery Tour","Bring a Pet to Work","Car Service","Casual Day","Cheers","Concert Tickets","Dinner for Two","DJ for the Day","Extreme Adventure","Free Delivery Experience","Home Service","Local Attractions","Manicure & Pedicure","Museum Membership","Nap time","New Voicemail","Painting Class","Passes","Pet Sitting","Private Chef","Redecorate Your Office","Restaurant Gift Card","Shopping Spree","Skiing","Spa Day","Sporting Event Tickets","Subscription Box","VIP Tickets","Wine Tasting"));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward list of experiences category", actualList_contestRewardName.equals(expectedList_experiences_contestRewardName));			
		}
		else if(Category.equalsIgnoreCase("Health & Fitness"))
		{
			ArrayList <String> expectedList_Health_contestRewardName= new ArrayList<String>();	
			expectedList_Health_contestRewardName.addAll(Arrays.asList("Custom","Bike Share","Gym Membership","Meditation Break","Personal Training Sessions","Yoga Class"));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward list of Health & Fitness category", actualList_contestRewardName.equals(expectedList_Health_contestRewardName));			
		}
		else if(Category.equalsIgnoreCase("Personal Development"))
		{
			ArrayList <String> expectedList_PDevelopment_contestRewardName= new ArrayList<String>();	
			expectedList_PDevelopment_contestRewardName.addAll(Arrays.asList("Custom","Audible Membership","Book","Conference","LinkedIn Recommendation","LinkedIn Subscription","Master Class","Membership","Online Course","Seminar","Subscription"));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward list of Personal Development category", actualList_contestRewardName.equals(expectedList_PDevelopment_contestRewardName));			
		}
		else if(Category.equalsIgnoreCase("Recognition"))
		{
			ArrayList <String> expectedList_Recognition_contestRewardName= new ArrayList<String>();	
			expectedList_Recognition_contestRewardName.addAll(Arrays.asList("Custom","A Thank You Note","Bragging Rights","Corner Office","High Five","Manager's Office","Public Shoutout","Social Media Shoutout","Trophy"));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward list of Recognition category", actualList_contestRewardName.equals(expectedList_Recognition_contestRewardName));			
		}
		else if(Category.equalsIgnoreCase("Swag"))
		{
			ArrayList <String> expectedList_Swag_contestRewardName= new ArrayList<String>();	
			expectedList_Swag_contestRewardName.addAll(Arrays.asList("Custom","Amazon Prime Subscription","Apple Watch","Art","Bag","Camera","Hat","Headphones","Home Entertainment Upgrade","Hoodie","iPad","Magazine Subscription","Memorabilia","Mini Fridge","Mug","Music Subscription","New Car","New Laptop","Notebook","Office Upgrade","Pajama Day","Personalized Stationary","Pick Your Own","Reading Device","Sneakers","Speakers","Sports Swag","Streaming TV Subscription","Suit Up","Sunglasses","Swag Basket","T-Shirt","Upgrade an Office Item","Watch","Water Bottle"));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward list of Swag category", actualList_contestRewardName.equals(expectedList_Swag_contestRewardName));			
		}
		else if(Category.equalsIgnoreCase("Team Building"))
		{
			ArrayList <String> expectedList_Team_Building_contestRewardName= new ArrayList<String>();	
			expectedList_Team_Building_contestRewardName.addAll(Arrays.asList("Custom","Barbeque","Executive Assistant for the Week","Field Day","Happy Hour","Mini Golf","Movie Day in Office","Office Perks","Party/Activity","Personalized Gift","Pizza Party","Team Lunch","Team Movie Outing"));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward list of Team Building category", actualList_contestRewardName.equals(expectedList_Team_Building_contestRewardName));			
		}
		else if(Category.equalsIgnoreCase("Time Off"))
		{
			ArrayList <String> expectedList_Time_Off_contestRewardName= new ArrayList<String>();	
			expectedList_Time_Off_contestRewardName.addAll(Arrays.asList("Custom","Day Off","Extra PTO","Late Start","Laundry Service","Leave Early","Out of Office","Sleep-in Day","Weekend Away","Work from Home Day"));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward list of Time Off category", actualList_contestRewardName.equals(expectedList_Time_Off_contestRewardName));			
		}
		else if(Category.equalsIgnoreCase("Travel"))
		{
			ArrayList <String> expectedList_Travel_contestRewardName= new ArrayList<String>();	
			expectedList_Travel_contestRewardName.addAll(Arrays.asList("Custom","All-Inclusive Package","Cruise","Day on the Water","Jet Set","Luggage","Paid Vacation","Transit Pass","Uber or Lyft Gift Card","VIP Parking"));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying reward list of Time Off category", actualList_contestRewardName.equals(expectedList_Travel_contestRewardName));			
		}
	}
	public void verify_Contest_NewLabel()
	{
		System.out.println("Live Contest Name "+liveContestName);
		By loc_labelContest=By.xpath("//span[contains(text(),'"+liveContestName+"')]//ancestor::div[@class='contest-properties']//preceding-sibling::div//child::span[contains(text(),'NEW')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_labelContest, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if new label is displyed for new contest on web app", Pojo.getObjSeleniumFunctions().isElementDisplayed(loc_labelContest));
	}
	public void verify_launchContestButtonforLiveContest()
	{		 
		while (Pojo.getObjSeleniumFunctions().checkElementNOTDisplayed(By.xpath("//span[contains(text(),'"+liveContestName+"')]/ancestor::div[@class='contest-properties']/preceding-sibling::div/child::span[contains(text(),'COMING SOON')]"))==false) 
		{
			Pojo.getObjSeleniumFunctions().pageRefresh();
		}
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if launch contest is enabled for live contest", Pojo.getObjSeleniumFunctions().checkElementEnabled(By.xpath("//span[contains(text(),'"+liveContestName+"')]//ancestor::div[@class='contest-properties']//preceding-sibling::div//child::button[contains(text(),'LAUNCH CONTEST')]")));		
	}
	public void click_launchContestButton()
	{		
		Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(By.xpath("//mat-spinner[@role='progressbar']"), 2000);
		Pojo.getObjSeleniumFunctions().waitForPageLoad(2);	
		By loc_btnLaunchContest=By.xpath("//span[contains(text(),'"+liveContestName+"')]//ancestor::div[@class='contest-properties']//preceding-sibling::div//span[contains(text(),'NEW')]//following-sibling::button[contains(text(),'LAUNCH CONTEST')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnLaunchContest, 15);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_contest_banner, 20);
		
	//	Pojo.getObjSeleniumFunctions().waitFor(5);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on launch contest button for Live Contest", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[contains(text(),'"+liveContestName+"')]//ancestor::div[@class='contest-properties']//preceding-sibling::div//child::button[contains(text(),'LAUNCH CONTEST')]")));
	}
	
	public void waitForBannerImageToLoad()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_contest_banner, 30);
		Pojo.getObjSeleniumFunctions().waitFor(5);

	}
	public void click_launchButtonForExistingContest(String existingContest)
	{		
		Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(By.xpath("//mat-spinner[@role='progressbar']"), 2000);
		Pojo.getObjSeleniumFunctions().waitForPageLoad(2);
		By loc_existingContest=By.xpath("//span[contains(text(),'"+existingContest+"')]//ancestor::div[@class='contest-properties']//preceding-sibling::div//child::button[contains(text(),'LAUNCH CONTEST')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_existingContest, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on launch contest button for Live Contest", Pojo.getObjSeleniumFunctions().click(loc_existingContest));
	}
	public void click_GamesTab()
	{
//		WebElement myElement = Pojo.getDriver().findElement(loc_gamesTab);
//		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gamesTab, 15);
//		JavascriptExecutor js = (JavascriptExecutor)Pojo.getDriver();
//		 js.executeScript("arguments[0].click();",myElement);
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gamesTab, 15);
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that games tab is clicking", Pojo.getObjSeleniumFunctions().click(loc_gamesTab));
	}
	public void verify_gameIsDisplayedUnderLiveContest()
	{
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifyng if game which is added in the live contest is displayed under contest in web app", Pojo.getObjSeleniumFunctions().isElementDisplayed(By.xpath("//mat-card-title[contains(text(),'"+liveContestGamename+"')]")));
	}
	public void verify_messageOnLB_forFirstTime()
	{
		String expected_LBMessage= "Gameplay in Progress.Play Now to join the Leaderboard!";
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_infoBlackScrLbContest, 10);
		String actual_LBMessage=Pojo.getObjSeleniumFunctions().getText(loc_infoBlackScrLbContest).replace("\n", "").trim();
		System.out.println("Actual LB Message "+actual_LBMessage);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying message on leaderboard when player is playing for the first time", actual_LBMessage.equals(expected_LBMessage));		
	}
	public String scoreOnContestLB(String existingPlayer)
	{
		String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
		String playerLastName=AllUsersPage.expectedDataUser.get("LastName");
		playerName=playerFirstName+" "+playerLastName;
		String player=Strings.isNullOrEmpty(playerFirstName)?existingPlayer:playerName;
		if(Pojo.getObjSeleniumFunctions().isElementDisplayed(By.xpath("//mat-card-title[contains(text(),'"+player+"')]//parent::div")))
		{
			
			//String player=Strings.isNullOrEmpty(playerFirstName)?existingPlayer:playerName;  //If playerFirstName is null then take existingPlayer ow take playerName
			score_GamePlay= Pojo.getObjSeleniumFunctions().getText(By.xpath("//mat-card-title[contains(text(),'"+player+"')]//parent::div//following-sibling::mat-card-title")).trim().replaceAll("[^0-9]", "");					
			contestLeaderboardScore.put("score_contestLB", score_GamePlay);	
			contestLeaderboardScore.put("player_name", player);	
			return score_GamePlay;
		}
		contestLeaderboardScore.put("player_name", player);	
		return null;
	}
	public void scoreOnGlobalLB(String existingUser)
	{
		int score_GlobalLB=objLeaderboardPageDesktopView.getLeaderboardPoint(existingUser);
		if(globalLeaderboardScore.isEmpty())
		{
			globalLeaderboardScore.put("scoreLbBefore", score_GlobalLB);
		}
		else
		{
			globalLeaderboardScore.put("scoreLbAfter", score_GlobalLB);
		}	
	}
	public void click_contestBack()
	{
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on back contest button", Pojo.getObjSeleniumFunctions().click(By.xpath("//div[@class='backBtnContestGame']")));
		Pojo.getObjSeleniumFunctions().waitFor(3);
	}
	public void clickon_game(String liveGame)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on game in the contest", Pojo.getObjSeleniumFunctions().click(By.xpath("//mat-card-title[contains(text(),'"+liveGame+"')]")));
	}
	public void close_trophies()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Closing all the trophies after contest game play", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[contains(text(),'close')]")));
		Pojo.getObjSeleniumFunctions().waitFor(2);
	}
	public void clickon_homeButton_scoreOn_gameOverScreen()
	{
		score_onEndGame=Integer.valueOf(Pojo.getObjSeleniumFunctions().getText(By.xpath("//div[@class='customRow centerAlign gameScore']//child::span")).trim());
		System.out.println("Score on end game:"+score_onEndGame);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on home button on game over screen", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[contains(text(),'HOME')]")));
	}
	public void click_gamesTabPlayerApp()
	{
		Pojo.getObjSeleniumFunctions().waitFor(4);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on games tab in palyer app", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[contains(text(),'Games')]")));
	}
	public void verify_scoreOnContestLB()
	{
		if(Pojo.getObjSeleniumFunctions().checkElementNOTDisplayed(By.xpath("//mat-card[contains(@class,'contestCardLeaderboard mat-card')]")))
		{
			Pojo.getObjSeleniumFunctions().pageRefresh();	
			Pojo.getObjSeleniumFunctions().waitForPageLoad(7);
		}		
		CreateContestPage contestPage= new CreateContestPage();
		int score_beforeGamePlay=Strings.isNullOrEmpty(contestLeaderboardScore.get("score_contestLB"))?0:Integer.valueOf(contestLeaderboardScore.get("score_contestLB"));
		int expected_scoreafterGamePlay= score_beforeGamePlay + score_onEndGame;
		System.out.println("Contest LB:expected scoreafterGamePlay" + expected_scoreafterGamePlay);
		By loc_actualScore=By.xpath("//mat-card-title[contains(text(),'"+contestLeaderboardScore.get("player_name")+"')]//parent::div//following-sibling::mat-card-title");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_actualScore, 10);
		int actual_scoreafterGamePlay=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_actualScore).trim().replaceAll("[^0-9]", ""));
		System.out.println("Contest LB:actual scoreafterGamePlay" + actual_scoreafterGamePlay);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying score on the LB after game play", actual_scoreafterGamePlay==expected_scoreafterGamePlay);				
	}
	public void verify_scoreOnGlobalLB()
	{
		int globalScore_beforeGamePlay=globalLeaderboardScore.get("scoreLbBefore");
		System.out.println("Global LB:expected scoreBeforeGamePlay" + globalScore_beforeGamePlay);
		int expected_globalScoreafterGamePlay= globalScore_beforeGamePlay + score_onEndGame;
		System.out.println("Global LB:expected scoreafterGamePlay" + expected_globalScoreafterGamePlay);
		int actual_globalScoreafterGamePlay=globalLeaderboardScore.get("scoreLbAfter");
		System.out.println("Global LB:actual scoreafterGamePlay" + actual_globalScoreafterGamePlay);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying score on the global LB after game play", actual_globalScoreafterGamePlay==expected_globalScoreafterGamePlay);		
	}
	public void playerNameOnContestLB()
	{
		String actual_playername= Pojo.getObjSeleniumFunctions().getText(By.xpath("//mat-card-title[contains(text(),'"+contestLeaderboardScore.get("player_name")+"')]")).trim();
		String expected_playername= contestLeaderboardScore.get("player_name");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying player name on contest LB", actual_playername.equals(expected_playername));
	}
	public void clickPlayerOnContestLB()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on player on contest LB", Pojo.getObjSeleniumFunctions().click(By.xpath("//mat-card-title[contains(text(),'"+contestLeaderboardScore.get("player_name")+"')]")));
	}
	public void playerProfilePage()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying player's profile page is opening", Pojo.getObjSeleniumFunctions().checkElementDisplayed(By.xpath("//span[contains(text(),'PROFILE')]")));
		Pojo.getObjSeleniumFunctions().waitFor(2);
	}
	public void playerScoreContestLBAndPlayerProfile()	
	{
		String score_playerProfile= Pojo.getObjSeleniumFunctions().getText(By.xpath("//span[contains(text(),'TOTAL POINTS')]//preceding-sibling::span")).trim();
		String score_contestLB= contestLeaderboardScore.get("score_contestLB");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if score on contest LB and plyaer's profile is same", score_playerProfile.equals(score_contestLB));
	}

	public void refreshPageTillContestVisibilty() {
		while (Pojo.getObjSeleniumFunctions().isElementDisplayed(By.xpath("//span[contains(text(),'"+liveContestName+"')]/ancestor::div[@class='contest-properties']/preceding-sibling::div/child::span[contains(text(),'COMING SOON')]"))== true) {
			Pojo.getObjSeleniumFunctions().pageRefresh();
		}
	}
	public void moreOption()
	{
		    Pojo.getObjSeleniumFunctions().waitFor(3);
			Pojo.getObjSeleniumFunctions().click(By.xpath("//span[normalize-space()='More']"));	
			Pojo.getObjSeleniumFunctions().waitFor(2);
	}
	public void verify_playersRankOnContestLB()
	{
		String player_fName=objAllUsersPage.expectedDataUser.get("FirstName");
		int player1_Score=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(By.xpath("//mat-card-title[contains(text(),'Player Automation')]//following::mat-card-title[contains(text(),'100')]")));
		int player2_Score=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(By.xpath("//mat-card-title[contains(text(),'"+player_fName+"')]//following::mat-card-title[contains(text(),'0')]")));
		int player1_Rank=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(By.xpath("//mat-card-title[contains(text(),'Player Automation')]//parent::div//preceding-sibling::div//parent::div//preceding-sibling::mat-card-title")));
		int player2_Rank=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(By.xpath("//mat-card-title[contains(text(),'"+player_fName+"')]//parent::div//preceding-sibling::div//parent::div//preceding-sibling::mat-card-title")));
		
		if(player1_Score>player2_Score)
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying player's rank", player1_Rank<player2_Rank);
		}
		else
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying player's rank", player1_Rank>player2_Rank);
		}
	}
	public void verify_grayedOutGames()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if game is grayed out after daily 1 attempt", Pojo.getObjSeleniumFunctions().checkElementDisplayed(By.xpath("//mat-icon[@aria-hidden='true']")));
	}
	public void moreLiveContestOption()
	{
		while (Pojo.getObjSeleniumFunctions().isElementDisplayed(By.xpath("//div[contains(text(),'"+liveContestName+"')]/ancestor::figure/child::span[contains(text(),'LIVE')]"))== false) 
		{
			Pojo.getObjSeleniumFunctions().pageRefresh();
		}
		Pojo.getObjSeleniumFunctions().waitFor(1);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on more option for contest", Pojo.getObjSeleniumFunctions().click(By.xpath("//div[contains(text(),'"+liveContestName+"')]/ancestor::div[@class='contest-wrapper']//preceding-sibling::div[@class='image-wrapper']//preceding-sibling::button/span/mat-icon")));
	}
	public void stopContest()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on stop contest button", Pojo.getObjSeleniumFunctions().click(loc_stopContest));
	}
	public void endContestNowOption()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on stop contest button", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[text()='END NOW']")));
	}
	public void verify_contestEndValidation()
	{
		String exp_validation="Contest ended successfully.";
		By loc_successContestEnd=By.xpath("//span[text()='Contest ended successfully.']");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_successContestEnd, 15);
		String act_validation=Pojo.getObjSeleniumFunctions().getText(loc_successContestEnd).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying contest ended validation message", exp_validation.equals(act_validation));
	}
	public void verify_endedContestStatus()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying contest status", Pojo.getObjSeleniumFunctions().isElementDisplayed(By.xpath("//div[contains(text(),'"+liveContestName+"')]/ancestor::div[@class='contest-wrapper']//preceding-sibling::div[@class='image-wrapper']//parent::figure//child::span[contains(text(),'ENDED')]")));
	}
	public void clickonLBOfEndedContest()
	{
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Clicking on LB of ended contest", Pojo.getObjSeleniumFunctions().click(By.xpath("//span[contains(text(),'"+liveContestName+"')]//ancestor::div[@class='contest-properties']//preceding-sibling::div//child::button[contains(text(),' LEADERBOARD')]")));
		Pojo.getObjSeleniumFunctions().waitFor(2);
	}
	public void youWonTrophy()
	{
		String actual_contestNameOnYouWonTrophy=null;
		By loc_contestNameOnTrophy=By.xpath("//span[contains(text(),'"+liveContestName+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_contestNameOnTrophy, 10);
		String contestNameOnYouWonTrophy=Pojo.getObjSeleniumFunctions().getText(loc_contestNameOnTrophy).trim();
		if(contestNameOnYouWonTrophy.trim().endsWith("CONTEST"))
		{
		   actual_contestNameOnYouWonTrophy=contestNameOnYouWonTrophy.substring(0, contestNameOnYouWonTrophy.length()-7).trim();
		}
		else
		{
			actual_contestNameOnYouWonTrophy=contestNameOnYouWonTrophy;
		}
		System.out.println("Actual Contest Name You Won Trophy "+actual_contestNameOnYouWonTrophy);
		System.out.println("Live Contest Name "+liveContestName);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if contest name is correct on YOU WON trophy",actual_contestNameOnYouWonTrophy.equalsIgnoreCase(liveContestName));
		Pojo.getObjSeleniumFunctions().waitFor(2);
		By loc_btnClose=By.xpath("//span[contains(text(),'close')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnClose, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Closing You WOn trophy ", Pojo.getObjSeleniumFunctions().click(loc_btnClose));
	}
	public void rewardTrophy()
	{
		By loc_titleTrophyAchieved=By.xpath("//span[contains(text(),'TROPHY ACHIEVED!')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleTrophyAchieved, 10);
		String actualTrophyAchieved= Pojo.getObjSeleniumFunctions().getText((loc_titleTrophyAchieved)).trim();
		String expectedTrophyAchieved= "TROPHY ACHIEVED!";
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying trophy achieved text", actualTrophyAchieved.equals(expectedTrophyAchieved));
		
		String actualRewardUnlocked= Pojo.getObjSeleniumFunctions().getText(By.xpath("//span[contains(text(),'REWARD UNLOCKED')]"));
		String expectedRewardUnlocked= "REWARD UNLOCKED";
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying trophy achieved text", actualRewardUnlocked.equals(expectedRewardUnlocked));
		
		//String contestNameOnYouWonTrophy=Pojo.getObjSeleniumFunctions().getText(By.xpath("//span[contains(text(),'"+liveContestName+"')]"));
		String contestNameOnYouWonTrophy=Pojo.getDriver().findElement(By.xpath("//span[contains(text(),'"+liveContestName+"')]")).getAttribute("innerHTML");
		System.out.println(contestNameOnYouWonTrophy);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verifying if contest name is correct on YOU WON trophy",contestNameOnYouWonTrophy.equals(liveContestName));

	}
	
	
}
