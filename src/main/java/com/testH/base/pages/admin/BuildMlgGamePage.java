package com.testH.base.pages.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;

public class BuildMlgGamePage {
	
	ArrayList<String> games = new ArrayList<String>();
	ArrayList<String> rules = new ArrayList<String>();
	ArrayList<String> mlgName = new ArrayList<String>();
	ArrayList<Integer> gameCriteria ;
	ArrayList<Boolean> statusGameCriteria ;
	static String gameName="";
	public static int count;
 
	


	public static HashMap<String, List<String>> expectedDataMLG = new HashMap<String, List<String>>();
	public static HashMap<String, List<Integer>> expectedCriteria  = new HashMap<String, List<Integer>>();
	public static HashMap<String, List<Boolean>> statusCriteriaAdded = new HashMap<String, List<Boolean>>();

	
	
	
	By loc_NewGameTextBoxMLG=By.xpath("//input[@placeholder='Multilevel game name']");
	By loc_btnAddLevel=By.xpath("//mat-icon[text()='add']");
	By loc_textBoxSearch=By.xpath("//input[@type='search']");
	By loc_totaloints=By.xpath("//span[contains(text(),'Total Points')]");
	By loc_minimumAttempts=By.xpath("//span[contains(text(),'Minimum Attempts')]");
	By loc_highScore=By.xpath("//span[contains(text(),'High Score')]");
	By loc_btnDone=By.xpath("//*[contains(text(),'DONE')]");
	By loc_btnAdd=By.xpath("//span[contains(text(),'ADD')]");
	By loc_btnAddChip=By.xpath("//span[contains(text(),'Add')]/parent::div");
	By loc_btnAddlayers=By.xpath("//mat-icon[contains(text(),'person_add')]/parent::div");
	By loc_chipLocationDrpDown=By.xpath("//span[contains(text(),'Location')]/child::button[1]");
	By loc_chipLocationSelected=By.xpath("//span[contains(text(),'Location')]");
	By loc_chipDeptDrpDown=By.xpath("//span[contains(text(),'Department')]/child::button[1]");
    By loc_toggleStatus=By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By loc_btnTurnOn=By.xpath("//span[text()='Turn On']");
	By loc_successMessage=By.xpath("//*[contains(@class,'mat-snack')]");
	By loc_ruleBtn=By.xpath("//mat-icon[contains(text(),'assignment')]/parent::div");
	By loc_textAreaRules=By.xpath("//textarea[contains(@name,'contest-rules')]");
	By loc_selectAllCheckbox=By.xpath("//div[contains(@class,'select-all-checkbox')]");

    
	public void enterMlgGameName(String gameName)
	{
		mlgName.add(gameName);
	    Pojo.getObjSeleniumFunctions().waitFor(3);
	    Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_NewGameTextBoxMLG, 10);
        Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that MLG area is clicking",Pojo.getObjSeleniumFunctions().click(loc_NewGameTextBoxMLG));
		Pojo.getObjSeleniumFunctions().clearText(loc_NewGameTextBoxMLG);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that text is entering",Pojo.getObjSeleniumFunctions().setText(loc_NewGameTextBoxMLG, gameName));
		expectedDataMLG.put("MLGRName",mlgName);

	}
	
	public void enterRule(String rule)
	{
		rules.add(rule);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_ruleBtn, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rule button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_ruleBtn));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that rules entering",Pojo.getObjSeleniumFunctions().setText(loc_textAreaRules, rule));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking ", Pojo.getObjSeleniumFunctions().click(loc_btnDone));
		expectedDataMLG.put("MLGRule",rules);

	}
	
	public void clickAddLevelBtn()
	{
	gameCriteria= new ArrayList<Integer>();
	statusGameCriteria=new ArrayList<Boolean>();
	
	Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnAddLevel);
	Pojo.getObjSeleniumFunctions().waitFor(2);
    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Add Level button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAddLevel));
   
	}
	
	public void enterGameNameAndSelect(int gameNumber)
	{
		 
		 gameName=BuildSpGamePage.expectedData.get("GameName").get(gameNumber);
	     games.add(gameName);
         By loc_gameName=By.xpath("//div[contains(text(),'"+gameName+"')]");
		 Pojo.getObjSeleniumFunctions().waitFor(2);
         Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that recently created game is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxSearch,gameName));
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify game is selecting", Pojo.getObjSeleniumFunctions().click(loc_gameName));
		 expectedDataMLG.put("MLGLevelName",games);
		 count=count+1;
		 
	}
	public void enterGameNameAndSelect(String gameNameAlreadyCreated)
	{
		 gameName=gameNameAlreadyCreated;
	     games.add(gameName);
         By loc_gameName=By.xpath("//div[contains(text(),'"+gameName+"')]");
		 Pojo.getObjSeleniumFunctions().waitFor(2);
         Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that already created game is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxSearch,gameName));
         Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_gameName, 15);
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify game is selecting", Pojo.getObjSeleniumFunctions().click(loc_gameName));
		 expectedDataMLG.put("MLGLevelName",games);
		 count=count+1;

	}
	
	public void clickAddCriteriaBtn(int levelNumber)
	{
		
		 gameName=BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(levelNumber);
		 Pojo.getObjSeleniumFunctions().waitFor(3);
		 By loc_addCriteria=By.xpath("//td[contains(text(),'"+gameName+"')]//following-sibling::td[1]/child::div/child::mat-form-field");
		 Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_addCriteria, 10);
		 System.out.println("Locator "+loc_addCriteria);
		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add criteria button is clicking",Pojo.getObjSeleniumFunctions().click(loc_addCriteria));

	}
	
	public void selectTotalPoints(String selectTotalPointsOrNot)
	{
		if(selectTotalPointsOrNot.equalsIgnoreCase("Yes"))
		{
	    statusGameCriteria.add(true);
	    statusCriteriaAdded.put(gameName,statusGameCriteria);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total points are selecting",Pojo.getObjSeleniumFunctions().click(loc_totaloints));
		}
		else
		{
		    statusGameCriteria.add(false);
		    statusCriteriaAdded.put(gameName,statusGameCriteria);

		}


	}
	
	public void selectMinimumAttempts(String selectTotalAttemptssOrNot)
	{
		if(selectTotalAttemptssOrNot.equalsIgnoreCase("Yes"))
		{
		    statusGameCriteria.add(true);
		    statusCriteriaAdded.put(gameName,statusGameCriteria);

		    Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total attempts are selecting",Pojo.getObjSeleniumFunctions().click(loc_minimumAttempts));
		}
		else
		{
			statusGameCriteria.add(false);
		    statusCriteriaAdded.put(gameName,statusGameCriteria);

		}
	}

	public void selectHighScore(String selectHighScoreOrNot)
	{
		if(selectHighScoreOrNot.equalsIgnoreCase("Yes"))
		{
		 statusGameCriteria.add(true);
		 statusCriteriaAdded.put(gameName,statusGameCriteria);

		 Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score selecting",Pojo.getObjSeleniumFunctions().click(loc_highScore));
		}
		else
		{
			statusGameCriteria.add(false); 
		    statusCriteriaAdded.put(gameName,statusGameCriteria);

		}
	}
	
	public void clickDoneBtn()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnDone, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that done button is clicking",Pojo.getObjSeleniumFunctions().click(loc_btnDone));

	}
	
	public void clickAddBtn()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnAdd, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that ADD button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAdd));
	}
	
	public void clickAddPlayers()
	{
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnAddlayers);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that add players button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnAddlayers));
	}
	
	public void addChipAddPlayersPage()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnAddChip, 15);
		Pojo.getObjSeleniumFunctions().waitFor(4);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Add button is clicking", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_btnAddChip));
	}
	
	public void clickLocation()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_chipLocationDrpDown, 15);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location dropdown is clicking", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_chipLocationDrpDown));
	}
	
	public void clickSelectedLocationChip()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_chipLocationSelected, 15);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location dropdown is clicking", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_chipLocationSelected));
	}
	public void enterLocation()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxSearch, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location is clicking", Pojo.getObjSeleniumFunctions().click(loc_textBoxSearch));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxSearch, AllUsersPage.expectedDataUser.get("Location")));
	}
	
	public void enterLocation(String locationName)
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxSearch, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location is clicking", Pojo.getObjSeleniumFunctions().click(loc_textBoxSearch));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxSearch, locationName));
	}
	
	public void clickSelectAll()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_selectAllCheckbox, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that select all button is clicking", Pojo.getObjSeleniumFunctions().click(loc_selectAllCheckbox));
	}
	
	public void selectLocation()
	{
		String locationName=AllUsersPage.expectedDataUser.get("Location");
		By loc_chkBoxLocation=By.xpath("//div[contains(text(),'"+locationName+"')]/parent::div/child::div[1]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_chkBoxLocation, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location checkbox is selecting", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_chkBoxLocation));
    }
	
	public void selectLocation(String locationName)
	{
		By loc_chkBoxLocation=By.xpath("//div[contains(text(),'"+locationName+"')]/parent::div/child::div[1]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_chkBoxLocation, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that location checkbox is selecting", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_chkBoxLocation));
    }
	
	
	
	public void clickDept()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_chipDeptDrpDown, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that dept dropdown is clicking", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_chipDeptDrpDown));
	}
	public void enterDept()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxSearch, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that dept is clicking", Pojo.getObjSeleniumFunctions().click(loc_textBoxSearch));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that dept is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxSearch, AllUsersPage.expectedDataUser.get("Department")));
	}

	public void selectDept()
	{
		String deptName=AllUsersPage.expectedDataUser.get("Department");
		By loc_chkBoxDepartment=By.xpath("//div[contains(text(),'"+deptName+"')]/parent::div/child::div[1]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_chkBoxDepartment, 15);
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_chkBoxDepartment);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify dept checkbox is selecting", Pojo.getObjSeleniumFunctions().click(loc_chkBoxDepartment));
	}
	public void selectDept(String deptName)
	{
		By loc_chkBoxDepartment=By.xpath("//div[contains(text(),'"+deptName+"')]/parent::div/child::div[1]");
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_chkBoxDepartment, 15);
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_chkBoxDepartment);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify dept checkbox is selecting", Pojo.getObjSeleniumFunctions().click(loc_chkBoxDepartment));
	}
	
	public void enterDept(String deptName)
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textBoxSearch, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that dept is clicking", Pojo.getObjSeleniumFunctions().click(loc_textBoxSearch));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that dept is entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxSearch, deptName));
	}
	
	
	
	public void clickToggleBtn()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_toggleStatus, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that toggle button is clicking", Pojo.getObjSeleniumFunctions().click(loc_toggleStatus));
	}
	public void clickTurnOnBtn()
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnTurnOn, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that turn on button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnTurnOn));
	}
	
	public void verifySuccessMsg(String expectedText)
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_successMessage, 15);
		String actualText=Pojo.getObjSeleniumFunctions().getText(loc_successMessage).trim();
		System.out.println("Success Message MLG "+actualText);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is appearing",expectedText.equals(actualText));
	}
	
	public void setPoints(int level,int points)
	{
       if(statusCriteriaAdded.get(gameName).get(0)==true)
       {
		
		gameName=BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(level);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		By loc_textBoxTotalPoints=By.xpath("//td[contains(text(),'"+gameName+"')]//following-sibling::td[1]//child::span[contains(text(),'TOTAL POINTS')]/following-sibling::input");
		gameCriteria.add(points);
		expectedCriteria.put(gameName, gameCriteria);
		String strPointsString=Integer.toString(points);
		Pojo.getObjSeleniumFunctions().clearText(loc_textBoxTotalPoints);;
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that points are entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxTotalPoints, strPointsString));
		}
	else
	{
		gameName=BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(level);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		gameCriteria.add(null);
		expectedCriteria.put(gameName, gameCriteria);
	}} 
	public void setAttempts(int level,int attempts)
	{
		if(statusCriteriaAdded.get(gameName).get(1)==true)
		{
		gameName=BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(level);
		Pojo.getObjSeleniumFunctions().waitFor(3);
		By loc_textBoxMinimumAttempts=By.xpath("//td[contains(text(),'"+gameName+"')]//following-sibling::td[1]//child::span[contains(text(),'MINIMUM ATTEMPTS')]/following-sibling::input");
		gameCriteria.add(attempts);
		expectedCriteria.put(expectedDataMLG.get("MLGLevelName").get(level), gameCriteria);
		String strAttemptsString=Integer.toString(attempts);
		Pojo.getObjSeleniumFunctions().clearText(loc_textBoxMinimumAttempts);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that attempts are entering", Pojo.getObjSeleniumFunctions().setText(loc_textBoxMinimumAttempts,strAttemptsString));
		}
		else
		{
			gameName=BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(level);
			Pojo.getObjSeleniumFunctions().waitFor(3);
			gameCriteria.add(null);
			expectedCriteria.put(gameName, gameCriteria);
		}
		
	}
	public void setHighScore(int level,int highScore)
	{
		if(statusCriteriaAdded.get(gameName).get(2)==true)
		{
		 gameName=BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(level);
		 Pojo.getObjSeleniumFunctions().waitFor(3);
		 By loc_drpDownHighScore=By.xpath("//td[contains(text(),'"+gameName+"')]//following-sibling::td[1]//child::span[contains(text(),'HIGH SCORE')]/parent::div/child::select");
		 gameCriteria.add(highScore);
		expectedCriteria.put(expectedDataMLG.get("MLGLevelName").get(level), gameCriteria);
		By loc_highScore=By.xpath("//td[contains(text(),'"+gameName+"')]//following-sibling::td[1]//child::span[contains(text(),'HIGH SCORE')]/parent::div//child::option[@value='"+highScore+"']");
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score drp down is clicking", Pojo.getObjSeleniumFunctions().click(loc_drpDownHighScore));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that high score is selecting", Pojo.getObjSeleniumFunctions().click(loc_highScore));
		}
		else
		{
			gameName=BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").get(level);
			Pojo.getObjSeleniumFunctions().waitFor(3);
			gameCriteria.add(null);
			expectedCriteria.put(gameName, gameCriteria);	
		}
	}
	
	}
	

