package com.testH.base.pages.admin;

import java.util.HashMap;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;

public class TrophiesReportPageAdmin {
	
	public static HashMap<String, String> gameTrophyData = new HashMap<String, String>();

	public static String trophyReportType="";
	
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
	By loc_downloadIcon=By.xpath("//mat-icon[contains(text(),'cloud_download')]");
	By loc_infoPlayerTrophyBlankScr=By.xpath("//p[contains(text(),'No player has achieved this trophy yet.')]");
	
	public void selectGeneralTrophy(String trophyName)
	{
		By loc_trophyName=By.xpath("//tr//child::td[2]/child::p[contains(text(),'"+trophyName+"')]");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy is selecting", Pojo.getObjSeleniumFunctions().click(loc_trophyName));
	}
	
	public void clickDownloadIcon()
	{
		if(isInfoDisplayingOnTrophyBlankScreen()==true)
		{
		trophyReportType="Not Achieved";
		By loc_filterType=By.xpath("//span[text()='Trophy']");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_filterType, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that filter is clicking", Pojo.getObjSeleniumFunctions().click(loc_filterType));
		By loc_listItem=By.xpath("//span[text()='Not Achieved']");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that list item is selecting",Pojo.getObjSeleniumFunctions().click(loc_listItem) );
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that download icon is clicking", Pojo.getObjSeleniumFunctions().click(loc_downloadIcon));
		}
		else
		{
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that download icon is clicking", Pojo.getObjSeleniumFunctions().click(loc_downloadIcon));

		}
	}
	
	public boolean isInfoDisplayingOnTrophyBlankScreen()
	{
		if(Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_infoPlayerTrophyBlankScr)==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void selectListItem(String listItem)
	{
		By loc_listItem=By.xpath("//span[text()='"+listItem+"']");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that list item is selecting",Pojo.getObjSeleniumFunctions().click(loc_listItem) );
	}
}
