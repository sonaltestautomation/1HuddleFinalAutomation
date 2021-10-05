package com.testH.base.desktopView;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;
import com.testH.base.pages.admin.AllUsersPage;
import com.testH.base.pages.admin.BuildMlgGamePage;
import com.testH.base.pages.admin.BuildSpGamePage;
import com.testH.base.pages.admin.TrophiesPageAdmin;
import com.testH.base.pages.client.EndGamePage;

public class EndGamePageDesktopView extends EndGamePage  {
	
	
	By loc_endGameTotalPoints=By.xpath("//div[contains(@class,'gameScore')]");
	By loc_homeButton=By.xpath("//span[text()='HOME']");
	By loc_gameIcon=By.xpath("//span[text()='Games']//parent::div");
	
	By loc_headerTrophyAchieved=By.xpath("//span[text()='TROPHY ACHIEVED!']");
	By loc_headerLevelAchieved=By.xpath("//span[text()='ACHIEVED']");
	By loc_textTitle=By.xpath("//span[text()='TROPHY ACHIEVED!']//parent::div//following-sibling::div/child::span[1]");
	By loc_textSubtilte=By.xpath("//span[text()='TROPHY ACHIEVED!']//parent::div//following-sibling::div/child::span[2]");
	By loc_textSubtilteLevel=By.xpath("//span[text()='ACHIEVED']//parent::div//following-sibling::div/child::span");
    By loc_btnClose_Trophy=By.xpath("//div[contains(@class,'contentSection')]/child::div[contains(@class,'close')]");
    By loc_btnClose_MlgLevel=By.xpath("//section[contains(@class,'level_details')]/child::div[contains(@class,'close')]");
    By loc_btnLetKnow=By.xpath("//span[contains(text(),'LET')]");
	By loc_textShareTrophy=By.xpath("//mat-card-title[contains(text(),'SHARE TROPHY')]");
	By loc_textShareLevel=By.xpath("//mat-card-title[contains(text(),'SHARE LEVEL')]");
	By loc_textTotalPointsGameTrophy=By.xpath("//span[contains(text(),'Total Points')]");

	By loc_iconFbShare=By.xpath("//img[@data-social='facebook_share']");
	By loc_iconLinkdIn=By.xpath("//img[@data-social='linkdin_share']");
	By loc_iconTwitterShare=By.xpath("//img[@data-social='twitter_share']");
	By loc_iconMailShare=By.xpath("//img[@data-social='mail_share']");
	By loc_tropgyClose=By.xpath("//span[contains(text(),'TROPHY ACHIEVED')]/parent::div/parent::div/parent::div/child::div[1]");

	By loc_levelBatch=By.xpath("//span[contains(text(),'ACHIEVED')]");
	
	By loc_textGameOver=By.xpath("//mat-card-title[contains(text(),'GAME OVER')]");
	By loc_gameNameEndGame=By.xpath("//mat-card-title[contains(text(),'GAME OVER')]//following-sibling::div");
	By loc_textTotalTime=By.xpath("//mat-card-title[contains(text(),'TOTAL TIME')]");
	By loc_canvas=By.xpath("//canvas[@id='myCanvas']");
	By loc_btnSendGameRecord=By.xpath("//span[text()='SEND RECORD']");
	By loc_successMessageSendRecord=By.xpath("//*[contains(@class,'mat-snack')]");
	By loc_textLevelComplete=By.xpath("//span[text()='COMPLETE!']");
	
	By loc_gameList=By.xpath("//div[contains(@class,'gameList')]");
	By loc_trophyName=By.xpath("//span[contains(text(),'YOU HAVE SCUCCESSFULLY COMPLETED ALL REQUIREMENTS TO EARN THE TROPHY FOR THIS GAME.')]//parent::div//following-sibling::div[1]/child::span");
	
	@Override
	public void verifyTotalScore(int expectedScore) {

		String EndGamePoints=Pojo.getObjSeleniumFunctions().getText(loc_endGameTotalPoints);
		int intEndGamePoints=Integer.parseInt(EndGamePoints);		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Total score is correct", expectedScore==intEndGamePoints);
	
	}

