package com.testH.base.pages.admin;

import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.testH.app.generic.Pojo;
import com.testH.base.desktopView.SelectAnswerPageDesktopView;

public class DetailedReportPage {
	
	public static HashMap<String, Integer> gamePlayCountDashboard = new HashMap<String, Integer>();
	public static HashMap<String, Integer> trophiesCountDashboard = new HashMap<String, Integer>();
	public static HashMap<String, Integer> participationCountDashboard = new HashMap<String, Integer>();
	
	By loc_btnDetailedReport=By.xpath("//p[text()='Detailed Report']");
	By loc_gamePlayedCount=By.xpath("//tr[1]//child::td[1]");
	By loc_playerName=By.xpath("//tr[1]//child::td[2]");
	By loc_playerImage=By.xpath("//tr[1]//child::td[1]");
	By loc_gamePlayedTimeSp=By.xpath("//tr[1]//child::td[2]");
	By loc_pointsSp=By.xpath("//tr[1]//child::td[3]");
	By loc_lastPlayedSp=By.xpath("//tr[1]//child::td[4]");
	By loc_gamesMP=By.xpath("//tr[1]//child::td[5]");
	By loc_timeMP=By.xpath("//tr[1]//child::td[6]");
	By loc_pointMP=By.xpath("//tr[1]//child::td[7]");
	By loc_winMP=By.xpath("//tr[1]//child::td[8]");
	By loc_lastPlayedMp=By.xpath("//tr[1]//child::td[9]");
	By loc_rating=By.xpath("//tr[1]//child::td[10]");
	By loc_dept=By.xpath("//tr[1]//child::td[11]");
	By loc_location=By.xpath("//tr[1]//child::td[12]");
    By loc_group=By.xpath("//tr[1]//child::td[13]");
    By loc_cancelChip=By.xpath("//mat-icon[contains(@class,'cancel-chip')]");
    By loc_addEmailChip=By.xpath("//span[text()='Add Email']");
    By loc_customDuration=By.xpath("//div[contains(text(),'Custom')]");
    By loc_enterEmail=By.xpath("//input[@name='emailInput']");
    By loc_msgSuccess=By.xpath("//div[@class='title']");
    By loc_btnOk=By.xpath("//span[contains(text(),'OK')]");
    By loc_firstResult=By.xpath("//table/tbody");
    
    By loc_mlgGameCount=By.xpath("//tr[1]//child::td[3]");
    By loc_mlgGamePlayedTime=By.xpath("//tr[1]//child::td[4]");
    By loc_mlgSpPoints=By.xpath("//tr[1]//child::td[5]");
    By loc_lastPlayedMlgSp=By.xpath("//tr[1]//child::td[6]");
    By loc_ratingMlgSp=By.xpath("//tr[1]//child::td[7]");
    By loc_deptMlgDetailedReport=By.xpath("//tr[1]//child::td[8]");
	By loc_locationMlgDetailedReport=By.xpath("//tr[1]//child::td[9]");
    By loc_groupMlgDetailedReport=By.xpath("//tr[1]//child::td[10]");
    
    
	By loc_playerImageSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[1]");
	By loc_playerNameSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[2]");
	By loc_gamePlayedCountSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[3]");
	By loc_gamePlayedTimeSpSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[4]");
	By loc_pointsSpSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[5]");
	By loc_lastPlayedSpSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[6]");
	By loc_gamesMPSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[7]");
	By loc_timeMPSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[8]");
	By loc_pointMPSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[9]");
	By loc_winMPSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[10]");
	By loc_lastPlayedMpSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[11]");
	By loc_ratingSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[12]");
	By loc_deptSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[13]");
	By loc_locationSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[14]");
    By loc_groupSingleLevelDetailedReport=By.xpath("//tr[1]//child::td[15]");
    
    By loc_spGamePlayedCountPlayerCard=By.xpath("//div[contains(text(),'SINGLE PLAYER')]/parent::div/child::div[2]/child::div[1]/child::div[1]");
    By loc_spGamePlayedTimePlayerCard=By.xpath("//div[contains(text(),'SINGLE PLAYER')]/parent::div/child::div[2]/child::div[2]/child::div[1]");
    By loc_mpGamePlayedCountPlayerCard=By.xpath("//div[contains(text(),'MULTIPLAYER')]/parent::div/child::div[2]/child::div[1]/child::div[1]");
    By loc_mpGamePlayedTimePlayerCard=By.xpath("//div[contains(text(),'MULTIPLAYER')]/parent::div/child::div[2]/child::div[2]/child::div[1]");
    By loc_dateAchievedRookieLevel=By.xpath("//div[contains(text(),'Rookie')]//following-sibling::div");
    By loc_gameRemainingStarter=By.xpath("//div[contains(text(),'Starter')]//following-sibling::div");
    By loc_gameRemainingProfessional=By.xpath("//div[contains(text(),'Professional')]//following-sibling::div");
    By loc_gameRemainingAllStar=By.xpath("//div[contains(text(),'All Star')]//following-sibling::div");
    By loc_gameRemainingMaster=By.xpath("//div[contains(text(),'Master')]//following-sibling::div");
    
