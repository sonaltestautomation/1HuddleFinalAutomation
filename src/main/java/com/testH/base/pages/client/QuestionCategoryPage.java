package com.testH.base.pages.client;

public abstract class QuestionCategoryPage {
	
	public abstract void verifyCatScreen();
	public abstract void verifyPauseGameButton();
	public abstract void verifyEndGameButton();
	public abstract void verifyTotalTimeField();
	public abstract void selectCategory();
	public abstract void verifyCategories();
	public abstract void verifyQuestionCount();
	public abstract void verifyAndClickPauseGame();
	public abstract void verifyAndClickEndGameButton();
	public abstract int getPlayerPoints();
	public abstract int getQuestionCount();
	public abstract String getTotalTime();
	public abstract String getPlayerName();
	public abstract void verifyCategoryNameWithQues();
	public abstract void verifyPointsWithQues();
	public abstract void verifyTimerWithQuestions();
	public abstract void verifyRateQuestionEnabledWithEveryQuestion();
	public abstract void verifyDoneButtonLastQuestion();
	public abstract void clickEndGameButton();
	public abstract void verifyDisabledBackButtonLastQues();
	public abstract void verifyEnabledBackButtonLastQuesAndroidApp();
	
	

}
