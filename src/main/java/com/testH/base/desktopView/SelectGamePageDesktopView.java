package com.testH.base.desktopView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.BuildMlgGamePage;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.admin.GameLibraryPage;
import com.testH.base.pages.admin.TrophiesPageAdmin;
import com.testH.base.pages.client.SelectGamePage;

public class SelectGamePageDesktopView extends SelectGamePage {
	
	ArrayList<Integer> gameCriteria ;

	
	By loc_ScreenTitleText=By.xpath("//div[@class='title']//child::mat-card-title");
	By loc_gameList=By.xpath("//div[contains(@class,'gameName')]//child::div");
	By loc_gameListDisplay=By.xpath("//div[contains(@class,'gameName')]//child::div");

	By loc_gameIcon=By.xpath("//mat-list-item[contains(@class,'goToGames')]");
	By loc_rulesIcon=By.xpath("//img[@src='assets/img/rules.png']");
	By loc_trophiesIcon=By.xpath("//img[@src='assets/img/mlg_trophy.png']");
	By loc_totalPointsBeforePlaying=By.xpath("//div[@class='howToBuild']/child::span[2]");
	By loc_textPoints=By.xpath("//div[@class='howToBuild']/child::span[3]");
	By loc_levelIndicator=By.xpath("//div[@class='level_indicator']");
	By loc_textLevels=By.xpath("//span[contains(text(),'LEVEL')]");
	By loc_textGameOver=By.xpath("//span[contains(text(),'GAME OVER')]");
	By loc_rulesTitle=By.xpath("//span[contains(text(),'RULE')]");
	By loc_rulesText=By.xpath("//span[contains(text(),'RULE')]/parent::div/following-sibling::div");
	By loc_btnCloseRule=By.xpath("//i[contains(text(),'close')]");
	By loc_levelName=By.xpath("//div[contains(@class,'level_properties')]/child::div/following-sibling::span");
	By loc_howToWinText=By.xpath("//span[contains(text(),'HOW TO WIN')]");
	By loc_btnLetsGo=By.xpath("//*[contains(text(),'LET')]");
	By loc_pointsCriteria=By.xpath("//span[contains(text(),'POINTS')]//following-sibling::div//child::span[2]");
	By loc_attemptsCriteria=By.xpath("//span[contains(text(),'ATTEMPTS')]//following-sibling::div//child::span[2]");
	By loc_highScoreCriteria=By.xpath("//span[contains(text(),'HIGH SCORE')]//following-sibling::div//child::span[2]");
	By loc_pointsAchievedLevelPopup=By.xpath("//span[contains(text(),'POINTS')]//following-sibling::div//child::span[1]");
	By loc_attemptsAchievedLevelPopup=By.xpath("//span[contains(text(),'ATTEMPTS')]//following-sibling::div//child::span[1]");
	By loc_highScoreAchievedLevelPopup=By.xpath("//span[contains(text(),'HIGH SCORE')]//following-sibling::div//child::span[1]");
	By loc_btnLetsGoDisable=By.xpath("//*[contains(text(),'LET')]");	
	By loc_btnCloseLevel=By.xpath("//*[text()='close']");
	By loc_gamereviewTitle=By.xpath("//div[contains(text(),'LIVE GAME PREVIEW')]");
	By loc_btnBackMLG=By.xpath("//span[contains(text(),'arrow')]");
	By loc_greenTickPoints=By.xpath("//span[contains(text(),'POINTS')]//following-sibling::div//child::img[contains(@class,'enable_completed_tick')]");
    By loc_greenTickAttempt=By.xpath("//span[contains(text(),'ATTEMPTS')]//following-sibling::div//child::img[contains(@class,'enable_completed_tick')]");
    By loc_greenTickHighScore=By.xpath("//span[contains(text(),'HIGH SCORE')]//following-sibling::div//child::img[contains(@class,'enable_completed_tick')]");
    By loc_textLevelNumLevelCompPopup=By.xpath("//div[contains(@class,'title_text_level_completed')]/child::span[1]");
    By loc_loadingCircle=By.xpath("assets/img/OHloader.gif");

	int highScore=0;
	String levelName="";
	static String gameName="";
	int gameNum=0;
	static String level="";
	int nextLevel;
	int totalPoints=0;

	LeaderboardPageDesktopView objLeaderboardPageDesktopView=new LeaderboardPageDesktopView();
	BuildMlgGamePage objBuildMlgGamePage=new BuildMlgGamePage();
	
	
	@Override
	public void verifySelectGameScreen(String companyName) {
		
		String expectedTitle="";
		
		
		if(Pojo.getObjConfig().get("AUT_ADMIN_URL").equals("https://admin.1huddle.co/login"))
		{

			companyName="AUTOMATIONQA";
			expectedTitle=companyName.toUpperCase()+" "+"GAMES";
			//String expectedTitle=companyName+" "+"GAMES";
			System.out.println("Expected Title "+expectedTitle);
			//Pojo.getObjSeleniumFunctions().waitFor(5);
			}
		else
		{
			System.out.println("Company Name "+companyName);
			expectedTitle=companyName.toUpperCase()+" "+"GAMES";
			//String expectedTitle=companyName+" "+"GAMES";
			System.out.println("Expected Title "+expectedTitle);
			//Pojo.getObjSeleniumFunctions().waitFor(5);
		}
		
		Pojo.getObjSeleniumFunctions().pageRefresh();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_ScreenTitleText, 20);