    By loc_totalRow=By.xpath("//tbody/tr");
    By loc_gameNamesList=By.xpath("//tbody/tr/td[1]");
    By loc_pointsList=By.xpath("//tbody/tr/td[2]");
    By loc_accuracyList=By.xpath("//tbody/tr/td[3]");
    By loc_timeSpentList=By.xpath("//tbody/tr/td[4]");
    By loc_playedOnDate=By.xpath("//tbody/tr/td[5]");
    By loc_arrowItemsPerPage=By.xpath("//mat-select");
    By loc_listItemsPerPageNumbers=By.xpath("//mat-option");
    
    By loc_iconDownload=By.xpath("//mat-icon[text()='cloud_download']");
    By loc_iconEmail=By.xpath("//mat-icon[text()='email']");
    By loc_btnDownload=By.xpath("//*[contains(text(),'Download')]");
    By loc_btnSendByEmail=By.xpath("//span[contains(text(),'Send by Email')]");
    //By loc_messageSuccessDownloadReport=By.xpath("//*[contains(text(),'Downloading reports...')]");
    By loc_textBlankScreen=By.xpath("//*[contains(text(),'Downloading reports...')]");

    By loc_tilesTrophy=By.xpath("//mat-grid-tile");
    
    By loc_questionTitles=By.xpath("//p[contains(@class,'question_title')]");
    By loc_totalPoints=By.xpath("//div[contains(text(),'Total Points')]");
    By loc_totalQuesTime=By.xpath("//div[contains(text(),'Total Time')]");
    By loc_playedOnDateAttemptedQuesScr=By.xpath("//div[contains(text(),'Played On')]");
    By loc_infoPlayerTrophyBlankScr=By.xpath("//p[contains(text(),'No player has achieved this trophy yet.')]");
    
    


    
    
    



    

	

	

	


	

	
	

public void clickDetailedReport()
{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that detailed report tab is selecting", Pojo.getObjSeleniumFunctions().click(loc_btnDetailedReport));
}
	
public void verifyColumnHeader(String expectedText)
{
	By loc_columnHeader=By.xpath("//button[contains(text(),'"+expectedText+"')]");
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_columnHeader, 15);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that column header is correct", Pojo.getObjSeleniumFunctions().getText(loc_columnHeader).trim().equals(expectedText));
}

public void verifySpgameCount(int actualGameCount, String durationType)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		 String playedGameCount=Pojo.getObjSeleniumFunctions().getText(loc_gamePlayedCount);
	      int actualNum=Integer.parseInt(playedGameCount);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that live count is correct", actualNum==0);
	}
	
	else
	{
  String liveGameCount=Pojo.getObjSeleniumFunctions().getText(loc_gamePlayedCount);
    int actualNum=Integer.parseInt(liveGameCount);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that live count is correct", actualNum==actualGameCount);
}}


public void verifySpPlayedTime(String durationType)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_gamePlayedTimeSp).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is correct",actualText.equals("00:00:00")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
	String actualText=Pojo.getObjSeleniumFunctions().getText(loc_gamePlayedTimeSp).trim();
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is correct",actualText.equals("00:00:05")||actualText.equals("00:00:06")||actualText.equals("00:00:07")||actualText.equals("00:00:08")||actualText.equals("00:00:09")||actualText.equals("00:00:10") );
}}


public void verifySpPointsCount(String durationType,int expectedPoints)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_pointsSp).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are correct for SP",actualText.equals("0")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
	String actualText=Pojo.getObjSeleniumFunctions().getText(loc_pointsSp).trim();
	int intActualPoints=Integer.parseInt(actualText);

	System.out.println("Game Play Points Reports Expected "+expectedPoints);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are correct for SP",intActualPoints==expectedPoints);
}}


public void verifyLastPlayedSPDate(String durationType)
{
	String expectedDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");
	
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_lastPlayedSp).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last played date is correct",actualText.startsWith(expectedDate)); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_lastPlayedSp).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last played date is correct",actualText.startsWith(expectedDate));
	
}
}

public void verifyMpGameCount(String durationType,int mpPoints)
{
	
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_gamesMP).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify MP game count is correct",actualText.equals("0")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_gamesMP).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MP game count is correct",actualText.equals("0"));
	
}
}

public void verifyMpTime(String durationType)
{
	
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_timeMP).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify MP time is correct",actualText.equals("00:00:00")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_timeMP).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MP time is correct",actualText.equals("00:00:00"));
	}
}

public void verifyMpPoints(String durationType, int expectedPoints)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_pointMP).trim();
		int actualPoints=Integer.parseInt(actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify MP points is correct",actualPoints==0); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_pointMP).trim();
		int actualPoints=Integer.parseInt(actualText);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MP time is correct",actualPoints==expectedPoints);
	}
}

public void verifyMpWinCount(String durationType, int expectedWin)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_winMP).trim();
		int actualWin=Integer.parseInt(actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify MP points is correct",actualWin==0); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_winMP).trim();
		int actualWin=Integer.parseInt(actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MP time is correct",actualWin==expectedWin);
	}
}

public void verifyLastPlayedMpDate(String durationType)
{
	String expectedDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");
	
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_lastPlayedMp).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last played date is correct",actualText.equals("-")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_lastPlayedMp).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last played date is correct",actualText.equals("-"));
	
}
}

public void verifyRating(String durationType, double expectedRating)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_rating).trim();
		int actualRating=Integer.parseInt(actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify rating is correct",actualRating== expectedRating); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_rating).trim();
		int actualRating=Integer.parseInt(actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rating is correct",actualRating== expectedRating);
	}
}

