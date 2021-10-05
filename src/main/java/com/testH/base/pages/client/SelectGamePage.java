package com.testH.base.pages.client;

import java.util.HashMap;

import org.openqa.selenium.By;

public abstract class SelectGamePage{
	
	//locators
	
	
	//medhods
	
	public abstract void verifySelectGameScreen(String companyName);
	public abstract void verifySelectGameScreenAndroidApp();
	
	public abstract void verifyGameList(); //Here we are checking game count is more than 0. Use verifyLiveGames() for if game is really live from admin. 
	public abstract void selectGame();
	public abstract void selectRecentlyCreatedGame(String gameName);
	public abstract void verifyLiveGameWebApp();
	public abstract void clickGamesIconSideMenu();
	public abstract void verifyHighScorePercentageText(String gameName);
	public abstract void verifyHighScore(int totalGameQues,float countCorrectAns,String gameName);
	public abstract void verifyGameTrophyWithGame();
	public abstract boolean refrestTillGameLive(String gameName);
	public abstract void verifyMlgLiveGameWebApp();
	public abstract void verifyMlgNotDisplayingOtherLocationDept();
	public abstract void verifyMlgNotDisplayingSameLocationOtherDept();
	
	public abstract void selectRecentlyCreatedMLG();
	public abstract void selectAlreadyCreatedMLG(String mlgName);
	public abstract void verifyRulesIcon();
	public abstract void closeRuleIcon();
	public abstract void verifyMlgGameName();
	public abstract void verifyMlgPointsBeforePlaying();
	public abstract void verifyLevelIndicatorAndTrophyImage();
	public abstract void verifyLevelCount();
	public abstract void verifyGameOverText();
	public abstract void clickAndVerifyRules();
	public abstract void verifyLockedImageAfterFirstLevel();
	public abstract void openAndVerifyLevel(int levelNum);
	public abstract void openAndVerifyLevelAlreadyCreatedMLG(int levelNum);
	public abstract void verifyGameNameOnLevelPopup();
	public abstract void verifyGameNameOnLevelPopup(String expectedGameName);

	
	public abstract void verifyHowToWinText();
	public abstract void verifyPointsCriteria();
	public abstract void verifyAttemptsCriteria();
	public abstract void verifyHighScoreCriteria();
	public abstract void verifyPointsCriteria(String criteriaValue);
	public abstract void verifyAttemptsCriteria(String criteriaValue);
	public abstract void verifyHighScoreCriteria(String criteriaValue);
	public abstract void verifyLetsGoEnabled();
	public abstract void verifyLetsGoDisabled();
	public abstract void verifyAndClickLetsGoButton();
	public abstract void verifyLevelPopUpGamePreview();
	public abstract void closeLevelPopUp();
	public abstract boolean checkAllCriteriaMatched(HashMap<String, Integer> expectedDataCriteria);
	public abstract boolean checkAllCriteriaMatched(HashMap<String, Integer> expectedDataCriteria,int points,int attempts,int highScore);
	public abstract void verifyNextLevelStatus(boolean status);
	public abstract void verifyNextLevelLocked(boolean status);

	public abstract void verifyNextLevelStatusAlreayCreatedMlg(boolean status);
	public abstract void verifyTotalPointsAfterEndingGameMLG(HashMap<String, Integer> expectedDataCriteria);
    public abstract int getMLGPoints();
    public abstract void clickBackSelectMLG();
    public abstract void verifyMlgPointsOnLeaderboard(HashMap<String, Integer> expectedDataCriteria,String alreadyCreatedPlayerName);
    public abstract void verifyUpdatedPointsLevelopup(HashMap<String, Integer> expectedDataCriteria);
    public abstract void verifyUpdatedAttemptsLevelopup(HashMap<String, Integer> expectedDataCriteria);
    public abstract void verifyUpdatedHighScoreLevelopup(HashMap<String, Integer> expectedDataCriteria);
    
    public abstract void verifyUpdatedPointsLevelopupAlreayCreatedMLG(HashMap<String, Integer> expectedDataCriteria);
    public abstract void verifyUpdatedAttemptsLevelopupAlreadyCreatedMLG(HashMap<String, Integer> expectedDataCriteria);
    public abstract void verifyUpdatedHighScoreLevelopupAlreadyCreatedMLG(HashMap<String, Integer> expectedDataCriteria);
    
    
    
    public abstract void pageRefresh();
    public abstract int getUpdatedPoints();
    public abstract int getUpdatedAttempts();
    public abstract int getUpdatedHighScore();
    public abstract int getCriteriaPoints();
    public abstract int getCriteriaAttempts();
    public abstract int getCriteriaHighScore();
	public abstract void verifyGreenTickPoints();
	public abstract void verifyGreenTickAttempts();
	public abstract void verifyGreenTickHighScore();
	public abstract void verifyMlgTrophyWithMlg();
	public abstract void verifyMlgTrophyWithMlg(String mlgName);
	
	public abstract void verifyLevelNumberLevelCompletePopUp();
	public abstract void verifyLoadingAnimationDisappear();
	public abstract void verifyCheckIconWithGameName();



	

}
