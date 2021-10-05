package com.testH.base.pages.client;

public abstract class RateQuestionPage {
	
	public abstract String clickRateQuestionButton();
	public abstract void verifyRateQuestionScreen();
	public abstract void verifyRateQuestionOptions();
	public abstract void verifyAndClickCancelBtn();
	public abstract void verifyRateQuestionBtn();
	public abstract void clickQuestionCorrectILikeIt();
	public abstract void clickQuestionCorrectHaveSuggestion();
	public abstract void clickQuestionWrong();
	public abstract void verifyFeedbackTextFieldDisabled();
	public abstract void verifyAndClickSubmitBtn();
	public abstract void verifySuccessMessage();
	public abstract void enterFeedback(String strFeedback);
	public abstract String getQuestionTitle();
}
