package com.testH.base.pages.admin;

import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;

public class VipCodePage {
	public static HashMap<String, String> vipCodeData = new HashMap<String, String>();
	
	AllUsersPage objAllUsersPage=new AllUsersPage();
	
	By loc_btnAddNewVipCode=By.xpath("//button[contains(@class,'add')]");
	By loc_textBoxVipCode=By.xpath("//input[contains(@placeholder,'Enter')]");
	By loc_btnAdd=By.xpath("//span[contains(text(),'ADD')]");
	By loc_btnYes=By.xpath("//span[contains(text(),'YES')]");
	
	By loc_cal=By.xpath("//div[contains(@class,'cal')]");
	By loc_selectYear=By.xpath("//button[@aria-label='Choose month and year']");
	By loc_nextBtn=By.xpath("//button[contains(@aria-label,'Next')]");
	By loc_previousBtn=By.xpath("//button[contains(@aria-label,'Previous')]");
	
	
	public void clickAddNewVipCodeBtn()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnAddNewVipCode, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Add new vip code button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnAddNewVipCode));
	}

	public void enterVipCode()
	{
		Pojo.getObjSeleniumFunctions().waitFor(5);
		String randomVipCode="AutomationVip"+Pojo.getObjUtilitiesFunctions().getRandomNumber(0, 9999);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that vip code is entering",Pojo.getObjSeleniumFunctions().setText(loc_textBoxVipCode, randomVipCode));
		System.out.println("VIP Code "+randomVipCode);
		vipCodeData.put("VipCode", randomVipCode);

	}
	public void selectLocation(String locationName)
	{
		objAllUsersPage.addLocation(locationName);

	}
	
	public void selectDept(String deptName)
	{
		objAllUsersPage.addDepartment(deptName);

	}
	
	public void setExpirationDate(String date)
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
		//int intDate=Pojo.getObjUtilitiesFunctions().getRandomNumber(1, 27);
		int intDate=Integer.parseInt(sDate);
		int intMonth=Integer.parseInt(sMonth);
		
	System.out.println("Year "+intYear);
	System.out.println("Date "+intDate);
	System.out.println("Month "+intMonth);

	
	Pojo.getObjSeleniumFunctions().click(loc_cal);

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

	}

public void clickAddBtn()
{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnAdd));
}

public void clickExpireBtn()
{
	String vipCode=vipCodeData.get("VipCode");
	By loc_expireBtn=By.xpath("//td[(text()='"+vipCode+"')]//following-sibling::td[5]");
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_expireBtn, 10);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that expire button is clicking", Pojo.getObjSeleniumFunctions().click(loc_expireBtn));
}

public void clickYesOnConfirmationPopUp()
{
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnYes, 10);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that yes button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnYes));
	Pojo.getObjSeleniumFunctions().waitFor(2);

}
}