package com.testH.base.pages.androidApp;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.desktopView.LeaderboardPageDesktopView;
import com.testH.base.pages.PageFactory;
import com.testH.base.pages.admin.BuildMlgGamePage;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.admin.GameLibraryPage;
import com.testH.base.pages.admin.TrophiesPageAdmin;
import com.testH.base.pages.client.SelectGamePage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

public class SelectGamePageAndroidApp extends SelectGamePage  
{

	By loc_textGame=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/fragment_contest_game_tv\")");
	By loc_btnCenter=MobileBy.xpath("//android.widget.LinearLayout//child::*[contains(@class,'androidx.appcompat.app')][3]");
	By loc_listGames=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/contest_practice_game_game_name_tv\")");
	By loc_highScorePercentageText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_list_item_score_tv\")");
	By loc_rulesIcon=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_rules\")");
	By loc_levelIndicator=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/gameProgress\")");
	By loc_trophiesIcon=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/newTrophy1\")");
	By loc_textLevels=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/txtLevelOne\")");
	By loc_textGameOver=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/lblGameOver\")");
	By loc_rulesTitle=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/contest_dialog_rules_title_tv\")");
	By loc_rulesText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/mlg_rules\")");
	By loc_btnCloseRule=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/close_dialog\")");
	By loc_totalPointsBeforePlaying=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/lblTotalPoints\")");
	By loc_textPoints=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/lblPoints\")");
	By loc_howToWinText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/lblHowToWin\")");
	By loc_pointsCriteria=MobileBy.xpath("//android.widget.TextView[@text='POINTS']//following-sibling::android.view.ViewGroup//child::android.widget.TextView[2]");
	By loc_attemptsCriteria=MobileBy.xpath("//android.widget.TextView[@text='ATTEMPTS']//following-sibling::android.view.ViewGroup//child::android.widget.TextView[2]");
	By loc_highScoreCriteria=MobileBy.xpath("//android.widget.TextView[@text='HIGH SCORE']//following-sibling::android.view.ViewGroup//child::android.widget.TextView[2]");
	By loc_btnLetsGo=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/nextGame\")");
	By loc_btnLetsGoDisable=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/nextGame\")");
	By loc_btnCloseLevel=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/closeDailog\")");
	By loc_levelName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/lblGameName\")");
	By loc_levelPopUp=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/achievement_dialog__fragment_view_holder_cl\")");
    By loc_levelCount=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/achievement_dialog__fragment_achieved_tv\")");
    By loc_textLevelsGamePreview=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/achievement_dialog__fragment_achieved_tv\")");
    By loc_pointsAchievedLevelPopup=MobileBy.xpath("//android.widget.TextView[@text='POINTS']//following-sibling::android.view.ViewGroup//child::android.widget.TextView[1]");
    By loc_attemptsAchievedLevelPopup=MobileBy.xpath("//android.widget.TextView[@text='ATTEMPTS']//following-sibling::android.view.ViewGroup//child::android.widget.TextView[1]");
    By loc_highScoreAchievedLevelPopup=MobileBy.xpath("//android.widget.TextView[@text='HIGH SCORE']//following-sibling::android.view.ViewGroup//child::android.widget.TextView[1]");
	By loc_gamereviewTitle=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");

	double highScore=0;
	String highScoreExp="";
	String levelName="";
	static String gameName="";
	int gameNum=0;
	static String level="";
	int nextLevel;
	int totalPoints=0;


	LeaderboardPageAndroidApp objLeaderboardPageAndroidApp=new LeaderboardPageAndroidApp();




	@Override
	public void verifySelectGameScreen(String companyName) {

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that user is not select game screen", Pojo.getObjSeleniumFunctions().getText(loc_textGame).trim().equals("GAMES"));
	}

	@Override
	public void selectGame() {
		List<AndroidElement> gameList;
		//gameList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_listGames);
		//int gameCount=gameList.size();
		//int ran_Num= Pojo.getObjUtilitiesFunctions().getRandomNumber(1,gameCount);
		
		//By loc_gameList=By.xpath("//div[contains(@class,'gameList')]//child::mat-card["+ran_Num+"]");
		//System.out.println("Game Path "+loc_gameList);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Game is selecting", Pojo.getObjSeleniumFunctions().click(loc_listGames));
		
	}

	@Override
	public void verifyGameList() {
		List<AndroidElement> gameList;
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_listGames, 15);
        gameList=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_listGames);
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct live games are appearing",gameList.size()>0);		
	}

	@Override
	public void verifyLiveGameWebApp() {
		List<AndroidElement> gameList;
        List<String> gameNamesWebApp=new ArrayList<String>();
		List<String> gameNamesAdmin;
        String gameName;
        
        
        gameList=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_listGames);
        gameNamesAdmin= GameLibraryPage.gameList;
        System.out.println("Game Names Admin: "+gameNamesAdmin);
        
		for(AndroidElement l:gameList)
		{
		   gameName=l.getText().trim();
		   gameNamesWebApp.add(gameName);
		}
		
		System.out.println("Game Names WebApp "+gameNamesWebApp);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct live games are appearing",gameNamesWebApp.contains(BuildSpGamePage.expectedData.get("GameName").get(0).toUpperCase()));
	}

	@Override
	public void selectRecentlyCreatedGame(String gameName) {
		
		
		ArrayList<String> games = new ArrayList<String>();
	    games.add(gameName);
		
		BuildSpGamePage.expectedData.put("GameName",games);

		String gameNameUpperCase=gameName.toUpperCase();
		System.out.println("Recently Created Game Name "+gameNameUpperCase);
	    By loc_recentCreatedGame=MobileBy.xpath("//android.widget.TextView[@text='"+gameNameUpperCase+"']//parent::android.view.ViewGroup");
	    
		Pojo.getObjSeleniumFunctions().androidScroll(gameNameUpperCase);
		
		if(Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_recentCreatedGame, 5)==false)
		{
			Pojo.getObjSeleniumFunctions().androidScroll(gameNameUpperCase);

		}

	    Pojo.getObjSeleniumFunctions().waitFor(3);
	    //Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_recentCreatedGame, 25);
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct game name is clicking",Pojo.getObjSeleniumFunctions().tap(loc_recentCreatedGame));		
	}

	@Override
	public void clickGamesIconSideMenu() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnCenter, 15);
		Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that center button is clicking to open game screen",Pojo.getObjSeleniumFunctions().click(loc_btnCenter));
	}

	@Override
	public void verifyHighScorePercentageText(String gameName) {
		

		selectRecentlyCreatedGame(gameName);
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score percentage is correct", Pojo.getObjSeleniumFunctions().getText(loc_highScorePercentageText).trim().equals("High score 0%"));
		Pojo.getObjSeleniumFunctions().navigateToBack();
	}

	@Override
	public void verifyHighScore(int totalGameQues,float countCorrectAns,String gameName) {
		
        selectRecentlyCreatedGame(gameName);
        String highScoreValue=Pojo.getObjSeleniumFunctions().getText(loc_highScorePercentageText).trim();
		highScoreValue=highScoreValue.replaceAll("[^0-9.]", "");
		highScoreValue=highScoreValue+"%";
		System.out.println("High Score Actual "+highScoreValue);
		
//		int catCount=BuildSpGamePage.expectedDataCount.get("CategoryCount");
//		int quesCount=BuildSpGamePage.expectedDataCount.get("QuestionCount");
//		int expectedHighScore=(int) ((countCorrectAns/(catCount*quesCount))*100);
		
		double expectedHighScore=(double) ((countCorrectAns/totalGameQues)*100);
		expectedHighScore=Double.parseDouble(new DecimalFormat("##.##").format(expectedHighScore));

		if(expectedHighScore>=highScore)
		{
			highScore=expectedHighScore;
		}
		
		if(countCorrectAns%totalGameQues==0||countCorrectAns==0)
		{
			int highScoreInt=(int) highScore;
			System.out.println("Expected High Score Int "+highScoreInt);
			highScoreExp=highScoreInt+"%";
		}
		else
		{
		highScoreExp=highScore+"%";
		System.out.println("Expected High Score double "+highScoreExp);

		}
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that High score is showing correctly", highScoreValue.equals(highScoreExp));
	}

	@Override
	public void verifyGameTrophyWithGame() {//Game trophy does not appear with gamename on android
		
		Pojo.getObjSeleniumFunctions().androidScroll("TROPHY GAME PLAY");
		By loc_pointsCriteria=MobileBy.xpath("//android.widget.TextView[@text='TROPHY GAME PLAY']//parent::android.view.ViewGroup//child::android.widget.ImageView[@resource-id='com.ionicframework.SaleshuddleApp:id/trohy_iv']");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy icon is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_pointsCriteria));
	}

	@Override
	public boolean refrestTillGameLive(String gameName) {
	
	String gameNameUpperCase=gameName.toUpperCase();
	System.out.println("Game Name Upper Case "+gameNameUpperCase);
    By loc_recentCreatedGame=MobileBy.xpath("//android.widget.TextView[@text='"+gameNameUpperCase+"']");
	Pojo.getObjSeleniumFunctions().androidScroll(gameNameUpperCase);
	boolean isGameDisplayed=false;
	
	for(int i=1;i<=5;i++)
	{
	if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_recentCreatedGame)==false)
	{
		Pojo.getObjSeleniumFunctions().pageRefreshNativeApp(loc_textGame, loc_btnCenter);
		Pojo.getObjSeleniumFunctions().androidScroll(gameNameUpperCase);
		Pojo.getObjSeleniumFunctions().waitFor(10);
    }
	else
	{
		isGameDisplayed=true;
		break;
	}
	}