public void verifyDepartmentName()
{
	String expectedDept=AllUsersPage.expectedDataUser.get("Department");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify Dept name is correct",expectedDept.equals(Pojo.getObjSeleniumFunctions().getText(loc_dept).trim()));
}

public void verifyLocationName()
{
	String expectedLoc=AllUsersPage.expectedDataUser.get("Location");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify location name is correct",expectedLoc.equals(Pojo.getObjSeleniumFunctions().getText(loc_location).trim()));
}

public void verifyGroupName()
{
	String expectedGroup=AllUsersPage.expectedDataUser.get("Group");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify group name is correct",expectedGroup.equals(Pojo.getObjSeleniumFunctions().getText(loc_group).trim()));
}

public void verifyModalTitle(String expectedTitle)
{
	By loc_titleModal=By.xpath("//div[text()='"+expectedTitle+"']");
	
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that modal title is correct", Pojo.getObjSeleniumFunctions().getText(loc_titleModal).trim().equals(expectedTitle));
}

public void closeEmailIdChip()
{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that email id chip is closing", Pojo.getObjSeleniumFunctions().click(loc_cancelChip));

}

public void clickAddEmailChip()
{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add email chip is clicking", Pojo.getObjSeleniumFunctions().click(loc_addEmailChip));
}

public void enterEmail(String email)
{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that email is entering", Pojo.getObjSeleniumFunctions().setText(loc_enterEmail, email));
}


public void selectCustomDuration()
{
  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that custom duration is selecting", Pojo.getObjSeleniumFunctions().click(loc_customDuration));
}

public void clickButtonOnModal(String buttonName)
{
	By loc_buttonName=By.xpath("//div[contains(text(),'"+buttonName+"')]");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that button is clicking", Pojo.getObjSeleniumFunctions().click(loc_buttonName));
}

public void verifySuccessDetailedReport(String expectedText)
{
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_msgSuccess, 30);
	String actualSuccessMsg=Pojo.getObjSeleniumFunctions().getText(loc_msgSuccess);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is appearing", actualSuccessMsg.equals(expectedText));
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Ok button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnOk));
}

public void verifyPlayerName()
{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player name is showing correctly", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_playerImage));
	String playerFirstName=AllUsersPage.expectedDataUser.get("FirstName");
	String playerLastName=AllUsersPage.expectedDataUser.get("LastName");
	String playerFullName=playerFirstName+" "+playerLastName;
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_playerName, 15);
    Pojo.getObjSeleniumFunctions().waitFor(3);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that player name is correct", Pojo.getObjSeleniumFunctions().getText(loc_playerName).trim().equals(playerFullName));}


public void verifyGameCountMlgDetailedReport(String durationType,int expectedCount)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_mlgGameCount).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify MLG game count is correct",actualText.equals("0")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		int actualGameCount=Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_mlgGameCount).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for mlg detailed report",expectedCount==actualGameCount );
	
}
}

public void verifyMlgSpPlayedTime(String durationType)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_mlgGamePlayedTime).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count time is correct",actualText.equals("00:00:00")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
	String actualText=Pojo.getObjSeleniumFunctions().getText(loc_mlgGamePlayedTime).trim();
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game played count is correct",actualText.equals("00:00:18")||actualText.equals("00:00:19")||actualText.equals("00:00:20")||actualText.equals("00:00:21")||actualText.equals("00:00:22")||actualText.equals("00:00:23")||actualText.equals("00:00:24") );
}}

public void verifyMlgPointsDetailedReport(String durationType,int expectedPoints)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_mlgSpPoints).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are correct for SP",actualText.equals("0")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
	String actualText=Pojo.getObjSeleniumFunctions().getText(loc_mlgSpPoints).trim();
	int intActualPoints=Integer.parseInt(actualText);

	System.out.println("Game Play Points Reports Expected "+expectedPoints);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are correct for SP",intActualPoints==expectedPoints);
}}

public void verifyLastPlayedMlgSPDate(String durationType)
{
	String expectedDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");
	
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_lastPlayedMlgSp).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last played date is correct",actualText.startsWith(expectedDate)); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_lastPlayedMlgSp).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last played date is correct",actualText.startsWith(expectedDate));
	
}
}

public void verifyRatingMlgSpDetailedReport(String durationType, double expectedRating)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_ratingMlgSp).trim();
		int actualRating=Integer.parseInt(actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify rating is correct",actualRating== expectedRating); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_ratingMlgSp).trim();
		int actualRating=Integer.parseInt(actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rating is correct",actualRating== expectedRating);
	}
}

public void verifyDepartmentNameMlgDetailedReport()
{
	String expectedDept=AllUsersPage.expectedDataUser.get("Department");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify Dept name is correct",expectedDept.equals(Pojo.getObjSeleniumFunctions().getText(loc_deptMlgDetailedReport).trim()));
}

public void verifyLocationNameMlgDetailedReport()
{
	String expectedLoc=AllUsersPage.expectedDataUser.get("Location");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify location name is correct",expectedLoc.equals(Pojo.getObjSeleniumFunctions().getText(loc_locationMlgDetailedReport).trim()));
}

