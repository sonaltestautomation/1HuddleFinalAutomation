package com.testH.base.pages.admin;

import java.util.HashMap;

import org.openqa.selenium.By;
import com.testH.app.generic.Pojo;


public class ScheduleGamePage {
	
	By loc_selectAllLocation=By.xpath("//div[contains(@class,'select-all-checkbox')]/child::mat-checkbox");
	By loc_btnNext=By.xpath("//span[text()=' NEXT ']");
	By loc_btnCancel=By.xpath("//span[text()='CANCEL']");
    By loc_selectAllDept=By.xpath("//div[contains(@class,'select-all-checkbox')]");
    By loc_Attempts=By.xpath("//input[@placeholder= 'Enter attempts']");
    By loc_btnApply=By.xpath("//span[contains(text(),'APPLY')]");
    By loc_checkBox=By.xpath("//td[contains(@class,'checkboxes')]/child::mat-checkbox");
    By loc_iconDel=By.xpath("//mat-icon[contains(text(),'delete')]");
    By loc_yesConfirmationPopUp=By.xpath("//span[contains(text(),'YES')]");
    By loc_textBlankScreen=By.xpath("//p[contains(text(),'This game has not been scheduled yet')]");
    
	public static HashMap<String, String> expectedDataScheduleGame = new HashMap<String, String>();
    
    
    public void selectAllLocations()
    {
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_selectAllLocation, 20);
    	Pojo.getObjSeleniumFunctions().waitFor(3);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that all locations are selecting", Pojo.getObjSeleniumFunctions().click(loc_selectAllLocation));
    }
    
    public void clickNext()
    {
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Next button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnNext));
    }
    
    public void selectAllDeps()
    {
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_selectAllDept, 15);

    	Pojo.getObjSeleniumFunctions().waitFor(3);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that all Deps are selecting", Pojo.getObjSeleniumFunctions().click(loc_selectAllDept));
    }
    
    public void enterAttempt(String gameAttempts)
    {
    	Pojo.getObjSeleniumFunctions().waitFor(3);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts are adding", Pojo.getObjSeleniumFunctions().setText(loc_Attempts,gameAttempts));

    	expectedDataScheduleGame.put("AttemptCount", gameAttempts);

    	

    }
    
    public void clickApply()
    {
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that apply button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnApply));

    }
    
    public void selectCheckBoxWithLimit()
    {
    	 Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_checkBox, 10);
    	 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that checkbox is selecting", Pojo.getObjSeleniumFunctions().click(loc_checkBox));
    }
    
    public void clickDeleteIcon()
    {
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_iconDel, 10);
   	 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that checkbox is selecting", Pojo.getObjSeleniumFunctions().click(loc_iconDel));
    }
    public void clickYesConfirmationPopUp()
    {
    	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_yesConfirmationPopUp, 10);
      	 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that checkbox is selecting", Pojo.getObjSeleniumFunctions().click(loc_yesConfirmationPopUp));
    }
    
    public void verifyMessageOnBlankPage(String message)
    {
    	String actualText=Pojo.getObjSeleniumFunctions().getText(loc_textBlankScreen);
    	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that message is correct", Pojo.getObjSeleniumFunctions().getText(loc_textBlankScreen).trim().equals(actualText));
    }
}