//	while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_recentCreatedGame)==false)
//		{
//			Pojo.getObjSeleniumFunctions().pageRefreshNativeApp(loc_textGame, loc_btnCenter);
//			Pojo.getObjSeleniumFunctions().androidScroll(gameNameUpperCase);
//			Pojo.getObjSeleniumFunctions().waitFor(10);
//		}
		
		
     return isGameDisplayed;
	}

	@Override
	public void verifyMlgLiveGameWebApp() {
		List<AndroidElement> gameList;
		List<String> gameNamesAndroidApp=new ArrayList<String>();
        String gameName;
        gameList=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_listGames);
        
		for(AndroidElement l:gameList)
		{
		   gameName=l.getText().trim();
		   gameNamesAndroidApp.add(gameName);
		}
		
		Pojo.getObjSeleniumFunctions().androidScroll(BuildSpGamePage.expectedData.get("GameName").get(0).toUpperCase());
		System.out.println("Game Names android "+gameNamesAndroidApp);
		System.out.println("Game Name Live "+BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0).toUpperCase());
		
	    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct mlg is in live state",gameNamesAndroidApp.contains(BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0).toUpperCase()));		
	}

	@Override
	public void verifyMlgNotDisplayingOtherLocationDept() {

		String mlgGameName=BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0);
		mlgGameName=mlgGameName.toUpperCase();
		By loc_MlgGameName=MobileBy.xpath("//android.widget.TextView[@text='"+mlgGameName+"']//parent::android.view.ViewGroup");
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MLG is not displaying to other location dept user",Pojo.getObjSeleniumFunctions().checkElementNOTDisplayed(loc_MlgGameName));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MLG is not displaying to other location dept user",Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_MlgGameName)==false);		
	}

	@Override
	public void selectRecentlyCreatedMLG() {
		String mlgGameName=BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0);
		mlgGameName=mlgGameName.toUpperCase();
		By loc_MlgGameName=MobileBy.xpath("//android.widget.TextView[@text='"+mlgGameName+"']//parent::android.view.ViewGroup");
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
		By loc_MlgGameName=MobileBy.xpath("//android.widget.TextView[@text='"+mlgGameName+"']");
        String actualMlg=Pojo.getObjSeleniumFunctions().getText(loc_MlgGameName).toUpperCase();
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that mlg game name is correct",actualMlg.trim().equals(mlgGameName));		
	}

	

	@Override
	public void verifyLevelIndicatorAndTrophyImage() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level indicator is showing correctly", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_levelIndicator));
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy image is showing correctly with level indicator",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_trophiesIcon));		
	}

	@Override
	public void verifyLevelCount() {
		int totalLevelActual=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_textLevels).size();
		int totalLevelExpected=BuildMlgGamePage.count;
		System.out.println("Level Count Expected "+totalLevelExpected);
		System.out.println("Level Count Actual "+totalLevelActual);
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level count is correct", totalLevelActual==totalLevelExpected);
		List<AndroidElement> levels=Pojo.getObjSeleniumFunctions().getWebElementListAndroidApp(loc_textLevels);
		
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
		By loc_levelOneLockImage=MobileBy.xpath("//android.widget.TextView[@text='LEVEL 1']//preceding::android.widget.ImageView[@resource-id='com.ionicframework.SaleshuddleApp:id/lock_icon']");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that lock image is not appearing with level 1",Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_levelOneLockImage)==false);
		for(int i=2;i<=totalLevelExpected;i++)
		{
			levelName="LEVEL "+i;
			System.out.println("Level Name "+levelName);
			By loc_lockedLevelImage=MobileBy.xpath("//android.widget.TextView[@text='"+levelName+"']//preceding::android.widget.ImageView[@resource-id='com.ionicframework.SaleshuddleApp:id/lock_icon']");
            Pojo.getObjSeleniumFunctions().scrollToView(loc_lockedLevelImage);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that lock image is appearing with level ",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_lockedLevelImage));

	}		
	}

	

	@Override
	public void verifyGameNameOnLevelPopup() {
		// TODO Auto-generated method stub
		
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
	}		
	}

	@Override
	public void verifyAttemptsCriteria() {
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(1)==true)
		{
		int actualAttempt=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_attemptsCriteria).trim());
		int expectedAttempts=BuildMlgGamePage.expectedCriteria.get(BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(gameNum)).get(1);
		System.out.println("Expected Attempt Criteria "+expectedAttempts);
		System.out.println("Actual Attempt Criteria "+actualAttempt);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts are correct", actualAttempt==expectedAttempts);
	}		
	}

	@Override
	public void verifyHighScoreCriteria() {
		if(BuildMlgGamePage.statusCriteriaAdded.get(gameName).get(2)==true)
		{
		String actualHighScore=Pojo.getObjSeleniumFunctions().getText(loc_highScoreCriteria).trim();
		int expectedHighScore=BuildMlgGamePage.expectedCriteria.get(BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(gameNum)).get(2);
		String strExpectedHighScore=Integer.toString(expectedHighScore)+"%";
		System.out.println("Expected High Score "+strExpectedHighScore);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is correct", actualHighScore.equals(strExpectedHighScore));
	}
	}

	@Override
	public void verifyLetsGoEnabled() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyAndClickLetsGoButton() {
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnLetsGo, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that lets go text is correct", Pojo.getObjSeleniumFunctions().getText(loc_btnLetsGo).trim().equals("LET'S GO"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Lets go button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnLetsGo));		
	}

	@Override
	public void openAndVerifyLevel(int levelNum) {
		gameNum=levelNum-1;
		level="LEVEL "+levelNum;
		By loc_level=MobileBy.xpath("//android.widget.TextView[@text='"+level+"']//preceding::android.widget.RelativeLayout[1]");
		gameName=BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(gameNum);
		System.out.println("Level Name "+gameName);
		String expectedLevel=Pojo.getObjSeleniumFunctions().getText(loc_level).trim();
		System.out.println("Expected Level "+expectedLevel);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_level, 10);
		Pojo.getObjSeleniumFunctions().androidScroll("level");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level is clicking", Pojo.getObjSeleniumFunctions().tap(loc_level));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_levelPopUp, 15);
		
		System.out.println("Actual Level "+Pojo.getObjSeleniumFunctions().getText(loc_levelCount));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level is correct on popup", expectedLevel.equals(Pojo.getObjSeleniumFunctions().getText(loc_levelCount).trim()));		
	}

	@Override
	public void verifyLetsGoDisabled() {
		//Ask developer to set attribute for disabled item
		//String classAttribute=Pojo.getObjSeleniumFunctions().getAttribute(loc_btnLetsGoDisable,"class");
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that lets go button is disabled",classAttribute.contains("click_disable"));		
	}

	@Override
	public void verifyLevelPopUpGamePreview() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textLevelsGamePreview, 10);
	    System.out.println("Actual level game preview "+Pojo.getObjSeleniumFunctions().getText(loc_textLevelsGamePreview));
		System.out.println("Expected level game preview "+level);
	    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level number is correct", Pojo.getObjSeleniumFunctions().getText(loc_textLevelsGamePreview).trim().equals(level));			
	}

	@Override
	public void closeLevelPopUp() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnCloseLevel, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking on level popup",Pojo.getObjSeleniumFunctions().click(loc_btnCloseLevel));		
	}

	@Override
	public boolean checkAllCriteriaMatched(HashMap<String, Integer> expectedDataCriteria) {
		// TODO Auto-generated method stub
		return false;
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
		int gamePoints=expectedDataCriteria.get("TotalPoints");
		int previousMlgPoints=expectedDataCriteria.get("MLGPoints");
		int totalPoints=gamePoints+previousMlgPoints;
	   System.out.println("Expected Total Points "+totalPoints);
	   System.out.println("Actual Total Points "+getMLGPoints());
	   Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total MLG points are correct ", totalPoints==getMLGPoints());		
	}

	@Override
	public int getMLGPoints() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_totalPointsBeforePlaying, 10);
		int points=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_totalPointsBeforePlaying).trim().replaceAll("[^0-9]", ""));
		return points;
	}

	@Override
	public void clickBackSelectMLG() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is clicking",Pojo.getObjSeleniumFunctions().navigateToBack());
		
	}

	@Override
	public void verifyMlgPointsOnLeaderboard(HashMap<String, Integer> expectedData,String alreadyCreatedPlayerName) {
		int expectedLeaderboardPoints=expectedData.get("TotalPoints")+objLeaderboardPageAndroidApp.playerPoint;
		System.out.println("Leaderboard Points Expected "+expectedLeaderboardPoints);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are correct ", objLeaderboardPageAndroidApp.getLeaderboardPoint(alreadyCreatedPlayerName)==expectedLeaderboardPoints);		
	}

	@Override
	public void verifyUpdatedPointsLevelopup(HashMap<String, Integer> expectedDataCriteria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyUpdatedAttemptsLevelopup(HashMap<String, Integer> expectedDataCriteria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyUpdatedHighScoreLevelopup(HashMap<String, Integer> expectedDataCriteria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pageRefresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getUpdatedPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUpdatedAttempts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getUpdatedHighScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCriteriaPoints() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCriteriaAttempts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCriteriaHighScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void verifyGreenTickPoints() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyGreenTickAttempts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyGreenTickHighScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyMlgTrophyWithMlg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyLevelNumberLevelCompletePopUp() {
System.out.println("Expected Level Number on level complete popup: "+level);
		
		if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_levelCount)==false)
		{
			
			Pojo.getObjSeleniumFunctions().pageRefresh();
			Pojo.getObjSeleniumFunctions().waitFor(5);
		}
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_levelCount, 15);
		System.out.println("Actual Level Number on level complete popup: "+Pojo.getObjSeleniumFunctions().getText(loc_levelCount).trim());
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level number is correct", Pojo.getObjSeleniumFunctions().getText(loc_levelCount).trim().equals(level));		
	}

	@Override
	public void verifyLoadingAnimationDisappear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyCheckIconWithGameName() {
		String gameName=BuildSpGamePage.expectedData.get("GameName").get(0);
		gameName=gameName.toUpperCase();
		By loc_checkIcon=MobileBy.xpath("//android.widget.TextView[@text='"+gameName+"']//parent::android.view.ViewGroup//child::android.widget.ImageView");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that disabled check icon is appearing",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_checkIcon));
	}

	@Override
	public void closeRuleIcon() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectAlreadyCreatedMLG(String mlgName) {
		mlgName=mlgName.toUpperCase();
		By loc_MlgGameName=MobileBy.xpath("//android.widget.TextView[@text='"+mlgName+"']//parent::android.view.ViewGroup");
		Pojo.getObjSeleniumFunctions().androidScroll(mlgName.toUpperCase());
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
		String strActualAtt=Pojo.getObjSeleniumFunctions().getText(loc_attemptsCriteria).trim().replaceAll("[^0-9]","");
		int actualAttempt=Integer.parseInt(strActualAtt);
		System.out.println("Expected Attempt Criteria "+expectedAttempts);
		System.out.println("Actual Attempt Criteria "+actualAttempt);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts are correct", actualAttempt==expectedAttempts);		
	}

	@Override
	public void verifyHighScoreCriteria(String criteriaValue) {
		int expectedHighScore=Integer.parseInt(criteriaValue);
		String actualHighScore=Pojo.getObjSeleniumFunctions().getText(loc_highScoreCriteria).trim().replaceAll("[^0-9]","")+"%";
		String strExpectedHighScore=Integer.toString(expectedHighScore)+"%";
		System.out.println("Actual High Score: "+actualHighScore);
		System.out.println("Expected High Score: "+strExpectedHighScore);
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
		By loc_level=MobileBy.xpath("//android.widget.TextView[@text='"+level+"']");
        Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_level, 15);
		String expectedLevel=Pojo.getObjSeleniumFunctions().getText(loc_level).trim();
		System.out.println("Expected Level "+expectedLevel);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_level, 10);
		Pojo.getObjSeleniumFunctions().androidScroll(level);
		By loc_levelImage=MobileBy.xpath("//android.widget.TextView[@text='"+level+"']//preceding::android.widget.RelativeLayout[1]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level is clicking", Pojo.getObjSeleniumFunctions().tap(loc_levelImage));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_levelPopUp, 15);
		System.out.println("Actual Level "+Pojo.getObjSeleniumFunctions().getText(loc_levelCount));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level is correct on popup", expectedLevel.equals(Pojo.getObjSeleniumFunctions().getText(loc_levelCount).trim()));	}

	@Override
	public void verifyUpdatedPointsLevelopupAlreayCreatedMLG(HashMap<String, Integer> expectedData) {
		System.out.println("Points Expected "+expectedData.get("TotalPoints"));
		int actualPointsAchieved=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsAchievedLevelPopup).trim());
		int actualPointsCriteria=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsCriteria).trim().replaceAll("[^0-9]", ""));

			if(expectedData.get("TotalPoints")<=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsAchievedLevelPopup).trim().replaceAll("[^0-9]", "")))
				 {
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that updated points are correct", expectedData.get("TotalPoints")==actualPointsAchieved);
				 }
			else if(expectedData.get("TotalPoints")>Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsAchievedLevelPopup).trim().replaceAll("[^0-9]", "")))
			  {
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that updated points are correct", actualPointsAchieved==actualPointsCriteria);

			  }}		
	

	@Override
	public void verifyUpdatedAttemptsLevelopupAlreadyCreatedMLG(HashMap<String, Integer> expectedData) {
		System.out.println("Attempts Expected "+expectedData.get("TotalGameCount"));
		int actualAttemptPlayed=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_attemptsAchievedLevelPopup).trim());
		int actualAttemptCriteria=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_attemptsCriteria).trim().replaceAll("[^0-9]", ""));

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
	public boolean checkAllCriteriaMatched(HashMap<String, Integer> expectedDataCriteria, int points, int attempts,
			int highScore) {
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
		//Pojo.getObjSeleniumFunctions().pageRefresh();
		if(status==true)
		{
			   level=level.replaceAll("[^0-9]", "");
			   nextLevel=Integer.parseInt(level)+1;
			   System.out.println("Unlocked Next Level "+nextLevel);
			   openAndVerifyLevelAlreadyCreatedMLG(nextLevel);
		       verifyAndClickLetsGoButton();
		       Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gamereviewTitle, 10);
		       Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game preview screen is opening",Pojo.getObjSeleniumFunctions().getText(loc_gamereviewTitle).trim().equals("Live Game Preview"));
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
		//Pojo.getObjSeleniumFunctions().pageRefresh();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Level popup is closing", Pojo.getObjSeleniumFunctions().click(loc_btnCloseLevel));
		verifyLockedImageAfterFirstLevel();
		level=level.replaceAll("[^0-9]", "");
		nextLevel=Integer.parseInt(level)+1;
		System.out.println("Locked Next Level "+nextLevel);
		openAndVerifyLevelAlreadyCreatedMLG(nextLevel);
		verifyLetsGoDisabled();		
	}

	@Override
	public void verifyMlgTrophyWithMlg(String mlgName) {
		mlgName=mlgName.toUpperCase();
		By loc_gametrophyIcon=MobileBy.xpath("//android.widget.TextView[@text='"+mlgName+"']/parent::android.view.ViewGroup//child::android.widget.ImageView[@resource-id='com.ionicframework.SaleshuddleApp:id/trohy_iv']");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gametrophyIcon, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy icon is appearing with game",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_gametrophyIcon));		
	}

	@Override
	public void verifySelectGameScreenAndroidApp() {
		String actualTitle= Pojo.getObjSeleniumFunctions().getText(loc_textGame).trim();
		

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Select Game screen title is correct", "GAMES".equals(actualTitle));

		
	}

	@Override
	public void verifyMlgNotDisplayingSameLocationOtherDept() {
		String mlgGameName=BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0);
		//By loc_MlgGameName=By.xpath("//mat-card-title[contains(text(),'"+mlgGameName+"')]");
		boolean isMlgDisplayed=refrestTillGameLive(mlgGameName);
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MLG is not displaying to other location dept user",Pojo.getObjSeleniumFunctions().checkElementNOTDisplayed(loc_MlgGameName));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MLG is not displaying to same location other dept user",isMlgDisplayed==false);				
	}

	
	
		
	}

	
	



