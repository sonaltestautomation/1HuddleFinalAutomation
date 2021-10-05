package com.testH.base.pages.admin;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;

public class DashboardPage {
	
	public static HashMap<String, Integer> gamePlayCountDashboard = new HashMap<String, Integer>();
	public static HashMap<String, Integer> trophiesCountDashboard = new HashMap<String, Integer>();
	public static HashMap<String, Integer> participationCountDashboard = new HashMap<String, Integer>();
	
	public static HashMap<String, HashMap<String, Integer>> gamesPlayedTrophiesParticipationCountDashboard = new HashMap<String, HashMap<String, Integer>>();

	


	By loc_1hLogo=By.xpath("//img[@alt='1Huddle']");
	By loc_dashboardText=By.xpath("//li[contains(text(),'Dashboard')]");
	By loc_1huddleCompanyName=By.xpath("//div[contains(text(),'1huddle')]");
	By loc_btnSettings=By.xpath("//p[contains(text(),'Settings')]");
	By loc_btnLeaderboard=By.xpath("//p[contains(text(),'Leaderboard')]");
	By loc_btnReport=By.xpath("//p[text()=' Reports ']");

	By loc_btnQuestions=By.xpath("//p[contains(text(),'Questions')]");
	By loc_btnVipCode=By.xpath("//p[contains(text(),'VIP Codes')]");
	By loc_iconSettings=By.xpath("//mat-icon[contains(text(),'build')]");
	By loc_sideMenuNav=By.xpath("//app-sidenav//div[contains(@class,'sidenav')]");
	By loc_btnAttempts=By.xpath("//p[contains(text(),'Attempts')]");
	By loc_gameIcon=By.xpath("//mat-icon[text()='videogame_asset']");
	By loc_Games=By.xpath("//p[text()=' Games ']");
	By loc_textPlayeFeedback=By.xpath("//p[contains(text(),'Player Feedback')]");
	By loc_textTrophies=By.xpath("//a[@href='/admin/trophy']/child::mat-list-item");
	By loc_btnAddFilter=By.xpath("//input[@id='chips']");
	By loc_textBoxSearchBox=By.xpath("//input[@name='search-key']");
	By loc_searchedResult=By.xpath("//input[@name='search-key']/parent::form/following-sibling::div");
	By loc_btnDownArrowTime=By.xpath("//div[@class='mat-select-arrow']");
	By loc_practiveGamePoints=By.xpath("//mat-card-subtitle[contains(text(),'PRACTICE GAMES')]//following-sibling::mat-card-subtitle");
	By loc_liveGameCount=By.xpath("//mat-card-subtitle[contains(text(),'LIVE GAMES')]//following-sibling::mat-card-subtitle");
	By loc_gamesPlayedCount=By.xpath("//mat-card-subtitle[contains(text(),'GAMES PLAYED')]//following-sibling::mat-card-subtitle");

	By loc_trophyAchievedCount=By.xpath("//mat-card-subtitle[contains(text(),'TROPHIES ACHIEVED')]//following-sibling::mat-card-subtitle");
	By loc_participationCount=By.xpath("//mat-card-subtitle[contains(text(),'PARTICIPATION')]//following-sibling::mat-card-subtitle");
	By loc_iconDashboard=By.xpath("//mat-icon[contains(text(),'dashboard')]");
	By loc_textBoxDashboard=By.xpath("//input[@type='search']");
	By loc_textBoxGameName=By.xpath("//input[@name='search-key']");

	By loc_btnSearchedResult=By.xpath("//div[@class='list-item-name']");
	By loc_btnSelectAll=By.xpath("//div[@class='select-all-checkbox']");

	By loc_btnDone=By.xpath("//mat-toolbar[contains(text(),'DONE')]");
	By loc_listDuration=By.xpath("//mat-option[contains(@id,'mat-option')]");
	By loc_btnDashboardIcon=By.xpath("//mat-icon[text()='dashboard']");
	By loc_textDashboard=By.xpath("//p[contains(text(),'Dashboard')]");
	
	By loc_iconProfile=By.xpath("//img[@class='profile_icon']");
	By loc_btnLogout=By.xpath("//span[contains(text(),'Logout')]");
	
