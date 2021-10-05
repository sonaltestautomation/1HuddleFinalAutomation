package com.testH.base.pages.androidApp;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.desktopView.QuestionCategoryPageDesktopView;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.client.GamePausePage;

import io.appium.java_client.MobileBy;

public class GamePausePageAndroidApp extends GamePausePage {
	
	By loc_textPauseGame=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/pause_game_pause_game_tv\")");
	By loc_btnResumeGame=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_pause_bottom_view_resume_tv\")");
	By loc_btnEndGame=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_game_bottom_view_end_game_tv\")");
	By loc_textPlayerName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/pause_game_player_name_tv\")");
	By loc_textGameScore=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/pause_game_player_game_score_tv\")");
	By loc_countQuestion=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/pause_game_percentage_tv\")");
	By loc_totalTime=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/pause_game_total_time_tv\")");
	By loc_textQues=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/pause_game_Questions_tv\")");
	By loc_textTogo=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/pause_game_correct_tv\")");
	By loc_btnYes=MobileBy.xpath("//android.widget.Button[contains(@text,'YES')]");
	By loc_btnEndGamePauseScr=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/activity_pause_bottom_view_end_game_tv\")");

	
	
	@Override
	public void verifyPauseScreen() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textPauseGame, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that pause game screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_textPauseGame).trim().equals("GAME PAUSED"));
		
	}

	@Override
	public void verifyAndClickResumeGameButton() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that resume game button is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnResumeGame));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that resume game button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnResumeGame));		
	}

	@Override
	public void verifyAndClickEndGameButton() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnEndGamePauseScr, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that end game button is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnEndGamePauseScr));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that end game button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnEndGamePauseScr));		
	}

	@Override
	public void verifyGameName() {
		
	}

	@Override
	public void verifyPlayerName() {
	//	String firstName=AllUsersPage.expectedDataUser.get("FirstName").trim();
	//	String lastName=AllUsersPage.expectedDataUser.get("LastName").trim();
	//	String fullName=firstName+" "+lastName;
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player name is correct", QuestionCategoryPageAndroidApp.playerName.equals(Pojo.getObjSeleniumFunctions().getText(loc_textPlayerName).trim()));		
	}

	@Override
	public void verifyPlayerPoints() {
		String strPlayerPoint=Pojo.getObjSeleniumFunctions().getText(loc_textGameScore).trim();
		int playerPoints=Integer.parseInt(strPlayerPoint);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player points are correct",QuestionCategoryPageAndroidApp.gamePoints==playerPoints);		
	}

	@Override
	public void verifyQuestionCount() {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_countQuestion, 10);
		String strQuestionCount=Pojo.getObjSeleniumFunctions().getText(loc_countQuestion).trim();
		int quesCountApp=Integer.parseInt(strQuestionCount);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question count is correct",QuestionCategoryPageAndroidApp.quesCount==quesCountApp);		
	}

	@Override
	public void verifyTotalTime() {
		String totalTime=Pojo.getObjSeleniumFunctions().getText(loc_totalTime).trim().replaceAll("[^0-9]", "");
		int time=Integer.parseInt(totalTime);
		String expectedTime=QuestionCategoryPageAndroidApp.totalTime;
		int expectedTimeInt=Integer.parseInt(expectedTime);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total time is correct",time>=expectedTimeInt);		
	}

	@Override
	public void verifyQuestionsToGoText() {
		String strQuestionCount=Pojo.getObjSeleniumFunctions().getText(loc_countQuestion).trim();
		int quesCount=Integer.parseInt(strQuestionCount);
		if(quesCount==1)
		{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that questions text is correct", Pojo.getObjSeleniumFunctions().getText(loc_textQues).trim().equals("QUESTION"));
		}
		else
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that questions text is correct", Pojo.getObjSeleniumFunctions().getText(loc_textQues).trim().equals("QUESTIONS"));
		}
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that to go text is correct", Pojo.getObjSeleniumFunctions().getText(loc_textTogo).trim().equals("TO GO!"));

			
	}

	@Override
	public void clickYesConfirmation() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnYes, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Yes button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnYes));
		
	}

	

}
