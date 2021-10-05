package com.testH.base.desktopView;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.client.LeaderboardPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class LeaderboardPageDesktopView extends LeaderboardPage  {
	
	static int playerPoint=0;
	By loc_leaderboardSideMenu=By.xpath("//span[text()='Leaderboards']");
	By loc_playerPointLeaderBoard=By.xpath("//mat-card[contains(@style,'color: rgb')]/child::mat-card-title[2]");
	By loc_titleLeaderboard=By.xpath("//mat-card-title[contains(text(),'LEADERBOARD')]");
	By loc_companyNameAllLeaderboard=By.xpath("//div[contains(@class,'leaderBoardTitle')]//following-sibling::div[2]");
	By loc_AllTab=By.xpath("//div[contains(text(),'ALL')]");
	By loc_DeptTab=By.xpath("//div[contains(text(),'DEPARTMENT')]");
	By loc_GroupTab=By.xpath("//div[contains(text(),'GROUP')]");
	By loc_DeptName=By.xpath("//mat-button-toggle[contains(@style,'background: black')]/parent::mat-button-toggle-group/parent::div/following-sibling::div");
	By loc_GroupName=By.xpath("//div[contains(text(),'DEPARTMENT')]/parent::button/parent::mat-button-toggle/parent::mat-button-toggle-group/parent::div/following-sibling::div");
	By loc_firstRankText=By.xpath("//span[contains(@class,'dot1')]");
	By loc_secondRankText=By.xpath("//span[contains(@class,'dot2')]");
	By loc_thirdRankTest=By.xpath("//span[contains(@class,'dot3')]");
	By loc_firstRankScore=By.xpath("//span[contains(@class,'dot1')]/parent::div/following-sibling::div/child::mat-card-title");
	By loc_secondRankScore=By.xpath("//span[contains(@class,'dot2')]/parent::div/following-sibling::div/child::mat-card-title");
	By loc_thirdRankScore=By.xpath("//span[contains(@class,'dot3')]/parent::div/following-sibling::div/child::mat-card-title");
    By loc_fourthRankScore=By.xpath("//mat-card-title[contains(text(),'4')]/following-sibling::mat-card-title");
    By loc_playerNamesLeaderboard=By.xpath("//mat-card-title[contains(@class,'cardTitleName')]");
    By loc_loadingCircle=By.xpath("assets/img/OHloader.gif");
    By loc_topThreeLeaderboardCardPlayers=By.xpath("//div[contains(@class,'leaderboardPlayer')]/child::div/mat-card-title");
    By loc_gameList=By.xpath("//div[contains(@class,'gameList')]");
	int firstRankScore=0;
	int secondRankScore=0;
	int thirdRankScore=0;
	String playerName="";
	

	@Override
	public void clickLeaderboardsSideMenu() {
		//
      //  Pojo.getObjSeleniumFunctions().waitFor(5);
       // Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_loadingCircle, 30);
       // Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();
		//Pojo.getObjUtilitiesFunctions().waitForPageLoad(20);
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameList, 25);

		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_leaderboardSideMenu, 25);
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that leaderboard icon is clicking", Pojo.getObjSeleniumFunctions().click(loc_leaderboardSideMenu));
		//Pojo.getObjSeleniumFunctions().waitFor(3);
	}
	
	@Override
	public int getLeaderboardPoint(String alreadyCreatedPlayerName) {
		By loc_playerPoint;
		String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
		String playerLastName=AllUsersPage.expectedDataUser.get("LastName");
		playerName=playerFirstName+" "+playerLastName;
		if(playerFirstName!=null)
		{
		 loc_playerPoint=By.xpath("//mat-card-title[contains(text(),'"+playerName+"')]/parent::div/following-sibling::mat-card-title");
		}
		else
		{
			playerName=alreadyCreatedPlayerName;
			System.out.println("Player Name "+playerName);
			loc_playerPoint=By.xpath("//mat-card-title[contains(text(),'"+playerName+"')]/parent::div/following-sibling::mat-card-title");
		}
	//	Pojo.getObjSeleniumFunctions().waitFor(4);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerPoint, 10);
		Pojo.getObjSeleniumFunctions().scrollToView(loc_playerPoint);
		String sPlayerPoint=Pojo.getObjSeleniumFunctions().getText(loc_playerPoint).trim();
		sPlayerPoint=sPlayerPoint.replaceAll("[^0-9]", "");
		playerPoint=Integer.parseInt(sPlayerPoint);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are greater than or equal to zero", playerPoint>=0);
		System.out.println("Player Leaderboard Points "+playerPoint);
		return playerPoint;
	}
	
	@Override
	public void verifyLeaderBoardPoint(int gamePoints) {
	
	Pojo.getObjSeleniumFunctions().waitFor(2);
	int expectedPlayerPoint=playerPoint+gamePoints;
	Pojo.getObjSeleniumFunctions().pageRefresh();
	int actualPlayerPoint=getLeaderboardPoint(playerName);
	
	System.out.println("Expected Points "+expectedPlayerPoint);
	System.out.println("Actual Points "+actualPlayerPoint);
	
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that leaderboard points are correct", expectedPlayerPoint==actualPlayerPoint);
//	AllUsersPage.expectedDataUser.put("FirstName", null);
//	AllUsersPage.expectedDataUser.put("LastName", null);
	}

	@Override
	public void verifyLeaderboardPage() {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleLeaderboard, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that leaderboard page is opening",Pojo.getObjSeleniumFunctions().getText(loc_titleLeaderboard).trim().equals("LEADERBOARDS"));
		
	}

	@Override
	public void verifyCompanyName(String cName) {

		String cmpName_upperCase=cName.trim().toUpperCase();
		By loc_compName=By.xpath("//mat-card-title[contains(text(),'"+cmpName_upperCase+"')]");
		Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_compName, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that company name is correct on leaderboard screen",Pojo.getObjSeleniumFunctions().getText(loc_companyNameAllLeaderboard).trim().equals(cName.trim()));
		
	}

	@Override
	public void verifyAllDeptTabs() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that All tab is appearing",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_AllTab));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Dept tab is appearing",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_DeptTab));

	}

	@Override
	public void verifyAllDeptGroupTabs() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that All tab is appearing",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_AllTab));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Dept tab is appearing",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_DeptTab));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Group tab is appearing",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_GroupTab));

	}

	@Override
	public void clickLeaderboard(String leaderboardType) {
		By loc_leaderboardType=By.xpath("//div[contains(text(),'"+leaderboardType+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_leaderboardType, 15);
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that leaderboard is selecting",Pojo.getObjSeleniumFunctions().click(loc_leaderboardType));
		Pojo.getObjSeleniumFunctions().waitFor(1);
	}

	@Override
	public void verifyDeptName() {
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_DeptName, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Department name is correct", Pojo.getObjSeleniumFunctions().getText(loc_DeptName).trim().equals(AllUsersPage.expectedDataUser.get("Department").trim()));
	}

	@Override
	public void verifyGroupName() {
		Pojo.getObjSeleniumFunctions().waitFor(3);
		
		System.out.println("Actual Group Name "+Pojo.getObjSeleniumFunctions().getText(loc_GroupName).trim());
		System.out.println("Expected Group Name "+AllUsersPage.expectedDataUser.get("Group").trim().toUpperCase());
		Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();

		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_GroupName, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Group name is correct", Pojo.getObjSeleniumFunctions().getText(loc_GroupName).trim().equals(AllUsersPage.expectedDataUser.get("Group").trim().toUpperCase()));
		
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
		
		ArrayList<String> strPlayerNames=new ArrayList<String>();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerNamesLeaderboard, 10);
		List<WebElement> playerNames=Pojo.getObjSeleniumFunctions().getWebElementList(loc_playerNamesLeaderboard);
		
		for(WebElement playerName:playerNames)
		{
			strPlayerNames.add(playerName.getText().trim());
		}
		
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player name is showing in list", strPlayerNames.contains(playerFullName));
		}

	@Override
	public void selectRandomPlayer() {
		ArrayList<String> strPlayerNames=new ArrayList<String>();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerNamesLeaderboard, 10);
		List<WebElement> playerNames=Pojo.getObjSeleniumFunctions().getWebElementList(loc_playerNamesLeaderboard);
		int playerNamesSize=playerNames.size();
		int randomNum=Pojo.getObjUtilitiesFunctions().getRandomNumber(0,playerNamesSize);
		
		for(WebElement playerName:playerNames)
		{
			strPlayerNames.add(playerName.getText().trim());
		}
		
		String randomPlayerName=strPlayerNames.get(randomNum);
		By loc_playerName=By.xpath("//mat-card-title[contains(text(),'"+randomPlayerName+"')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that random player is selecting",Pojo.getObjSeleniumFunctions().click(loc_playerName));

	}

	@Override
	public void selectPlayer() {
		ArrayList<String> players=new ArrayList<String>();
		String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
		String playerLastName=AllUsersPage.expectedDataUser.get("LastName");
		String playerFullName=playerFirstName+" "+playerLastName;
		System.out.println("Player Full Name "+playerFullName);
		By loc_playerName=By.xpath("//mat-card-title[contains(text(),'"+playerFullName+"')]");
		By loc_playerNameTopCards=By.xpath("//mat-card-title[contains(text(),'"+playerFullName+"')]/parent::div/parent::div/parent::div");
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_topThreeLeaderboardCardPlayers, 10);
		List<WebElement> cardPlayers=Pojo.getObjSeleniumFunctions().getWebElementList(loc_topThreeLeaderboardCardPlayers);
		
		for(WebElement e:cardPlayers)
		{
			players.add(e.getText().trim());
		}
		
		if(players.contains(playerFullName))
		{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerName, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player is selecting",Pojo.getObjSeleniumFunctions().click(loc_playerNameTopCards));
		}
		else
		{
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerName, 10);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player is selecting",Pojo.getObjSeleniumFunctions().click(loc_playerName));
		}
		
	}

	@Override
	public void selectGroupLeaderboard() {
		By loc_leaderboardType=By.xpath("//div[contains(text(),'GROUP')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_leaderboardType, 15);
		Pojo.getObjSeleniumFunctions().waitFor(8);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that leaderboard is selecting",Pojo.getObjSeleniumFunctions().click(loc_leaderboardType));
		Pojo.getObjSeleniumFunctions().waitFor(6);		
	}

	@Override
	public void verifyPlayerRankingOrder() {
		
			ArrayList<Integer> ranking=new ArrayList<Integer>();
			ArrayList<String> playerNames=new ArrayList<String>();
			ArrayList<Integer> score=new ArrayList<Integer>();
			ArrayList<Integer> tempListRank=new ArrayList<Integer>();
			ArrayList<String> tempListNames=new ArrayList<String>();
			ArrayList<Integer> tempListScore=new ArrayList<Integer>();
			
			
			
			  By loc_rankingListOrder=By.xpath("//mat-card/child::mat-card-title[1]");
			  List<WebElement> rankList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_rankingListOrder);
			 
			  By loc_playerPoints=By.xpath("//mat-card/child::mat-card-title[2]");
			  List<WebElement>playerPointsList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_playerPoints);
			  
			  for(int i=1;i<=rankList.size();i++) 
			  { 
				By loc_rank=By.xpath("//mat-card["+i+"]/child::mat-card-title[1]"); 
				By loc_playerName=By.xpath("//mat-card["+i+"]/child::mat-card-title//following-sibling::div[2]"); 
				By loc_points=By.xpath("//mat-card["+i+"]/child::mat-card-title[2]");
						 
				int rank=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_rank).trim());
				ranking.add(rank);
				
				int playerPoint=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_points).trim().replaceAll("[^0-9]", ""));
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

			 
			 
			 
			// Collections.sort(score, Collections.reverseOrder());
			 
			  
			  
		}

	@Override
	public void verifyInfoMessageToVerifyEmailLimitedAccess(String expectedText) {
		// TODO Auto-generated method stub
		
	}
		
	}

