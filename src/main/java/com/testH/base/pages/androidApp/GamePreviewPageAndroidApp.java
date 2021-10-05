package com.testH.base.pages.androidApp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.GamePreviewPageAdmin;
import com.testH.base.pages.admin.ScheduleGamePage;
import com.testH.base.pages.admin.TrophiesPageAdmin;
import com.testH.base.pages.client.GamePreviewPage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

public class GamePreviewPageAndroidApp extends GamePreviewPage  {
	
	By loc_titleTextProfile=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_info_header_tv\")");
	By loc_scenarioTextProfile=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_info_desc_tv\")");
	By loc_btnPlayGame=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_profile_play_game_bt\")");
	By loc_titleGamePreview=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_titleTrophy=MobileBy.xpath("//android.widget.TextView[@text='TROPHY']");
	By loc_trophyIconHorizontolScroll=By.xpath("//android.widget.TextView[@text='TROPHY']/parent::android.view.ViewGroup/child::android.widget.ImageView");
	By loc_descTrophy=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/enhance_trophy_frag_trophy_desc_tv\")");
	By loc_highScoreText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/enhance_trophy_high_score_tv_lbl\")");
	By loc_highScoreValue=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/enhance_trophy_high_score_tv\")");
    By loc_gameAttemptText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/enhance_trophy_attempts_tv_lbl\")");
    By loc_gameAttemptValue=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/enhance_trophy_attempts_tv\")");
    By loc_totalPointsText=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/enhance_trophy_points_tv_lbl\")");
    By loc_totalPointsValue=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/enhance_trophy_points_tv\")");
    By loc_gameToGo=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_to_go\")");
    By loc_attemptDetails=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_to_go_attempts\")");
    By loc_iconLevelDetails=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_criteria_iv\")");
    
	public int gameCount=0;

    
	@Override
	public void verifyGamepreviewScreen() {
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleGamePreview, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game preview screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_titleGamePreview).trim().equals("Game Preview"));
		
	}

	@Override
	public void clickPlayGameButton() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnPlayGame, 15);
		System.out.println("Click Play Game");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnPlayGame, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Play button is clicking ", Pojo.getObjSeleniumFunctions().tap(loc_btnPlayGame));
		System.out.println("Click Play Button 1");
	    gameCount=gameCount+1;
	    Pojo.getObjSeleniumFunctions().waitFor(7);
	}

	@Override
	public void verifyPreviewTitle(String expectedTitle) {
		Pojo.getObjSeleniumFunctions().waitFor(3);
	//	String expectedTitleUpperCase=expectedTitle.toUpperCase();
		String actualTitle=Pojo.getObjSeleniumFunctions().getText(loc_titleTextProfile).trim();
		System.out.println("Expected Preview Title "+expectedTitle);
		System.out.println("Actual preview Title "+actualTitle);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that preview title is correct",actualTitle.equals(expectedTitle));		
	}

	@Override
	public void verifyScenario(String expectedScenario) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_scenarioTextProfile, 10);
		String actualScenario=Pojo.getObjSeleniumFunctions().getText(loc_scenarioTextProfile).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that preview scenario is correct",actualScenario.equals(expectedScenario));		
	}

	

	@Override
	public void verifyPreviewInfo() {
		String infoTitleExpected=GamePreviewPageAdmin.expectedProfileDataList.get("Information").get(0).toString();
		String infoDescExpected=GamePreviewPageAdmin.expectedProfileDataList.get("Information").get(1).toString();


		By loc_infoTitle=MobileBy.xpath("//android.widget.TextView[@text='"+infoTitleExpected+"']");
	    By loc_expandPlusBtnInfoTitle=MobileBy.xpath("//android.widget.TextView[@text='"+infoTitleExpected+"']/following-sibling::android.widget.ImageView[@resource-id='com.ionicframework.SaleshuddleApp:id/expand_iv']");
	    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that expand button is clicking", Pojo.getObjSeleniumFunctions().tap(loc_expandPlusBtnInfoTitle));
		By loc_infoDesc=MobileBy.xpath("//android.widget.TextView[@text='"+infoDescExpected+"']");
	
		String infoTitleActual=Pojo.getObjSeleniumFunctions().getText(loc_infoTitle);
		String infoDescActual=Pojo.getObjSeleniumFunctions().getText(loc_infoDesc);
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that info title is correct", infoTitleExpected.equals(infoTitleActual));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that info desc is correct", infoDescExpected.equals(infoDescActual));

		
		
				
	}

	@Override
	public void verifyTrophyField() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy icon is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_trophyIconHorizontolScroll));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_titleTrophy).trim().equals("TROPHY"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy is clicking", Pojo.getObjSeleniumFunctions().tap(loc_titleTrophy));
		
	}

	@Override
	public void verifyTrophyDescription() {
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy description is correct", Pojo.getObjSeleniumFunctions().getText(loc_descTrophy).trim().equals(TrophiesPageAdmin.gameTrophyData.get("TrophyDescription")));
		
	}

	@Override
	public void verifyTotalPoints() {
		String totalPointText=Pojo.getObjSeleniumFunctions().getText(loc_totalPointsText).trim();
		String totalPointsValue=Pojo.getObjSeleniumFunctions().getText(loc_totalPointsValue).trim();
		String completeTotalPoints=totalPointsValue+" "+totalPointText;
		System.out.println("Actual Total Points "+completeTotalPoints);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total points are correct",(TrophiesPageAdmin.gameTrophyData.get("Points")+" "+"POINTS").equals(completeTotalPoints));			
	}

	@Override
	public void verifyGameAttempt() {
		String totalAttemptText=Pojo.getObjSeleniumFunctions().getText(loc_gameAttemptText).trim();
		String totalAttemptValue=Pojo.getObjSeleniumFunctions().getText(loc_gameAttemptValue).trim();
		String completeTotalAttempts=totalAttemptValue+" "+totalAttemptText;
		System.out.println("Actual Total Attempts "+completeTotalAttempts);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total attempts are correct",(TrophiesPageAdmin.gameTrophyData.get("Attempts")+" "+"ATTEMPTS").equals(completeTotalAttempts));		
	}

	@Override
	public void verifyHighScore() {		
		Pojo.getObjSeleniumFunctions().swipe(loc_titleTrophy, loc_titleTextProfile);
		String highScoreText=Pojo.getObjSeleniumFunctions().getText(loc_highScoreText).trim();
		String highScoreValue=Pojo.getObjSeleniumFunctions().getText(loc_highScoreValue).trim();
		String completeHighScore=highScoreValue+" "+highScoreText;
		System.out.println("Actual High Score Value "+completeHighScore);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is correct",(TrophiesPageAdmin.gameTrophyData.get("HighScore")+"%"+" "+"HIGH SCORE").equals(completeHighScore));		
	}

	@Override
	public void clickBackGamePreview() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleGamePreview, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is clicking", Pojo.getObjSeleniumFunctions().navigateToBack());
	}

	@Override
	public void verifyLevelDetailsIcon() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level details icon is appearing",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_iconLevelDetails));
		
	}

	@Override
	public void clickLevelDetailsIcon() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level details icon is clicking",Pojo.getObjSeleniumFunctions().click(loc_iconLevelDetails));
		
	}

	@Override
	public void verifyGamesToGo() {
		int gameCountSetByManager=Integer.parseInt(ScheduleGamePage.expectedDataScheduleGame.get("AttemptCount"));
		System.out.println("Game count set by manager "+gameCountSetByManager);
		int gameCountFinal=gameCountSetByManager-gameCount;
		String expectedText= "GAMES TO GO: "+gameCountFinal;
		System.out.println("Expected Games to Go "+expectedText);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameToGo, 10);
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_gameToGo).trim();
		System.out.println("Actual Games to Go "+actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Games to GO is correct ", expectedText.equals(actualText));		
	}

	@Override
	public void verifyAttemptAndEndDate() {
		int gameCountSetByManager=Integer.parseInt(ScheduleGamePage.expectedDataScheduleGame.get("AttemptCount"));
		String month=Pojo.getObjUtilitiesFunctions().expectedDataDate.get("Month");
		String year=Pojo.getObjUtilitiesFunctions().expectedDataDate.get("Year");
		String date=Pojo.getObjUtilitiesFunctions().expectedDataDate.get("EndDate");
		
		int intDate=Integer.parseInt(date);
		if(intDate<=9)
		{
			date="0"+intDate;
		}
		
		
		String firstLetter = month.substring(0, 1);
	    String remainingLetters = month.substring(1, month.length()).toLowerCase();
	    firstLetter = firstLetter.toUpperCase();
	    month=firstLetter+remainingLetters;

		String expectedText= "You get "+gameCountSetByManager +" attempt(s) per day until "+month+""+date+","+year+"." ;
		System.out.println("Expected End Date Text "+expectedText);
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_attemptDetails).trim();
		System.out.println("Actual End Date Text "+actualText);
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts and end date is correct",expectedText.equals(actualText));
		
	}

	@Override
	public void verifyDisabledPlayButton() {
		 
	     String	attributeDisabledPlayButton=Pojo.getObjSeleniumFunctions().getAttribute(loc_btnPlayGame, "enabled");
	     System.out.println("Attribute Play Disabled "+attributeDisabledPlayButton);
	     Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Play button is showing as disabled", attributeDisabledPlayButton.equals("false")); 
	}

	

}
