package com.testH.base.pages.client;

public abstract class GamePausePage {
	public abstract void verifyPauseScreen();
	public abstract void verifyAndClickResumeGameButton();
	public abstract void verifyAndClickEndGameButton();
	public abstract void verifyGameName();
	public abstract void verifyPlayerName();
	public abstract void verifyPlayerPoints();
	public abstract void verifyQuestionCount();
	public abstract void verifyTotalTime();
	public abstract void verifyQuestionsToGoText();
	public abstract void clickYesConfirmation();

}
