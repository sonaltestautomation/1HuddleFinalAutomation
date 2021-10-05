package com.testH.base.pages.androidApp;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.BuildMlgGamePage;
import com.testH.base.pages.admin.TrophiesPageAdmin;
import com.testH.base.pages.client.EndGamePage;

import io.appium.java_client.MobileBy;

public class EndGamePageAndroidApp extends EndGamePage  {
	
	By loc_textGameOver=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_textTotalTime=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/end_game_total_time_tv\")");
	By loc_totalTimeValue=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/end_game_total_time_val_tv\")");
	By loc_headerTrophyAchieved=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/achievement_dialog__fragment_achieved_tv\")");
	By loc_headerLevelAchieved=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_textTitle=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/achievement_dialog__fragment_achieved_name_tv\")");
	By loc_textSubtilte=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/achievement_dialog__fragment_achieved_desc_tv\")");
	By loc_textSubtilteLevel=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
    By loc_btnClose_Trophy=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/close_dialog\")");
    By loc_btnClose_MlgLevel=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/closeDailog\")");
    By loc_btnLetKnow=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/achievement_dialog_fragment_share_tv_root\")");
	By loc_textShareTrophy=MobileBy.xpath("//android.widget.TextView[@resource-id='android:id/title']");
	By loc_textShareLevel=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_textTotalPointsGameTrophy=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/game_trophy_details_points_tv\")");
	By loc_trophyName=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/gameName\")");

	By loc_iconFbShare=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_iconLinkdIn=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_iconTwitterShare=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_iconMailShare=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	By loc_tropgyClose=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/custom_action_bar_title_tv\")");
	
	By loc_homeButton=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/end_game_leaderboard_tv\")");
	By loc_trophyLevelContainer=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/achievement_dialog__fragment_view_holder_cl\")");
	By loc_endGameTotalPoints=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/end_game_player_game_score_tv\")");
	By loc_gameTrophyLevelContainer=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/achievement_dialog_fragment_level_achieved_tv\")");

	
	By loc_btnSendRecord=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/end_game_send_recap_tv\")");
	By loc_textSuccessSendRecord=MobileBy.xpath("//*[@text='Game record has been sent to your registered email address.']");
	By loc_textLevelComplete=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.ionicframework.SaleshuddleApp:id/level_completed_label\")");
	
	
	@Override
	public void verifyTotalScore(int expectedScore) {
		String EndGamePoints=Pojo.getObjSeleniumFunctions().getText(loc_endGameTotalPoints);
		EndGamePoints=EndGamePoints.replaceAll("[^0-9]","");
		int intEndGamePoints=Integer.parseInt(EndGamePoints);
		System.out.println("End Game Points "+intEndGamePoints);
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Total score is correct", expectedScore==intEndGamePoints);
		
	}

	@Override
	public void verifyAndClickSendRecordButton() {
		Pojo.getObjSeleniumFunctions().waitForElementToBeClickable(loc_btnSendRecord);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that send record button is appearing", Pojo.getObjSeleniumFunctions().getText(loc_btnSendRecord).trim().equals("SEND RECORD"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that send record button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnSendRecord));
		
	}

	@Override
	public void verifyHomeButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyScorePercentage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickHomeButton() {
	//	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().click(loc_homeButton));
		//Pojo.getObjSeleniumFunctions().waitFor(7);
		//Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();
	  //  Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_trophyLevelContainer, 10);

		while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_trophyLevelContainer)||Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_gameTrophyLevelContainer))
		 {
			Pojo.getObjSeleniumFunctions().navigateToBack();
			//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_Trophy));
			Pojo.getObjSeleniumFunctions().waitFor(3);
			System.out.println("Navigate Back");
		  }
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_homeButton, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().click(loc_homeButton));

	    }
		
    @Override
	public void verifyTrophyTitleAndSubtitle(String expectedTitle, String expectedSubTitle) {
		Pojo.getObjSeleniumFunctions().waitFor(5);
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_headerTrophyAchieved, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that header is correct", Pojo.getObjSeleniumFunctions().getText(loc_headerTrophyAchieved).trim().equals("TROPHY ACHIEVED!"));
		String actualTitle=Pojo.getObjSeleniumFunctions().getText(loc_textTitle).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that title is correct", expectedTitle.trim().equals(actualTitle));
		String actualSubTitle=Pojo.getObjSeleniumFunctions().getText(loc_textSubtilte).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that sub title is correct", expectedSubTitle.trim().equals(actualSubTitle));
		
	}

	@Override
	public void verifyLevelTitleANdSubTitle(String expectedTitle, String expectedSubTitle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyAndClickLetKnowButton() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Let them know button is displaying",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnLetKnow));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Let them know button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnLetKnow));		
	}

	@Override
	public void verifyShareTropyTitle() {
		
		//Modal does not open in android app
		
//		Pojo.getObjSeleniumFunctions().waitFor(5);
//		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textShareTrophy, 10);
//		System.out.println("Title Test "+Pojo.getObjSeleniumFunctions().getText(loc_textShareTrophy));
//		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that share social media title is correct for trophies",Pojo.getObjSeleniumFunctions().getText(loc_textShareTrophy).trim().equals("SHARE"));
		Pojo.getObjSeleniumFunctions().navigateToBackAndroidApp();
	}

	@Override
	public void verifyAndClickFbShare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyAndClickLinkInShare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyAndClickTwitterShare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyAndClickMailShare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyAndClickCloseButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickHomeButtonForTrophies(int gameCount,int index) {
		{
			//Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_homeButton, 10);
		//	Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().click(loc_homeButton));
		  //  Pojo.getObjSeleniumFunctions().waitFor(5);
		//	Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();

			    if(index<gameCount)
			    {
			    
			    //Pojo.getObjSeleniumFunctions().waitFor(10);
			    Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_trophyLevelContainer, 10);
				while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_trophyLevelContainer))
				 {
					Pojo.getObjSeleniumFunctions().navigateToBack();
					//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_Trophy));
					Pojo.getObjSeleniumFunctions().waitFor(3);
					System.out.println("Navigate Back");
				  }
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().click(loc_homeButton));

			    }
			    
			    
			   }
		
	}

	@Override
	public void clickHomeButtonForLevels(int gameCount,int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyShareLevelTitle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyGameOverText() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textGameOver, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that GAME OVER text is displaying", Pojo.getObjSeleniumFunctions().getText(loc_textGameOver).trim().equals("Game Over"));
		
		
	}

	@Override
	public void verifyGameName(String expectedGameName) {
		
		//We dont show game name on end game screen on android app

		
	}

	@Override
	public void verifyTotalTimeField() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total time filed is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textTotalTime).trim().equals("Total Time"));
		String totalTime=Pojo.getObjSeleniumFunctions().getText(loc_totalTimeValue).trim();
		totalTime=totalTime.replaceAll("[^0-9]", "");
		System.out.println("Total time is "+totalTime);
		int intTotalTime=Integer.parseInt(totalTime);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total time is correct", intTotalTime>0);
		
	}

	@Override
	public void verifySuccessMessageAfterSendRecord(String successText) {
		System.out.println("Success Text "+Pojo.getObjSeleniumFunctions().getText(loc_textSuccessSendRecord).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is appearing after send record", Pojo.getObjSeleniumFunctions().getText(loc_textSuccessSendRecord).trim().equals("Game record has been sent to your registered email address."));
		
	}

	@Override
	public void clickHomeButtonForGameTrophies(int gameCount, int index) {
	    //Pojo.getObjSeleniumFunctions().waitFor(5);
		Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();

	    System.out.println("Trophy Name "+TrophiesPageAdmin.gameTrophyData.get("TrophyName"));
		    if((TrophiesPageAdmin.gameTrophyData.get("TrophyName")!=null))
		    {
			while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_trophyLevelContainer))
			 {
				if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_textTotalPointsGameTrophy)==true)
				{
					break;
				}
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that back button is clicking", Pojo.getObjSeleniumFunctions().navigateToBack());
				Pojo.getObjSeleniumFunctions().waitFor(3);
				System.out.println("Click back");
			  }
			//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_homeButton));

		    }}
		
	

	@Override
	public void clickHomeButtonForMlgTrophies(int levelNum,String levelOrTrophy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyMlgTrophyText(String expectedText) {
		By loc_actualText=By.xpath("//android.widget.TextView[@text='"+expectedText+"']");
		System.out.println("Trphy Text "+Pojo.getObjSeleniumFunctions().getText(loc_actualText).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct text is appearing on trophy popup ", Pojo.getObjSeleniumFunctions().getText(loc_actualText).trim().equals(expectedText));	}

	@Override
	public void verifyMlgTrophyName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeMlgTrophy() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that trophy is getting closed", Pojo.getObjSeleniumFunctions().click(loc_btnClose_Trophy));
		
	}

	@Override
	public void closeLevelPopUp() {
		if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_btnClose_MlgLevel))
		{
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnClose_MlgLevel, 10);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level popup is closing ", Pojo.getObjSeleniumFunctions().click(loc_btnClose_MlgLevel));
		}
	}

	@Override
	public void verifyCompleteText(String text) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textLevelComplete, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level complete text is correct", Pojo.getObjSeleniumFunctions().getText(loc_textLevelComplete).trim().equals(text));		
	}

	@Override
	public void clickHomeButtonForMlgTrophies(int levelNum, String levelOrTrophy, int totalLevels) {
		//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().click(loc_homeButton));
		//Pojo.getObjSeleniumFunctions().waitFor(7);
		 Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_trophyLevelContainer, 10);
		
		while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_trophyLevelContainer))
		 {
			Pojo.getObjSeleniumFunctions().navigateToBack();
			//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_Trophy));
			Pojo.getObjSeleniumFunctions().waitFor(3);
			System.out.println("Navigate Back");
		 }
		
		if(totalLevels==levelNum&&levelOrTrophy.equalsIgnoreCase("TROPHY"))//if trophy is provided from feature file then MLG level complete pop up will be closed otherwise MLG level complete popup remain open to verify level complete popup text
		{
			System.out.println("No of levels in MLG "+BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").size());
			//Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_MlgLevel));
			Pojo.getObjSeleniumFunctions().navigateToBack();

		}	
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_homeButton, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().click(loc_homeButton));
	}

	@Override
	public void verifyMlgTrophyName(String mlgName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyGameTrophyNameEndGame() {
		System.out.println("Trophy Name Expected "+TrophiesPageAdmin.gameTrophyData.get("TrophyName"));
		System.out.println("Trophy Name Actual "+Pojo.getObjSeleniumFunctions().getText(loc_trophyName).trim());
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game trophy name is correct",TrophiesPageAdmin.gameTrophyData.get("TrophyName").equals(Pojo.getObjSeleniumFunctions().getText(loc_trophyName).trim()));		
	}

	@Override
	public void closeAllTrophiesAndLevelAndGoToHomeScreen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeOpenedTrophies() {
		while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_trophyLevelContainer)||Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_gameTrophyLevelContainer))
		 {
			Pojo.getObjSeleniumFunctions().navigateToBack();
			Pojo.getObjSeleniumFunctions().waitFor(3);
			System.out.println("Navigate Back");
		 }	
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_homeButton, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().click(loc_homeButton));
	}
}
	