		String actualTitle= Pojo.getObjSeleniumFunctions().getText(loc_ScreenTitleText).trim();
		System.out.println("Actual Title "+actualTitle);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Select Game screen title is correct", expectedTitle.equals(actualTitle));
		
	}

	@Override
	public void selectGame() {
		List<WebElement> gameList;
		gameList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_gameList);
		int gameCount=gameList.size();
		int ran_Num= Pojo.getObjUtilitiesFunctions().getRandomNumber(1,gameCount);
		
		By loc_gameList=By.xpath("//div[contains(@class,'gameList')]//child::mat-card["+ran_Num+"]");
		System.out.println("Game Path "+loc_gameList);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Game is selecting", Pojo.getObjSeleniumFunctions().click(loc_gameList));
		
		
	}

	@Override
	public void verifyGameList() {  //This checks if game count is more than zero
		
		List<WebElement> gameList;
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameList, 10);
        gameList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_gameList);
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct live games are appearing",gameList.size()>0);
}
	
	public void verifyLiveGameWebApp() {
		
		List<WebElement> gameList;
		List<String> gameNamesWebApp=new ArrayList<String>();
		List<String> gameNamesAdmin;
        String gameName;
        int totaloints;
        
        Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameList, 15);
        gameList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_gameList);
        gameNamesAdmin= GameLibraryPage.gameList;
        System.out.println("Game Names Admin: "+gameNamesAdmin);
        
		for(WebElement l:gameList)
		{
		   gameName=l.getText().trim();
		   gameNamesWebApp.add(gameName);
		}
		
		System.out.println("Game Names WebApp "+gameNamesWebApp);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct live games are appearing",gameNamesWebApp.contains(BuildSpGamePage.expectedData.get("GameName").get(0)));
		
	}

	@Override
	public void selectRecentlyCreatedGame(String gameName) {
	    ArrayList<String> games = new ArrayList<String>();
	    games.add(gameName);
		
		BuildSpGamePage.expectedData.put("GameName",games);

		//By loc_recentCreatedGame=By.xpath("//mat-card-title[contains(text(),'"+gameName+"')]");
		By loc_recentCreatedGame=By.xpath("//mat-card-title[text()=' "+gameName+" ']");
		System.out.println("Loc "+loc_recentCreatedGame);
		refrestTillGameLive(gameName);
		Pojo.getObjSeleniumFunctions().scrollToView(loc_recentCreatedGame);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_recentCreatedGame, 15);
    	//Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct game name is clicking",Pojo.getObjSeleniumFunctions().click(loc_recentCreatedGame));
		
	}

	@Override
	public void clickGamesIconSideMenu() {
	   //	Pojo.getObjSeleniumFunctions().waitFor(3);
		//Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_loadingCircle, 15);
		//Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameListDisplay, 15);

		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameIcon, 20);

		Pojo.getObjSeleniumFunctions().waitFor(3);
		//Pojo.getObjUtilitiesFunctions().waitForPageLoad(10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game icon is clicking",Pojo.getObjSeleniumFunctions().click(loc_gameIcon));
		Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();

	}

	@Override
	public void verifyHighScorePercentageText(String gameName) {
		//String gameName=BuildSpGamePage.expectedData.get("GameName").get(0);
		By loc_highScorePercentageText=By.xpath("//mat-card-title[contains(text(),'"+gameName+"')]/parent::div/parent::div//child::mat-card-subtitle");
		//By loc_highScorePercentageText=By.xpath("//mat-card-title[contains(text(),'GameForHighScore')]/parent::div/parent::div//child::mat-card-subtitle");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score percentage is correct", Pojo.getObjSeleniumFunctions().getText(loc_highScorePercentageText).trim().equals("High Score 0%"));
	}

	@Override
	public void verifyHighScore(int totalGameQues,float countCorrectAns,String gameName) {
		//String gameName=BuildSpGamePage.expectedData.get("GameName").get(0);
		//By loc_highScorePercentageText=By.xpath("//mat-card-title[contains(text(),'"+gameName+"')]/parent::div/parent::div//child::mat-card-subtitle");
	//	By loc_highScorePercentageText=By.xpath("//mat-card-title[contains(text(),'"+gameName+"')]/parent::div/parent::div//child::mat-card-subtitle"); //used hard coded value of game name here because game names take some time to be live.
		By loc_highScorePercentageText=By.xpath("//mat-card-title[text()=' "+gameName+" ']/parent::div/parent::div//child::mat-card-subtitle"); //used hard coded value of game name here because game names take some time to be live.
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_highScorePercentageText, 10);
		String highScoreValue=Pojo.getObjSeleniumFunctions().getText(loc_highScorePercentageText).trim();
		highScoreValue=highScoreValue.replaceAll("[^0-9]", "");
		highScoreValue=highScoreValue+"%";
		System.out.println("High Score Actual "+highScoreValue);
		
