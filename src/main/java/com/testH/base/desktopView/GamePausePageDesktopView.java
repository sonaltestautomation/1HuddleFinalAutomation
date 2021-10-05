package com.testH.base.desktopView;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.client.GamePausePage;

public class GamePausePageDesktopView extends GamePausePage  {
	
	By loc_btnPauseGame=By.xpath("//span[contains(text(),'PAUSE GAME')]");	By loc_textGamePause=By.xpath("//mat-card-title[contains(text(),'GAME PAUSED')]");
	By loc_textGameName=By.xpath("//mat-card-title[contains(text(),'GAME PAUSED')]/parent::div/child::div");
	By loc_countQuestion=By.xpath("//span[contains(@class,'queCnt')]");
	By loc_textQues=By.xpath("//span[contains(text(),'QUESTION')]");
	By loc_textTogo=By.xpath("//span[contains(text(),'TO GO')]");
	By loc_btnResumeGame=By.xpath("//span[contains(text(),'RESUME GAME')]");
	By loc_btnEndGame=By.xpath("//span[contains(text(),'RESUME GAME')]/parent::button/following-sibling::button");
	By loc_textGameScore=By.xpath("//div[contains(@class,'gameScore')]");
	By loc_textPlayerName=By.xpath("//div[contains(@class,'pauseScreenProfile')]/child::div[2]");
	By loc_totalTime=By.xpath("//div[contains(@class,'pauseScreenProfile')]/child::div[5]");
	By loc_btnYes=By.xpath("//button[text()='Yes']");
	
	
	

	@Override
	public void verifyPauseScreen() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that pause game screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_textGamePause).trim().equals("GAME PAUSED"));
	}

	@Override
	public void verifyAndClickResumeGameButton() {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that resume game button is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnResumeGame));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that resume game button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnResumeGame));
	}

	@Override
	public void verifyAndClickEndGameButton() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnEndGame, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that end game button  is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnEndGame));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that end game button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnEndGame));
	}

	@Override
	public void verifyGameName() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name is correct", BuildSpGamePage.expectedData.get("GameName").get(0).equals(Pojo.getObjSeleniumFunctions().getText(loc_textGameName).trim()));
		
	}

	@Override
	public void verifyPlayerName() {
		
		//String firstName=AllUsersPage.expectedDataUser.get("FirstName").trim();
		//String lastName=AllUsersPage.expectedDataUser.get("LastName").trim();
		//String fullName=firstName+" "+lastName;
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player name is correct", QuestionCategoryPageDesktopView.playerName.equals(Pojo.getObjSeleniumFunctions().getText(loc_textPlayerName).trim()));
	}

	@Override
	public void verifyPlayerPoints() {

		String strPlayerPoint=Pojo.getObjSeleniumFunctions().getText(loc_textGameScore).trim();
		int playerPoints=Integer.parseInt(strPlayerPoint);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player points are correct",QuestionCategoryPageDesktopView.gamePoints==playerPoints );
	}

	@Override
	public void verifyQuestionCount() {

		String strQuestionCount=Pojo.getObjSeleniumFunctions().getText(loc_countQuestion).trim();
		int quesCount=Integer.parseInt(strQuestionCount);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that question count is correct",QuestionCategoryPageDesktopView.quesCount==quesCount);
	}

	@Override
	public void verifyTotalTime() {
		String totalTime=Pojo.getObjSeleniumFunctions().getText(loc_totalTime).trim().replaceAll("[^0-9]", "");
		int time=Integer.parseInt(totalTime);
		String expectedTime=QuestionCategoryPageDesktopView.totalTime;
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
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Yes button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnYes));
		
	}

	

}
