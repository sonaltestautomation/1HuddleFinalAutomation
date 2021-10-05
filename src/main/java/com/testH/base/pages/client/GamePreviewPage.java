package com.testH.base.pages.client;

public abstract class GamePreviewPage {
	
	

public abstract void verifyGamepreviewScreen();
public abstract void clickPlayGameButton();
public abstract void verifyPreviewTitle(String expectedTitle);
public abstract void verifyScenario(String expectedScenario);
public abstract void verifyPreviewInfo();
public abstract void verifyTrophyField();
public abstract void verifyTrophyDescription();
public abstract void verifyTotalPoints();
public abstract void verifyGameAttempt();
public abstract void verifyHighScore();
public abstract void clickBackGamePreview();
public abstract void verifyLevelDetailsIcon();
public abstract void clickLevelDetailsIcon();
public abstract void verifyGamesToGo();
public abstract void verifyAttemptAndEndDate();
public abstract void verifyDisabledPlayButton();

}