public void verifyGroupNameMlgDetailedReport()
{
	String expectedGroup=AllUsersPage.expectedDataUser.get("Group");
	System.out.println("Expected Group "+expectedGroup);
	if(expectedGroup==null)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify group name is correct",Pojo.getObjSeleniumFunctions().getText(loc_groupMlgDetailedReport).trim().equals("-"));

	}
	else
	{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify group name is correct",expectedGroup.equals(Pojo.getObjSeleniumFunctions().getText(loc_groupMlgDetailedReport).trim()));
	}
}

public void verifySpgameCountSingleLevelDetailedReport(int actualGameCount, String durationType)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		 String playedGameCount=Pojo.getObjSeleniumFunctions().getText(loc_gamePlayedCountSingleLevelDetailedReport);
	      int actualNum=Integer.parseInt(playedGameCount);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that live count is correct", actualNum==0);
	}
	
	else
	{
  String liveGameCount=Pojo.getObjSeleniumFunctions().getText(loc_gamePlayedCountSingleLevelDetailedReport);
    int actualNum=Integer.parseInt(liveGameCount);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that live count is correct", actualNum==actualGameCount);
}}


public void verifySpPlayedTimeSingleLevelDetailedReport(String durationType)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_gamePlayedTimeSpSingleLevelDetailedReport).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is correct",actualText.equals("00:00:00")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
	String actualText=Pojo.getObjSeleniumFunctions().getText(loc_gamePlayedTimeSpSingleLevelDetailedReport).trim();
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is correct",actualText.equals("00:00:05")||actualText.equals("00:00:06")||actualText.equals("00:00:07")||actualText.equals("00:00:08")||actualText.equals("00:00:09")||actualText.equals("00:00:10") );
}}


public void verifySpPointsCountSingleLevelDetailedReport(String durationType,int expectedPoints)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_pointsSpSingleLevelDetailedReport).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are correct for SP",actualText.equals("0")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
	String actualText=Pojo.getObjSeleniumFunctions().getText(loc_pointsSpSingleLevelDetailedReport).trim();
	int intActualPoints=Integer.parseInt(actualText);

	System.out.println("Game Play Points Reports Expected "+expectedPoints);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are correct for SP",intActualPoints==expectedPoints);
}}


public void verifyLastPlayedSPDateSingleLevelDetailedReport(String durationType)
{
	String expectedDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");
	
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_lastPlayedSpSingleLevelDetailedReport).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last played date is correct",actualText.startsWith(expectedDate)); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_lastPlayedSpSingleLevelDetailedReport).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last played date is correct",actualText.startsWith(expectedDate));
	
}
}

public void verifyMpGameCountSingleLevelDetailedReport(String durationType,int mpPoints)
{
	
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_gamesMPSingleLevelDetailedReport).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify MP game count is correct",actualText.equals("0")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_gamesMPSingleLevelDetailedReport).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MP game count is correct",actualText.equals("0"));
	
}
}

public void verifyMpTimeSingleLevelDetailedReport(String durationType)
{
	
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_timeMPSingleLevelDetailedReport).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify MP time is correct",actualText.equals("00:00:00")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_timeMPSingleLevelDetailedReport).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MP time is correct",actualText.equals("00:00:00"));
	}
}

public void verifyMpPointsSingleLevelDetailedReport(String durationType, int expectedPoints)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_pointMPSingleLevelDetailedReport).trim();
		int actualPoints=Integer.parseInt(actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify MP points is correct",actualPoints==0); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_pointMPSingleLevelDetailedReport).trim();
		int actualPoints=Integer.parseInt(actualText);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MP time is correct",actualPoints==expectedPoints);
	}
}

public void verifyMpWinCountSingleLevelDetailedReport(String durationType, int expectedWin)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_winMPSingleLevelDetailedReport).trim();
		int actualWin=Integer.parseInt(actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify MP points is correct",actualWin==0); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_winMPSingleLevelDetailedReport).trim();
		int actualWin=Integer.parseInt(actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MP time is correct",actualWin==expectedWin);
	}
}

public void verifyLastPlayedMpDateSingleLevelDetailedReport(String durationType)
{
	String expectedDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");
	
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_lastPlayedMpSingleLevelDetailedReport).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last played date is correct",actualText.equals("-")); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_lastPlayedMpSingleLevelDetailedReport).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last played date is correct",actualText.equals("-"));
	
}
}

public void verifyRatingSingleLevelDetailedReport(String durationType, double expectedRating)
{
	if(durationType.equals("Last Week")||durationType.equals("Last Month"))
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_ratingSingleLevelDetailedReport).trim();
		int actualRating=Integer.parseInt(actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify rating is correct",actualRating== expectedRating); //Participation should be ("00:00:00"), need to log improvement
	}
	else
	{
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_ratingSingleLevelDetailedReport).trim();
		int actualRating=Integer.parseInt(actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rating is correct",actualRating== expectedRating);
	}
}

public void verifyDepartmentNameSingleLevelDetailedReport()
{
	String expectedDept=AllUsersPage.expectedDataUser.get("Department");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify Dept name is correct",expectedDept.equals(Pojo.getObjSeleniumFunctions().getText(loc_deptSingleLevelDetailedReport).trim()));
}

public void verifyLocationNameSingleLevelDetailedReport()
{
	String expectedLoc=AllUsersPage.expectedDataUser.get("Location");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify location name is correct",expectedLoc.equals(Pojo.getObjSeleniumFunctions().getText(loc_locationSingleLevelDetailedReport).trim()));
}

