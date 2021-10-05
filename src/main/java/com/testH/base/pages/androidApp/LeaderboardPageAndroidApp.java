package com.testH.base.pages.androidApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.client.LeaderboardPage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

public class LeaderboardPageAndroidApp extends LeaderboardPage  {
	
	By loc_leaderboardSideMenu=MobileBy.xpath("//android.widget.HorizontalScrollView[@resource-id='com.ionicframework.SaleshuddleApp:id/leaderboard_activity_tab_layout']//child::android.widget.LinearLayout/child::*[1]");
	By loc_titleLeaderboard=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_AllTab=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_leaderboard_first_tab_tv\")");
	By loc_compName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_sub_title_tv\")");
	By loc_DeptTab=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_leaderboard_second_tab_tv\")");
	By loc_GroupTab=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_leaderboard_third_tab_tv\")");

    By loc_fourthRankScore=MobileBy.xpath("//android.widget.TextView[@text='4']//following-sibling::android.widget.TextView[@resource-id='com.ionicframework.SaleshuddleApp:id/leader_board_list_item_points_tv']");

    By loc_playerNamesLeaderboard=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/leader_board_list_item_player_name_tv\")");
	By loc_infoMessage=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/verify_lbl\")");

	
	int playerPoint=0;
	int firstRankScore=0;
	int secondRankScore=0;
	int thirdRankScore=0;
	String playerName="";
	String leaderboardType="";
	String fragmentName="";
	
	By loc_firstRankScore;
	By loc_secondRankScore;
	By loc_thirdRankScore;
	By loc_firstRankText;
	By loc_secondRankText;
	By loc_thirdRankTest;
	By loc_firstRankPlayerName;
	By loc_secondRankPlayerName;
	By loc_thirdRankPlayerName;

	
	public void setDynamicXpath(String leaderboardType)
	{
		System.out.println("Leaderboard Type "+leaderboardType);
		if(leaderboardType.equals("DEPARTMENT"))
		{
			System.out.println("Dept Leaderboard");
			loc_firstRankScore=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/dept_fragment_first_rank_score_tv\")");
			loc_secondRankScore=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/dept_fragment_second_rank_score_tv\")");
			loc_thirdRankScore=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/dept_fragment_third_rank_score_tv\")");
		    loc_firstRankText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/dept_fragment_first_rank_tv\")");
			loc_secondRankText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/dept_fragment_second_rank_tv\")");
			loc_thirdRankTest=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/dept_fragment_third_rank_tv\")");
			loc_firstRankPlayerName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/dept_fragment_first_rank_name_tv\")");
			loc_secondRankPlayerName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/dept_fragment_second_rank_name_tv\")");
			loc_thirdRankPlayerName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/dept_fragment_third_rank_name_tv\")");
		}
		else if(leaderboardType.equals("GROUP"))
		{
			System.out.println("Group Leaderboard");
			loc_firstRankScore=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/group_fragment_first_rank_score_tv\")");
			loc_secondRankScore=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/group_fragment_second_rank_score_tv\")");
			loc_thirdRankScore=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/group_fragment_third_rank_score_tv\")");
		    loc_firstRankText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/group_fragment_first_rank_tv\")");
			loc_secondRankText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/group_fragment_second_rank_tv\")");
			loc_thirdRankTest=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/group_fragment_third_rank_tv\")");
			loc_firstRankPlayerName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/group_fragment_first_rank_name_tv\")");
			loc_secondRankPlayerName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/group_fragment_second_rank_name_tv\")");
			loc_thirdRankPlayerName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/group_fragment_third_rank_name_tv\")");
		}
		else
		{
			System.out.println("All Leaderboard");
			loc_firstRankScore=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/all_fragment_first_rank_score_tv\")");
			loc_secondRankScore=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/all_fragment_second_rank_score_tv\")");
			loc_thirdRankScore=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/all_fragment_third_rank_score_tv\")");
		    loc_firstRankText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/all_fragment_first_rank_tv\")");
			loc_secondRankText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/all_fragment_second_rank_tv\")");
			loc_thirdRankTest=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/all_fragment_third_rank_tv\")");
			loc_firstRankPlayerName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/all_fragment_first_rank_name_tv\")");
			loc_secondRankPlayerName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/all_fragment_second_rank_name_tv\")");
			loc_thirdRankPlayerName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/all_fragment_third_rank_name_tv\")");
		}
	}
	

	@Override
	public void clickLeaderboardsSideMenu() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_leaderboardSideMenu, 20);
		Pojo.getObjSeleniumFunctions().waitFor(5);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that leaderboard icon is clicking", Pojo.getObjSeleniumFunctions().click(loc_leaderboardSideMenu));
		Pojo.getObjSeleniumFunctions().waitFor(3);		
	}

	

	@Override
	public void verifyLeaderBoardPoint(int gamePoints) {
		Pojo.getObjSeleniumFunctions().waitFor(2);
		int expectedPlayerPoint=playerPoint+gamePoints;
		//Pojo.getObjSeleniumFunctions().pageRefresh();
		Pojo.getObjSeleniumFunctions().waitFor(3);
		int actualPlayerPoint=getLeaderboardPoint(playerName);
		
		System.out.println("Expected Points "+expectedPlayerPoint);
		System.out.println("Actual Points "+actualPlayerPoint);
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that leaderboard points are correct", expectedPlayerPoint==actualPlayerPoint);
		
	}

	@Override
	public int getLeaderboardPoint(String alreadyAddedplayerName) {
		
		setDynamicXpath(leaderboardType);
		By loc_playerPoint;
        String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
		String playerLastName=AllUsersPage.expectedDataUser.get("LastName");
	    playerName=playerFirstName+" "+playerLastName;
	//    Pojo.getObjSeleniumFunctions().androidScroll(playerName);
		
		if(playerFirstName!=null)
		{
		  
		  if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_firstRankPlayerName)==true)
		  {
			 if(Pojo.getObjSeleniumFunctions().getText(loc_firstRankPlayerName).trim().equals(playerFirstName)||Pojo.getObjSeleniumFunctions().getText(loc_secondRankPlayerName).trim().equals(playerFirstName)||Pojo.getObjSeleniumFunctions().getText(loc_thirdRankPlayerName).trim().equals(playerFirstName))
			 {
				if(Pojo.getObjSeleniumFunctions().getText(loc_firstRankPlayerName).trim().equals(playerFirstName))
				{
					loc_playerPoint=loc_firstRankScore;
				}
				else if(Pojo.getObjSeleniumFunctions().getText(loc_secondRankPlayerName).trim().equals(playerFirstName))
				{
					loc_playerPoint=loc_secondRankScore;
				}
				else
				{
					loc_playerPoint=loc_thirdRankScore;
			    }
			 }
			else
			{
		    Pojo.getObjSeleniumFunctions().androidScroll(playerName);

			loc_playerPoint=MobileBy.xpath("//android.widget.TextView[@text='"+playerName+"']//following-sibling::android.widget.TextView");
		    }
			}
			else
			 {
				  Pojo.getObjSeleniumFunctions().androidScroll(playerName);

					loc_playerPoint=MobileBy.xpath("//android.widget.TextView[@text='"+playerName+"']//following-sibling::android.widget.TextView");
 
			 }}
		
		
		else
		{
			playerName=alreadyAddedplayerName;
			System.out.println("Alreay Added Player Name "+playerName);
			if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_firstRankPlayerName))
			{
			 System.out.println("First Rank Player Name "+Pojo.getObjSeleniumFunctions().getText(loc_firstRankPlayerName));
			 if(Pojo.getObjSeleniumFunctions().getText(loc_firstRankPlayerName).trim().equals(playerName)||Pojo.getObjSeleniumFunctions().getText(loc_secondRankPlayerName).trim().equals(playerName)||Pojo.getObjSeleniumFunctions().getText(loc_thirdRankPlayerName).trim().equals(playerName))
			 {
				if(Pojo.getObjSeleniumFunctions().getText(loc_firstRankPlayerName).trim().equals(playerName))
				{
					loc_playerPoint=loc_firstRankScore;
				}
				else if(Pojo.getObjSeleniumFunctions().getText(loc_secondRankPlayerName).trim().equals(playerName))
				{
					loc_playerPoint=loc_secondRankScore;
				}
				else
				{
					loc_playerPoint=loc_thirdRankScore;
                }
				
			}
			else {
				  Pojo.getObjSeleniumFunctions().androidScroll(playerName);

			loc_playerPoint=MobileBy.xpath("//android.widget.TextView[contains(@text,'"+playerName+"')]//following-sibling::android.widget.TextView");
		        }
			 }
			else
			{
				  Pojo.getObjSeleniumFunctions().androidScroll(playerName);

				loc_playerPoint=MobileBy.xpath("//android.widget.TextView[contains(@text,'"+playerName+"')]//following-sibling::android.widget.TextView");
			}}
		Pojo.getObjSeleniumFunctions().waitFor(5);
		System.out.println("Loc PlayerPoint "+loc_playerPoint);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerPoint, 10);
		String sPlayerPoint=Pojo.getObjSeleniumFunctions().getText(loc_playerPoint).trim();
		sPlayerPoint=sPlayerPoint.replaceAll("[^0-9]", "");
		playerPoint=Integer.parseInt(sPlayerPoint);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are greater than or equal to zero", playerPoint>=0);
		return playerPoint;
		
		
		
	}



	@Override
	public void verifyLeaderboardPage() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleLeaderboard, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that leaderboard page is opening",Pojo.getObjSeleniumFunctions().getText(loc_titleLeaderboard).trim().equals("Leaderboards"));
		
	}



	@Override
	public void verifyCompanyName(String cName) {
		
		if(Pojo.getObjConfig().get("AUT_ADMIN_URL").equals("https://admin.1huddle.co/login"))
		{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_compName, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that company name is correct on leaderboard screen",Pojo.getObjSeleniumFunctions().getText(loc_compName).trim().equals("AutomationQA"));
		}
		else
		{
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_compName, 15);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that company name is correct on leaderboard screen",Pojo.getObjSeleniumFunctions().getText(loc_compName).trim().equals("AmazonPrime"));
		}
	}



	@Override
	public void verifyAllDeptTabs() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that All tab is appearing",Pojo.getObjSeleniumFunctions().getText(loc_AllTab).trim().equals("ALL"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Dept tab is appearing",Pojo.getObjSeleniumFunctions().getText(loc_DeptTab).trim().equals("DEPARTMENT"));
		
	}



	@Override
	public void verifyAllDeptGroupTabs() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that All tab is appearing",Pojo.getObjSeleniumFunctions().getText(loc_AllTab).trim().equals("ALL"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Dept tab is appearing",Pojo.getObjSeleniumFunctions().getText(loc_DeptTab).trim().equals("DEPARTMENT"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Group tab is appearing",Pojo.getObjSeleniumFunctions().getText(loc_GroupTab).trim().equals("GROUP"));

	}



	@Override
	public void clickLeaderboard(String leaderboardType) {
		setDynamicXpath(leaderboardType);
		this.leaderboardType=leaderboardType;
		System.out.println("Select Leaderboard "+this.leaderboardType);
		By loc_leaderboardType=MobileBy.xpath("//android.widget.TextView[@text='"+leaderboardType+"']");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_leaderboardType, 15);
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that leaderboard is selecting",Pojo.getObjSeleniumFunctions().click(loc_leaderboardType));
		Pojo.getObjSeleniumFunctions().waitFor(1);
		
	}



	@Override
	public void verifyDeptName() {
		
	}



	@Override
	public void verifyGroupName() {
		// We do not show group name on android app
		
	}



	@Override
	public void verifyFirstRank() {
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that first rank is displaying", Pojo.getObjSeleniumFunctions().getText(loc_firstRankText).trim().equals("1"));
		
		firstRankScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_firstRankScore).trim().replaceAll("[^0-9]", ""));
		secondRankScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_secondRankScore).trim().replaceAll("[^0-9]", ""));
		thirdRankScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_thirdRankScore).trim().replaceAll("[^0-9]", ""));
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that first rank is correct",(firstRankScore>=secondRankScore)&&(firstRankScore>=thirdRankScore));
		
	}



	@Override
	public void verifySecondRank() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that second rank is displaying", Pojo.getObjSeleniumFunctions().getText(loc_secondRankText).trim().equals("2"));
		firstRankScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_firstRankScore).trim().replaceAll("[^0-9]", ""));
		secondRankScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_secondRankScore).trim().replaceAll("[^0-9]", ""));
		thirdRankScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_thirdRankScore).trim().replaceAll("[^0-9]", ""));
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that second rank is correct",(secondRankScore<=firstRankScore)&&(secondRankScore>=thirdRankScore));
		
	}



	@Override
	public void verifuThirdRank() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that third rank is displaying", Pojo.getObjSeleniumFunctions().getText(loc_thirdRankTest).trim().equals("3"));
		firstRankScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_firstRankScore).trim().replaceAll("[^0-9]", ""));
		secondRankScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_secondRankScore).trim().replaceAll("[^0-9]", ""));
		thirdRankScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_thirdRankScore).trim().replaceAll("[^0-9]", ""));
		int fourthRankScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_fourthRankScore).trim().replaceAll("[^0-9]", ""));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that 3rd rank is correct",(thirdRankScore<=firstRankScore)&&(thirdRankScore<=secondRankScore)&&(thirdRankScore>=fourthRankScore));

	}



	@Override
	public void verifyUserInLeaderboardRankingList() {
		String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
		String playerLastName=AllUsersPage.expectedDataUser.get("LastName");
		String playerFullName=playerFirstName+" "+playerLastName;
		System.out.println("Logged In Player Name "+playerFullName);
		
		String playerFirstNameTopThree=Pojo.getObjSeleniumFunctions().getText(loc_firstRankPlayerName).trim();
		String playerSecondNameTopThree=Pojo.getObjSeleniumFunctions().getText(loc_secondRankPlayerName).trim();
		String playerThirdNameTopThree=Pojo.getObjSeleniumFunctions().getText(loc_thirdRankPlayerName).trim();

		if(playerFirstNameTopThree.equals(playerFirstName)||playerSecondNameTopThree.equals(playerSecondNameTopThree)||playerThirdNameTopThree.equals(playerFirstName))
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player is showing", playerFirstNameTopThree.equals(playerFirstName)||playerSecondNameTopThree.equals(playerSecondNameTopThree)||playerThirdNameTopThree.equals(playerFirstName));
		}
		
		else
		{
			Pojo.getObjSeleniumFunctions().androidScroll(playerFullName);
			ArrayList<String> strPlayerNames=new ArrayList<String>();
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerNamesLeaderboard, 10);
			List<AndroidElement> playerNames=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_playerNamesLeaderboard);
			
			for(AndroidElement playerName:playerNames)
			{
				strPlayerNames.add(playerName.getText().trim());
			}
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player name is showing in list", strPlayerNames.contains(playerFullName)||playerFirstNameTopThree.equals(playerFirstName)||playerSecondNameTopThree.equals(playerFirstName)||playerThirdNameTopThree.equals(playerFirstName));
		}
		}
		
	



	@Override
	public void selectRandomPlayer() {
		ArrayList<String> strPlayerNames=new ArrayList<String>();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerNamesLeaderboard, 10);
		List<AndroidElement> playerNames=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_playerNamesLeaderboard);
		int playerNamesSize=playerNames.size();
		int randomNum=Pojo.getObjUtilitiesFunctions().getRandomNumber(0,playerNamesSize);
		
		for(WebElement playerName:playerNames)
		{
			strPlayerNames.add(playerName.getText().trim());
		}
		
		String randomPlayerName=strPlayerNames.get(randomNum).trim();
		System.out.println("Random Player Name: "+randomPlayerName);
		
		By loc_playerName=MobileBy.xpath("//android.widget.TextView[contains(@text,'"+randomPlayerName+"')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that random player is selecting",Pojo.getObjSeleniumFunctions().click(loc_playerName));		
	}



	@Override
	public void selectPlayer() {
		setDynamicXpath(leaderboardType);
		By loc_playerName;
        String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
		String playerLastName=AllUsersPage.expectedDataUser.get("LastName");
	    playerName=playerFirstName+" "+playerLastName;
	    Pojo.getObjSeleniumFunctions().androidScroll(playerName);
		
		    if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_firstRankPlayerName))
			{
			 
			 if(Pojo.getObjSeleniumFunctions().getText(loc_firstRankPlayerName).trim().equals(playerName)||Pojo.getObjSeleniumFunctions().getText(loc_secondRankPlayerName).trim().equals(playerName)||Pojo.getObjSeleniumFunctions().getText(loc_thirdRankPlayerName).trim().equals(playerName))
			 {
				if(Pojo.getObjSeleniumFunctions().getText(loc_firstRankPlayerName).trim().equals(playerName))
				{
					loc_playerName=loc_firstRankPlayerName;
				}
				else if(Pojo.getObjSeleniumFunctions().getText(loc_secondRankPlayerName).trim().equals(playerName))
				{
					loc_playerName=loc_secondRankPlayerName;
				}
				else
				{
					loc_playerName=loc_thirdRankPlayerName;
                }
				
			}
			else {
				  Pojo.getObjSeleniumFunctions().androidScroll(playerName);

			loc_playerName=MobileBy.xpath("//android.widget.TextView[contains(@text,'"+playerName+"')]");
		        }
			 }
			else
			{
				  Pojo.getObjSeleniumFunctions().androidScroll(playerName);

				loc_playerName=MobileBy.xpath("//android.widget.TextView[contains(@text,'"+playerName+"')]");
			}
		Pojo.getObjSeleniumFunctions().waitFor(5);
		System.out.println("Loc "+loc_playerName);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerName, 10);
		String sPlayerName=Pojo.getObjSeleniumFunctions().getText(loc_playerName).trim();
		System.out.println("Player Name "+sPlayerName);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player is clicking", Pojo.getObjSeleniumFunctions().click(loc_playerName));
}



	@Override
	public void selectGroupLeaderboard() {
		leaderboardType="GROUP";
		setDynamicXpath(leaderboardType);
		By loc_leaderboardType=MobileBy.xpath("//android.widget.TextView[@text='GROUP']");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_leaderboardType, 15);
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that leaderboard is selecting",Pojo.getObjSeleniumFunctions().click(loc_leaderboardType));
		Pojo.getObjSeleniumFunctions().waitFor(1);		
	}



	@Override
	public void verifyPlayerRankingOrder() {
		ArrayList<Integer> ranking=new ArrayList<Integer>();
		ArrayList<String> playerNames=new ArrayList<String>();
		ArrayList<Integer> score=new ArrayList<Integer>();
		ArrayList<Integer> tempListRank=new ArrayList<Integer>();
		ArrayList<String> tempListNames=new ArrayList<String>();
		ArrayList<Integer> tempListScore=new ArrayList<Integer>();
		
		
		
		  By loc_rankingListOrder=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/leader_board_list_item_rank_tv\")");
		  Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_rankingListOrder, 10);
		  List<AndroidElement> rankList=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_rankingListOrder);
		 
		  By loc_playerPoints=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/leader_board_list_item_points_tv\")");
		  Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerPoints, 10);

		  List<AndroidElement>playerPointsList=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_playerPoints);
		  
		  for(AndroidElement l1:rankList)
		  {
			  int rank=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(l1).trim());
			  ranking.add(rank);
		  }
		  
		  for(AndroidElement l2:playerPointsList)
		  {
			  int playerPoint=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(l2).trim().replaceAll("[^0-9]", ""));
			  score.add(playerPoint);
		  }
		  
		  
		  
		  

		 
		 tempListRank.addAll(ranking);
		 tempListScore.addAll(score);
		 

		Collections.sort(ranking);
		Collections.sort(score, Collections.reverseOrder()); 
		 
		 System.out.println("Temp Rank "+tempListRank);
		 System.out.println("Temp Score "+tempListScore);
		 
		 System.out.println("Sorted Rank "+ranking);
		 System.out.println("Sorted Score "+score);
		 
	 if(ranking.size()==0)
	 {
			 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that score is in correct order ", false);
		 }
	 else
		 {
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that ranking is in correct order ", tempListRank.equals(ranking));
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that score is in correct order ", tempListScore.equals(score));
		 
		 }

	}


	@Override
	public void verifyInfoMessageToVerifyEmailLimitedAccess(String expectedText) {
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_infoMessage).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Veirfy that info message is correct", expectedText.equals(actualText));
	}		
	}


