package com.testH.base.pages.admin;

import java.util.HashMap;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;

public class TrophiesPageAdmin {
	
	public static HashMap<String, String> gameTrophyData = new HashMap<String, String>();

	By loc_chipFilter=By.xpath("//input[@id='chips']");
	By loc_filterTrophy=By.xpath("//span[contains(text(),'Trophy')]");
	By loc_textBoxTrophy=By.xpath("//input[@placeholder='Enter Trophy Name']");
	By loc_btnDone=By.xpath("//mat-icon[contains(text(),'done')]");
	By loc_btnOptions=By.xpath("//mat-icon[contains(@class,'menu-options')]");
	By loc_btnEdit=By.xpath("//span[contains(text(),'Edit')]");
	By loc_textboxPoints=By.xpath("//input[@name='Points']");
	By loc_textboxAttempts=By.xpath("//input[@name='Attempts']");
	By loc_drpdownHighScore=By.xpath("//select[@name='High Score']");
	By loc_textboxDescription=By.xpath("//textarea[@name='Description']");
	By loc_btnSave=By.xpath("//div[contains(text(),'SAVE')]");
	By loc_progressBar=By.xpath("//div[@id='initialView']//div[@role='progressbar']");
	By loc_btnUpdate=By.xpath("//div[contains(text(),'UPDATE')]");
	
	public void selectTab(String tabName)
	{
		By loc_tab=By.xpath("//div[contains(text(),'"+tabName+"')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that tab is selecting", Pojo.getObjSeleniumFunctions().click(loc_tab));
	}
	
	public void selectTrophyFilter()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that filter chip is selecting", Pojo.getObjSeleniumFunctions().click(loc_chipFilter));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy is clicking",Pojo.getObjSeleniumFunctions().click(loc_filterTrophy));
	}
	
	public void enterTrophyName()
	{
		//Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_progressBar,3);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxTrophy, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxTrophy,BuildSpGamePage.expectedData.get("GameName").get(0)));
		
	}
	public void clickDoneBtn()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDone));
	}
	public void clickOptions()
	{
		//Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_progressBar,3);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnOptions, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that burger button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnOptions));
	}
	public void clickEdit()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that edit button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnEdit));
	}
	public void enterPoints(String points)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are adding", Pojo.getObjSeleniumFunctions().setText(loc_textboxPoints, points));
		gameTrophyData.put("Points", points);
		
	}
	public void enterAttempts(String attempts)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts are adding", Pojo.getObjSeleniumFunctions().setText(loc_textboxAttempts, attempts));
		gameTrophyData.put("Attempts",attempts);
	}
	public void setHighScore(String highScore)
	{
		By loc_highScoreValue=By.xpath("//option[contains(text(),'"+highScore+"')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score dropdown is clicking", Pojo.getObjSeleniumFunctions().click(loc_drpdownHighScore));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is selecting", Pojo.getObjSeleniumFunctions().click(loc_highScoreValue));
		gameTrophyData.put("HighScore",highScore);
	}
	public void enterDescription(String description)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that description is adding", Pojo.getObjSeleniumFunctions().setText(loc_textboxDescription, description));
		gameTrophyData.put("TrophyDescription",description);

	}

	public void clickSave()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Save button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnSave));
	}
	
	public void clickUpdate()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnUpdate, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Update button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnUpdate));

	}
	
	public void searchAlreayCreatedTrophy(String trophyName)
	{
		Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_progressBar,3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxTrophy, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy name is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxTrophy, trophyName));
		gameTrophyData.put("TrophyName",trophyName);//trophy name and game name are same but here we are taking already created game so setting trophy name here
	}
}
