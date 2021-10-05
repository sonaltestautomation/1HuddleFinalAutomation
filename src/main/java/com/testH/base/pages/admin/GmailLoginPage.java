package com.testH.base.pages.admin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;

public class GmailLoginPage {
	

	
	By loc_inpEmail = By.xpath("//input[@id='identifierId' and @type='email']");
	By loc_btnNextEmailOrPhone = By.xpath("//span[contains(text(),'Next')]");
	By loc_inpEnterYourPassword = By.xpath("//input[@name='password' and @type='password']");
	By loc_btnNextEnterYourPassword = By.xpath("//span[contains(text(),'Next')]");
	By loc_progressBar = By.xpath("//div[@id='initialView']//div[@role='progressbar']");
	By loc_forgotPasswordNotification=By.xpath("//tr[1]//child::span[contains(text(),'1Huddle - Requested a new password')]/parent::span");
	By loc_supportNotification=By.xpath("//tr[1]//child::span[contains(text(),'1Huddle Support')]/parent::span");
	By loc_ActivationEmailVipCode=By.xpath("//tr[1]//child::span[contains(text(),'Account Activation for 1Huddle')]/parent::span");
	By loc_btnResetPw=By.xpath("//a[contains(text(),'Reset Password')]");
	By loc_trimmedContent=By.xpath("//div[(@aria-label='Show trimmed content')]/child::img");

	
	By loc_1hProgress=By.xpath("//mat-progress-bar[@role='progressbar']");
	
	By loc_gameRecordNotification=By.xpath("//tr[1]//child::span[contains(text(),'1Huddle Game Report')]/parent::span");
	By loc_welcomeText=By.xpath("//div[contains(text(),'Great')]");
	
	By loc_dateTextGameReport=By.xpath("//div[contains(text(),'DATE:')]");
	By loc_timeTextGameReport=By.xpath("//div[contains(text(),'TIME:')]");
	By loc_nameOfGameTextGameReport=By.xpath("//div[contains(text(),'NAME OF')]");
	By loc_lengthOfGameTextGameReport=By.xpath("//div[contains(text(),'LENGTH OF')]");
	By loc_dateGameReport=By.xpath("//div[contains(text(),'DATE:')]//following-sibling::div");
	By loc_timeGameReport=By.xpath("//div[contains(text(),'TIME:')]//following-sibling::div");
	By loc_gameNameGameReport=By.xpath("//div[contains(text(),'NAME OF')]//following-sibling::div");
	By loc_gameLenghtGameReport=By.xpath("//div[contains(text(),'LENGTH OF')]//following-sibling::div");
	By loc_pointsGameReport=By.xpath("//span[contains(text(),'POINTS:')]");
	By loc_twitterIconGameReport=By.xpath("//img[@alt='Twitter']");
	By loc_fbIconGameReport=By.xpath("//img[@alt='Facebook']");
	By loc_instaIconGameReport=By.xpath("//img[@alt='Instagram']");
	By loc_linkInIconGameReport=By.xpath("//img[@alt='Linkedin']");
	
	By loc_btnActiveList=By.xpath("//a[contains(text(),'ACTIVATE')]");
	By loc_btnContinueLogin=By.xpath("//span[contains(text(),'Continue')]");
	
