package com.testH.base.pages.admin;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;

public class GameLibraryPage {
	
	By loc_btnAddAFilter=By.xpath("//input[@id='chips']");
	//By loc_filState=By.xpath("//span[contains(text(),'State')]");
	By loc_filState=By.xpath("//mat-option[@role='option'][3]");

//	By loc_filLive=By.xpath("//div[contains(text(),'Live')]");
	By loc_filLive=By.xpath("//mat-list-item[@role='listitem'][1]");
	
	By loc_liveGameList=By.xpath("//mat-card-title");
	By loc_optionsGame=By.xpath("//div[contains(@class,'gameListRow')]/child::mat-grid-tile[1]//child::button");
	By loc_btnDelete=By.xpath("//span[contains(text(),'Delete')]");
	By loc_btnYes=By.xpath("//span[contains(text(),'YES')]");
	By loc_textMoveToReady=By.xpath("//span[contains(text(),'Move to Ready')]");
	By loc_textSchedule=By.xpath("//span[contains(text(),'Schedule')]");
	
	By loc_Game=By.xpath("//span[text()=' Game ']");
	By loc_textBoxEnterGame=By.xpath("//input[contains(@placeholder,'Enter Game Name')]");
	By loc_btnDone=By.xpath("//button[contains(@type,'submit')]");
	
	
    public static List<String> gameList=new ArrayList<String>();
    

	
	//BuildSpGamePage objBuildSpGamePage;
	
    public void selectGameStateFilter(String stateName)
    {
    	By loc_gameState=By.xpath("//div[contains(text(),'"+stateName+"')]");
    	Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add filter button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAddAFilter));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that state button is clicking", Pojo.getObjSeleniumFunctions().click(loc_filState));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_filLive, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct state is clicking", Pojo.getObjSeleniumFunctions().click(loc_gameState));
		Pojo.getObjSeleniumFunctions().waitFor(3);

    }
    
	
	
	public void selectLiveFilter()
	{
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnAddAFilter, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add filter button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAddAFilter));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_filState, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that state button is clicking", Pojo.getObjSeleniumFunctions().click(loc_filState));
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_filLive, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that live button is clicking", Pojo.getObjSeleniumFunctions().click(loc_filLive));
		Pojo.getObjSeleniumFunctions().waitFor(3);
	}
	
	public boolean verifyLiveGame()
	{
		String expectedGame=BuildSpGamePage.expectedData.get("GameName").get(0);
		System.out.println("GameName "+expectedGame);
		
		gameList=getLiveGameListAdmin();
	    System.out.println("Live Game List Admin: "+gameList);
        boolean isLiveGameAvailable=gameList.contains(expectedGame);
	   // Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Live game is available in live game list",gameList.contains(expectedGame));
	    return isLiveGameAvailable;
	}
	
	
	public List<String> getLiveGameListAdmin()
	{
		List<WebElement> liveGames=Pojo.getObjSeleniumFunctions().getWebElementList(loc_liveGameList);
        List<String> gameList=new ArrayList<String>();
		
		int gameCount=liveGames.size();
		
		for(int i=0;i<=gameCount-1;i++)
		{
			gameList.add(Pojo.getObjSeleniumFunctions().getText(liveGames.get(i)).trim());
		}
		
		return gameList;

	}
	
	public void deleteGame(int gameCount)
	{
		for(int i=1;i<=gameCount;i++)
		{
			
			System.out.println("Delete Game Number "+i);
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_optionsGame, 10);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that option button is clicking",Pojo.getObjSeleniumFunctions().click(loc_optionsGame));
			Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnDelete);

			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Delete button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDelete));
			Pojo.getObjSeleniumFunctions().waitFor(5);

			Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnYes);

			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Yes button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnYes));
		}
	}

	public void clickOptionsRecentlyCreatedGame()
	{
		String gameName=BuildSpGamePage.expectedData.get("GameName").get(0);
		By loc_optionRecentlyCreatedGame=By.xpath("//mat-card-title[contains(text(),'"+gameName+"')]/parent::div/parent::div/child::div[1]/child::button");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_optionRecentlyCreatedGame, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that option button is clicking",Pojo.getObjSeleniumFunctions().click(loc_optionRecentlyCreatedGame));
	}
	public void clickMoveToReady()
	{
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_textMoveToReady);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that move to ready button is clicking",Pojo.getObjSeleniumFunctions().click(loc_textMoveToReady));

	}
	public void enterGameName(String gameName)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add filter button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAddAFilter));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_Game, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game is clicking", Pojo.getObjSeleniumFunctions().click(loc_Game));
	//	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name is clicking", Pojo.getObjSeleniumFunctions().click(loc_Game));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxEnterGame, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name is entering",Pojo.getObjSeleniumFunctions().setText(loc_textBoxEnterGame, gameName));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnDone));
		Pojo.getObjSeleniumFunctions().waitFor(2);
	}
	
	public void clickScheduleGameButton()
	{
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_textSchedule);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that schedule game button is clicking",Pojo.getObjSeleniumFunctions().click(loc_textSchedule));
	}
}
