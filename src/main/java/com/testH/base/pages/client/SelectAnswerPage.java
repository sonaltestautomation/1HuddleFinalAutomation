package com.testH.base.pages.client;

import java.util.HashMap;
import java.util.List;

public abstract class SelectAnswerPage {
	
	
	public abstract int getQuestionPoint();
	public abstract boolean giveAns(String playerAns); //correct or incorrect
	public abstract int playGameAndCalculatePoint();
	public abstract void clickNext();
	public abstract void clickDone();
	public abstract String getQuestionTitle();
	public abstract List<String> getOptions();
	public abstract void verifyQuestionTitle();
	public abstract void verifyQuestionOptions();
	public abstract void verifyQuestionTitleAndOptions();
	public abstract int playGameAndCalculatePointWebOnly(String selectAns);  //random, all correct, all wrong
	public abstract int playGameAndCalculateCorrectAnswers(String selectAns);  //random, all correct, all wrong
    public  abstract void clickBack();	
    public abstract String getCategoryName();
    public abstract int getQuesPoint();
    public abstract void verifyBackBtnDisabledLastQues();
    public abstract void verifyBackAndNextDisabled();
    public abstract void verifyQuestionTimer();
    public abstract void verifyRateQuestionEveryQues();
    public abstract HashMap<String, Integer> playGameAndCalculatePointsStatistics(String selectAns);
    public abstract void verifyQuestionDataWithImageAndSound();
    public abstract void verifyQuestionSound();
    public abstract void clickAndVerifyEnabledBackButtonAndroidApp();

    

    
	}
