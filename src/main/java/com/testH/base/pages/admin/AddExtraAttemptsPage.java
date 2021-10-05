package com.testH.base.pages.admin;

import java.util.ArrayList;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;

public class AddExtraAttemptsPage {
	
	By loc_btnAddAttempt=By.xpath("//button[contains(@class,'add-attempt')]");
	By loc_textboxSearchGame=By.xpath("//input[@placeholder='Search...']");
	By loc_checkboxSearchedResult=By.xpath("//div[contains(@class,'item-name')]//child::mat-checkbox");
	By loc_btnNext=By.xpath("//span[contains(text(),'Next')]");
	By loc_btnAddFilter=By.xpath("//div[@class='search-container']//child::app-search//input");
    By loc_btnName=By.xpath("//span[contains(text(),'Name')]");
    By loc_txtboxEnterName=By.xpath("//input[(@placeholder='Enter Player Name')]");
    By loc_iconDone=By.xpath("//mat-icon[(text()='done')]");
    By loc_textboxEnterAttempt=By.xpath("//input[(@placeholder='Enter attempts between 1 to 10')]");
    By loc_btnDone=By.xpath("//span[contains(text(),'Done')]");
    
    
    public void clickAddExtraButton()
    {
    	
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add extra button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAddAttempt));
    }
    
    public void enterGameName()
    {
    	Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnNext);
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textboxSearchGame, 10);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name is entering",Pojo.getObjSeleniumFunctions().setText(loc_textboxSearchGame, BuildSpGamePage.expectedData.get("GameName").get(0)));
    }
    
    public void enterAlreadyCreatedGameName(String gameName)
    {
    	ArrayList<String> games = new ArrayList<String>();
        games.add(gameName);
    	Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnNext);
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textboxSearchGame, 10);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name is entering",Pojo.getObjSeleniumFunctions().setText(loc_textboxSearchGame,gameName));
    	BuildSpGamePage.expectedData.put("GameName",games);
    }
    
    public void selectSearchedCheckbox()
    {
    	Pojo.getObjSeleniumFunctions().waitFor(5);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game checkbox is selecting",Pojo.getObjSeleniumFunctions().click(loc_checkboxSearchedResult));

    }
    
    public void clickNext()
    {
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnNext));

    }
    
    public void clickAddFilter()
    {
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnAddFilter, 10);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that filter is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAddFilter));

    }
    
    public void clickName()
    {
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnName, 10);

    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that name is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnName));

    }
    
    public void enterPlayerName(String playerName)
    {
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_txtboxEnterName, 10);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player name is entering",Pojo.getObjSeleniumFunctions().setText(loc_txtboxEnterName, playerName));

    }
    public void clickDoneIcon()
    {
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done icon is clicking", Pojo.getObjSeleniumFunctions().click(loc_iconDone));

    }
    public void enterAttempts(String attempt)
    {
    	ArrayList<String> extraAttempts = new ArrayList<String>();
    	extraAttempts.add(attempt);
    	BuildSpGamePage.expectedData.put("ExtraAttempt", extraAttempts);
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textboxEnterAttempt, 10);

    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts are entering", Pojo.getObjSeleniumFunctions().setText(loc_textboxEnterAttempt, attempt));

    }
    public void clickDoneButton()
    {
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDone));

    }

    

}