public void verifyGroupNameSingleLevelDetailedReport()
{
	String expectedGroup=AllUsersPage.expectedDataUser.get("Group");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify group name is correct",expectedGroup.equals(Pojo.getObjSeleniumFunctions().getText(loc_groupSingleLevelDetailedReport).trim()));
}

public void clickColumnHeaderToSortTheValues(String columnName)
{
    By loc_headerName=By.xpath("//button[contains(text(),'"+columnName+"')]");

	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that column header is clicking", Pojo.getObjSeleniumFunctions().click(loc_headerName));
	Pojo.getObjSeleniumFunctions().waitFor(5);
}

public void selectPlayerResultDetailedReport()
{
	
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_firstResult, 15);
    Pojo.getObjSeleniumFunctions().waitFor(3);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that first result is clicking", Pojo.getObjSeleniumFunctions().click(loc_firstResult));
}

public void verifyText(String expectedTabName)
{
	By loc_tabName=By.xpath("//*[contains(text(),'"+expectedTabName+"')]");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that text is showing correctly", Pojo.getObjSeleniumFunctions().getText(loc_tabName).trim().equals(expectedTabName));
}



public void clickTab(String expectedTabName)
{
	By loc_tabName=By.xpath("//div[contains(text(),'"+expectedTabName+"')]");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that tab is clicking", Pojo.getObjSeleniumFunctions().click(loc_tabName));
}

public void verifySpgameCountPlayerCard(int actualGameCount)
{
	
  String liveGameCount=Pojo.getObjSeleniumFunctions().getText(loc_spGamePlayedCountPlayerCard).trim();
    int actualNum=Integer.parseInt(liveGameCount);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that live count is correct", actualNum==actualGameCount);
}


public void verifySpPlayedTimePlayerCard()
{
	
	String actualText=Pojo.getObjSeleniumFunctions().getText(loc_spGamePlayedTimePlayerCard).trim();
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that participation count is correct",actualText.equals("00:00:11")||actualText.equals("00:00:12")||actualText.equals("00:00:13")||actualText.equals("00:00:14")||actualText.equals("00:00:15")||actualText.equals("00:00:16") );
}

public void verifyMpTimePlayerCard()
{
	
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_mpGamePlayedTimePlayerCard).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MP time is correct",actualText.equals("00:00:00"));
	
}

public void verifyMpGamesPlayerCard(int expectedGames)
{
	    String actualText=Pojo.getObjSeleniumFunctions().getText(loc_mpGamePlayedCountPlayerCard).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MP game count is correct",actualText.equals("0"));
	
}

public void verifyDateAchievedWithRookieLevel()
{
	   String expectedDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");
	
	   String expectedTextAndDate= "Achieved on:"+" "+expectedDate;
	   System.out.println("Roorkie level achieved date "+expectedTextAndDate);
	
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_dateAchievedRookieLevel).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that last played date is correct",actualText.equals(expectedTextAndDate));
	
}

   public void verifyGameCountRookie(int totalGamePlayCount, int gameRequiredForRookie) {
	
	   String expectedDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");
		
	   String expectedTextAndDate= "Achieved on:"+" "+expectedDate;
	   System.out.println("Roorkie level achieved date "+expectedTextAndDate);
	   int expectedGameCount=gameRequiredForRookie-totalGamePlayCount;
	
	if(expectedGameCount<=0)
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_dateAchievedRookieLevel, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that achieved is appearing",Pojo.getObjSeleniumFunctions().getText(loc_dateAchievedRookieLevel).trim().equals(expectedTextAndDate));
	}
	else
	{
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_dateAchievedRookieLevel, 10);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for rookie",Pojo.getObjSeleniumFunctions().getText(loc_dateAchievedRookieLevel).trim().equals(expectedGameCount+" "+"game to go"));
	}
}


public void verifyGameCountStarterPlayerCard(int totalGamePlayCount, int gameRequiredForStarter) {
	
int expectedGameCount=gameRequiredForStarter-totalGamePlayCount;
String expectedDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");

String expectedTextAndDate= "Achieved on:"+" "+expectedDate;
	
	if(expectedGameCount<=0)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Achieved is appearing",Pojo.getObjSeleniumFunctions().getText(loc_gameRemainingStarter).trim().equals(expectedTextAndDate));
	}
	else
	{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for Starter",Pojo.getObjSeleniumFunctions().getText(loc_gameRemainingStarter).trim().equals(expectedGameCount+" "+"game to go"));
	}
}

public void verifyGameCountProfessionalPlayerCard(int totalGamePlayCount, int gameRequiredForProfessional) {
	int expectedGameCount=gameRequiredForProfessional-totalGamePlayCount;
	String expectedDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");
    String expectedTextAndDate= "Achieved on:"+" "+expectedDate;
	
	if(expectedGameCount<=0)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that achieved is appearing",Pojo.getObjSeleniumFunctions().getText(loc_gameRemainingProfessional).trim().equals(expectedTextAndDate));
	}
	else
	{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for professional",Pojo.getObjSeleniumFunctions().getText(loc_gameRemainingProfessional).trim().equals(expectedGameCount+" "+"game to go"));
	}
}		