//		int catCount=BuildSpGamePage.expectedDataCount.get("CategoryCount");
//		int quesCount=BuildSpGamePage.expectedDataCount.get("QuestionCount");
//		int expectedHighScore=(int) ((countCorrectAns/(catCount*quesCount))*100);
		
		int expectedHighScore=(int) ((countCorrectAns/totalGameQues)*100);
		
		
		if(expectedHighScore>=highScore)
		{
			highScore=expectedHighScore;
		}
		
		System.out.println("High Score Expected "+highScore+"%");
		String highScoreExp=highScore+"%";
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that High score is showing correctly", highScoreValue.equals(highScoreExp));
		
	}

	@Override
	public void verifyGameTrophyWithGame() {
		String gameName=TrophiesPageAdmin.gameTrophyData.get("TrophyName");
		By loc_gametrophyIcon=By.xpath("//mat-card-title[contains(text(),'"+gameName+"')]/parent::div/parent::div/following-sibling::div//child::img");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gametrophyIcon, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy icon is appearing with game",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_gametrophyIcon));
	}

	@Override
	public boolean refrestTillGameLive(String gameName) {
		By loc_recentCreatedGame=By.xpath("//mat-card-title[contains(text(),'"+gameName+"')]");
		boolean isGameDisplayed=false;
		//while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_recentCreatedGame)==false)
		for(int i=1;i<=8;i++)
		{
		if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_recentCreatedGame)==false)
		{
			Pojo.getObjSeleniumFunctions().pageRefresh();
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameList, 10);
			
            Pojo.getObjSeleniumFunctions().waitFor(10);
            
		//	Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();
		}
		else
		{
			isGameDisplayed=true;
			System.out.println("MLG Game displaying to user");
			break;
		}
		
		}
		return isGameDisplayed;
	}

	@Override
	public void verifyMlgLiveGameWebApp() {
		List<WebElement> gameList;
		List<String> gameNamesWebApp=new ArrayList<String>();
        String gameName;
        gameList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_gameList);
        
		for(WebElement l:gameList)
		{
		   gameName=l.getText().trim();
		   gameNamesWebApp.add(gameName);
		}
		
		System.out.println("Game Names WebApp "+gameNamesWebApp);
		
		System.out.println("Game Name Live "+BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0));
	    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct mlg is in live state",gameNamesWebApp.contains(BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0)));
	}

	@Override
	public void verifyMlgNotDisplayingOtherLocationDept() {
		String mlgGameName=BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0);
		By loc_MlgGameName=By.xpath("//mat-card-title[contains(text(),'"+mlgGameName+"')]");
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MLG is not displaying to other location dept user",Pojo.getObjSeleniumFunctions().checkElementNOTDisplayed(loc_MlgGameName));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MLG is not displaying to other location dept user",Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_MlgGameName)==false);
	}
	
	@Override
	public void verifyMlgNotDisplayingSameLocationOtherDept() {
		String mlgGameName=BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0);
		//By loc_MlgGameName=By.xpath("//mat-card-title[contains(text(),'"+mlgGameName+"')]");
		boolean isMlgDisplayed=refrestTillGameLive(mlgGameName);
		System.out.println("is Mlg Displayed "+isMlgDisplayed);
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MLG is not displaying to other location dept user",Pojo.getObjSeleniumFunctions().checkElementNOTDisplayed(loc_MlgGameName));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MLG is not displaying to same location other dept user",isMlgDisplayed==false);		
	}

	@Override
	public void selectRecentlyCreatedMLG() {
		String mlgGameName=BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0);
		By loc_MlgGameName=By.xpath("//mat-card-title[contains(text(),'"+mlgGameName+"')]");
		Pojo.getObjSeleniumFunctions().scrollToView(loc_MlgGameName);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_MlgGameName, 10);
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that recently created mlg is selecting",Pojo.getObjSeleniumFunctions().click(loc_MlgGameName));		
	}

	@Override
	public void verifyRulesIcon() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_rulesIcon, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rules icon is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_rulesIcon));
	}

	@Override
	public void verifyMlgGameName() {
		String mlgGameName=BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0).toUpperCase();
		By loc_MlgGameName=By.xpath("//span[contains(text(),'"+mlgGameName+"')]");
        String actualMlg=Pojo.getObjSeleniumFunctions().getText(loc_MlgGameName);
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that mlg game name is correct",actualMlg.trim().equals(mlgGameName));

	}

    @Override
	public void verifyLevelIndicatorAndTrophyImage() {
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level indicator is showing correctly", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_levelIndicator));
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy image is showing correctly with level indicator",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_trophiesIcon));
	}

	@Override
	public void verifyLevelCount() {
		
		int totalLevelActual=Pojo.getObjSeleniumFunctions().getWebElementList(loc_textLevels).size();
		int totalLevelExpected=BuildMlgGamePage.count;
		System.out.println("Level Count Expected "+totalLevelExpected);
		System.out.println("Level Count Actual "+totalLevelActual);
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level count is correct", totalLevelActual==totalLevelExpected);
		List<WebElement> levels=Pojo.getObjSeleniumFunctions().getWebElementList(loc_textLevels);
		
		for(WebElement e:levels)
		{
			String strLevel=e.getText().replaceAll("[^0-9]","").trim();
			int intLevel=Integer.parseInt(strLevel);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level count is correct", intLevel<=totalLevelExpected);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level name is corrrect",e.getText().trim().equals("LEVEL "+intLevel));

		}
		
	}

	@Override
	public void verifyGameOverText() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game over text is showing", Pojo.getObjSeleniumFunctions().getText(loc_textGameOver).trim().equals("GAME OVER"));
	}

	@Override
	public void clickAndVerifyRules() {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rules are clicking", Pojo.getObjSeleniumFunctions().click(loc_rulesIcon));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_rulesTitle, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that title is correct", Pojo.getObjSeleniumFunctions().getText(loc_rulesTitle).equals("RULES"));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_rulesText, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rules are correct",Pojo.getObjSeleniumFunctions().getText(loc_rulesText).trim().equals(BuildMlgGamePage.expectedDataMLG.get("MLGRule").get(0)));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rules are closing", Pojo.getObjSeleniumFunctions().click(loc_btnCloseRule));
	}

	@Override
	public void verifyMlgPointsBeforePlaying() {
		String points=Pojo.getObjSeleniumFunctions().getText(loc_totalPointsBeforePlaying).trim();
		String textPoints=Pojo.getObjSeleniumFunctions().getText(loc_textPoints).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are correct",points.equals("0"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points text is correct",textPoints.equals("POINTS"));
	}

	@Override
	public void verifyLockedImageAfterFirstLevel() {
		int totalLevelExpected=BuildMlgGamePage.count;
		System.out.println("Level Count "+totalLevelExpected);
		By loc_levelOneImage=By.xpath("//span[contains(text(),'LEVEL 1')]//parent::div/child::div/child::div[2]//img[@class='level_img']");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that lock image is not appearing with level 1",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_levelOneImage));
		for(int i=2;i<=totalLevelExpected;i++)
		{
			levelName="LEVEL "+i;
			System.out.println("Level Name "+levelName);
		    By loc_lockedLevelImage=By.xpath("//span[contains(text(),'"+levelName+"')]/parent::div/child::div/child::div[2]/img[2]");
		    String lockImageAttribute=Pojo.getObjSeleniumFunctions().getAttribute(loc_lockedLevelImage, "class");
		    Pojo.getObjSeleniumFunctions().scrollToView(loc_lockedLevelImage);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that lock image is appearing with level ",lockImageAttribute.startsWith("lock_img"));

	}}
	
	@Override
	public void openAndVerifyLevel(int levelNum) {
		gameNum=levelNum-1;
		level="LEVEL "+levelNum;
		By loc_level=By.xpath("//span[contains(text(),'"+level+"')]");
		gameName=BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(gameNum);
		System.out.println("Level Name "+gameName);
		String expectedLevel=Pojo.getObjSeleniumFunctions().getText(loc_level).trim();
		System.out.println("Expected Level "+expectedLevel);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_level, 10);
		Pojo.getObjSeleniumFunctions().scrollToView(loc_level);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level is clicking", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_level));
		By loc_levelPopUp=By.xpath("//section[contains(@class,'level_details')]//child::span[contains(text(),'"+level+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_levelPopUp, 15);
		System.out.println("Actual Level "+Pojo.getObjSeleniumFunctions().getText(loc_levelPopUp));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level is correct on popup", expectedLevel.equals(Pojo.getObjSeleniumFunctions().getText(loc_levelPopUp).trim()));
	}

	@Override
	public void verifyGameNameOnLevelPopup() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_levelName, 10);
		String actualLevelName=Pojo.getObjSeleniumFunctions().getText(loc_levelName).trim();
		System.out.println("Expected Game Name "+gameName);
		System.out.println("Actual Game Name "+actualLevelName);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name is correct on level popup",gameName.equals(actualLevelName));
	}

	@Override
	public void verifyHowToWinText() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that how to win text is correct",Pojo.getObjSeleniumFunctions().getText(loc_howToWinText).trim().equals("HOW TO WIN"));

	}

	@Override
	public void verifyPointsCriteria() {
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(0)==true)
	    {
		int actualPoints=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsCriteria).trim().replaceAll("[^0-9]", ""));
		int expectedPoints=BuildMlgGamePage.expectedCriteria.get(BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(gameNum)).get(0);
		System.out.println("Expected Points Criteria "+expectedPoints);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are correct", actualPoints==expectedPoints);
	}}

	@Override
	public void verifyAttemptsCriteria() {
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(1)==true)
		{
		int actualAttempt=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_attemptsCriteria).trim());
		int expectedAttempts=BuildMlgGamePage.expectedCriteria.get(BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(gameNum)).get(1);
		System.out.println("Expected Attempt Criteria "+expectedAttempts);
		System.out.println("Actual Attempt Criteria "+actualAttempt);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts are correct", actualAttempt==expectedAttempts);
	}}

	@Override
	public void verifyHighScoreCriteria() {
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(2)==true)
		{
		String actualHighScore=Pojo.getObjSeleniumFunctions().getText(loc_highScoreCriteria).trim();
		int expectedHighScore=BuildMlgGamePage.expectedCriteria.get(BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(gameNum)).get(2);
		String strExpectedHighScore=Integer.toString(expectedHighScore)+"%";
		System.out.println("Expected High Score "+strExpectedHighScore);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is correct", actualHighScore.equals(strExpectedHighScore));
	}}

	@Override
	public void verifyLetsGoEnabled() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnLetsGo, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that lets go button is enabled", Pojo.getObjSeleniumFunctions().checkElementEnabled(loc_btnLetsGo));
		boolean status=Pojo.getObjSeleniumFunctions().checkElementEnabled(loc_btnLetsGo);
		System.out.println("Enabled or not "+status);
	}

	@Override
	public void verifyAndClickLetsGoButton() {
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnLetsGo, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that lets go text is correct", Pojo.getObjSeleniumFunctions().getText(loc_btnLetsGo).trim().equals("LET'S GO"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Lets go button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnLetsGo));
	}

	

	@Override
	public void verifyLetsGoDisabled() {
		String classAttribute=Pojo.getObjSeleniumFunctions().getAttribute(loc_btnLetsGoDisable,"class");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that lets go button is disabled",classAttribute.contains("click_disable"));

	}

	@Override
	public void verifyLevelPopUpGamePreview() {
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textLevels, 10);
    System.out.println("Actual level game preview "+Pojo.getObjSeleniumFunctions().getText(loc_textLevels));
	System.out.println("Expected level game preview "+level);
    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level number is correct", Pojo.getObjSeleniumFunctions().getText(loc_textLevels).trim().equals(level));	
	}

	@Override
	public void closeLevelPopUp() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnCloseLevel, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking on level popup",Pojo.getObjSeleniumFunctions().click(loc_btnCloseLevel));
	}

	@Override
	public boolean checkAllCriteriaMatched(HashMap<String, Integer> expectedDataCriteria) {
		
		boolean pointsStatus=true;
		boolean attemptStatus=true;
		boolean highScoreStatus=true;
		
		
		System.out.println("Game Criteria "+BuildMlgGamePage.statusCriteriaAdded.get(gameName));
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(0)==true)
		{
			totalPoints=expectedDataCriteria.get("TotalPoints");
			int expectedPoints=BuildMlgGamePage.expectedCriteria.get(BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(gameNum)).get(0);
            if(expectedDataCriteria.get("TotalPoints")>=expectedPoints)
            {
            	pointsStatus= true;
            }
            else
            {
            	pointsStatus= false;
            }
         }
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(1)==true)
		{
			int expectedAttempts=BuildMlgGamePage.expectedCriteria.get(BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(gameNum)).get(1);
			if(expectedDataCriteria.get("TotalGameCount")>=expectedAttempts)
	            {
				attemptStatus= true;
	            }
	            else
	            {
	            	attemptStatus =false;
	            }}

		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(2)==true)
		{		
			int expectedHighScore=BuildMlgGamePage.expectedCriteria.get(BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(gameNum)).get(2);
			System.out.println("Total Correct Ans "+expectedDataCriteria.get("TotalCorrectAns"));
			System.out.println("Total Ques Count "+expectedDataCriteria.get("QuestionCount"));
			
			float quesCount=expectedDataCriteria.get("QuestionCount");
			
			
			int actualHighScore=(int)(expectedDataCriteria.get("TotalCorrectAns")/(quesCount)*100);
			System.out.println("High Score Actual "+actualHighScore);
			System.out.println("Expected High Score "+BuildMlgGamePage.expectedCriteria.get(BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(gameNum)).get(2));
			if(actualHighScore>=expectedHighScore)
			{
				highScoreStatus=true;
			}
			else
			{
				highScoreStatus=false;
			}
		}
	System.out.println("Next level locked or not "+(pointsStatus&&attemptStatus&&highScoreStatus));
	return pointsStatus&&attemptStatus&&highScoreStatus;
	}

	@Override
	public void verifyNextLevelStatus(boolean status) {
		Pojo.getObjSeleniumFunctions().pageRefresh();
		if(status==true)
		{
			   level=level.replaceAll("[^0-9]", "");
			   nextLevel=Integer.parseInt(level)+1;
			   System.out.println("Unlocked Next Level "+nextLevel);
			   openAndVerifyLevel(nextLevel);
		       verifyAndClickLetsGoButton();
		       Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game preview screen is opening",Pojo.getObjSeleniumFunctions().getText(loc_gamereviewTitle).trim().equals("LIVE GAME PREVIEW"));
		}
		else
		{
			verifyLockedImageAfterFirstLevel();
			level=level.replaceAll("[^0-9]", "");
			nextLevel=Integer.parseInt(level)+1;
			System.out.println("Locked Next Level "+nextLevel);
			openAndVerifyLevel(nextLevel);
			verifyLetsGoDisabled();
			
			
		}
	}

	@Override
	public void verifyTotalPointsAfterEndingGameMLG(HashMap<String, Integer> expectedDataCriteria) {
		//int gamePoints=expectedDataCriteria.get("TotalPoints");
		//int previousMlgPoints=expectedDataCriteria.get("MLGPoints");
		//int totalPoints=gamePoints+previousMlgPoints;
		int totalPoints=expectedDataCriteria.get("MLGPoints");
	   System.out.println("Expected Total Points "+totalPoints);
	   System.out.println("Actual Total Points "+getMLGPoints());
	   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total MLG points are correct ", totalPoints==getMLGPoints());
	
	}

	@Override
	public int getMLGPoints() {
		//Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();

		//Pojo.getObjSeleniumFunctions().pageRefresh();
		//Pojo.getObjSeleniumFunctions().waitFor(10);
		//Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_totalPointsBeforePlaying, 10);
		int points=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_totalPointsBeforePlaying).trim().replaceAll("[^0-9]", ""));
		return points;
	}

	@Override
	public void clickBackSelectMLG() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnBackMLG));
		Pojo.getObjSeleniumFunctions().waitFor(2);
		
	}

	@Override
	public void verifyMlgPointsOnLeaderboard(HashMap<String, Integer> expectedData,String alreadyCreatedPlayerName) {
		
		int expectedLeaderboardPoints=expectedData.get("TotalPoints")+LeaderboardPageDesktopView.playerPoint;
		System.out.println("Leaderboard Points Expected "+expectedLeaderboardPoints);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are correct ", objLeaderboardPageDesktopView.getLeaderboardPoint(alreadyCreatedPlayerName)==expectedLeaderboardPoints);

	}

	@Override
	public void verifyUpdatedPointsLevelopup(HashMap<String, Integer> expectedData) {
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(0)==true)
	    {
		System.out.println("Points Expected "+expectedData.get("TotalPoints"));
		int actualPointsAchieved=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsAchievedLevelPopup).trim());
		int actualPointsCriteria=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsCriteria).trim().replaceAll("[^0-9]", ""));

			if(expectedData.get("TotalPoints")<=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsAchievedLevelPopup).trim().replaceAll("[^0-9]", "")))
				 {
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that upated points are correct", expectedData.get("TotalPoints")==actualPointsAchieved);
				 }
			else if(expectedData.get("TotalPoints")>Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsAchievedLevelPopup).trim()))
			  {
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that upated points are correct", actualPointsAchieved==actualPointsCriteria);

			  }}}

	@Override
	public void verifyUpdatedAttemptsLevelopup(HashMap<String, Integer> expectedData) {
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(1)==true)
	    {
		System.out.println("Attempts Expected "+expectedData.get("TotalGameCount"));
		int actualAttemptPlayed=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_attemptsAchievedLevelPopup).trim());
		int actualAttemptCriteria=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_attemptsCriteria).trim());

			if(expectedData.get("TotalGameCount")<=actualAttemptPlayed)
			{
		     Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts are correct", expectedData.get("TotalGameCount")==actualAttemptPlayed);
			}
			else if(expectedData.get("TotalGameCount")>actualAttemptPlayed)
			{
			     Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts are correct", actualAttemptPlayed==actualAttemptCriteria);
			}
	    }	
	}

	@Override
	public void verifyUpdatedHighScoreLevelopup(HashMap<String, Integer> expectedData) {
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(2)==true)
	    {
		float quesCount=expectedData.get("QuestionCount");

		int expectedHighScoreAchieved=(int)(expectedData.get("TotalCorrectAns")/(quesCount)*100);
		System.out.println("High Score expected "+expectedHighScoreAchieved);
		String strExpectedHighScore=Integer.toString(expectedHighScoreAchieved)+"%";
		String actualHighScore=Pojo.getObjSeleniumFunctions().getText(loc_highScoreAchievedLevelPopup).trim();
		int intActualHighScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_highScoreAchievedLevelPopup).trim().replaceAll("[^0-9]", ""));
		String strActualHighScorePopUp=Integer.toString(intActualHighScore)+"%";
		int actualHighScoreCriteria=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_highScoreCriteria).trim().replaceAll("[^0-9]", ""));
		String strActualHighScoreCriteria=Integer.toString(actualHighScoreCriteria)+"%";
		   if(expectedHighScoreAchieved<=intActualHighScore)
		   {
			   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is correct",strExpectedHighScore.equals(actualHighScore));
		   }
		   else if(expectedHighScoreAchieved>actualHighScoreCriteria)
		   {
			   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is correct",strActualHighScorePopUp.equals(strActualHighScoreCriteria));

		   }
	}}

	@Override
	public void pageRefresh() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that refresh is working", Pojo.getObjSeleniumFunctions().pageRefresh());
		Pojo.getObjUtilitiesFunctions().waitForPageLoad(20);
    	Pojo.getObjSeleniumFunctions().waitFor(5);
	}

	@Override
	public int getUpdatedPoints() {
		
		int actualPoints=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsAchievedLevelPopup).trim());
		return actualPoints;
	    
	}

	@Override
	public int getUpdatedAttempts() {
	    
		int actualAttempt=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_attemptsAchievedLevelPopup).trim());
		return actualAttempt;
	}

	@Override
	public int getUpdatedHighScore() {
		
		String actualHighScore=Pojo.getObjSeleniumFunctions().getText(loc_highScoreAchievedLevelPopup).trim().replaceAll("[^0-9]", "");
		int intHighScore=Integer.parseInt(actualHighScore);
		return intHighScore;
	}

	@Override
	public int getCriteriaPoints() {
		
		int actualPoints=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsCriteria).trim().replaceAll("[^0-9]", ""));
		return actualPoints;
	}

	@Override
	public int getCriteriaAttempts() {
	    
		int actualAttempt=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_attemptsCriteria).trim());
		return actualAttempt;
	}

	@Override
	public int getCriteriaHighScore() {
	    
		String actualHighScore  =Pojo.getObjSeleniumFunctions().getText(loc_highScoreCriteria).trim().replaceAll("[^0-9]", "");
		int intHighScore=Integer.parseInt(actualHighScore);
		return intHighScore;

	}

	@Override
	public void verifyGreenTickPoints() {
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(0)==true)	
		{
		  if(getUpdatedPoints()>=getCriteriaPoints()) {
			  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that green tick is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_greenTickPoints));
		  }
		  else
		  {
			  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that green tick is not appearing", Pojo.getObjSeleniumFunctions().checkElementNOTDisplayed(loc_greenTickPoints));

		  }
		}
	}

	@Override
	public void verifyGreenTickAttempts() {
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(1)==true)	
		{
			if(getUpdatedAttempts()>=getCriteriaAttempts()) {
				  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that green tick is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_greenTickAttempt));
			  }
			  else
			  {
				  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that green tick is not appearing", Pojo.getObjSeleniumFunctions().checkElementNOTDisplayed(loc_greenTickAttempt));

			  }
		}		
	}

	@Override
	public void verifyGreenTickHighScore() {
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(2)==true)	
		{
			if(getUpdatedHighScore()>=getCriteriaHighScore()) {
				  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that green tick is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_greenTickHighScore));
			  }
			  else
			  {
				  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that green tick is not appearing", Pojo.getObjSeleniumFunctions().checkElementNOTDisplayed(loc_greenTickHighScore));

			  }
		}		
	}

	@Override
	public void verifyMlgTrophyWithMlg() {
	    String expectedTrophyName=BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0);
		By loc_gametrophyIcon=By.xpath("//mat-card-title[contains(text(),'"+expectedTrophyName+"')]//parent::div/parent::div/following-sibling::div//child::img");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gametrophyIcon, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy icon is appearing with game",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_gametrophyIcon));
	}

	@Override
	public void verifyLevelNumberLevelCompletePopUp() {
		//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textLevelNumLevelCompPopup, 10);
		System.out.println("Expected Level Number on level complete popup: "+level);
		
		if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_textLevelNumLevelCompPopup)==false)
		{
			
			Pojo.getObjSeleniumFunctions().pageRefresh();
			Pojo.getObjSeleniumFunctions().waitFor(5);
		}
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textLevelNumLevelCompPopup, 15);
		System.out.println("Actual Level Number on level complete popup: "+Pojo.getObjSeleniumFunctions().getText(loc_textLevelNumLevelCompPopup).trim());
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level number is correct", Pojo.getObjSeleniumFunctions().getText(loc_textLevelNumLevelCompPopup).trim().equals(level));
	}

	@Override
	public void verifyLoadingAnimationDisappear() {
		Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_loadingCircle, 30);
		
	}
	
	@Override
	public void verifyCheckIconWithGameName() {
		String gameName=BuildSpGamePage.expectedData.get("GameName").get(0);
		By loc_checkIcon=By.xpath("//mat-card-title[contains(text(),'"+gameName+"')]//parent::div/parent::div//parent::mat-card//child::div[@class='check-icon']");
		String attrClass=Pojo.getObjSeleniumFunctions().getAttribute(loc_checkIcon, "class");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that disabled check icon is appearing",attrClass.equals("check-icon"));
	}

	@Override
	public void closeRuleIcon() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rules are closing", Pojo.getObjSeleniumFunctions().click(loc_btnCloseRule));

	}

	@Override
	public void selectAlreadyCreatedMLG(String mlgName) {
		By loc_MlgGameName=By.xpath("//mat-card-title[contains(text(),'"+mlgName+"')]");
		Pojo.getObjSeleniumFunctions().scrollToView(loc_MlgGameName);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_MlgGameName, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that already created mlg is selecting",Pojo.getObjSeleniumFunctions().click(loc_MlgGameName));
		

		 

		
	}

	@Override
	public void verifyPointsCriteria(String criteriaValue) {
		
		int actualPoints=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsCriteria).trim().replaceAll("[^0-9]", ""));
		int expectedPoints=Integer.parseInt(criteriaValue);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are correct", actualPoints==expectedPoints);
		
	}

	@Override
	public void verifyAttemptsCriteria(String criteriaValue) {
		int expectedAttempts=Integer.parseInt(criteriaValue);
		int actualAttempt=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_attemptsCriteria).trim());
		System.out.println("Expected Attempt Criteria "+expectedAttempts);
		System.out.println("Actual Attempt Criteria "+actualAttempt);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts are correct", actualAttempt==expectedAttempts);

	}

	@Override
	public void verifyHighScoreCriteria(String criteriaValue) {
		
		int expectedHighScore=Integer.parseInt(criteriaValue);
		String actualHighScore=Pojo.getObjSeleniumFunctions().getText(loc_highScoreCriteria).trim();
		String strExpectedHighScore=Integer.toString(expectedHighScore)+"%";
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is correct", actualHighScore.equals(strExpectedHighScore));
		
	}

	@Override
	public void verifyGameNameOnLevelPopup(String expectedGameName) {
		String actualLevelName=Pojo.getObjSeleniumFunctions().getText(loc_levelName).trim();
		System.out.println("Expected Game Name "+expectedGameName);
		System.out.println("Actual Game Name "+actualLevelName);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name is correct on level popup",expectedGameName.equals(actualLevelName));
		
	}

	@Override
	public void openAndVerifyLevelAlreadyCreatedMLG(int levelNum) {
		level="LEVEL "+levelNum;
		By loc_level=By.xpath("//span[contains(text(),'"+level+"')]");
        Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_level, 10);
		String expectedLevel=Pojo.getObjSeleniumFunctions().getText(loc_level).trim();
		System.out.println("Expected Level "+expectedLevel);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_level, 10);
		Pojo.getObjSeleniumFunctions().scrollToView(loc_level);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level is clicking", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_level));
		By loc_levelPopUp=By.xpath("//section[contains(@class,'level_details')]//child::span[contains(text(),'"+level+"')]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_levelPopUp, 15);
		System.out.println("Actual Level "+Pojo.getObjSeleniumFunctions().getText(loc_levelPopUp));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level is correct on popup", expectedLevel.equals(Pojo.getObjSeleniumFunctions().getText(loc_levelPopUp).trim()));
		
	}

	@Override
	public void verifyUpdatedPointsLevelopupAlreayCreatedMLG(HashMap<String, Integer> expectedData) {
	    
		System.out.println("Points Expected "+expectedData.get("TotalPoints"));
		int actualPointsAchieved=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsAchievedLevelPopup).trim());
		int actualPointsCriteria=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsCriteria).trim().replaceAll("[^0-9]", ""));

			if(expectedData.get("TotalPoints")<=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsAchievedLevelPopup).trim().replaceAll("[^0-9]", "")))
				 {
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that upated points are correct", expectedData.get("TotalPoints")==actualPointsAchieved);
				 }
			else if(expectedData.get("TotalPoints")>Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsAchievedLevelPopup).trim()))
			  {
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that upated points are correct", actualPointsAchieved==actualPointsCriteria);

			  }}
		
	

	@Override
	public void verifyUpdatedAttemptsLevelopupAlreadyCreatedMLG(HashMap<String, Integer> expectedData) {
		System.out.println("Attempts Expected "+expectedData.get("TotalGameCount"));
		int actualAttemptPlayed=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_attemptsAchievedLevelPopup).trim());
		int actualAttemptCriteria=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_attemptsCriteria).trim());

			if(expectedData.get("TotalGameCount")<=actualAttemptPlayed)
			{
		     Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts are correct", expectedData.get("TotalGameCount")==actualAttemptPlayed);
			}
			else if(expectedData.get("TotalGameCount")>actualAttemptPlayed)
			{
			     Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts are correct", actualAttemptPlayed==actualAttemptCriteria);
			}
	    }
		
	

	@Override
	public void verifyUpdatedHighScoreLevelopupAlreadyCreatedMLG(HashMap<String, Integer> expectedData) {
		float quesCount=expectedData.get("QuestionCount");

		int expectedHighScoreAchieved=(int)(expectedData.get("TotalCorrectAns")/(quesCount)*100);
		System.out.println("High Score expected "+expectedHighScoreAchieved);
		String strExpectedHighScore=Integer.toString(expectedHighScoreAchieved)+"%";
		String actualHighScore=Pojo.getObjSeleniumFunctions().getText(loc_highScoreAchievedLevelPopup).trim();
		int intActualHighScore=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_highScoreAchievedLevelPopup).trim().replaceAll("[^0-9]", ""));
		String strActualHighScorePopUp=Integer.toString(intActualHighScore)+"%";
		int actualHighScoreCriteria=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_highScoreCriteria).trim().replaceAll("[^0-9]", ""));
		String strActualHighScoreCriteria=Integer.toString(actualHighScoreCriteria)+"%";
		   if(expectedHighScoreAchieved<=intActualHighScore)
		   {
			   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is correct",strExpectedHighScore.equals(actualHighScore));
		   }
		   else if(expectedHighScoreAchieved>actualHighScoreCriteria)
		   {
			   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is correct",strActualHighScorePopUp.equals(strActualHighScoreCriteria));

		   }
	}

	@Override
	public boolean checkAllCriteriaMatched(HashMap<String, Integer> expectedDataCriteria, int points, int attempts,int highScore) {
		boolean pointsStatus=true;
		boolean attemptStatus=true;
		boolean highScoreStatus=true;
		
		
	//	System.out.println("Game Criteria "+BuildMlgGamePage.statusCriteriaAdded.get(gameName));
		//if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(0)==true)
		
			totalPoints=expectedDataCriteria.get("TotalPoints");
            if(expectedDataCriteria.get("TotalPoints")>=points)
            {
            	pointsStatus= true;
            }
            else
            {
            	pointsStatus= false;
            }
         
		
			if(expectedDataCriteria.get("TotalGameCount")>=attempts)
	            {
				attemptStatus= true;
	            }
	            else
	            {
	            	attemptStatus =false;
	            }

		
			System.out.println("Total Correct Ans "+expectedDataCriteria.get("TotalCorrectAns"));
			System.out.println("Total Ques Count "+expectedDataCriteria.get("QuestionCount"));
			
			int expectedHighScore=expectedDataCriteria.get("TotalCorrectAns")/expectedDataCriteria.get("QuestionCount");
			expectedHighScore=expectedHighScore*100;

			
			System.out.println("High Score Actual "+highScore);
			System.out.println("Expected High Score "+expectedHighScore);
			if(highScore>=expectedHighScore)
			{
				highScoreStatus=true;
			}
			else
			{
				highScoreStatus=false;
			}
		
	
	System.out.println("Next level locked or not "+(pointsStatus&&attemptStatus&&highScoreStatus));
	return pointsStatus&&attemptStatus&&highScoreStatus;
		
	}

	@Override
	public void verifyNextLevelStatusAlreayCreatedMlg(boolean status) {
		Pojo.getObjSeleniumFunctions().pageRefresh();
		if(status==true)
		{
			   level=level.replaceAll("[^0-9]", "");
			   nextLevel=Integer.parseInt(level)+1;
			   System.out.println("Unlocked Next Level "+nextLevel);
			   openAndVerifyLevelAlreadyCreatedMLG(nextLevel);
		       verifyAndClickLetsGoButton();
		       Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game preview screen is opening",Pojo.getObjSeleniumFunctions().getText(loc_gamereviewTitle).trim().equals("LIVE GAME PREVIEW"));
		}
		else
		{
			verifyLockedImageAfterFirstLevel();
			level=level.replaceAll("[^0-9]", "");
			nextLevel=Integer.parseInt(level)+1;
			System.out.println("Locked Next Level "+nextLevel);
			openAndVerifyLevelAlreadyCreatedMLG(nextLevel);
			verifyLetsGoDisabled();
			
			
		}		
	}

	@Override
	public void verifyNextLevelLocked(boolean status) {
		Pojo.getObjSeleniumFunctions().pageRefresh();
		verifyLockedImageAfterFirstLevel();
		level=level.replaceAll("[^0-9]", "");
		nextLevel=Integer.parseInt(level)+1;
		System.out.println("Locked Next Level "+nextLevel);
		openAndVerifyLevelAlreadyCreatedMLG(nextLevel);
		verifyLetsGoDisabled();		
	}

	@Override
	public void verifyMlgTrophyWithMlg(String mlgName) {
		By loc_gametrophyIcon=By.xpath("//mat-card-title[contains(text(),'"+mlgName+"')]//parent::div/parent::div/following-sibling::div//child::img");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gametrophyIcon, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy icon is appearing with game",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_gametrophyIcon));		
	}

	@Override
	public void verifySelectGameScreenAndroidApp() {
		// TODO Auto-generated method stub
		
	}

	}

	




	