	@Override
	public void verifyAndClickSendRecordButton() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that send record button is appearing", Pojo.getObjSeleniumFunctions().getText(loc_btnSendGameRecord).trim().equals("SEND RECORD"));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that send record button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnSendGameRecord));

	}

	@Override
	public void verifyHomeButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyScorePercentage() {
		
		String text=Pojo.getObjSeleniumFunctions().getText(loc_canvas);
		System.out.println("Canvas Text "+text);
	}

	@Override
	public void clickHomeButton() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_homeButton, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().click(loc_homeButton));
		//Pojo.getObjSeleniumFunctions().waitFor(7);
		Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();
		
		
		while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_btnClose_Trophy))
		 {
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnClose_Trophy, 10);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_Trophy));
			Pojo.getObjSeleniumFunctions().waitFor(3);
			System.out.println("Click Close");
		  }
		}
	    
	
		
	@Override
	public void clickHomeButtonForLevels(int gameCount,int index) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().click(loc_homeButton));
	  //  Pojo.getObjSeleniumFunctions().waitFor(5);
		Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();

		    if(index<gameCount)
		    {
			while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_btnClose_Trophy))
			 {
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_Trophy));
				Pojo.getObjSeleniumFunctions().waitFor(3);
				System.out.println("Click Close");
			  }}
			 System.out.println("Opti 2");
			 if(index==gameCount)
			 {
				 System.out.println("Close Trophy");
				 while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_tropgyClose))
				 {
					Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_tropgyClose));
					Pojo.getObjSeleniumFunctions().waitFor(3);
					System.out.println("Click Close");
				  }
			 }
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
		Pojo.getObjSeleniumFunctions().waitFor(3);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that header is correct", Pojo.getObjSeleniumFunctions().getText(loc_headerLevelAchieved).trim().equals(expectedTitle));
		String actualTitle=Pojo.getObjSeleniumFunctions().getText(loc_textSubtilteLevel).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that title is correct", expectedSubTitle.trim().equals(actualTitle));
		
	}

	@Override
	public void verifyAndClickLetKnowButton() {
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Let them know button is displaying",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_btnLetKnow));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that Let them know button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnLetKnow));
		
	}

	@Override
	public void verifyShareTropyTitle() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textShareTrophy, 10);

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that share social media title is correct for trophies",Pojo.getObjSeleniumFunctions().getText(loc_textShareTrophy).trim().equals("SHARE TROPHY"));
	}
	
	@Override
	public void verifyShareLevelTitle() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textShareLevel, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that share social media title is correct for levels",Pojo.getObjSeleniumFunctions().getText(loc_textShareLevel).trim().equals("SHARE LEVEL"));

	}

	@Override
	public void verifyAndClickFbShare() {

		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that faceboob button is displaying",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_iconFbShare));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify facebook share button is clicking", Pojo.getObjSeleniumFunctions().click(loc_iconFbShare));
		Pojo.getObjSeleniumFunctions().switchToWindowUsingTitle("Facebook");
		System.out.println("FB Title "+Pojo.getObjSeleniumFunctions().getTitle());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that FB page is opening", Pojo.getObjSeleniumFunctions().getTitle().trim().equals("Facebook"));
		Pojo.getObjSeleniumFunctions().switchToWindowUsingTitle("1Huddle");

}

	@Override
	public void verifyAndClickLinkInShare() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that linkdIn button is displaying",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_iconLinkdIn));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify linkdIn share button is clicking", Pojo.getObjSeleniumFunctions().click(loc_iconLinkdIn));
		Pojo.getObjSeleniumFunctions().switchToWindowUsingTitle("Sign Up | LinkedIn");
		System.out.println("LI Title "+Pojo.getObjSeleniumFunctions().getTitle());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that LinkdIn page is opening", Pojo.getObjSeleniumFunctions().getTitle().trim().equals("Sign Up | LinkedIn"));
		Pojo.getObjSeleniumFunctions().switchToWindowUsingTitle("1Huddle");

	}

	@Override
	public void verifyAndClickTwitterShare() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that twitter button is displaying",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_iconTwitterShare));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify twitter share button is clicking", Pojo.getObjSeleniumFunctions().click(loc_iconTwitterShare));
		Pojo.getObjSeleniumFunctions().switchToWindowContainsURL("https://twitter.com/");
		Pojo.getObjSeleniumFunctions().waitFor(5);
		System.out.println("Twitter Title "+Pojo.getObjSeleniumFunctions().getTitle());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that twitter page is opening", Pojo.getObjSeleniumFunctions().getTitle().trim().equals("Compose new Tweet / Twitter"));
		Pojo.getObjSeleniumFunctions().switchToWindowUsingTitle("1Huddle");
	}

	@Override
	public void verifyAndClickMailShare() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that mail button is displaying",Pojo.getObjSeleniumFunctions().checkElementDisplayed(loc_iconMailShare));
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify mail share button is enabled", Pojo.getObjSeleniumFunctions().checkElementEnabled(loc_iconMailShare));		
		Pojo.getObjSeleniumFunctions().switchToWindowUsingTitle("1Huddle");
		Pojo.getObjSeleniumFunctions().pressEscapeKeyKeyboard();
		

	}

	@Override
	public void verifyAndClickCloseButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyGameOverText() {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_textGameOver, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that GAME OVER text is displaying", Pojo.getObjSeleniumFunctions().getText(loc_textGameOver).trim().equals("GAME OVER"));
		
	}

	@Override
	public void verifyGameName(String expectedGameName) {
		
		System.out.println("Actual Game Name "+Pojo.getObjSeleniumFunctions().getText(loc_gameNameEndGame).trim());
		System.out.println("Expected Game Name "+expectedGameName);
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game name is correct on end game screen", Pojo.getObjSeleniumFunctions().getText(loc_gameNameEndGame).trim().equals(expectedGameName));
		
	}

	@Override
	public void verifyTotalTimeField() {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total time filed is appearing", Pojo.getObjSeleniumFunctions().getText(loc_textTotalTime).trim().startsWith("TOTAL TIME"));
		String totalTime=Pojo.getObjSeleniumFunctions().getText(loc_textTotalTime).trim();
		totalTime=totalTime.replaceAll("[^0-9]", "");
		System.out.println("Total time is "+totalTime);
		int intTotalTime=Integer.parseInt(totalTime);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that total time is correct", intTotalTime>0);
	}

	@Override
	public void verifySuccessMessageAfterSendRecord(String successText) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_successMessageSendRecord, 15);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that success message is appearing after send record", Pojo.getObjSeleniumFunctions().getText(loc_successMessageSendRecord).trim().equals(successText));
		
	}

	@Override
	public void clickHomeButtonForGameTrophies(int gameCount, int index) {
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().clickUsingActionClass(loc_homeButton));
	    //Pojo.getObjSeleniumFunctions().waitFor(5);
		Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();

	    System.out.println("Trophy Name "+TrophiesPageAdmin.gameTrophyData.get("TrophyName"));
		    if((TrophiesPageAdmin.gameTrophyData.get("TrophyName")!=null))
		    {
			while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_btnClose_Trophy))
			 {
				if(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_textTotalPointsGameTrophy)==true)
				{
					break;
				}
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_Trophy));
				Pojo.getObjSeleniumFunctions().waitFor(3);
				System.out.println("Click Close");
			  }
		    }

	}

	
	@Override
	public void clickHomeButtonForTrophies(int gameCount,int index) {
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_homeButton, 10);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().click(loc_homeButton));
	  //  Pojo.getObjSeleniumFunctions().waitFor(5);
		Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();

		    if(index<gameCount)
		    {
			while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_btnClose_Trophy))
			 {
				Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_Trophy));
				Pojo.getObjSeleniumFunctions().waitFor(3);
				System.out.println("Click Close");
			  }
		    }
		    
		    
		   }

	@Override
	public void clickHomeButtonForMlgTrophies(int levelNum,String levelOrTrophy) {
		
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().click(loc_homeButton));
		//Pojo.getObjSeleniumFunctions().waitFor(7);
		Pojo.getObjUtilitiesFunctions().waitForWebAppLoadingAnimationToDisappear();

		
		while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_btnClose_Trophy))
		 {
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_Trophy));
			Pojo.getObjSeleniumFunctions().waitFor(3);
			System.out.println("Click Close");
		 }
		
		if(BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").size()==levelNum&&levelOrTrophy.equalsIgnoreCase("TROPHY"))//if trophy is provided from feature file then MLG level complete pop up will be closed otherwise MLG level complete popup remain open to verify level complete popup text
		{
			System.out.println("No of levels in MLG "+BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").size());
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_MlgLevel));
		}
		
	}
	
	

	@Override
	public void verifyMlgTrophyText(String expectedText) {
		By loc_actualText=By.xpath("//span[contains(text(),'"+expectedText+"')]");
		System.out.println("Trphy Text "+Pojo.getObjSeleniumFunctions().getText(loc_actualText).trim());
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct text is appearing on trophy popup ", Pojo.getObjSeleniumFunctions().getText(loc_actualText).trim().equals(expectedText));
		
	}

	@Override
	public void verifyMlgTrophyName() {
      String expectedTrophyName=BuildMlgGamePage.expectedDataMLG.get("MLGRName").get(0);
	  By loc_actualText=By.xpath("//span[contains(text(),'"+expectedTrophyName+"')]");
	  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that mlg game name correct on trophy popup ", Pojo.getObjSeleniumFunctions().getText(loc_actualText).trim().equals(expectedTrophyName));
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
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that home button is clicking", Pojo.getObjSeleniumFunctions().click(loc_homeButton));
		Pojo.getObjSeleniumFunctions().waitFor(7);
		
		while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_btnClose_Trophy))
		 {
			Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_btnClose_Trophy, 10);
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_Trophy));
			Pojo.getObjSeleniumFunctions().waitFor(3);
			System.out.println("Click Close");
		 }
		
		if(totalLevels==levelNum&&levelOrTrophy.equalsIgnoreCase("TROPHY"))//if trophy is provided from feature file then MLG level complete pop up will be closed otherwise MLG level complete popup remain open to verify level complete popup text
		{
			System.out.println("No of levels in MLG "+BuildMlgGamePage.expectedDataMLG.get("MLGLevelName").size());
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that level close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_MlgLevel));
		}
		
	}

	@Override
	public void verifyMlgTrophyName(String mlgName) {
		By loc_actualText=By.xpath("//span[contains(text(),'"+mlgName+"')]");
		  Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that mlg game name correct on trophy popup ", Pojo.getObjSeleniumFunctions().getText(loc_actualText).trim().equals(mlgName));
	}

	@Override
	public void verifyGameTrophyNameEndGame() {
		System.out.println("Trophy Name Expected "+TrophiesPageAdmin.gameTrophyData.get("TrophyName"));
		System.out.println("Trophy Name Actual "+Pojo.getObjSeleniumFunctions().getText(loc_trophyName).trim());
		
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that game trophy name is correct",TrophiesPageAdmin.gameTrophyData.get("TrophyName").equals(Pojo.getObjSeleniumFunctions().getText(loc_trophyName).trim()));		
	}

	@Override
	public void closeAllTrophiesAndLevelAndGoToHomeScreen() {
		clickHomeButton();		
	}

	@Override
	public void closeOpenedTrophies() {
		while(Pojo.getObjSeleniumFunctions().verifyElementDisplay(loc_btnClose_Trophy))
		 {
			Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that close button is clicking", Pojo.getObjSeleniumFunctions().click(loc_btnClose_Trophy));
			Pojo.getObjSeleniumFunctions().waitFor(3);
			System.out.println("Click Close");
		 }		
	}
	
	

	
}