public void verifyGameCountAllStarPlayerCard(int totalGamePlayCount, int gameRequiredForAllStar) {
	int expectedGameCount=gameRequiredForAllStar-totalGamePlayCount;
	String expectedDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");
    String expectedTextAndDate= "Achieved on:"+" "+expectedDate;
	
	if(expectedGameCount<=0)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that achieved is appearing",Pojo.getObjSeleniumFunctions().getText(loc_gameRemainingAllStar).trim().equals(expectedTextAndDate));
	}
	else
	{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for all star",Pojo.getObjSeleniumFunctions().getText(loc_gameRemainingAllStar).trim().equals(expectedGameCount+" "+"game to go"));
	}
}		


public void verifyGameCountMasterPlayerCard(int totalGamePlayCount, String gameRequiredForMaster) {
	
	String tempStr= gameRequiredForMaster.replaceAll("[^0-9]", "").trim();
	int intGameRequiredMaster=Integer.parseInt(tempStr);
    int expectedGameCount=intGameRequiredMaster-totalGamePlayCount;
    
    String expectedDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");
    String expectedTextAndDate= "Achieved on:"+" "+expectedDate;
	
	
	if(expectedGameCount==0)
	{
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that achieved is appearing",Pojo.getObjSeleniumFunctions().getText(loc_gameRemainingMaster).trim().equals(expectedTextAndDate));
	}
	else if(expectedGameCount>999)
	{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for master before playing ",Pojo.getObjSeleniumFunctions().getText(loc_gameRemainingMaster).trim().equals(gameRequiredForMaster+" "+"game to go"));
	}
	else
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameRemainingMaster, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count is correct for master after playing ",Pojo.getObjSeleniumFunctions().getText(loc_gameRemainingMaster).trim().equals(expectedGameCount+" "+"game to go"));

	}
}

public void verifyTotalGamesInGameList(int gameCount)
{
	int totalRow=Pojo.getObjSeleniumFunctions().getWebElementList(loc_totalRow).size();
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game count in game list is correct",totalRow==gameCount);
}

public void verifyGameName()
{
  String expectedGameName=BuildSpGamePage.expectedData.get("GameName").get(0).toString();
  
  ArrayList<WebElement> gameNames=(ArrayList<WebElement>) Pojo.getObjSeleniumFunctions().getWebElementList(loc_gameNamesList);
  int totalGames=gameNames.size();
  String actualGameName="";
  
  for(int i=0;i<totalGames;i++)
  {
	  actualGameName=gameNames.get(i).getText().trim();
	  System.out.println("Actual Game Name List "+actualGameName);
	  System.out.println("Expected Game Name list "+expectedGameName);
	  
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name is correct in list", actualGameName.equals(expectedGameName));
  }
  
}

public void verifyPointsSingleLevelDetailedReport(int expectedPoints)
{
  ArrayList<WebElement> gamePoints=(ArrayList<WebElement>) Pojo.getObjSeleniumFunctions().getWebElementList(loc_pointsList);
  int totalGames=gamePoints.size();
  int actualPoints;
  
  for(int i=0;i<totalGames;i++)
  {
	  actualPoints=Integer.parseInt(gamePoints.get(i).getText().trim());
	  System.out.println("Actual Points List "+actualPoints);
	  System.out.println("Expected Points list "+expectedPoints);
	  
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points is correct in list", actualPoints==expectedPoints);
  }
  
}

public void verifyAccuracySingleLevelDetailedReport(int totalQues,int correctAns)
{
  ArrayList<WebElement> gameAccuracy=(ArrayList<WebElement>) Pojo.getObjSeleniumFunctions().getWebElementList(loc_accuracyList);
  int totalRow=gameAccuracy.size();
  String actualAccuracy;
  int expectedAccuracy=(totalQues/correctAns)*100;
  String strExpectedAccuracy=expectedAccuracy+"%";
  
  for(int i=0;i<totalRow;i++)
  {
	  actualAccuracy=gameAccuracy.get(i).getText().trim();
	  System.out.println("Actual Accuracy List "+actualAccuracy);
	  System.out.println("Expected Accuracy list "+strExpectedAccuracy);
	  
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that accuracy is correct in list", actualAccuracy.equals(strExpectedAccuracy));
  }
  }

public void verifyTimeSpentSingleLevelDetailedReport()
{
  ArrayList<WebElement> gameTimeSpent=(ArrayList<WebElement>) Pojo.getObjSeleniumFunctions().getWebElementList(loc_timeSpentList);
  int totalRow=gameTimeSpent.size();
  String actualText;
  
  for(int i=0;i<totalRow;i++)
  {
	  actualText=gameTimeSpent.get(i).getText().trim();
	  System.out.println("Actual Accuracy List "+actualText);
	  
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time spent is correct in list", actualText.equals("00:00:05")||actualText.equals("00:00:06")||actualText.equals("00:00:07")||actualText.equals("00:00:08")||actualText.equals("00:00:09")||actualText.equals("00:00:10"));
  }
  }

public void verifyPlayedOnDateSingleLevelDetailedRport()
{
	String expectedDate=Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");
	ArrayList<WebElement> playedOnDate=(ArrayList<WebElement>) Pojo.getObjSeleniumFunctions().getWebElementList(loc_playedOnDate);
  int totalRow=playedOnDate.size();
  String actualText;
  
  for(int i=0;i<totalRow;i++)
  {
	  actualText=playedOnDate.get(i).getText().trim();
	  System.out.println("Actual Date On List "+actualText);
	  
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that played on date is corrrect", actualText.startsWith(expectedDate));
  }
  }