	public void mouseHove1hLogo()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that mouse hover",Pojo.getObjSeleniumFunctions().mouseHover(loc_1hLogo));
		Pojo.getObjSeleniumFunctions().waitFor(5);

	}
	
	public void verifyDashboardPageAdminLogin()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_dashboardText, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that dashboard page is appearing when admin login",Pojo.getObjSeleniumFunctions().getText(loc_dashboardText).trim().equals("Dashboard"));
	}
	
	public void clickDashboardIconSideMenu()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnDashboardIcon, 10);
		Pojo.getObjSeleniumFunctions().mouseHover(loc_btnDashboardIcon);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that dashboard icon is clicking",Pojo.getObjSeleniumFunctions().click(loc_textDashboard));
		mouseHove1hLogo();

	}
	
	public void verifyAutoSelected1huddleCompanyAdmin()
	{
		
	}
	
	public void clickSettings()
	{
		Pojo.getObjSeleniumFunctions().mouseHover(loc_iconSettings);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that settings is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnSettings));
	}
	
	public void clickLeaderBoard()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that leaderboard is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnLeaderboard));

	}
	
	public void clickReports()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that report is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnReport));

	}
	
	public void clickSideMenuSubItem(String itemName)
	{
		By loc_itemName=By.xpath("//p[contains(text(),'"+itemName+"')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that sub item is selecting", Pojo.getObjSeleniumFunctions().click(loc_itemName));
	}
	
	
	public void clickQuestions()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Questions button is clicking in side menu", Pojo.getObjSeleniumFunctions().click(loc_btnQuestions));
	}
	
	public void clickVipCode()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that vip code is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnVipCode));
		mouseHove1hLogo();

	}
	
	public void clickAttempts()
	{

		Pojo.getObjSeleniumFunctions().mouseHover(loc_sideMenuNav);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_Games, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Games drop down is clicking",Pojo.getObjSeleniumFunctions().click(loc_Games));

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAttempts));
	}
	
	public void clickGameIcon()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify mouse hover on Games Icon",Pojo.getObjSeleniumFunctions().mouseHover(loc_gameIcon));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_Games, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Games drop down is clicking",Pojo.getObjSeleniumFunctions().click(loc_Games));
		
	}
	public void verifyAndClickPlayerFeedback()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textPlayeFeedback, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player feedback button is clicking", Pojo.getObjSeleniumFunctions().click(loc_textPlayeFeedback));
		mouseHove1hLogo();
	}
	
	public void verifyAndClickTrophies()
	{
		Pojo.getObjSeleniumFunctions().scrollToView(loc_textTrophies);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies sub item is appearing",Pojo.getObjSeleniumFunctions().getText(loc_textTrophies).trim().equals("Trophies"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Trophy item is clicking", Pojo.getObjSeleniumFunctions().click(loc_textTrophies));
		mouseHove1hLogo();
	}
	
	public void selectFilter(String filterType)
	{
		Pojo.getObjSeleniumFunctions().waitFor(5);

		By loc_filterType=By.xpath("//span[contains(text(),'"+filterType+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_filterType, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that filter is clicking", Pojo.getObjSeleniumFunctions().click(loc_filterType));
	}
	
	public void clickRightArrowButtonOfFilter(String filterType)
	{
		Pojo.getObjSeleniumFunctions().waitFor(5);

		By loc_filterType=By.xpath("//span[contains(text(),'"+filterType+"')]/child::button[1]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that right arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_filterType));
	}
	public void mouseHoveOnFilter(String filterType)
	{
		Pojo.getObjSeleniumFunctions().waitFor(5);

		By loc_filterType=By.xpath("//span[contains(text(),'"+filterType+"')]/child::button[1]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify mouse hovering filter", Pojo.getObjSeleniumFunctions().mouseHover(loc_filterType));
	}
	
	
	public void selectSubFilter(String filterName, String subFilterName)
	{
		Pojo.getObjSeleniumFunctions().waitFor(3);
		System.out.println("Subfilter Name "+subFilterName);
		By loc_subFilter=By.xpath("//mat-toolbar[contains(text(),'"+filterName+"')]/parent::div//child::span[contains(text(),'"+subFilterName+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_subFilter, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that sub filter is clicking", Pojo.getObjSeleniumFunctions().click(loc_subFilter));

	}
	
	public void selectMenuItemFilter(String filterType)
	{
		Pojo.getObjSeleniumFunctions().waitFor(5);

		By loc_filterType=By.xpath("//button//parent::span[contains(text(),'"+filterType+"')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that filter is clicking", Pojo.getObjSeleniumFunctions().click(loc_filterType));
	}
	
	
	public void clickAddFilterBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add filter button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAddFilter));
	}
	
	public void clickSubMenuArrowRight(String filterName)
	{
		By loc_filterType=By.xpath("//span[contains(text(),'"+filterName+"')]/child::button[2]");
		System.out.println("Xpath "+loc_filterType);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_filterType, 10);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that filter type is clicking", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_filterType));
	}
	
	public void enterRecentlyPlayedPlayerName()
	{
		String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
		String playerLastName=AllUsersPage.expectedDataUser.get("LastName");
		String playerName=playerFirstName+" "+playerLastName;
		Pojo.getObjSeleniumFunctions().click(loc_textBoxSearchBox);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxSearchBox, playerName));
	}
	
	public void selectSearchedResult()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_searchedResult, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that searched result is selecting", Pojo.getObjSeleniumFunctions().click(loc_searchedResult));
	}
	
	public void selectTimeFilter(String timeFilterType)
	{
		By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+timeFilterType+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_filterType, 10);
		System.out.println("Time Filter "+timeFilterType);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
	}
	
	public void verifyPracticeGameCount(String durationType)
	{
		Pojo.getObjSeleniumFunctions().waitFor(3);

		if(durationType.equals("Last Week")||durationType.equals("Last Month"))
		{
			String pracGameCount=Pojo.getObjSeleniumFunctions().getText(loc_practiveGamePoints);
		    int actualNum=Integer.parseInt(pracGameCount);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that practice count is correct", actualNum==0);
		}
		else
		{
		Pojo.getObjSeleniumFunctions().waitFor(3);
		String pracGameCount=Pojo.getObjSeleniumFunctions().getText(loc_practiveGamePoints);
	    int actualNum=Integer.parseInt(pracGameCount);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that practice count is correct", actualNum==0);
		}
		

	}
	
	public void verifyLiveGameCount(int actualGameCount, String durationType)
	{
		if(durationType.equals("Last Week")||durationType.equals("Last Month"))
		{
			 String liveGameCount=Pojo.getObjSeleniumFunctions().getText(loc_liveGameCount);
		      int actualNum=Integer.parseInt(liveGameCount);
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that live count is correct", actualNum==0);
		}
		
		else
		{
      String liveGameCount=Pojo.getObjSeleniumFunctions().getText(loc_liveGameCount);
      int actualNum=Integer.parseInt(liveGameCount);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that live count is correct", actualNum==actualGameCount);
	}}
	
	public void verifyTrophiesAchievedCount(int actualTrophiesAchieved,String durationType)
	{
		if(durationType.equals("Last Week")||durationType.equals("Last Month"))
		{
			String expectedText=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount);
			int actualNum=Integer.parseInt(expectedText);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies count is correct", actualNum==0);
		}
		else
		{
		String expectedText=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount);
		int actualNum=Integer.parseInt(expectedText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies count is correct", actualNum==actualTrophiesAchieved);
	}}
	
	
	
	public void verifyParticipationTime(String durationType)
	{
		
		if(durationType.equals("Last Week")||durationType.equals("Last Month"))
		{
			String actualText=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is correct",actualText.equals("0")); //Participation should be ("00:00:00"), need to log improvement
		}
		else
		{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is correct",actualText.equals("00:00:05")||actualText.equals("00:00:06")||actualText.equals("00:00:07")||actualText.equals("00:00:08")||actualText.equals("00:00:09")||actualText.equals("00:00:10") );
	}}
	
	public void clickTImerFilter()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnDownArrowTime,10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

	}
	public void clickDashboard()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that dashboard button is clicking", Pojo.getObjSeleniumFunctions().click(loc_iconDashboard));
	}
	
	public void enterLocation()
	{
		String playerLocation=AllUsersPage.expectedDataUser.get("Location");
		
		
			Pojo.getObjSeleniumFunctions().click(loc_textBoxDashboard);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxDashboard, playerLocation));
		
		
		System.out.println("Player Location "+playerLocation);
		Pojo.getObjSeleniumFunctions().click(loc_textBoxDashboard);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxDashboard, playerLocation));
	}
	
	public void enterLocation(String locationName)
	{
		
			Pojo.getObjSeleniumFunctions().click(loc_textBoxDashboard);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxDashboard, locationName));
		
		System.out.println("Player Location "+locationName);
		Pojo.getObjSeleniumFunctions().click(loc_textBoxDashboard);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxDashboard, locationName));
	}
	
	public void enterDepartment(String deptName)
	{
		
			Pojo.getObjSeleniumFunctions().click(loc_textBoxDashboard);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that dept name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxDashboard, deptName));
		
		System.out.println("Player Dept "+deptName);
		Pojo.getObjSeleniumFunctions().click(loc_textBoxDashboard);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that dept name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxDashboard, deptName));
	}
	
	public void enterGroup(String groupName)
	{
		
	    Pojo.getObjSeleniumFunctions().click(loc_textBoxDashboard);
	    Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxDashboard, 15);
	    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that group name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxDashboard, groupName));
		System.out.println("Player Group "+groupName);
		Pojo.getObjSeleniumFunctions().click(loc_textBoxDashboard);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that group name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxDashboard, groupName));
	}
	
	
	public void enterGameName()
	{
		String gameName=BuildSpGamePage.expectedData.get("GameName").get(0).toString();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxGameName, 10);
		//	Pojo.getObjSeleniumFunctions().click(loc_textBoxGameName);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxGameName, gameName));
		
	}
	
	public void enterGameName(String gameName)
	{
			Pojo.getObjSeleniumFunctions().click(loc_textBoxGameName);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxGameName, gameName));
		
	}
	
	public void clickCheckboxSearchedResult()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnSearchedResult, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that checkbox is clicking with the scerched result", Pojo.getObjSeleniumFunctions().click(loc_btnSearchedResult));

	}
	
	
	
	public void clickDoneBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDone));
		Pojo.getObjSeleniumFunctions().waitFor(5); //if don't wait then it will take values before searching result
	}
	
	public void clickSelectAll()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that select all is clicking in the text box", Pojo.getObjSeleniumFunctions().click(loc_btnSelectAll));
	}
	
	public HashMap<String, HashMap<String, Integer>> getGamesPlayedCountTrophiesCountParticipationCount()
	{
		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnDownArrowTime, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitFor(7);
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gamesPlayedCount, 15);
			Pojo.getObjSeleniumFunctions().waitFor(7);
			
			String strCountgamePlayed=Pojo.getObjSeleniumFunctions().getText(loc_gamesPlayedCount).trim();
			int intCount=Integer.parseInt(strCountgamePlayed);
			gamePlayCountDashboard.put(durationName, intCount);
			gamesPlayedTrophiesParticipationCountDashboard.put("Games Played Count Dashboard", gamePlayCountDashboard);
			
			
			String strCountTrophyAchieved=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount).trim();
			int intCountTrophyAchieved=Integer.parseInt(strCountTrophyAchieved);
			trophiesCountDashboard .put(durationName, intCountTrophyAchieved);
			gamesPlayedTrophiesParticipationCountDashboard.put("Trophies Achieved Count Dashboard", trophiesCountDashboard);
			
			String strCountParticipation=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
			int intCountParticipation=Integer.parseInt(strCountParticipation);
			participationCountDashboard.put(durationName, intCountParticipation);
			gamesPlayedTrophiesParticipationCountDashboard.put("Participation Count Dashboard", participationCountDashboard);

			
			

		}
		
		return gamesPlayedTrophiesParticipationCountDashboard;
		
	}
	
	public HashMap<String, Integer> getTrophiesAchievedCount()
	{
		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_trophyAchievedCount, 15);
			Pojo.getObjSeleniumFunctions().waitFor(5);
			String strCount=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount).trim();
			int intCount=Integer.parseInt(strCount);
			trophiesCountDashboard .put(durationName, intCount);

		}
		
		return trophiesCountDashboard;
	}
	
	public HashMap<String, Integer> getParticipationCount()
	{
		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_participationCount, 15);
			Pojo.getObjSeleniumFunctions().waitFor(5);
			String strCount=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
			int intCount=Integer.parseInt(strCount);
			participationCountDashboard.put(durationName, intCount);

		}
		
		return participationCountDashboard;

	}
	
	public void verifyGamesPlayedCountActivePlayers(int recentlyPlayedGameCount,HashMap<String,Integer> dashboardData)
	{

		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitFor(5);
			String strCount=Pojo.getObjSeleniumFunctions().getText(loc_gamesPlayedCount).trim();
			int intCount=Integer.parseInt(strCount);
			
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCount==dashboardData.get(durationName));

			}
			else
			{
			
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCount== dashboardData.get(durationName));

		}}
		}
	
	public void verifyTrophiesAchievedCountActivePlayers(int actualTrophiesAchievedWhilePlayedGame,HashMap<String, Integer> dashboardData)
	{
//		String expectedText=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount);
//		int actualTrophiesCountDashboard=Integer.parseInt(expectedText);
//		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies count is correct on dashboard ", actualTrophiesCountDashboard==actualTrophiesAchievedWhilePlayedGame+trophiesCountDashBoardBeforePlayingGame);
		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitFor(5);
			String strCount=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount).trim();
			int intCount=Integer.parseInt(strCount);
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCount==dashboardData.get(durationName));

			}
			else
			{
				
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCount== dashboardData.get(durationName));

		    }

		}
		
	}
	
	public void verifyTrophiesAchievedCountSingleLevelGamePlayDashboard(double totalPlayerCount,double gameProphyCount,HashMap<String, Integer> dashboardData)
	{

		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();
		int expectedTrophyCountInt;
		DecimalFormat df = new DecimalFormat("#.#");
		double expectedTrophyCountDouble=(gameProphyCount/totalPlayerCount)*100;
		System.out.println("Trophy Row Calculation "+expectedTrophyCountDouble);

		expectedTrophyCountDouble=Double.parseDouble(df.format(expectedTrophyCountDouble));
		System.out.println("Trophy Row Calculation "+expectedTrophyCountDouble);

		String numberD = String.valueOf(expectedTrophyCountDouble);
        numberD = numberD.substring (numberD.indexOf ("." )+1);
        int intNum=Integer.parseInt(numberD);
        System.out.println("Number After Decimal "+intNum);
		
        if(intNum>5)
        {
        	df = new DecimalFormat("#.#");
             df.setRoundingMode(RoundingMode.CEILING);
            expectedTrophyCountDouble=Double.parseDouble(df.format(expectedTrophyCountDouble));
        	String strTrophyCount=String.valueOf(expectedTrophyCountDouble).toString();
        	System.out.println("Trophy Count with Decimal "+strTrophyCount);
            String[] separated =  strTrophyCount.split("\\.");
            strTrophyCount=separated[0];
            System.out.println("Expected Trophy greater than five "+strTrophyCount);
        	expectedTrophyCountInt=Integer.parseInt(strTrophyCount);
        	expectedTrophyCountInt=expectedTrophyCountInt+1;
        	System.out.println("Expected Trophy count decimal greater than five "+expectedTrophyCountInt);
        }
        else
        {
       	df = new DecimalFormat("#.#");
       	expectedTrophyCountDouble=Double.parseDouble(df.format(expectedTrophyCountDouble));
        String strTrophyCount=String.valueOf(expectedTrophyCountDouble);
        String[] separated =  strTrophyCount.split("\\.");
        
        strTrophyCount=separated[0];
        System.out.println("Expected Trophy less than five "+strTrophyCount);
    	expectedTrophyCountInt=Integer.parseInt(strTrophyCount);
    	System.out.println("Expected Trophy count decimal less than five "+expectedTrophyCountInt);


        }
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitFor(5);
			String strCount=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount).trim();
			int intCount=Integer.parseInt(strCount);
			
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCount==dashboardData.get(durationName));

			}
			else
			{
				
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCount==expectedTrophyCountInt);

		    }

		}
		
	}
	
	
	
	public void verifyParticipationTeamWiseDashboardActivePlayers(HashMap<String, Integer> dashboardData)
	{
		int playerCount=AllUsersPage.expectedDataUSerEmailAndPassword.size();
//		String strCount=Pojo.getObjSeleniumFunctions().getText(loc_gamesPlayedCount).trim();
//		int intCount=Integer.parseInt(strCount);
//		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is correct",intCount==playerCountOnDashboardBeforePlaying+playerCount );
		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
		  listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitFor(5);
			String strCount=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
			int intCount=Integer.parseInt(strCount);
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCount==dashboardData.get(durationName));

			}
			else
			{
			
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCount==dashboardData.get(durationName));

		}

		}
		}
	
	public void verifyGamesPlayedCount(int recentlyPlayedGameCount,HashMap<String,Integer> dashboardData)
	{

		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitFor(7);
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gamesPlayedCount,15);
			Pojo.getObjSeleniumFunctions().waitFor(7);
			String strCount=Pojo.getObjSeleniumFunctions().getText(loc_gamesPlayedCount).trim();
			int intCount=Integer.parseInt(strCount);
			System.out.println("Actual Game Played Count "+intCount);
			
			
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCount==dashboardData.get(durationName));

			}
			else
			{
			System.out.println("Duration Name "+durationName);
			System.out.println("Game Count dashboard before play "+dashboardData.get(durationName));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCount==recentlyPlayedGameCount+dashboardData.get(durationName));

		}}
		}
	
	public void verifyTrophiesAchievedCount(int actualTrophiesAchievedWhilePlayedGame,HashMap<String, Integer> dashboardData)
	{
//		String expectedText=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount);
//		int actualTrophiesCountDashboard=Integer.parseInt(expectedText);
//		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies count is correct on dashboard ", actualTrophiesCountDashboard==actualTrophiesAchievedWhilePlayedGame+trophiesCountDashBoardBeforePlayingGame);
		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_trophyAchievedCount, 15);
			Pojo.getObjSeleniumFunctions().waitFor(5);
			String strCount=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount).trim();
			int intCount=Integer.parseInt(strCount);
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCount==dashboardData.get(durationName));

			}
			else
			{
			 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCount== actualTrophiesAchievedWhilePlayedGame+dashboardData.get(durationName));

		   }

		   }
		
	}
	
	public void verifyParticipationTeamWiseDashboard(HashMap<String, Integer> dashboardData)
	{
		int playerCount=AllUsersPage.expectedDataUSerEmailAndPassword.size();
//		String strCount=Pojo.getObjSeleniumFunctions().getText(loc_gamesPlayedCount).trim();
//		int intCount=Integer.parseInt(strCount);
//		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is correct",intCount==playerCountOnDashboardBeforePlaying+playerCount );
		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
		  listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_participationCount, 15);
			Pojo.getObjSeleniumFunctions().waitFor(6);
			String strCount=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
			int intCount=Integer.parseInt(strCount);
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCount==dashboardData.get(durationName));

			}
			else
			{
			
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCount==dashboardData.get(durationName)+playerCount);

		}

		}
		
		}
	
	public void verifyGamePlayCountTrophyAchievedCountAndParticipation(int recentlyPlayedGameCount,int actualTrophiesAchievedWhilePlayedGame,HashMap<String, Integer> dashboardDataGamePlay,HashMap<String, Integer> dashboardDataTrophiesAchieved,HashMap<String, Integer> dashboardDataParticipation)
	{
		int playerCount=AllUsersPage.expectedDataUSerEmailAndPassword.size();

		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitFor(7);
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gamesPlayedCount,15);
			Pojo.getObjSeleniumFunctions().waitFor(7);
			
			String strCountGamePlayed=Pojo.getObjSeleniumFunctions().getText(loc_gamesPlayedCount).trim();
			int intCountGamePlayed=Integer.parseInt(strCountGamePlayed);
			System.out.println("Actual Game Played Count "+intCountGamePlayed);
			
			String strCountTrophyAchieved=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount).trim();
			int intCountTrophyAchieved=Integer.parseInt(strCountTrophyAchieved);
			
			String strCountParticipation=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
			int intCountParticipation=Integer.parseInt(strCountParticipation);
			
			
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCountGamePlayed==dashboardDataGamePlay.get(durationName));
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCountTrophyAchieved==dashboardDataTrophiesAchieved.get(durationName));
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCountParticipation==dashboardDataParticipation.get(durationName));

			}
			else
			{
			System.out.println("Duration Name "+durationName);
			System.out.println("Game Count dashboard before play "+dashboardDataGamePlay.get(durationName));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCountGamePlayed==recentlyPlayedGameCount+dashboardDataGamePlay.get(durationName));
			 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCountTrophyAchieved== actualTrophiesAchievedWhilePlayedGame+dashboardDataTrophiesAchieved.get(durationName));
			 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCountParticipation==dashboardDataParticipation.get(durationName)+playerCount);
		}}
	}
	
	public void verifyGamePlayCountTrophyAchievedCountAndParticipationForActivePlayers(int recentlyPlayedGameCount,int actualTrophiesAchievedWhilePlayedGame,HashMap<String, Integer> dashboardDataGamePlay,HashMap<String, Integer> dashboardDataTrophiesAchieved,HashMap<String, Integer> dashboardDataParticipation)
	{
		int playerCount=AllUsersPage.expectedDataUSerEmailAndPassword.size();

		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitFor(7);
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gamesPlayedCount,15);
			Pojo.getObjSeleniumFunctions().waitFor(7);
			
			String strCountGamePlayed=Pojo.getObjSeleniumFunctions().getText(loc_gamesPlayedCount).trim();
			int intCountGamePlayed=Integer.parseInt(strCountGamePlayed);
			System.out.println("Actual Game Played Count "+intCountGamePlayed);
			
			String strCountTrophyAchieved=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount).trim();
			int intCountTrophyAchieved=Integer.parseInt(strCountTrophyAchieved);
			
			String strCountParticipation=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
			int intCountParticipation=Integer.parseInt(strCountParticipation);
			
			
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCountGamePlayed==dashboardDataGamePlay.get(durationName));
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCountTrophyAchieved==dashboardDataTrophiesAchieved.get(durationName));
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCountParticipation==dashboardDataParticipation.get(durationName));

			}
			else
			{
			System.out.println("Duration Name "+durationName);
			System.out.println("Game Count dashboard before play "+dashboardDataGamePlay.get(durationName));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCountGamePlayed==dashboardDataGamePlay.get(durationName));
			 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCountTrophyAchieved== dashboardDataTrophiesAchieved.get(durationName));
			 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCountParticipation==dashboardDataParticipation.get(durationName));
		}}
	}
	
	public void verifyGamePlayCountTrophyAchievedCountAndParticipationDashBoardTypeSingleLevel(int recentlyPlayedGameCount,double gameTrophyCount,HashMap<String, Integer> dashboardDataGamePlay,HashMap<String, Integer> dashboardDataTrophiesAchieved,HashMap<String, Integer> dashboardDataParticipation,double totalPlayerCount)
	{
		
		int playerCount=AllUsersPage.expectedDataUSerEmailAndPassword.size();
		
		List<String> listDurationFilter=new ArrayList<String>();
		int expectedTrophyCountInt;
		DecimalFormat df = new DecimalFormat("#.#");
		System.out.println("Game Trophy Count "+gameTrophyCount);
		System.out.println("Total Player Count "+totalPlayerCount);
		
		double expectedTrophyCountDouble=(gameTrophyCount/totalPlayerCount)*100;
		System.out.println("Trophy Row Calculation "+expectedTrophyCountDouble);

		expectedTrophyCountDouble=Double.parseDouble(df.format(expectedTrophyCountDouble));
		System.out.println("Trophy Row Calculation "+expectedTrophyCountDouble);

		String numberD = String.valueOf(expectedTrophyCountDouble);
        numberD = numberD.substring (numberD.indexOf ("." )+1);
        int intNum=Integer.parseInt(numberD);
        System.out.println("Number After Decimal "+intNum);
		
        if(intNum>5)
        {
        	df = new DecimalFormat("#.#");
             df.setRoundingMode(RoundingMode.CEILING);
            expectedTrophyCountDouble=Double.parseDouble(df.format(expectedTrophyCountDouble));
        	String strTrophyCount=String.valueOf(expectedTrophyCountDouble).toString();
        	System.out.println("Trophy Count with Decimal "+strTrophyCount);
            String[] separated =  strTrophyCount.split("\\.");
            strTrophyCount=separated[0];
            System.out.println("Expected Trophy greater than five "+strTrophyCount);
        	expectedTrophyCountInt=Integer.parseInt(strTrophyCount);
        	expectedTrophyCountInt=expectedTrophyCountInt+1;
        	System.out.println("Expected Trophy count decimal greater than five "+expectedTrophyCountInt);
        }
        else
        {
       	df = new DecimalFormat("#.#");
       	expectedTrophyCountDouble=Double.parseDouble(df.format(expectedTrophyCountDouble));
        String strTrophyCount=String.valueOf(expectedTrophyCountDouble);
        String[] separated =  strTrophyCount.split("\\.");
        
        strTrophyCount=separated[0];
        System.out.println("Expected Trophy less than five "+strTrophyCount);
    	expectedTrophyCountInt=Integer.parseInt(strTrophyCount);
    	System.out.println("Expected Trophy count decimal less than five "+expectedTrophyCountInt);
        }

		
		String durationName="";

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitFor(7);
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gamesPlayedCount,15);
			Pojo.getObjSeleniumFunctions().waitFor(7);
			
			String strCountGamePlayed=Pojo.getObjSeleniumFunctions().getText(loc_gamesPlayedCount).trim();
			int intCountGamePlayed=Integer.parseInt(strCountGamePlayed);
			System.out.println("Actual Game Played Count "+intCountGamePlayed);
			
			String strCountTrophyAchieved=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount).trim();
			int intCountTrophyAchieved=Integer.parseInt(strCountTrophyAchieved);
			
			String strCountParticipation=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
			int intCountParticipation=Integer.parseInt(strCountParticipation);
			
			
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCountGamePlayed==dashboardDataGamePlay.get(durationName));
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCountTrophyAchieved==dashboardDataTrophiesAchieved.get(durationName));
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCountParticipation==dashboardDataParticipation.get(durationName));

			}
			else
			{
			System.out.println("Duration Name "+durationName);
			System.out.println("Game Count dashboard before play "+dashboardDataGamePlay.get(durationName));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCountGamePlayed==recentlyPlayedGameCount+dashboardDataGamePlay.get(durationName));
			 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCountTrophyAchieved== expectedTrophyCountInt);
			 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCountParticipation==dashboardDataParticipation.get(durationName)+playerCount);
		}
	}
    }
	
	public void verifyGamePlayCountTrophyAchievedCountAndParticipationMlgDashboard(int recentlyPlayedGameCount,int mlgTrophyWonCount,HashMap<String, Integer> dashboardDataGamePlay,HashMap<String, Integer> dashboardDataTrophiesAchieved,HashMap<String, Integer> dashboardDataParticipation)
	{
		
		
		int playerCount=AllUsersPage.expectedDataUSerEmailAndPassword.size();

		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitFor(7);
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gamesPlayedCount,15);
			Pojo.getObjSeleniumFunctions().waitFor(7);
			
			String strCountGamePlayed=Pojo.getObjSeleniumFunctions().getText(loc_gamesPlayedCount).trim();
			int intCountGamePlayed=Integer.parseInt(strCountGamePlayed);
			System.out.println("Actual Game Played Count "+intCountGamePlayed);
			
			String strCountTrophyAchieved=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount).trim();
			int intCountTrophyAchieved=Integer.parseInt(strCountTrophyAchieved);
			
			String strCountParticipation=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
			int intCountParticipation=Integer.parseInt(strCountParticipation);
			
			
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCountGamePlayed==dashboardDataGamePlay.get(durationName));
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCountTrophyAchieved==dashboardDataTrophiesAchieved.get(durationName));
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCountParticipation==dashboardDataParticipation.get(durationName));

			}
			else
			{
			System.out.println("Duration Name "+durationName);
			System.out.println("Game Count dashboard before play "+dashboardDataGamePlay.get(durationName));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCountGamePlayed==recentlyPlayedGameCount+dashboardDataGamePlay.get(durationName));
			 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCountTrophyAchieved== mlgTrophyWonCount+dashboardDataTrophiesAchieved.get(durationName));
			 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCountParticipation==dashboardDataParticipation.get(durationName)+playerCount);

		}}
	}
	
	public void verifyGamePlayCountTrophyAchievedCountAndParticipationMlgDashboardStatusWon(int recentlyPlayedGameCount,int mlgTrophyWonCount,int participationCountWinner,HashMap<String, Integer> dashboardDataGamePlay,HashMap<String, Integer> dashboardDataTrophiesAchieved,HashMap<String, Integer> dashboardDataParticipation)
	{
		
		
		int playerCount=participationCountWinner;

		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
			
			listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitFor(7);
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gamesPlayedCount,15);
			Pojo.getObjSeleniumFunctions().waitFor(7);
			
			String strCountGamePlayed=Pojo.getObjSeleniumFunctions().getText(loc_gamesPlayedCount).trim();
			int intCountGamePlayed=Integer.parseInt(strCountGamePlayed);
			System.out.println("Actual Game Played Count "+intCountGamePlayed);
			
			String strCountTrophyAchieved=Pojo.getObjSeleniumFunctions().getText(loc_trophyAchievedCount).trim();
			int intCountTrophyAchieved=Integer.parseInt(strCountTrophyAchieved);
			
			String strCountParticipation=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
			int intCountParticipation=Integer.parseInt(strCountParticipation);
			
			
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCountGamePlayed==dashboardDataGamePlay.get(durationName));
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCountTrophyAchieved==dashboardDataTrophiesAchieved.get(durationName));
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCountParticipation==dashboardDataParticipation.get(durationName));

			}
			else
			{
			System.out.println("Duration Name "+durationName);
			System.out.println("Game Count dashboard before play "+dashboardDataGamePlay.get(durationName));
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is showing correctly", intCountGamePlayed==recentlyPlayedGameCount+dashboardDataGamePlay.get(durationName));
			 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies achieved count is showing correctly", intCountTrophyAchieved== mlgTrophyWonCount+dashboardDataTrophiesAchieved.get(durationName));
			 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCountParticipation==dashboardDataParticipation.get(durationName)+playerCount);

		}}
	}
	
	
	public void verifyParticipationMlgDashboard(HashMap<String, Integer> dashboardData)
	{
		int playerCount=AllUsersPage.expectedDataUSerEmailAndPassword.size();
//		String strCount=Pojo.getObjSeleniumFunctions().getText(loc_gamesPlayedCount).trim();
//		int intCount=Integer.parseInt(strCount);
//		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is correct",intCount==playerCountOnDashboardBeforePlaying+playerCount );
		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
		  listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_participationCount, 15);
			Pojo.getObjSeleniumFunctions().waitFor(5);
			String strCount=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
			int intCount=Integer.parseInt(strCount);
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCount==dashboardData.get(durationName));

			}
			else
			{
			
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCount==dashboardData.get(durationName)+playerCount);

		}

		}
		
		}
	
	public void verifyParticipationMlgDashboard(int participationCountWinner,HashMap<String, Integer> dashboardData)
	{
		int playerCount=participationCountWinner;
//		String strCount=Pojo.getObjSeleniumFunctions().getText(loc_gamesPlayedCount).trim();
//		int intCount=Integer.parseInt(strCount);
//		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is correct",intCount==playerCountOnDashboardBeforePlaying+playerCount );
		String durationName="";
		List<String> listDurationFilter=new ArrayList<String>();

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));
		List<WebElement> durationList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listDuration);

		for(WebElement l1:durationList)
		{
		  listDurationFilter.add(l1.getText().trim());
		}
		By loc_timeFilterName=By.xpath("//mat-option//span[contains(text(),'This Month')]");

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time filter is selecting", Pojo.getObjSeleniumFunctions().click(loc_timeFilterName));
		
		for(int i=0;i<listDurationFilter.size();i++)
		{
			durationName=listDurationFilter.get(i);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that down arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownArrowTime));

			By loc_filterType=By.xpath("//mat-option//span[contains(text(),'"+durationName+"')]");
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_filterType));
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_participationCount, 15);
			Pojo.getObjSeleniumFunctions().waitFor(5);
			String strCount=Pojo.getObjSeleniumFunctions().getText(loc_participationCount).trim();
			int intCount=Integer.parseInt(strCount);
			
			if(durationName.equals("Last Week")||durationName.equals("Last Month"))
			{
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCount==dashboardData.get(durationName));

			}
			else
			{
			
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is showing correctly", intCount==dashboardData.get(durationName)+playerCount);

		}

		}
		
		}
	
	public void verifyAndClickLogout()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that profile icon is clicking", Pojo.getObjSeleniumFunctions().click(loc_iconProfile));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnLogout, 5);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that logout buton is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnLogout));
		Pojo.getObjSeleniumFunctions().waitFor(3);
	}
}