	public void gmailLogin(String userEmail,String pw)
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_inpEmail, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that email is entering", Pojo.getObjSeleniumFunctions().setText(loc_inpEmail,userEmail));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnNextEmailOrPhone , 15);
		//Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that next button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnNextEmailOrPhone));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_inpEnterYourPassword, 10);
		//Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that password is entering", Pojo.getObjSeleniumFunctions().setText(loc_inpEnterYourPassword, pw));
		//Pojo.getObjSeleniumFunctions().waitFor(2);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Next button on password screen is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnNextEnterYourPassword));
	}
	
	public void verifyAndOpenForgotPwMail()
	{
		//Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_btnNextEnterYourPassword,10);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_forgotPasswordNotification, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that forgot email is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_forgotPasswordNotification));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that forgot email is opening", Pojo.getObjSeleniumFunctions().click(loc_forgotPasswordNotification));

	}
	
	public void verifyAndOpenSupportEmail()
	{
		//Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_btnNextEnterYourPassword,10);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_supportNotification, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that support email is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_supportNotification));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that support email is opening", Pojo.getObjSeleniumFunctions().click(loc_supportNotification));
	}
	
	public void verifyAndOpenAccountActivationLinkVipCode()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_ActivationEmailVipCode, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that activation email is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_ActivationEmailVipCode));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that support email is opening", Pojo.getObjSeleniumFunctions().click(loc_ActivationEmailVipCode));
	}
	
	public void clickActiveButton()
	{
	   
		
		String email=VipCodePage.vipCodeData.get("UniqueEmail");

		String[] arrOfStr = email.split("@"); 
        System.out.println("Before @ "+arrOfStr[0]);
		By loc_trimmedContentVipCode=By.xpath("//span[contains(text(),'"+arrOfStr[0]+"')]/following::div[@aria-label='Show trimmed content'][1]");
		By loc_btnActive=By.xpath("//span[contains(text(),'"+arrOfStr[0]+"')]/following::div[@aria-label='Hide expanded content'][1]/parent::div/following-sibling::div[1]//a[contains(text(),'ACTIVATE')]");

        System.out.println("Trimmed xPath "+loc_trimmedContentVipCode);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_trimmedContentVipCode, 20);
		if(Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_trimmedContentVipCode))
		{
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_trimmedContentVipCode, 15);


			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trimmed content is clicking",Pojo.getObjSeleniumFunctions().click(loc_trimmedContentVipCode));
			
			Pojo.getObjSeleniumFunctions().click(loc_btnActive);

			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnActiveList, 15);
			Pojo.getObjSeleniumFunctions().scrollToView(loc_btnActive);
			Pojo.getObjSeleniumFunctions().click(loc_btnActive);
			Pojo.getObjSeleniumFunctions().switchToWindowUsingTitle("1Huddle");
		}
		else
		{
			Pojo.getObjSeleniumFunctions().click(loc_btnActive);
			Pojo.getObjSeleniumFunctions().switchToWindowUsingTitle("1Huddle");
		}
		}
	
	public void clickContinueToLogin()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnContinueLogin, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that continue to login button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnContinueLogin));


	}
	
	public void emailTextForgotPw()
	{
		
	}
	
	public void clickResetPw()
	
	{
		Pojo.getObjSeleniumFunctions().waitFor(2);
		//Pojo.getObjUtilitiesFunctions().waitForPageLoad(15);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_trimmedContent, 20);
		if(Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_trimmedContent))
		{
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_trimmedContent, 15);

			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trimmed content is clicking",Pojo.getObjSeleniumFunctions().click(loc_trimmedContent));
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnResetPw, 15);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that reset password button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnResetPw));
			Pojo.getObjSeleniumFunctions().switchToWindowUsingTitle("1Huddle");
		}
		else
		{
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnResetPw, 15);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that reset password button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnResetPw));
			Pojo.getObjSeleniumFunctions().switchToWindowUsingTitle("1Huddle");
		}
	}
	
	public void verifyAndOpenGameReportMail()
	{
		
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameRecordNotification, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game report email is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_gameRecordNotification));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game report email is opening", Pojo.getObjSeleniumFunctions().click(loc_gameRecordNotification));
	}
	
	public void verifyWelcomeTextGameReport(String expectedText)
	{
	  String actualText=Pojo.getObjSeleniumFunctions().getText(loc_welcomeText);
	  System.out.println("Actual Welcome Text "+actualText);
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that welcome text is correct", actualText.equals(expectedText));
	}
	
	public void verifyDateGameReport()
	{
		String expectedCurrentDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("mm/dd/yyyy");
		System.out.println("CurrentDate "+expectedCurrentDate);
		String actualCurrentDate=Pojo.getObjSeleniumFunctions().getText(loc_dateGameReport).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that date field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_dateTextGameReport).trim().equals("DATE:"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that date is correct",expectedCurrentDate.equals(actualCurrentDate));
    }
	public void verifyTimeGameReport()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time field is appearing", Pojo.getObjSeleniumFunctions().getText(loc_timeTextGameReport).trim().equals("TIME:"));

	}
	public void verifyGameNameGameReport()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name text is present", Pojo.getObjSeleniumFunctions().getText(loc_nameOfGameTextGameReport).trim().equals("NAME OF GAME:"));
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name is correct", Pojo.getObjSeleniumFunctions().getText(loc_gameNameGameReport).trim().equals(BuildSpGamePage.expectedData.get("GameName").get(0)));
	}
	public void verifyLengthOfGameGameReport()
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that length of game text is present", Pojo.getObjSeleniumFunctions().getText(loc_lengthOfGameTextGameReport).trim().equals("LENGTH OF GAME:"));

	}
	public void verifyPlayerNameGameReport()
	{
		String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
		
		By loc_playerName=By.xpath("//span[contains(text(),'"+playerFirstName+"')]");
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player name is correct", Pojo.getObjSeleniumFunctions().getText(loc_playerName).trim().equals(AllUsersPage.expectedDataUser.get("FirstName")));

	}
	public void verifyPlayerPointsGameReport(int expectedPoints)
	{
		String strPoints=Pojo.getObjSeleniumFunctions().getText(loc_pointsGameReport).trim();
		strPoints=strPoints.replaceAll("[^0-9]", "");
		int intPoints=Integer.parseInt(strPoints);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player points are correct",intPoints==expectedPoints );
	}
	
	public void verifySocialIconsGameReport()
	{
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that twitter share icon is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_twitterIconGameReport));
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that facebook share icon is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_fbIconGameReport));
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that instagram share icon is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_instaIconGameReport));
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that linledIn share icon is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_linkInIconGameReport));

	}
	
	public void verifyAndOpenDetailedReportEmail()
	{
		//Pojo.getObjSeleniumFunctions().waitForElementInVisibilityLocated(loc_btnNextEnterYourPassword,10);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_supportNotification, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that support email is displaying", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_supportNotification));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that support email is opening", Pojo.getObjSeleniumFunctions().click(loc_supportNotification));
	}
}