public void verifyItemsPerPageCount()
{
	
	ArrayList<String> itemsPerPageExpected=new ArrayList<String>();
	itemsPerPageExpected.add("10");
	itemsPerPageExpected.add("20");
	itemsPerPageExpected.add("30");
	itemsPerPageExpected.add("40");
	itemsPerPageExpected.add("50");
	itemsPerPageExpected.add("100");
    
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("verify that items per page arrow is clicking", Pojo.getObjSeleniumFunctions().click(loc_arrowItemsPerPage));
	ArrayList<WebElement> itemsPerPageActualList=(ArrayList<WebElement>) Pojo.getObjSeleniumFunctions().getWebElementList(loc_listItemsPerPageNumbers);
	
	for(int i=0;i<=itemsPerPageExpected.size()-1;i++)
	{
		String actualText=itemsPerPageActualList.get(i).getText().trim();
		System.out.println("Actual Items Per Page Text "+actualText);
		String expectedText=itemsPerPageExpected.get(i);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that items per page count is correct",actualText.equals(expectedText));
	}

}

public void verifyAndClickOptionsIcon()
{
 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that options icon is appearing", Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_iconDownload));
 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that options icon is clicking", Pojo.getObjSeleniumFunctions().click(loc_iconDownload));

}

public void verifyDownloadButton(String buttonName)
{
	 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that download button is appearing", Pojo.getObjSeleniumFunctions().getText(loc_btnDownload).trim().equals(buttonName));

}

public void verifySendByEmailButton(String buttonName)
{
	 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that send By email button is appearing", Pojo.getObjSeleniumFunctions().getText(loc_btnSendByEmail).trim().equals(buttonName));

}



public void clickDownlaodButton()
{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that download button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnDownload));
}

public void clickSendByEmailBtn()
{
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that send by email button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnSendByEmail));

}

public void verifySuccessDownloadReport(String expectedText) throws IOException
{
	By loc_messageSuccessDownloadReport=By.xpath("//*[contains(text(),'"+expectedText+"')]");
	Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_messageSuccessDownloadReport, 15);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is correct",Pojo.getObjSeleniumFunctions().getText(loc_messageSuccessDownloadReport).trim().equals(expectedText));
	Pojo.getObjSeleniumFunctions().waitFor(5);// bcz downlods starts after few secs
	
}

public void verifyTextBlankScreen(String expectedText)
{
	By loc_message=By.xpath("//p[contains(text(),'"+expectedText+"')]");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that text is correct on blank screen",Pojo.getObjSeleniumFunctions().getText(loc_message).trim().equals(expectedText));

}

public void verifyTrophyAchievedCount(int expectedCount)
{
	int actualCount=Pojo.getObjSeleniumFunctions().getWebElementList(loc_tilesTrophy).size();
	
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophies count is correct", actualCount==expectedCount);
}

public void verifyTrophyTitleSubTitle(String expectedTitle, String expectedSubTitle)
{
	By loc_title=By.xpath("//div[text()='"+expectedTitle+"']");
	By loc_subTitle=By.xpath("//div[contains(text(),'"+expectedSubTitle+"')]");
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy title is correct", Pojo.getObjSeleniumFunctions().getText(loc_title).trim().equals(expectedTitle));
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy sub title is correct", Pojo.getObjSeleniumFunctions().getText(loc_subTitle).trim().equals(expectedSubTitle));
}

public void clickGameSpGamesReport()
{
	  String expectedGameName=BuildSpGamePage.expectedData.get("GameName").get(0).toString();
	  By loc_gameName=By.xpath("//p[contains(text(),'"+expectedGameName+"')]");
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game is clicking", Pojo.getObjSeleniumFunctions().click(loc_gameName));

}

