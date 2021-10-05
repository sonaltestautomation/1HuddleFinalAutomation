package com.testH.base.pages.client;

public abstract class EndGamePage {
	
	public abstract void verifyTotalScore(int expectedScore);
	public abstract void verifyAndClickSendRecordButton();
	public abstract void verifySuccessMessageAfterSendRecord(String successText);
	public abstract void verifyHomeButton();
	public abstract void verifyScorePercentage();
	public abstract void verifyGameOverText();
	public abstract void verifyGameName(String expectedGameName);
	public abstract void verifyTotalTimeField();
	public abstract void clickHomeButton();
	public abstract void clickHomeButtonForTrophies(int gameCount,int index);
	public abstract void clickHomeButtonForGameTrophies(int gameCount,int index);
	public abstract void clickHomeButtonForMlgTrophies(int levelNum,String levelOrTrophy);
	public abstract void clickHomeButtonForMlgTrophies(int levelNum,String levelOrTrophy,int totalLevels);

	public abstract void clickHomeButtonForLevels(int gameCount,int index);
	
	public abstract void verifyTrophyTitleAndSubtitle(String expectedTitle,String expectedSubTitle);
	public abstract void verifyLevelTitleANdSubTitle(String expectedTitle,String expectedSubTitle);
	
	public abstract void verifyAndClickLetKnowButton();
	public abstract void verifyShareTropyTitle();
	public abstract void verifyShareLevelTitle();
	public abstract void verifyAndClickFbShare();
	public abstract void verifyAndClickLinkInShare();
	public abstract void verifyAndClickTwitterShare();
	public abstract void verifyAndClickMailShare();
	public abstract void verifyAndClickCloseButton();
	public abstract void verifyMlgTrophyText(String expectedText);
	public abstract void verifyMlgTrophyName();
	public abstract void verifyMlgTrophyName(String mlgName);
	public abstract void closeMlgTrophy();
	public abstract void closeLevelPopUp();
	public abstract void verifyCompleteText(String text);
	public abstract void verifyGameTrophyNameEndGame();
	public abstract void closeAllTrophiesAndLevelAndGoToHomeScreen();
	public abstract void closeOpenedTrophies();
	
	


	

}
