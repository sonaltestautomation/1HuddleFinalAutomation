package com.testH.base.pages.admin;

import org.openqa.selenium.By;

import com.testH.app.generic.Pojo;

public class PlayerFeedbackPageAdmin {
	
	
	By loc_titleQues=By.xpath("//tbody[1]//tr[1]//td[3]");
	By loc_feedBackType=By.xpath("//tbody[1]//tr[1]//td[2]/mat-icon");
	By loc_commentQues=By.xpath("//tbody[1]//tr[1]//td[4]");
	
	public void verifyWrongQuestion(String question,String quesFeedbackComment)
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleQues, 10);
		String actualQues=Pojo.getObjSeleniumFunctions().getText(loc_titleQues).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct question is appearing on admin",actualQues.equals(question));
		String quesComments=Pojo.getObjSeleniumFunctions().getText(loc_commentQues).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("validate correct comment is appearing",quesComments.equals(quesFeedbackComment));
		
	}
	public void verifySuggestionQues(String question,String quesFeedbackComment)
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleQues, 10);
		String actualQues=Pojo.getObjSeleniumFunctions().getText(loc_titleQues).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct question is appearing on admin",actualQues.equals(question));
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_commentQues, 10);
		String quesComments=Pojo.getObjSeleniumFunctions().getText(loc_commentQues).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("validate correct comment is appearing",quesComments.equals(quesFeedbackComment));
		
	}
	public void verifyRatedQuestionFeedbackCorrect(String question)
	{
		Pojo.getObjSeleniumFunctions().waitForElementDisplayed(loc_titleQues, 10);
		String actualQues=Pojo.getObjSeleniumFunctions().getText(loc_titleQues).trim();
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that correct question is appearing on admin",actualQues.equals(question));
		String quesComments=Pojo.getObjSeleniumFunctions().getText(loc_commentQues).trim();
        System.out.println("Ques Comment "+quesComments);
		Pojo.getObjUtilitiesFunctions().logTestCaseStatus("Verify that comment is not appearing",quesComments.equals(""));

	}

}