public void verifyCorrectIncorrectTickQuestionTitle()
{
	boolean expectedState;
	boolean actualState;
	int actualPoints=0;
	String actualTime;
	int actualCardNumber;
	int expectedPoints=0;
	int totalPoints=0;
	int totalTime=0;
	
	HashMap<String, Boolean> actualQuestionAttempt = new HashMap<String, Boolean>();
	HashMap<String, Integer> actualQuestionPoints = new HashMap<String, Integer>();	
	HashMap<String, String> actualQuestionTime = new HashMap<String, String>();	
	HashMap<String, Integer> actualCardNum = new HashMap<String, Integer>();	

    Set<Integer> set1 = new HashSet<Integer>();    




	ArrayList<WebElement> quesTitles=(ArrayList<WebElement>) Pojo.getObjSeleniumFunctions().getWebElementList(loc_questionTitles);
	
	ArrayList<String> titleText=new ArrayList<String>();
	
	for(WebElement e:quesTitles)
	{
		titleText.add(e.getText().trim());
	}
	
	for(int i=0;i<quesTitles.size();i++)
	{
		String questionTitle=titleText.get(i);
		By loc_tickCorrectWithQues=By.xpath("//p[contains(text(),'"+questionTitle+"')]//parent::td//parent::tr/child::td[1]/mat-icon[contains(text(),'done')]");
        By loc_pointsWithQues=By.xpath("//p[contains(text(),'"+questionTitle+"')]//parent::td//parent::tr/child::td[4]");
		By loc_timeWithQues=By.xpath("//p[contains(text(),'"+questionTitle+"')]//parent::td//parent::tr/child::td[5]");
        By loc_CardNumWithQues=By.xpath("//p[contains(text(),'"+questionTitle+"')]//parent::td//parent::tr/child::td[2]");
        By loc_tickIcon=By.xpath("//p[contains(text(),'"+questionTitle+"')]//parent::td//parent::tr/child::td[1]/child::mat-icon");
        
		if(Pojo.getObjSeleniumFunctions().getText(loc_tickIcon).trim().equals("done"))
		{
			actualQuestionAttempt.put(titleText.get(i), true);
			actualQuestionPoints.put(titleText.get(i), Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsWithQues).trim()));
			actualQuestionTime.put(titleText.get(i), Pojo.getObjSeleniumFunctions().getText(loc_timeWithQues).trim());
			actualCardNum.put(titleText.get(i),Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_CardNumWithQues).trim()));
			set1.add(Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_CardNumWithQues).trim()));//To check duplicate card num is not in the list
			totalPoints=totalPoints+Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsWithQues).trim());
			totalTime=totalTime+ Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_timeWithQues).trim().replaceAll("[^0-9]", ""));

		}
		else
		{
			actualQuestionAttempt.put(titleText.get(i), false);
			actualQuestionPoints.put(titleText.get(i), Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_pointsWithQues).trim()));
			actualQuestionTime.put(titleText.get(i), Pojo.getObjSeleniumFunctions().getText(loc_timeWithQues).trim());
			totalTime=totalTime+ Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_timeWithQues).trim().replaceAll("[^0-9]", ""));

			actualCardNum.put(titleText.get(i),Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_CardNumWithQues).trim()));
			set1.add(Integer.parseInt(Pojo.getObjSeleniumFunctions().getText(loc_CardNumWithQues).trim()));//To check duplicate card num is not in the list


		}
	}
	
	System.out.println("Total Points "+totalPoints);
	
	ArrayList<Integer> cardNums=new ArrayList<Integer>();
	cardNums.add(1);
	cardNums.add(2);
	
	for(int i=0;i<quesTitles.size();i++)
	{
		String questionTitle=titleText.get(i);
		expectedState=SelectAnswerPageDesktopView.expectedQuestionAttemptData.get(questionTitle);
		actualState=actualQuestionAttempt.get(questionTitle);
		expectedPoints=SelectAnswerPageDesktopView.expectedGamePlayData.get(questionTitle);
		actualPoints=actualQuestionPoints.get(questionTitle);
		actualTime=actualQuestionTime.get(questionTitle);
		actualCardNumber=actualCardNum.get(questionTitle);
		
		System.out.println("Expected Ques Points "+expectedPoints);
		System.out.println("Actual Ques Points "+actualPoints);
		
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct tick is appearing with the question", expectedState==actualState);
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are showing correctly with question", expectedPoints==actualPoints);
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that time is showing correctly with question", actualTime.equals("00:00:01")||actualTime.equals("00:00:02")||actualTime.equals("00:00:03"));
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that card no is correct with question", actualCardNumber<=quesTitles.size());
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that card no is not duplicate", quesTitles.size()==set1.size());

	}
	
	String expectedTotalPoints="Total Points: "+totalPoints;
	String actualTotalPoints=Pojo.getObjSeleniumFunctions().getText(loc_totalPoints).trim();
	String expectedTotalQuesTime="Total Time: 00:00:0"+totalTime;
	String actualTotalQuesTime=Pojo.getObjSeleniumFunctions().getText(loc_totalQuesTime).trim();
	String expectedDate="Played On: "+Pojo.getObjUtilitiesFunctions().getDateInSpecifiedFormat("MM/dd/yyyy");
	String actualDate=Pojo.getObjSeleniumFunctions().getText(loc_playedOnDateAttemptedQuesScr).trim();

	
	System.out.println("Expected Total Points "+expectedTotalPoints);
	System.out.println("Actual Total Points "+actualTotalPoints);
	System.out.println("Expected Total Time "+expectedTotalQuesTime);
	System.out.println("Actual Total Time "+actualTotalQuesTime);
	System.out.println("Expected Date "+expectedDate);
	System.out.println("Actual Date "+actualDate);
	
	
	
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total points are showing correctly",expectedTotalPoints.equals(actualTotalPoints));
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total ques time is showing correctly", expectedTotalQuesTime.equals(actualTotalQuesTime));
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that played on date is showing correctly", expectedDate.equals(actualDate));
}


public void verifyDownloadedReportData(HashMap<String, List> expectedCsvData) throws IOException
{
	System.out.println("Actual Csv Data "+Pojo.getObjUtilitiesFunctions().getCsvData());
	System.out.println("Expected Csv Data "+expectedCsvData);
	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that downloaded csv data is correct",Pojo.getObjUtilitiesFunctions().getCsvData().equals(expectedCsvData));
}

public void verifyColumnHeaderDownloadedReportData(HashMap<String, List> expectedCsvData) throws IOException
{

		System.out.println("Actual Csv Data "+Pojo.getObjUtilitiesFunctions().getCsvData().get("Row 1"));
		System.out.println("Expected Csv Data "+expectedCsvData.get("Row 1"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that downloaded csv data is correct",Pojo.getObjUtilitiesFunctions().getCsvData().get("Row 1").equals(expectedCsvData.get("Row 1")));
	}
}












