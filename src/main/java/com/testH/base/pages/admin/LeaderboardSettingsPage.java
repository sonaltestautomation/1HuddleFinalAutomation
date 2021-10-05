package com.testH.base.pages.admin;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;

public class LeaderboardSettingsPage {
	
	By loc_btnSave=By.xpath("//button[@type='submit']");
	By loc_btnYes=By.xpath("//span[text()='YES']");
	By loc_clickNextResetCal=By.xpath("//input[@name='futureReset']");
	By loc_clickStartDateCal=By.xpath("//input[@name='pastReset']");
	By loc_selectYear=By.xpath("//button[@aria-label='Choose month and year']");
	By loc_nextBtn=By.xpath("//button[contains(@aria-label,'Next')]");
	By loc_previousBtn=By.xpath("//button[contains(@aria-label,'Previous')]");
	
	public void clickSave()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnSave, 15);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Save button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnSave));
	}
	
	public void clickYesConfirmation()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Yes button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnYes));
		Pojo.getObjSeleniumFunctions().waitFor(3);

	}
	
	public void setRandomDateLeaderboard(String calType,String date)
	{
	    HashMap<Integer, String> month = new HashMap<Integer, String>();
		ArrayList<String> startDate = new ArrayList<String>();
	   
		month.put(1, "January");
	    month.put(2, "February");
	    month.put(3, "March");
	    month.put(4, "April");
	    month.put(5, "May");
	    month.put(6, "June");
	    month.put(7, "July");
	    month.put(8, "August");
	    month.put(9, "September");
	    month.put(10, "October");
	    month.put(11, "November");
	    month.put(12, "December");

		String dateSplit[]=date.split("/");
		String sYear=dateSplit[2];
		String sDate=dateSplit[1];
		String sMonth=dateSplit[0];
		
		int intYear=Integer.parseInt(sYear);
		int intDate=Pojo.getObjUtilitiesFunctions().getRandomNumber(1, 27);
		int intMonth=Integer.parseInt(sMonth);
		
	System.out.println("Year "+intYear);
	System.out.println("Date "+intDate);
	System.out.println("Month "+intMonth);

	if(calType.equals("NextReset"))
	{
		Pojo.getObjSeleniumFunctions().waitFor(5);
		Pojo.getObjSeleniumFunctions().click(loc_clickNextResetCal);
	}
	else if(calType.equals("StartDate"))
	{
		Pojo.getObjSeleniumFunctions().waitFor(5);
		Pojo.getObjSeleniumFunctions().click(loc_clickStartDateCal);
	}

	String strCurrentYear=Pojo.getObjSeleniumFunctions().getText(loc_selectYear);
	System.out.println("Current Year "+strCurrentYear);
	strCurrentYear=strCurrentYear.replaceAll("[^0-9]","");
	Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_selectYear);
	Pojo.getObjSeleniumFunctions().click(loc_selectYear);
	int intCurrentYear=Integer.parseInt(strCurrentYear);

	int yearDiff=intYear-intCurrentYear;

	By loc_yearXpath=By.xpath("//td[@aria-label='"+intYear+"']");

	if(yearDiff>0)
	{

	while(Pojo.getObjSeleniumFunctions().checkElementEnabled(loc_yearXpath)==false)
	{
		Pojo.getObjSeleniumFunctions().click(loc_nextBtn);
	}
	}

	else if(yearDiff<0)
	{
		while(Pojo.getObjSeleniumFunctions().checkElementEnabled(loc_yearXpath)==false)
		{
			Pojo.getObjSeleniumFunctions().click(loc_previousBtn);
		}
	}

	Pojo.getObjSeleniumFunctions().click(loc_yearXpath);

	String monthName=month.get(intMonth);
	By loc_month=By.xpath("//td[contains(@aria-label,'"+monthName+"')]");
	Pojo.getObjSeleniumFunctions().click(loc_month);

	String dateNumber=monthName+" "+intDate+", "+intYear;
	System.out.println("Date "+dateNumber);

	By selectDate=By.xpath("//td[(@aria-label='"+dateNumber+"')]");
	Pojo.getObjSeleniumFunctions().click(selectDate);

	String leaderBoardDateNotification=monthName+" "+intDate;
	startDate.add(leaderBoardDateNotification);
	System.out.println("Leaderboard Start Reset Date "+leaderBoardDateNotification);
	BuildSpGamePage.expectedData.put("LeaderboardResetDate",startDate);
	}


}
