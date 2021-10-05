package com.testH.base.desktopView;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.admin.GamePreviewPageAdmin;
import com.testH.base.pages.admin.ScheduleGamePage;
import com.testH.base.pages.admin.TrophiesPageAdmin;
import com.testH.base.pages.client.GamePreviewPage;

public class GamePreviewPageDesktopView extends GamePreviewPage  {
	
	
	By loc_GamePreviewTitle=By.xpath("//div[contains(text(),'LIVE GAME PREVIEW')]");
	By loc_BtnPlayGame=By.xpath("//span[contains(text(),'PLAY GAME')]");
	By loc_gamePreviewTitle=By.xpath("//span[contains(@class,'gamePreviewTitle')]");
	By loc_scenario=By.xpath("//mat-card-content[contains(@class,'scenarioText')]");
	By loc_btnBack=By.xpath("//*[contains(text(),'arrow_back')]");
	By loc_textTrophy=By.xpath("//mat-card-subtitle[contains(text(),'TROPHY')]");
	By loc_textDescription=By.xpath("//mat-card-subtitle[contains(text(),'TROPHY')]/following-sibling::mat-card-content");
	By loc_trophyTotalPoints=By.xpath("//mat-card-subtitle[contains(text(),'Total Points')]");
	By loc_trophyAttempts=By.xpath("//mat-card-subtitle[contains(text(),'Game Attempts')]");
	By loc_trophyHighScore=By.xpath("//mat-card-subtitle[contains(text(),'High Score')]");
	By loc_iconLevelDetails=By.xpath("//img[@src='assets/img/level_details.png']");
	By loc_loadingCircle=By.xpath("assets/img/OHloader.gif");
	By loc_gameToGo=By.xpath("//mat-card-subtitle[contains(text(),'GAMES TO GO:')]");
	By loc_attemptDetails=By.xpath("//mat-card-subtitle[contains(text(),'GAMES TO GO:')]/following-sibling::mat-card-content");
	
	public int gameCount=0;
	

	@Override
	public void verifyGamepreviewScreen() {
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_GamePreviewTitle, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game preview screen is opening", Pojo.getObjSeleniumFunctions().getText(loc_GamePreviewTitle).trim().equals("LIVE GAME PREVIEW"));
		
	}

	@Override
	public void clickPlayGameButton() {
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_BtnPlayGame, 15);
    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Play button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_BtnPlayGame));	
	//Pojo.getObjSeleniumFunctions().waitFor(7);
    gameCount=gameCount+1;
    System.out.println("Game Count "+gameCount);
    Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_loadingCircle, 15);
	}

	@Override
	public void verifyPreviewTitle(String expectedTitle) {
		
		Pojo.getObjSeleniumFunctions().waitFor(3);
		String actualTitle=Pojo.getObjSeleniumFunctions().getText(loc_gamePreviewTitle).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that preview title is correct",actualTitle.equals(expectedTitle));
		
	}

	@Override
	public void verifyScenario(String expectedScenario) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_scenario, 10);
		String actualScenario=Pojo.getObjSeleniumFunctions().getText(loc_scenario).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that preview scenario is correct",actualScenario.equals(expectedScenario));		
	}

	

	@Override
	public void verifyPreviewInfo() {
 		
		By loc_infoTitle=By.xpath("//mat-card-subtitle[contains(text(),'GAME DETAILS')]//parent::div//following-sibling::div//child::mat-card-subtitle");
		By loc_infoDesc=By.xpath("//mat-card-subtitle[contains(text(),'GAME DETAILS')]//parent::div//following-sibling::div//child::mat-card-content");
		
		List<WebElement> infoTitleList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_infoTitle);
		List<WebElement> infoDescList=Pojo.getObjSeleniumFunctions().getWebElementList(loc_infoDesc);
		
		if(infoTitleList.size()!=0)
		{
			
		for(WebElement e1:infoTitleList)
		{
			e1.getText().trim();
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that info title is correct", GamePreviewPageAdmin.expectedProfileDataList.get("Information").contains(e1.getText().trim()));
		}
		
		for(WebElement e2:infoDescList)
		{
			e2.getText().trim();
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that info desc is correct", GamePreviewPageAdmin.expectedProfileDataList.get("Information").contains(e2.getText().trim()));
		}
		}
		else
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that info title and description is displaying", false);
		}

	 	
		
	}

	@Override
	public void verifyTrophyField() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textTrophy).trim().equals("TROPHY"));
	}

	@Override
	public void verifyTrophyDescription() {
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy description is correct", Pojo.getObjSeleniumFunctions().getText(loc_textDescription).trim().equals(TrophiesPageAdmin.gameTrophyData.get("TrophyDescription")));
	}

	@Override
	public void verifyTotalPoints() {
		String totalPointActual=Pojo.getObjSeleniumFunctions().getText(loc_trophyTotalPoints).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total points are correct",("Total Points:"+(TrophiesPageAdmin.gameTrophyData.get("Points"))).equals(totalPointActual));	}

	@Override
	public void verifyGameAttempt() {
		String totalAttemptActual=Pojo.getObjSeleniumFunctions().getText(loc_trophyAttempts).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total attempts are correct",("Game Attempts:"+(TrophiesPageAdmin.gameTrophyData.get("Attempts"))).equals(totalAttemptActual));
	}

	@Override
	public void verifyHighScore() {
		String highScoreActual=Pojo.getObjSeleniumFunctions().getText(loc_trophyHighScore).trim();
		System.out.println(highScoreActual);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is correct",("High Score: "+(TrophiesPageAdmin.gameTrophyData.get("HighScore"))+"%").equals(highScoreActual));
	}

	@Override
	public void clickBackGamePreview() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnBack, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnBack));
		//Pojo.getObjSeleniumFunctions().waitFor(5);
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
	 By loc_playBtnDisabled=By.xpath("//button");
     String	attributeDisabledPlayButton=Pojo.getObjSeleniumFunctions().getAttribute(loc_playBtnDisabled, "disabled");
     Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Play button is showing as disabled", attributeDisabledPlayButton.equals("true"));
	}

	

}
